package net.alr11118.pinkmod.datagen;

import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.item.ModArmorMaterials;
import net.alr11118.pinkmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators)  {
        blockModelGenerators.createTrivialCube(ModBlocks.PINKGOLD_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.PINKGOLD, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.PINKGOLD_SWORD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINKGOLD_PICKAXE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINKGOLD_SHOVEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINKGOLD_AXE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PINKGOLD_HOE, ModelTemplates.FLAT_ITEM);

        itemModelGenerators.generateTrimmableItem(ModItems.PINKGOLD_HELMET, ModArmorMaterials.PINKGOLD_KEY,
                ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(ModItems.PINKGOLD_CHESTPLATE, ModArmorMaterials.PINKGOLD_KEY,
                ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(ModItems.PINKGOLD_LEGGINGS, ModArmorMaterials.PINKGOLD_KEY,
                ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(ModItems.PINKGOLD_BOOTS, ModArmorMaterials.PINKGOLD_KEY,
                ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
    }
}
