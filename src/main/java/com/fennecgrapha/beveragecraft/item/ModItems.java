package com.fennecgrapha.beveragecraft.item;

import com.fennecgrapha.beveragecraft.BeverageCraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

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
    public static final DeferredItem<Item> MATCHA_POWDER = ITEMS.register("matcha_powder",()->new Item(
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
    public static final DeferredItem<Item> HONEY_SYRUP = ITEMS.register("honey_syrup",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> CARAMEL_SAUCE = ITEMS.register("caramel_sauce",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );
    public static final DeferredItem<Item> CHOCOLATE_SAUCE = ITEMS.register("chocolate_sauce",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build()))
    );

    public static final DeferredItem<Item> SODA = ITEMS.register("soda",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0F).build()))
    );
    public static final DeferredItem<Item> BOBA_PEARLS = ITEMS.register("boba_pearls",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(-0.5F).build()))
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
    public static final DeferredItem<Item> SAKE = ITEMS.register("sake",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.4F).build()))
    );
    public static final DeferredItem<Item> SPARKLING_WINE = ITEMS.register("sparkling_wine",()->new Item(
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
    public static final DeferredItem<Item> COFFEE_LIQUEUR = ITEMS.register("coffee_liqueur",()->new Item(
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
        public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.beveragecraft.bitters.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    }
    );


    //ALCOHOLS: MIXED DRINKS
    static int cocktail_nutrition=19;
    static float cocktail_saturation=1.5F;
    static FoodProperties cocktail_properties=new FoodProperties.Builder().nutrition(cocktail_nutrition).saturationModifier(cocktail_saturation).build();
    static int cafe_nutrition=15;
    static float cafe_saturation=1.9f;
    static FoodProperties cafe_properties=new FoodProperties.Builder().nutrition(cafe_nutrition).saturationModifier(cafe_saturation).build();
    static int boba_nutrition=17;
    static float boba_saturation=1.9f;
    static FoodProperties boba_properties=new FoodProperties.Builder().nutrition(boba_nutrition).saturationModifier(boba_saturation).build();


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
    public static final DeferredItem<Item> BELLINI = ITEMS.register("bellini",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BLACK_RUSSIAN = ITEMS.register("black_russian",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BLOODY_MARY = ITEMS.register("bloody_mary",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CAIPIRINHA = ITEMS.register("caipirinha",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CARDINALE = ITEMS.register("cardinale",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CHAMPAGNE_COCKTAIL = ITEMS.register("champagne_cocktail",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CORPSE_REVIVER_2 = ITEMS.register("corpse_reviver_2",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> COSMOPOLITAN = ITEMS.register("cosmopolitan",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CUBA_LIBRE = ITEMS.register("cuba_libre",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FRENCH_75 = ITEMS.register("french_75",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FRENCH_CONNECTION = ITEMS.register("french_connection",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GARIBALDI = ITEMS.register("garibaldi",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GRASSHOPPER = ITEMS.register("grasshopper",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HEMINGWAY_SPECIAL = ITEMS.register("hemingway_special",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HORSES_NECK = ITEMS.register("horses_neck",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> IRISH_COFFEE = ITEMS.register("irish_coffee",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> KIR = ITEMS.register("kir",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> LEMON_DROP = ITEMS.register("lemon_drop",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> LONG_ISLAND_ICED_TEA = ITEMS.register("long_island_iced_tea",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MAI_TAI = ITEMS.register("mai_tai",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MARGARITA = ITEMS.register("margarita",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MIMOSA = ITEMS.register("mimosa",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MINT_JULEP = ITEMS.register("mint_julep",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MOJITO = ITEMS.register("mojito",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MOSCOW_MULE = ITEMS.register("moscow_mule",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PINA_COLADA = ITEMS.register("pina_colada",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PISCO_SOUR = ITEMS.register("pisco_sour",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RABO_DE_GALO = ITEMS.register("rabo_de_galo",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SEA_BREEZE = ITEMS.register("sea_breeze",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SEX_ON_THE_BEACH = ITEMS.register("sex_on_the_beach",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SINGAPORE_SLING = ITEMS.register("singapore_sling",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TEQUILA_SUNRISE = ITEMS.register("tequila_sunrise",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> VESPER = ITEMS.register("vesper",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ZOMBIE = ITEMS.register("zombie",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BEES_KNEES = ITEMS.register("bees_knees",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BRAMBLE = ITEMS.register("bramble",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CANCHANCHARA = ITEMS.register("canchanchara",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CHARTREUSE_SWIZZLE = ITEMS.register("chartreuse_swizzle",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DARK_N_STORMY = ITEMS.register("dark_n_stormy",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DONS_SPECIAL_DAIQUIRI = ITEMS.register("dons_special_daiquiri",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ESPRESSO_MARTINI = ITEMS.register("espresso_martini",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FERNANDITO = ITEMS.register("fernandito",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FRENCH_MARTINI = ITEMS.register("french_martini",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GIN_BASIL_SMASH = ITEMS.register("gin_basil_smash",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GRAND_MARGARITA = ITEMS.register("grand_margarita",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> IBA_TIKI = ITEMS.register("iba_tiki",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ILLEGAL = ITEMS.register("illegal",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> JUNGLE_BIRD = ITEMS.register("jungle_bird",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MISSIONARYS_DOWNFALL = ITEMS.register("missionarys_downfall",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> NAKED_AND_FAMOUS = ITEMS.register("naked_and_famous",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> NEW_YORK_SOUR = ITEMS.register("new_york_sour",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> OLD_CUBAN = ITEMS.register("old_cuban",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PALOMA = ITEMS.register("paloma",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PAPER_PLANE = ITEMS.register("paper_plane",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PENICILLIN = ITEMS.register("penicillin",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PISCO_PUNCH = ITEMS.register("pisco_punch",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PORN_STAR_MARTINI = ITEMS.register("porn_star_martini",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUSSIAN_SPRING_PUNCH = ITEMS.register("russian_spring_punch",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SHERRY_COBBLER = ITEMS.register("sherry_cobbler",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SOUTH_SIDE = ITEMS.register("south_side",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SPICY_FIFTY = ITEMS.register("spicy_fifty",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SPRITZ = ITEMS.register("spritz",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SUFFERING_BASTARD = ITEMS.register("suffering_bastard",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> THREE_DOTS_AND_A_DASH = ITEMS.register("three_dots_and_a_dash",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TIPPERARY = ITEMS.register("tipperary",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TOMMYS_MARGARITA = ITEMS.register("tommys_margarita",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TRINIDAD_SOUR = ITEMS.register("trinidad_sour",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> VENTO = ITEMS.register("vento",()->new ModCocktailIBAItem(
            new Item.Properties().food(cocktail_properties))
    );

    //NON-IBA COCKTAILS

    //Untextured
    //Untextured and unreciped
    public static final DeferredItem<Item> MICHELADA = ITEMS.register("michelada",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MULLED_WINE = ITEMS.register("mulled_wine",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );

    public static final DeferredItem<Item> FOG_CUTTER = ITEMS.register("fog_cutter",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> NAVY_GROG = ITEMS.register("navy_grog",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SCORPION_BOWL = ITEMS.register("scorpion_bowl",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HUMUHUMUNUKUNUKUAPUAA = ITEMS.register("humuhumunukunukuapuaa",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUM_BARREL = ITEMS.register("rum_barrel",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> VOLCANO_BOWL = ITEMS.register("volcano_bowl",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TIKI_BOWL = ITEMS.register("tiki_bowl",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUM_RUNNER = ITEMS.register("rum_runner",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DOCTOR_FUNK = ITEMS.register("doctor_funk",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HAWAIIAN_SUNSET = ITEMS.register("hawaiian_sunset",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SATURN = ITEMS.register("saturn",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> POLYNESIAN_PEARL = ITEMS.register("polynesian_pearl",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> LIQUID_MARIJUANA = ITEMS.register("liquid_marijuana",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> POG_PUNCH = ITEMS.register("pog_punch",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CANDY_APPLE = ITEMS.register("candy_apple",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DRAGONS_BLOOD = ITEMS.register("dragons_blood",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TRIUMVIRATE_PUNCH = ITEMS.register("triumvirate_punch",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BLUE_HAWAIIAN = ITEMS.register("blue_hawaiian",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BANANA_DAIQUIRI = ITEMS.register("banana_daiquiri",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HURRICANE = ITEMS.register("hurricane",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SIDEWINDERS_FANG = ITEMS.register("sidewinders_fang",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FISHBOWL = ITEMS.register("fishbowl",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BAHAMA_MAMA = ITEMS.register("bahama_mama",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GREEN_SWIZZLE = ITEMS.register("green_swizzle",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TIKI_MAX = ITEMS.register("tiki_max",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUM_GIGGLE = ITEMS.register("rum_giggle",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HALEKULANI = ITEMS.register("halekulani",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> THUNDERBIRD = ITEMS.register("thunderbird",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PARLAY_PUNCH = ITEMS.register("parlay_punch",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ROYAL_HAWAIIAN = ITEMS.register("royal_hawaiian",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUM_AND_GRAPEFRUIT = ITEMS.register("rum_and_grapefruit",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BRANDY_SMASH = ITEMS.register("brandy_smash",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> LYCHEE_SAKETINI = ITEMS.register("lychee_saketini",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );

    public static final DeferredItem<Item> MAYAN = ITEMS.register("mayan",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CANTARITOS = ITEMS.register("cantaritos",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ABSINTHE_SERVICE = ITEMS.register("absinthe_service",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ST_GERMAIN_SPRITZ = ITEMS.register("st_germain_spritz",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PIMMS_CUP = ITEMS.register("pimms_cup",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PINEAPPLE_MOJITO = ITEMS.register("pineapple_mojito",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> M_AND_M = ITEMS.register("m_and_m",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> GREEN_BEAST = ITEMS.register("green_beast",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PEACHTREE_PUNCH = ITEMS.register("peachtree_punch",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TRADEWINDS = ITEMS.register("tradewinds",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> MONKEY_BUSINESS = ITEMS.register("monkey_business",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> AGRICOLE_GUAVA_COOLER = ITEMS.register("agricole_guava_cooler",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PINATA = ITEMS.register("pinata",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BUMBOAT = ITEMS.register("bumboat",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> JAPANESE_PEAR = ITEMS.register("japanese_pear",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FROZEN_MARGARITA = ITEMS.register("frozen_margarita",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SAKURA_MARTINI = ITEMS.register("sakura_martini",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> FRUIT_AND_NUT = ITEMS.register("fruit_and_nut",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> ECLIPSE = ITEMS.register("eclipse",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );

    public static final DeferredItem<Item> COFFEE_GROG = ITEMS.register("coffee_grog",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> PEARL_DIVER = ITEMS.register("pearl_diver",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> HOT_BUTTERED_RUM = ITEMS.register("hot_buttered_rum",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BOOZY_EGGNOG = ITEMS.register("boozy_eggnog",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SANGUINELLO = ITEMS.register("sanguinello",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> DONS_GROG = ITEMS.register("dons_grog",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TI_PUNCH = ITEMS.register("ti_punch",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CENTER_OF_THE_GALAXY = ITEMS.register("center_of_the_galaxy",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CALLALOO_COOLER = ITEMS.register("callaloo_cooler",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SWIZZLE_FRANCAIS = ITEMS.register("swizzle_francais",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> RUM_FLIP = ITEMS.register("rum_flip",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TWELVE_MILE_LIMIT = ITEMS.register("twelve_mile_limit",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> BRANDY_SOUR = ITEMS.register("brandy_sour",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> LYCHEE_PUNCH = ITEMS.register("lychee_punch",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );



    public static final DeferredItem<Item> CHARTS_ASTRONO_MAI_TAI = ITEMS.register("charts_astrono_mai_tai",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> SQUASHS_GIN_BASIL_SMASH = ITEMS.register("squashs_gin_basil_smash",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> TOADS_FROG_POND = ITEMS.register("toads_frog_pond",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );
    public static final DeferredItem<Item> CABIN_FOUR_FIERY_UNDEAD = ITEMS.register("cabin_four_fiery_undead",()->new Item(
            new Item.Properties().food(cocktail_properties))
    );

    // CAFE

    public static final DeferredItem<Item> LATTE = ITEMS.register("latte",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(13).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> MOCHA = ITEMS.register("mocha",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(13).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> FLAVORED_LATTE = ITEMS.register("flavored_latte",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> FLAVORED_MOCHA = ITEMS.register("flavored_mocha",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> CARAMEL_MACCHIATO = ITEMS.register("caramel_macchiato",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> FRAPPE = ITEMS.register("frappe",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> VIETNAMESE_COFFEE = ITEMS.register("vietnamese_coffee",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> CHAI_LATTE = ITEMS.register("chai_latte",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> MATCHA_TEA = ITEMS.register("matcha_tea",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> MATCHA_LATTE = ITEMS.register("matcha_latte",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(14).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> FLAVORED_MATCHA_LATTE = ITEMS.register("flavored_matcha_latte",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> THAI_TEA = ITEMS.register("thai_tea",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> LONDON_FOG_LATTE = ITEMS.register("london_fog_latte",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> HORCHATA = ITEMS.register("horchata",()->new Item(
            new Item.Properties().food(cafe_properties))
    );


    public static final DeferredItem<Item> FRUITY_SODA = ITEMS.register("fruity_soda",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> SLUSHIE = ITEMS.register("slushie",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> POG_JUICE = ITEMS.register("pog_juice",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> TROPICAL_JUICE = ITEMS.register("tropical_juice",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> CRANCHERRY_JUICE = ITEMS.register("crancherry_juice",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> CRANGRAPE_JUICE = ITEMS.register("crangrape_juice",()->new Item(
            new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationModifier(1.2F).build()))
    );
    public static final DeferredItem<Item> NIX_SMOOTHIE = ITEMS.register("nix_smoothie",()->new Item(
            new Item.Properties().food(cafe_properties)) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.beveragecraft.nix_smoothie.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            }
    );
    public static final DeferredItem<Item> CHARTS_STARGAZER_SODA = ITEMS.register("charts_stargazer_soda",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> SQUASHS_BASIL_LEMONADE = ITEMS.register("squashs_basil_lemonade",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> TOADS_SWIMMING_POOL_LEMONADE = ITEMS.register("toads_swimming_pool_lemonade",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> MULLED_CIDER = ITEMS.register("mulled_cider",()->new Item(
            new Item.Properties().food(cafe_properties))
    );
    public static final DeferredItem<Item> MILK_BOBA_TEA = ITEMS.register("milk_boba_tea",()->new Item(
            new Item.Properties().food(boba_properties))
    );
    public static final DeferredItem<Item> FRUIT_BOBA_TEA = ITEMS.register("fruit_boba_tea",()->new Item(
            new Item.Properties().food(boba_properties))
    );
    public static final DeferredItem<Item> THAI_BOBA_TEA = ITEMS.register("thai_boba_tea",()->new Item(
            new Item.Properties().food(boba_properties))
    );
    public static final DeferredItem<Item> TARO_BOBA_TEA = ITEMS.register("taro_boba_tea",()->new Item(
            new Item.Properties().food(boba_properties))
    );
    public static final DeferredItem<Item> BOBA_SLUSHIE = ITEMS.register("boba_slushie",()->new Item(
            new Item.Properties().food(boba_properties))
    );
    public static final DeferredItem<Item> BOBA_COFFEE = ITEMS.register("boba_coffee",()->new Item(
            new Item.Properties().food(boba_properties))
    );
    public static final DeferredItem<Item> BOBA_FRAPPE = ITEMS.register("boba_frappe",()->new Item(
            new Item.Properties().food(boba_properties))
    );




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
