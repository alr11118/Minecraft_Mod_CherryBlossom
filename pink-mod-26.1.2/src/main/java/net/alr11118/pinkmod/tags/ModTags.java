package net.alr11118.pinkmod.tags;

import net.alr11118.pinkmod.PinkMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PINKGOLD_TOOL = createTag("needs_pinkgold_tool");
        public static final TagKey<Block> INCORRECT_FOR_PINKGOLD_TOOL = createTag("incorrect_for_pinkgold_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> PINKGOLD_REPAIR = createTag("pinkgold_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PinkMod.MOD_ID, name));
        }
    }
}
