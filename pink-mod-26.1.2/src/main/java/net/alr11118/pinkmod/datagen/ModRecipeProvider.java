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
                List<ItemLike> FLUORIDE_SMELTABLES = List.of(ModItems.RAW_FLUORITE,
                        ModBlocks.FLUORITE_ORE,
                        ModBlocks.FLUORITE_DEEPSLATE_ORE);

                oreSmelting(FLUORIDE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.FLUORITE, 0.25f, 200, "fluorite");
                oreBlasting(FLUORIDE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.FLUORITE, 0.25f, 100, "fluorite");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.FLUORITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUORITE_BLOCK);

                shaped(RecipeCategory.MISC, ModBlocks.RAW_FLUORITE_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ModItems.RAW_FLUORITE)
                        .unlockedBy(getHasName(ModItems.RAW_FLUORITE), has(ModItems.RAW_FLUORITE))
                        .group("fluoride")
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.RAW_FLUORITE, 9)
                        .requires(ModBlocks.RAW_FLUORITE_BLOCK)
                        .unlockedBy(getHasName(ModItems.RAW_FLUORITE), has(ModBlocks.RAW_FLUORITE_BLOCK))
                        .group("fluoride")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "PinkMod Recipes";
    }
}
