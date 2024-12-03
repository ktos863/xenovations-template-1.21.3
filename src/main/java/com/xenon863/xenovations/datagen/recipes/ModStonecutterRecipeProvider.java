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
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_BRICKS, Blocks.WHITE_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Blocks.LIGHT_GRAY_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_BRICKS, Blocks.GRAY_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_BRICKS, Blocks.BLACK_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_BRICKS, Blocks.BROWN_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_BRICKS, Blocks.RED_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_BRICKS, Blocks.ORANGE_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_BRICKS, Blocks.YELLOW_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_BRICKS, Blocks.LIME_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_BRICKS, Blocks.GREEN_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_BRICKS, Blocks.CYAN_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Blocks.LIGHT_BLUE_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_BRICKS, Blocks.BLUE_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_BRICKS, Blocks.PURPLE_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS, Blocks.MAGENTA_TERRACOTTA);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_BRICKS, Blocks.PINK_TERRACOTTA);
            }
        };
    }


    @Override
    public String getName() {
        return "Xenovations Stonecutter Recipe";
    }
}
