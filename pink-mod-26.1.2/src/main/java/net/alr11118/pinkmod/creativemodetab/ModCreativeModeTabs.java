package net.alr11118.pinkmod.creativemodetab;

import net.alr11118.pinkmod.PinkMod;
import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "fluorite_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE))
                    .title(Component.translatable("creativemodetab.pinkmode.fluorite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FLUORITE);
                        output.accept(ModItems.RAW_FLUORITE);
                    })
                    .build());

    public static final CreativeModeTab FLUORITE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "fluorite_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.FLUORITE_BLOCK))
                    .title(Component.translatable("creativemodetab.pinkmode.fluorite_block"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.FLUORITE_BLOCK);
                        output.accept(ModBlocks.RAW_FLUORITE_BLOCK);
                        output.accept(ModBlocks.FLUORITE_ORE);
                        output.accept(ModBlocks.FLUORITE_DEEPSLATE_ORE);
                    })
                    .build());

    public static void registerModCreativeModeTabs() {
        PinkMod.LOGGER.info("Registering Creative Mode Tabs for " + PinkMod.MOD_ID);
    }
}
