package net.alr11118.pinkmod.datagen;

import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider{

    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PINKGOLD_BLOCK);

        // Create the iron-level tag
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINKGOLD_BLOCK);

        // Pinkgold tool can mine everything in the iron-level tag
        valueLookupBuilder(ModTags.Blocks.NEEDS_PINKGOLD_TOOL)
                .add(ModBlocks.PINKGOLD_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        // Diamond-level blocks are too hard for Pinkgold
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PINKGOLD_BLOCK);

        valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_PINKGOLD_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
