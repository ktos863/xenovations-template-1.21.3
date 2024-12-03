package com.xenon863.xenovations.block;

import com.xenon863.xenovations.Xenovations;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "andesite_bricks")))
                    .strength(1.5f, 6f).requiresTool()));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs", new StairsBlock
            (ModBlocks.ANDESITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                    Identifier.of(Xenovations.MOD_ID, "andesite_brick_stairs"))).requiresTool()));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab", new SlabBlock
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "andesite_brick_slab")))
                    .strength(1.5f, 6f).requiresTool()));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall", new WallBlock
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "andesite_brick_wall")))
                    .strength(1.5f, 6f).requiresTool()));

    public static void registerModBlocks(){
        Xenovations.LOGGER.info("Registering blocks for " + Xenovations.MOD_ID);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Xenovations.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Xenovations.MOD_ID, name), new BlockItem(block, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Xenovations.MOD_ID, name)))));
    }
}
