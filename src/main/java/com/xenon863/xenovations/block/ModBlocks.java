package com.xenon863.xenovations.block;

import com.xenon863.xenovations.Xenovations;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
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

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "diorite_bricks")))
                    .strength(1.5f, 6f).requiresTool()));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs", new StairsBlock
            (ModBlocks.DIORITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                    Identifier.of(Xenovations.MOD_ID, "diorite_brick_stairs"))).requiresTool()));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab", new SlabBlock
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "diorite_brick_slab")))
                    .strength(1.5f, 6f).requiresTool()));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall", new WallBlock
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "diorite_brick_wall")))
                    .strength(1.5f, 6f).requiresTool()));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "granite_bricks")))
                    .strength(1.5f, 6f).requiresTool()));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs", new StairsBlock
            (ModBlocks.GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                    Identifier.of(Xenovations.MOD_ID, "granite_brick_stairs"))).requiresTool()));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab", new SlabBlock
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "granite_brick_slab")))
                    .strength(1.5f, 6f).requiresTool()));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall", new WallBlock
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "granite_brick_wall")))
                    .strength(1.5f, 6f).requiresTool()));

    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "white_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "light_gray_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "gray_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "black_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "brown_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "red_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "orange_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "yellow_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "lime_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "green_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "cyan_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "light_blue_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "blue_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "purple_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "magenta_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "pink_terracotta_bricks")))
                    .strength(1.25f, 4.2f).requiresTool()));

    public static final Block WHITE_GLAZED_TERRACOTTA_BRICKS = registerBlock("white_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "white_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_BRICKS = registerBlock("light_gray_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "light_gray_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block GRAY_GLAZED_TERRACOTTA_BRICKS = registerBlock("gray_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "gray_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block BLACK_GLAZED_TERRACOTTA_BRICKS = registerBlock("black_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "black_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block BROWN_GLAZED_TERRACOTTA_BRICKS = registerBlock("brown_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "brown_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block RED_GLAZED_TERRACOTTA_BRICKS = registerBlock("red_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "red_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block ORANGE_GLAZED_TERRACOTTA_BRICKS = registerBlock("orange_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "orange_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block YELLOW_GLAZED_TERRACOTTA_BRICKS = registerBlock("yellow_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "yellow_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block LIME_GLAZED_TERRACOTTA_BRICKS = registerBlock("lime_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "lime_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block GREEN_GLAZED_TERRACOTTA_BRICKS = registerBlock("green_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "green_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block CYAN_GLAZED_TERRACOTTA_BRICKS = registerBlock("cyan_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "cyan_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_BRICKS = registerBlock("light_blue_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "light_blue_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block BLUE_GLAZED_TERRACOTTA_BRICKS = registerBlock("blue_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "blue_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block PURPLE_GLAZED_TERRACOTTA_BRICKS = registerBlock("purple_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "purple_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA_BRICKS = registerBlock("magenta_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "magenta_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));
    public static final Block PINK_GLAZED_TERRACOTTA_BRICKS = registerBlock("pink_glazed_terracotta_bricks", new Block
            (AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Xenovations.MOD_ID, "pink_glazed_terracotta_bricks")))
                    .strength(1.4f, 1.4f).requiresTool().pistonBehavior(PistonBehavior.PUSH_ONLY)));

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
