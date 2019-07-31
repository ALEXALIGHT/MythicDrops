/*
 * The MIT License
 * Copyright © 2013 Richard Harrah
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.tealcube.minecraft.bukkit.mythicdrops.gson

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import com.tealcube.minecraft.bukkit.mythicdrops.api.enchantments.MythicEnchantment
import org.bukkit.enchantments.Enchantment
import java.lang.reflect.Type

class MythicEnchantmentSerializer : JsonSerializer<MythicEnchantment> {
    override fun serialize(src: MythicEnchantment?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        val jObject = JsonObject()
        if (src != null && context != null) {
            jObject.add("enchantment", context.serialize(src.enchantment, Enchantment::class.java))
            jObject.addProperty("minimumLevel", src.minimumLevel)
            jObject.addProperty("maximumLevel", src.maximumLevel)
        }
        return jObject
    }
}