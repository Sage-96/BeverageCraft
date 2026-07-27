package com.fennecgrapha.beveragecraft.item;

import com.fennecgrapha.beveragecraft.BeverageCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeverageCraft.MODID);

    public static final Supplier<CreativeModeTab> BEVERAGECRAFT_TAB = CREATIVE_MODE_TAB.register("beveragecraft_tab",
            ()->CreativeModeTab.builder().icon(()->new ItemStack(ModItems.SYRUP.get()))
                    .title(Component.translatable("itemGroup.beveragecraft"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STILL);
                        output.accept(ModItems.MIXER);
                        output.accept(ModItems.YEAST);
                        output.accept(ModItems.CRUSHED_ICE);
                        output.accept(ModItems.MATCHA_POWDER);
                        output.accept(ModItems.AQUAFABA);
                        output.accept(ModItems.SYRUP);
                        output.accept(ModItems.VANILLA_SYRUP);
                        output.accept(ModItems.ORGEAT_SYRUP);
                        output.accept(ModItems.FRUIT_SYRUP);
                        output.accept(ModItems.SPICE_SYRUP);
                        output.accept(ModItems.HONEY_SYRUP);
                        output.accept(ModItems.CARAMEL_SAUCE);
                        output.accept(ModItems.CHOCOLATE_SAUCE);
                        output.accept(ModItems.MOLASSES);
                        output.accept(ModItems.SODA);
                        output.accept(ModItems.BOBA_PEARLS);
                        output.accept(ModItems.BEER);
                        output.accept(ModItems.WINE);
                        output.accept(ModItems.SAKE);
                        output.accept(ModItems.SPARKLING_WINE);
                        output.accept(ModItems.HARD_CIDER);
                        output.accept(ModItems.BRANDY);
                        output.accept(ModItems.RUM);
                        output.accept(ModItems.VODKA);
                        output.accept(ModItems.GIN);
                        output.accept(ModItems.TEQUILA);
                        output.accept(ModItems.WHISKEY);
                        output.accept(ModItems.ABSINTHE);
                        output.accept(ModItems.FRUIT_LIQUEUR);
                        output.accept(ModItems.COCOA_LIQUEUR);
                        output.accept(ModItems.COFFEE_LIQUEUR);
                        output.accept(ModItems.FLORAL_LIQUEUR);
                        output.accept(ModItems.NUT_LIQUEUR);
                        output.accept(ModItems.AMARO);
                        output.accept(ModItems.FORTIFIED_WINE);
                        output.accept(ModItems.BITTERS);

                        //IBA
                        output.accept(ModItems.ALEXANDER);
                        output.accept(ModItems.AMERICANO_COCKTAIL);
                        output.accept(ModItems.ANGEL_FACE);
                        output.accept(ModItems.AVIATION);
                        output.accept(ModItems.BETWEEN_THE_SHEETS);
                        output.accept(ModItems.BOULIVARDIER);
                        output.accept(ModItems.BRANDY_CRUSTA);
                        output.accept(ModItems.CASINO);
                        output.accept(ModItems.CLOVER_CLUB);
                        output.accept(ModItems.DAIQUIRI);
                        output.accept(ModItems.DRY_MARTINI);
                        output.accept(ModItems.GIN_FIZZ);
                        output.accept(ModItems.HANKY_PANKY);
                        output.accept(ModItems.JOHN_COLLINS);
                        output.accept(ModItems.LAST_WORD);
                        output.accept(ModItems.MANHATTAN);
                        output.accept(ModItems.MARTINEZ);
                        output.accept(ModItems.MARY_PICKFORD);
                        output.accept(ModItems.MONKEY_GLAND);
                        output.accept(ModItems.NEGRONI);
                        output.accept(ModItems.OLD_FASHIONED);
                        output.accept(ModItems.PARADISE);
                        output.accept(ModItems.PLANTERS_PUNCH);
                        output.accept(ModItems.PORTO_FLIP);
                        output.accept(ModItems.RAMOS_FIZZ);
                        output.accept(ModItems.REMEMBER_THE_MAINE);
                        output.accept(ModItems.RUSTY_NAIL);
                        output.accept(ModItems.SAZERAC);
                        output.accept(ModItems.SIDECAR);
                        output.accept(ModItems.STINGER);
                        output.accept(ModItems.TUXEDO);
                        output.accept(ModItems.VIEUX_CARRE);
                        output.accept(ModItems.WHISKEY_SOUR);
                        output.accept(ModItems.WHITE_LADY);
                        output.accept(ModItems.BELLINI);
                        output.accept(ModItems.BLACK_RUSSIAN);
                        output.accept(ModItems.BLOODY_MARY);
                        output.accept((ModItems.CAIPIRINHA));
                        output.accept(ModItems.CARDINALE);
                        output.accept(ModItems.CHAMPAGNE_COCKTAIL);
                        output.accept(ModItems.CORPSE_REVIVER_2);
                        output.accept(ModItems.COSMOPOLITAN);
                        output.accept(ModItems.CUBA_LIBRE);
                        output.accept(ModItems.FRENCH_75);
                        output.accept(ModItems.FRENCH_CONNECTION);
                        output.accept(ModItems.GARIBALDI);
                        output.accept(ModItems.GRASSHOPPER);
                        output.accept(ModItems.HEMINGWAY_SPECIAL);
                        output.accept(ModItems.HORSES_NECK);
                        output.accept(ModItems.IRISH_COFFEE);
                        output.accept(ModItems.KIR);
                        output.accept(ModItems.LEMON_DROP);
                        output.accept(ModItems.LONG_ISLAND_ICED_TEA);
                        output.accept(ModItems.MAI_TAI);
                        output.accept(ModItems.MARGARITA);
                        output.accept(ModItems.MIMOSA);
                        output.accept(ModItems.MINT_JULEP);
                        output.accept(ModItems.MOJITO);
                        output.accept(ModItems.MOSCOW_MULE);
                        output.accept(ModItems.PINA_COLADA);
                        output.accept(ModItems.PISCO_SOUR);
                        output.accept(ModItems.RABO_DE_GALO);
                        output.accept(ModItems.SEA_BREEZE);
                        output.accept(ModItems.SEX_ON_THE_BEACH);
                        output.accept(ModItems.SINGAPORE_SLING);
                        output.accept(ModItems.TEQUILA_SUNRISE);
                        output.accept(ModItems.VESPER);
                        output.accept(ModItems.ZOMBIE);
                        output.accept(ModItems.BEES_KNEES);
                        output.accept(ModItems.BRAMBLE);
                        output.accept(ModItems.CANCHANCHARA);
                        output.accept(ModItems.CHARTREUSE_SWIZZLE);
                        output.accept(ModItems.DARK_N_STORMY);
                        output.accept(ModItems.DONS_SPECIAL_DAIQUIRI);
                        output.accept(ModItems.ESPRESSO_MARTINI);
                        output.accept(ModItems.FERNANDITO);
                        output.accept(ModItems.FRENCH_MARTINI);
                        output.accept(ModItems.GIN_BASIL_SMASH);
                        output.accept(ModItems.GRAND_MARGARITA);
                        output.accept(ModItems.IBA_TIKI);
                        output.accept(ModItems.ILLEGAL);
                        output.accept(ModItems.JUNGLE_BIRD);
                        output.accept(ModItems.MISSIONARYS_DOWNFALL);
                        output.accept(ModItems.NAKED_AND_FAMOUS);
                        output.accept(ModItems.NEW_YORK_SOUR);
                        output.accept(ModItems.OLD_CUBAN);
                        output.accept(ModItems.PALOMA);
                        output.accept(ModItems.PAPER_PLANE);
                        output.accept(ModItems.PENICILLIN);
                        output.accept(ModItems.PISCO_PUNCH);
                        output.accept(ModItems.PORN_STAR_MARTINI);
                        output.accept(ModItems.RUSSIAN_SPRING_PUNCH);
                        output.accept(ModItems.SHERRY_COBBLER);
                        output.accept(ModItems.SOUTH_SIDE);
                        output.accept(ModItems.SPICY_FIFTY);
                        output.accept(ModItems.SPRITZ);
                        output.accept(ModItems.SUFFERING_BASTARD);
                        output.accept(ModItems.THREE_DOTS_AND_A_DASH);
                        output.accept(ModItems.TIPPERARY);
                        output.accept(ModItems.TOMMYS_MARGARITA);
                        output.accept(ModItems.TRINIDAD_SOUR);
                        output.accept(ModItems.VENTO);

                        output.accept(ModItems.MICHELADA);
                        output.accept(ModItems.MULLED_WINE);
                        output.accept(ModItems.FOG_CUTTER);
                        output.accept(ModItems.NAVY_GROG);
                        output.accept(ModItems.SCORPION_BOWL);
                        output.accept(ModItems.HUMUHUMUNUKUNUKUAPUAA);
                        output.accept(ModItems.RUM_BARREL);
                        output.accept(ModItems.DOCTOR_FUNK);
                        output.accept(ModItems.VOLCANO_BOWL);
                        output.accept(ModItems.TIKI_BOWL);
                        output.accept(ModItems.RUM_RUNNER);
                        output.accept(ModItems.HAWAIIAN_SUNSET);
                        output.accept(ModItems.SATURN);
                        output.accept(ModItems.POLYNESIAN_PEARL);
                        output.accept(ModItems.LIQUID_MARIJUANA);
                        output.accept(ModItems.POG_PUNCH);
                        output.accept(ModItems.CANDY_APPLE);
                        output.accept(ModItems.DRAGONS_BLOOD);
                        output.accept(ModItems.TRIUMVIRATE_PUNCH);
                        output.accept(ModItems.BLUE_HAWAIIAN);
                        output.accept(ModItems.BANANA_DAIQUIRI);
                        output.accept(ModItems.HURRICANE);

                        output.accept(ModItems.SIDEWINDERS_FANG);
                        output.accept(ModItems.FISHBOWL);
                        output.accept(ModItems.BAHAMA_MAMA);
                        output.accept(ModItems.GREEN_SWIZZLE);
                        output.accept(ModItems.TIKI_MAX);
                        output.accept(ModItems.RUM_GIGGLE);
                        output.accept(ModItems.HALEKULANI);
                        output.accept(ModItems.THUNDERBIRD);
                        output.accept(ModItems.PARLAY_PUNCH);
                        output.accept(ModItems.ROYAL_HAWAIIAN);
                        output.accept(ModItems.RUM_AND_GRAPEFRUIT);
                        output.accept(ModItems.BRANDY_SMASH);
                        output.accept(ModItems.LYCHEE_SAKETINI);
                        output.accept(ModItems.MAYAN);
                        output.accept(ModItems.CANTARITOS);
                        output.accept(ModItems.ABSINTHE_SERVICE);
                        output.accept(ModItems.ST_GERMAIN_SPRITZ);
                        output.accept(ModItems.PIMMS_CUP);
                        output.accept(ModItems.PINEAPPLE_MOJITO);
                        output.accept(ModItems.M_AND_M);
                        output.accept(ModItems.GREEN_BEAST);
                        output.accept(ModItems.PEACHTREE_PUNCH);
                        output.accept(ModItems.TRADEWINDS);
                        output.accept(ModItems.MONKEY_BUSINESS);
                        output.accept(ModItems.AGRICOLE_GUAVA_COOLER);
                        output.accept(ModItems.PINATA);
                        output.accept(ModItems.BUMBOAT);
                        output.accept(ModItems.JAPANESE_PEAR);
                        output.accept(ModItems.FROZEN_MARGARITA);
                        output.accept(ModItems.SAKURA_MARTINI);
                        output.accept(ModItems.FRUIT_AND_NUT);
                        output.accept(ModItems.ECLIPSE);

                        output.accept(ModItems.COFFEE_GROG);
                        output.accept(ModItems.PEARL_DIVER);
                        output.accept(ModItems.HOT_BUTTERED_RUM);
                        output.accept(ModItems.BOOZY_EGGNOG);
                        output.accept(ModItems.SANGUINELLO);
                        output.accept(ModItems.DONS_GROG);
                        output.accept(ModItems.TI_PUNCH);
                        output.accept(ModItems.CENTER_OF_THE_GALAXY);
                        output.accept(ModItems.CALLALOO_COOLER);
                        output.accept(ModItems.SWIZZLE_FRANCAIS);
                        output.accept(ModItems.RUM_FLIP);
                        output.accept(ModItems.TWELVE_MILE_LIMIT);
                        output.accept(ModItems.BRANDY_SOUR);
                        output.accept(ModItems.LYCHEE_PUNCH);


                        output.accept(ModItems.CHARTS_ASTRONO_MAI_TAI);
                        output.accept(ModItems.SQUASHS_GIN_BASIL_SMASH);
                        output.accept(ModItems.TOADS_FROG_POND);
                        output.accept(ModItems.CABIN_FOUR_FIERY_UNDEAD);

                        output.accept(ModItems.LATTE);
                        output.accept(ModItems.MOCHA);
                        output.accept(ModItems.FLAVORED_LATTE);
                        output.accept(ModItems.FLAVORED_MOCHA);
                        output.accept(ModItems.CARAMEL_MACCHIATO);
                        output.accept(ModItems.FRAPPE);
                        output.accept(ModItems.VIETNAMESE_COFFEE);
                        output.accept(ModItems.CHAI_LATTE);
                        output.accept(ModItems.MATCHA_TEA);
                        output.accept(ModItems.MATCHA_LATTE);
                        output.accept(ModItems.FLAVORED_MATCHA_LATTE);
                        output.accept(ModItems.THAI_TEA);
                        output.accept(ModItems.LONDON_FOG_LATTE);
                        output.accept(ModItems.HORCHATA);
                        output.accept(ModItems.FRUITY_SODA);
                        output.accept(ModItems.SLUSHIE);
                        output.accept(ModItems.POG_JUICE);
                        output.accept(ModItems.TROPICAL_JUICE);
                        output.accept(ModItems.CRANCHERRY_JUICE);
                        output.accept(ModItems.CRANGRAPE_JUICE);
                        output.accept(ModItems.NIX_SMOOTHIE);
                        output.accept(ModItems.CHARTS_STARGAZER_SODA);
                        output.accept(ModItems.SQUASHS_BASIL_LEMONADE);
                        output.accept(ModItems.TOADS_SWIMMING_POOL_LEMONADE);
                        output.accept(ModItems.MULLED_CIDER);
                        output.accept(ModItems.MILK_BOBA_TEA);
                        output.accept(ModItems.FRUIT_BOBA_TEA);
                        output.accept(ModItems.THAI_BOBA_TEA);
                        output.accept(ModItems.TARO_BOBA_TEA);
                        output.accept(ModItems.BOBA_SLUSHIE);
                        output.accept(ModItems.BOBA_COFFEE);
                        output.accept(ModItems.BOBA_FRAPPE);


                        //output.accept(ModItems.);



                    }

                    ))
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
