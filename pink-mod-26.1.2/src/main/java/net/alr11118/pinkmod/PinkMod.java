package net.alr11118.pinkmod;

import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.creativemodetab.ModCreativeModeTabs;
import net.alr11118.pinkmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PinkMod implements ModInitializer {
	public static final String MOD_ID = "pinkmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
