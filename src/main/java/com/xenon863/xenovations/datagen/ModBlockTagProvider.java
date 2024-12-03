package com.xenon863.xenovations.datagen;

import com.xenon863.xenovations.block.ModBlocks;
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
                .add(ModBlocks.GRANITE_BRICK_WALL);

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
