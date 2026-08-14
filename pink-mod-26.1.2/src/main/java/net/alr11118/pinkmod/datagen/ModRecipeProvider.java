package net.alr11118.pinkmod.datagen;

import net.alr11118.pinkmod.block.ModBlocks;
import net.alr11118.pinkmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
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

                /*
                shaped(RecipeCategory.MISC, ModBlocks.PINKGOLD_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.PINKGOLD)
                        .unlockedBy(getHasName(ModItems.PINKGOLD), has(ModItems.PINKGOLD))
                        .group("pink_gold")
                        .save(output);
                 */

                shapeless(RecipeCategory.MISC, ModItems.PINKGOLD, 9)
                        .requires(ModBlocks.PINKGOLD_BLOCK)
                        .unlockedBy(getHasName(ModItems.PINKGOLD), has(ModBlocks.PINKGOLD_BLOCK))
                        .group("pink_gold")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "PinkMod Recipes";
    }
}
