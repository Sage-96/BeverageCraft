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
                        output.accept(ModItems.AQUAFABA);
                        output.accept(ModItems.SYRUP);
                        output.accept(ModItems.VANILLA_SYRUP);
                        output.accept(ModItems.ORGEAT_SYRUP);
                        output.accept(ModItems.FRUIT_SYRUP);
                        output.accept(ModItems.SPICE_SYRUP);
                        output.accept(ModItems.MOLASSES);
                        output.accept(ModItems.SODA);
                        output.accept(ModItems.BEER);
                        output.accept(ModItems.WINE);
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


                        //output.accept(ModItems.);



                    }

                    ))
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
