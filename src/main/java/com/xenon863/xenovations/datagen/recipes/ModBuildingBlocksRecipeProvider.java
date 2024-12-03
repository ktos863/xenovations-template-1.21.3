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

public class ModBuildingBlocksRecipeProvider extends FabricRecipeProvider {
    public ModBuildingBlocksRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, 4)
                        .pattern("AA")
                        .pattern("AA")
                        .input('A', Blocks.POLISHED_ANDESITE)
                        .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, 6)
                        .pattern("A  ")
                        .pattern("AA ")
                        .pattern("AAA")
                        .input('A', ModBlocks.ANDESITE_BRICKS)
                        .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, 6)
                        .pattern("AAA")
                        .input('A', ModBlocks.ANDESITE_BRICKS)
                        .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, 6)
                        .pattern("AAA")
                        .pattern("AAA")
                        .input('A', ModBlocks.ANDESITE_BRICKS)
                        .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, 4)
                        .pattern("DD")
                        .pattern("DD")
                        .input('D', Blocks.POLISHED_DIORITE)
                        .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, 6)
                        .pattern("D  ")
                        .pattern("DD ")
                        .pattern("DDD")
                        .input('D', ModBlocks.DIORITE_BRICKS)
                        .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, 6)
                        .pattern("DDD")
                        .input('D', ModBlocks.DIORITE_BRICKS)
                        .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, 6)
                        .pattern("DDD")
                        .pattern("DDD")
                        .input('D', ModBlocks.DIORITE_BRICKS)
                        .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, 4)
                        .pattern("GG")
                        .pattern("GG")
                        .input('G', Blocks.POLISHED_GRANITE)
                        .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, 6)
                        .pattern("G  ")
                        .pattern("GG ")
                        .pattern("GGG")
                        .input('G', ModBlocks.GRANITE_BRICKS)
                        .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, 6)
                        .pattern("GGG")
                        .input('G', ModBlocks.GRANITE_BRICKS)
                        .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                        .offerTo(recipeExporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, 6)
                        .pattern("GGG")
                        .pattern("GGG")
                        .input('G', ModBlocks.GRANITE_BRICKS)
                        .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Xenovations Building Blocks Recipes";
    }
}
