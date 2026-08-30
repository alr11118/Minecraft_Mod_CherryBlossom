package net.alr11118.pinkmod.creativemodetab;

import net.alr11118.pinkmod.PinkMod;
import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final CreativeModeTab PINKGOLD_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "pink_gold_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PINKGOLD))
                    .title(Component.translatable("creativemodetab.pinkmode.pinkgold_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.PINKGOLD);

                        output.accept(ModItems.PINKGOLD_SWORD);
                        output.accept(ModItems.PINKGOLD_PICKAXE);
                        output.accept(ModItems.PINKGOLD_SHOVEL);
                        output.accept(ModItems.PINKGOLD_AXE);
                        output.accept(ModItems.PINKGOLD_HOE);
                    })
                    .build());

    public static final CreativeModeTab PINKGOLD_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, "pink_gold_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PINKGOLD_BLOCK))
                    .title(Component.translatable("creativemodetab.pinkmode.pinkgold_block"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.PINKGOLD_BLOCK);
                    })
                    .build());

    public static void registerModCreativeModeTabs() {
        PinkMod.LOGGER.info("Registering Creative Mode Tabs for " + PinkMod.MOD_ID);

        // Tools & Utilities
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register(output -> {
                    output.accept(ModItems.PINKGOLD_PICKAXE);
                    output.accept(ModItems.PINKGOLD_SHOVEL);
                    output.accept(ModItems.PINKGOLD_AXE);
                    output.accept(ModItems.PINKGOLD_HOE);
                });

        // Combat
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register(output -> {
                    output.accept(ModItems.PINKGOLD_SWORD);
                });
    }
}
