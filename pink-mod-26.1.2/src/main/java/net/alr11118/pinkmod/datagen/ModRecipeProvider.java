package net.alr11118.pinkmod.datagen;

import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                //nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.PINKGOLD, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINKGOLD_BLOCK);

                shaped(RecipeCategory.MISC, ModItems.PINKGOLD)
                        .pattern("GGG")
                        .pattern("GCG")
                        .pattern("GGG")
                        .define('G', Items.GOLD_INGOT)
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                        .group("pink_gold")
                        .save(output, "pink_gold_from_copper_and_gold");

                shaped(RecipeCategory.MISC, ModBlocks.PINKGOLD_BLOCK)
                        .pattern("GGG")
                        .pattern("GGG")
                        .pattern("GGG")
                        .define('G', ModItems.PINKGOLD)
                        .unlockedBy(getHasName(ModItems.PINKGOLD), has(ModItems.PINKGOLD))
                        .group("pink_gold")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.PINKGOLD, 9)
                        .requires(ModBlocks.PINKGOLD_BLOCK)
                        .unlockedBy(getHasName(ModItems.PINKGOLD), has(ModBlocks.PINKGOLD_BLOCK))
                        .group("pink_gold")
                        .save(output, "pink_gold_from_pink_gold_block");
            }
        };
    }

    @Override
    public String getName() {
        return "PinkMod Recipes";
    }
}
