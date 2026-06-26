package com.fennecgrapha.beveragecraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCraftingTool extends Item {
    public ModCraftingTool(Item.Properties builder) {
        super(builder);
    }

    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return stack.copy();
    }

    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}