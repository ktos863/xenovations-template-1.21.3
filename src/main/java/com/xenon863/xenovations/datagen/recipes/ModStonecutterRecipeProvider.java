package com.xenon863.xenovations.datagen.recipes;

import com.xenon863.xenovations.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModStonecutterRecipeProvider extends FabricRecipeProvider {
    public ModStonecutterRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, ModBlocks.ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, ModBlocks.ANDESITE_BRICK_STAIRS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, ModBlocks.ANDESITE_BRICK_SLAB, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE, ModBlocks.ANDESITE_BRICK_WALL);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_STAIRS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_WALL);
            }
        };
    }

    @Override
    public String getName() {
        return "Xenovations Stonecutter Recipe";
    }
}
