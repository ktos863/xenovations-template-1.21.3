package com.xenon863.xenovations.datagen;

import com.xenon863.xenovations.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.ANDESITE_BRICK_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);

        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICK_SLAB, slabDrops(ModBlocks.DIORITE_BRICK_SLAB));
        addDrop(ModBlocks.DIORITE_BRICK_WALL);

        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICK_SLAB, slabDrops(ModBlocks.GRANITE_BRICK_SLAB));
        addDrop(ModBlocks.GRANITE_BRICK_WALL);

        addDrop(ModBlocks.WHITE_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.RED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.LIME_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.PINK_TERRACOTTA_BRICKS);

        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.CYAN_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BRICKS);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_BRICKS);
    }
}
