package com.tealcube.minecraft.bukkit.mythicdrops.repair;

/*
 * #%L
 * MythicDrops
 * %%
 * Copyright (C) 2013 - 2015 TealCube
 * %%
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby
 * granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER
 * IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF
 * THIS SOFTWARE.
 * #L%
 */


import com.tealcube.minecraft.bukkit.mythicdrops.api.items.MythicItemStack;
import com.tealcube.minecraft.bukkit.mythicdrops.api.repair.RepairCost;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

import java.util.List;

public final class MythicRepairCost implements RepairCost {

    private final String name;
    private final int priority;
    private final int experienceCost;
    private final double repairPercentagePerCost;
    private final int amount;
    private final Material material;
    private final String itemName;
    private final List<String> itemLore;

    public MythicRepairCost(String name, int priority, int experienceCost,
                            double repairPercentagePerCost, int amount,
                            Material material, String itemName, List<String> itemLore) {
        this.name = name;
        this.priority = priority;
        this.experienceCost = experienceCost;
        this.repairPercentagePerCost = repairPercentagePerCost;
        this.amount = amount;
        this.material = material;
        this.itemName = itemName;
        this.itemLore = itemLore;
    }

    @Override
    public List<String> getItemLore() {
        return itemLore;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public MaterialData getMaterialData() {
        return new MaterialData(material);
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public double getRepairPercentagePerCost() {
        return repairPercentagePerCost;
    }

    @Override
    public int getExperienceCost() {
        return experienceCost;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ItemStack toItemStack(int amount) {
        return new MythicItemStack(material, amount, (short) 0,
                                   (itemName == null || itemName.isEmpty()) ? null : itemName,
                                   (itemLore == null || itemLore.isEmpty()) ? null : itemLore);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        result = 31 * result + experienceCost;
        temp = Double.doubleToLongBits(repairPercentagePerCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + amount;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (itemLore != null ? itemLore.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MythicRepairCost that = (MythicRepairCost) o;

        return amount == that.amount && experienceCost == that.experienceCost
                && priority == that.priority
                && Double.compare(that.repairPercentagePerCost, repairPercentagePerCost) == 0 && !(
                itemLore != null ? !itemLore.equals(that.itemLore) : that.itemLore != null) && !(
                itemName != null ? !itemName.equals(that.itemName) : that.itemName != null)
                && material == that.material && !(name != null ? !name.equals(that.name)
                                                               : that.name != null);
    }
}
