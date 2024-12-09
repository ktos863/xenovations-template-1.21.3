package com.xenon863.xenovations.datagen;

import com.xenon863.xenovations.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //BUILDING BLOCKS
        BlockStateModelGenerator.BlockTexturePool andesiteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        andesiteBricks.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricks.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricks.wall(ModBlocks.ANDESITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool dioriteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        dioriteBricks.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricks.slab(ModBlocks.DIORITE_BRICK_SLAB);
        dioriteBricks.wall(ModBlocks.DIORITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool graniteBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        graniteBricks.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        graniteBricks.slab(ModBlocks.GRANITE_BRICK_SLAB);
        graniteBricks.wall(ModBlocks.GRANITE_BRICK_WALL);



        //COLORED BLOCKS
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_TERRACOTTA_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GLAZED_TERRACOTTA_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
