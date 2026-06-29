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
    public static final DeferredItem<Item> MIXER = ITEMS.register("drink_mixer",()->new ModCraftingTool(
            new Item.Properties().stacksTo(1))
    );


    public static final DeferredItem<Item> YEAST = ITEMS.register("yeast",()->new Item(
            new Item.Properties())
    );
    public static final DeferredItem<Item> CRUSHED_ICE = ITEMS.register("crushed_ice",()->new Item(
            new Item.Properties())
    );
    public static final DeferredItem<Item> AQUAFABA = ITEMS.register("aquafaba", () -> new Item(
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
    public static final DeferredItem<Item> SODA = ITEMS.register("soda",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0F).build()))
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
    public static final DeferredItem<Item> NUT_LIQUEUR = ITEMS.register("nut_liqueur",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> AMARO = ITEMS.register("amaro",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> FORTIFIED_WINE = ITEMS.register("fortified_wine",()->new Item(
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


    //ALCOHOLS: MIXED DRINKS
    static int cocktail_nutrition=12;
    static float cocktail_saturation=1.4F;
    static FoodProperties cocktail_properties=new FoodProperties.Builder().nutrition(cocktail_nutrition).saturationModifier(cocktail_saturation).build();
        //IBA LIST
    public static final DeferredItem<Item> ALEXANDER = ITEMS.register("alexander",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> AMERICANO_COCKTAIL = ITEMS.register("americano_cocktail",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ANGEL_FACE = ITEMS.register("angel_face",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> AVIATION = ITEMS.register("aviation",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BETWEEN_THE_SHEETS = ITEMS.register("between_the_sheets",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BOULIVARDIER = ITEMS.register("boulivardier",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BRANDY_CRUSTA = ITEMS.register("brandy_crusta",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CASINO = ITEMS.register("casino",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CLOVER_CLUB = ITEMS.register("clover_club",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DAIQUIRI = ITEMS.register("daiquiri",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DRY_MARTINI = ITEMS.register("dry_martini",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GIN_FIZZ = ITEMS.register("gin_fizz",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    //Untextured
    public static final DeferredItem<Item> HANKY_PANKY = ITEMS.register("hanky_panky",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> JOHN_COLLINS = ITEMS.register("john_collins",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> LAST_WORD = ITEMS.register("last_word",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MANHATTAN = ITEMS.register("manhattan",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );

    public static final DeferredItem<Item> MARTINEZ = ITEMS.register("martinez",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MARY_PICKFORD = ITEMS.register("mary_pickford",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MONKEY_GLAND = ITEMS.register("monkey_gland",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> NEGRONI = ITEMS.register("negroni",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> OLD_FASHIONED = ITEMS.register("old_fashioned",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PARADISE = ITEMS.register("paradise",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PLANTERS_PUNCH = ITEMS.register("planters_punch",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PORTO_FLIP = ITEMS.register("porto_flip",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );

    public static final DeferredItem<Item> RAMOS_FIZZ = ITEMS.register("ramos_fizz",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> REMEMBER_THE_MAINE = ITEMS.register("remember_the_maine",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUSTY_NAIL = ITEMS.register("rusty_nail",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SAZERAC = ITEMS.register("sazerac",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SIDECAR = ITEMS.register("sidecar",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> STINGER = ITEMS.register("stinger",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TUXEDO = ITEMS.register("tuxedo",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> VIEUX_CARRE = ITEMS.register("vieux_carre",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> WHISKEY_SOUR = ITEMS.register("whiskey_sour",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> WHITE_LADY = ITEMS.register("white_lady",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    //Untextured and unreciped


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
