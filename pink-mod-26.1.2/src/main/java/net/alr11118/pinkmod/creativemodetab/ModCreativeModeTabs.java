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
            Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "pink_gold_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PINKGOLD))
                    .title(Component.translatable("creativemodetab.pinkmode.fluorite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.PINKGOLD);
                    })
                    .build());

    public static final CreativeModeTab PINKGOLD_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "pink_gold_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PINKGOLD_BLOCK))
                    .title(Component.translatable("creativemodetab.pinkmode.pink_gold_block"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.PINKGOLD_BLOCK);
                    })
                    .build());

    public static void registerModCreativeModeTabs() {
        PinkMod.LOGGER.info("Registering Creative Mode Tabs for " + PinkMod.MOD_ID);
    }
}
