/*
 * This file is part of MythicDrops, licensed under the MIT License.
 *
 * Copyright (C) 2020 Richard Harrah
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.tealcube.minecraft.bukkit.mythicdrops.smithing

import com.tealcube.minecraft.bukkit.mythicdrops.api.settings.SettingsManager
import com.tealcube.minecraft.bukkit.mythicdrops.api.tiers.TierManager
import com.tealcube.minecraft.bukkit.mythicdrops.utils.CustomItemUtil
import com.tealcube.minecraft.bukkit.mythicdrops.utils.TierUtil
import io.pixeloutlaw.minecraft.spigot.mythicdrops.sendNonSpamMessage
import java.util.UUID
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.PrepareSmithingEvent

class SmithingListener(private val settingsManager: SettingsManager, private val tierManager: TierManager) : Listener {
    private val spamBuster = mutableMapOf<UUID, Long>()

    @EventHandler
    fun onPrepareSmithingEvent(event: PrepareSmithingEvent) {
        if (!settingsManager.configSettings.options.isAllowNetheriteUpgrade) {
            handlePreventingNetherite(event)
        }
    }

    private fun handlePreventingNetherite(event: PrepareSmithingEvent) {
        val anyTieredOrCustomItems = event.inventory.contents.filterNotNull().any {
            TierUtil.getTierFromItemStack(
                it,
                tierManager.get()
            ) != null || CustomItemUtil.getCustomItemFromItemStack(it) != null
        }
        val anyNetheriteIngots = event.inventory.contents.filterNotNull().any { it.type == Material.NETHERITE_INGOT }
        if (anyTieredOrCustomItems && anyNetheriteIngots) {
            event.result = null
            (event.view.player as? Player)?.let {
                it.updateInventory()
                it.sendNonSpamMessage(settingsManager.languageSettings.general.preventedNetheriteUpgrade)
            }
        }
    }
}