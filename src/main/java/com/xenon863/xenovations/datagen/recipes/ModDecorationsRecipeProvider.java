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

public class ModDecorationsRecipeProvider extends FabricRecipeProvider {
    public ModDecorationsRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.WHITE_TERRACOTTA)
                        .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.LIGHT_GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.GRAY_TERRACOTTA)
                        .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.BLACK_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.BROWN_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.BROWN_TERRACOTTA)
                        .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.RED_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.RED_TERRACOTTA)
                        .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.ORANGE_TERRACOTTA)
                        .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.YELLOW_TERRACOTTA)
                        .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.LIME_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.LIME_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.GREEN_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.GREEN_TERRACOTTA)
                        .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.CYAN_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.CYAN_TERRACOTTA)
                        .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.LIGHT_BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.BLUE_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.BLUE_TERRACOTTA)
                        .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.PURPLE_TERRACOTTA)
                        .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.MAGENTA_TERRACOTTA)
                        .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.DECORATIONS, ModBlocks.PINK_TERRACOTTA_BRICKS, 4)
                        .pattern("TT")
                        .pattern("TT")
                        .input('T', Blocks.PINK_TERRACOTTA)
                        .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
