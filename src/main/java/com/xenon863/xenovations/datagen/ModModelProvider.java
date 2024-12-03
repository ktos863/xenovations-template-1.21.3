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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
