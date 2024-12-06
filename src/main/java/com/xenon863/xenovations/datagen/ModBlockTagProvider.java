package com.xenon863.xenovations.datagen;

import com.xenon863.xenovations.block.ModBlocks;
import com.xenon863.xenovations.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.ANDESITE_BRICK_WALL)

                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICK_STAIRS)
                .add(ModBlocks.DIORITE_BRICK_SLAB)
                .add(ModBlocks.DIORITE_BRICK_WALL)

                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_BRICK_STAIRS)
                .add(ModBlocks.GRANITE_BRICK_SLAB)
                .add(ModBlocks.GRANITE_BRICK_WALL)

                .add(ModBlocks.WHITE_TERRACOTTA_BRICKS)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)
                .add(ModBlocks.GRAY_TERRACOTTA_BRICKS)
                .add(ModBlocks.BLACK_TERRACOTTA_BRICKS)
                .add(ModBlocks.BROWN_TERRACOTTA_BRICKS)
                .add(ModBlocks.RED_TERRACOTTA_BRICKS)
                .add(ModBlocks.ORANGE_TERRACOTTA_BRICKS)
                .add(ModBlocks.YELLOW_TERRACOTTA_BRICKS)
                .add(ModBlocks.LIME_TERRACOTTA_BRICKS)
                .add(ModBlocks.GREEN_TERRACOTTA_BRICKS)
                .add(ModBlocks.CYAN_TERRACOTTA_BRICKS)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)
                .add(ModBlocks.BLUE_TERRACOTTA_BRICKS)
                .add(ModBlocks.PURPLE_TERRACOTTA_BRICKS)
                .add(ModBlocks.MAGENTA_TERRACOTTA_BRICKS)
                .add(ModBlocks.PINK_TERRACOTTA_BRICKS)

                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.RED_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BRICKS)
                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_BRICKS);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.DIORITE_BRICK_STAIRS)
                .add(ModBlocks.GRANITE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.DIORITE_BRICK_SLAB)
                .add(ModBlocks.GRANITE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ANDESITE_BRICK_WALL)
                .add(ModBlocks.DIORITE_BRICK_WALL)
                .add(ModBlocks.GRANITE_BRICK_WALL);

    }
}
