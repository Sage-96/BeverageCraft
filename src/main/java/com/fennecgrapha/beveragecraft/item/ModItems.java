package com.fennecgrapha.beveragecraft.item;

import com.fennecgrapha.beveragecraft.BeverageCraft;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;
import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BeverageCraft.MODID);

    // TOOLS

    public static final DeferredItem<Item> STILL = ITEMS.register("distilling_flask",()->new ModCraftingTool(
            new Item.Properties().stacksTo(1))
    );

    public static final DeferredItem<Item> YEAST = ITEMS.register("yeast",()->new Item(
            new Item.Properties())
    );

    // INGREDIENTS
    public static final DeferredItem<Item> SYRUP = ITEMS.register("syrup",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> VANILLA_SYRUP = ITEMS.register("vanilla_syrup",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> ORGEAT_SYRUP = ITEMS.register("orgeat_syrup",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> FRUIT_SYRUP = ITEMS.register("fruit_syrup",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> SPICE_SYRUP = ITEMS.register("spice_syrup",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );

    public static final DeferredItem<Item> MOLASSES = ITEMS.register("molasses",()->new Item(
            new Item.Properties())
    );
    //ALCOHOLS
        //ALCOHOLS: SOFT
    public static final DeferredItem<Item> BEER = ITEMS.register("beer",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> WINE = ITEMS.register("wine",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> HARD_CIDER = ITEMS.register("hard_cider",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
        //ALCOHOLS: SPIRITS
    public static final DeferredItem<Item> BRANDY = ITEMS.register("brandy",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> RUM = ITEMS.register("rum",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> VODKA = ITEMS.register("vodka",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> GIN = ITEMS.register("gin",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> TEQUILA = ITEMS.register("tequila",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> WHISKEY = ITEMS.register("whiskey",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
        //ALCOHOLS: LIQUEURS
    public static final DeferredItem<Item> ABSINTHE = ITEMS.register("absinthe",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> FRUIT_LIQUEUR = ITEMS.register("fruit_liqueur",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> COCOA_LIQUEUR = ITEMS.register("cocoa_liqueur",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );

    public static final DeferredItem<Item> FLORAL_LIQUEUR = ITEMS.register("floral_liqueur",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> BITTERS = ITEMS.register("bitters",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0F).build())) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.beveragecraft.bitters.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    }
    );





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    };
}
