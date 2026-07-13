package net.alr11118.pinkmod;

import net.alr11118.pinkmod.datagen.ModBlockLootTableProvider;
import net.alr11118.pinkmod.datagen.ModBlockTagsProvider;
import net.alr11118.pinkmod.datagen.ModModelProvider;
import net.alr11118.pinkmod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PinkModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
