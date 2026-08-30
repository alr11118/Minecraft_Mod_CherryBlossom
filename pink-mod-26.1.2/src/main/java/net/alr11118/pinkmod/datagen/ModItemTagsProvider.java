package net.alr11118.pinkmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.alr11118.pinkmod.item.ModItems;
import net.alr11118.pinkmod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.PINKGOLD);

        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.PINKGOLD_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.PINKGOLD_PICKAXE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.PINKGOLD_SHOVEL);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.PINKGOLD_AXE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.PINKGOLD_HOE);
    }
}
