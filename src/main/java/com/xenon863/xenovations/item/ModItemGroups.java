package com.xenon863.xenovations.item;

import com.xenon863.xenovations.Xenovations;
import com.xenon863.xenovations.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup XENOVATIONS_BUILDING_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Xenovations.MOD_ID, "xenovations_building_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ANDESITE_BRICKS))
                    .displayName(Text.translatable("itemgroup.xenovations.xenovations_building_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);
                        entries.add(ModBlocks.DIORITE_BRICKS);
                        entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIORITE_BRICK_SLAB);
                        entries.add(ModBlocks.DIORITE_BRICK_WALL);
                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.GRANITE_BRICK_SLAB);
                        entries.add(ModBlocks.GRANITE_BRICK_WALL);
                    })).build());

    public static final ItemGroup XENOVATIONS_COLORED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Xenovations.MOD_ID, "xenovations_colored_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CYAN_TERRACOTTA_BRICKS))
                    .displayName(Text.translatable("itemgroup.xenovations.xenovations_colored_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.RED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_BRICKS);

                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_BRICKS);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_BRICKS);
                    })).build());

    public static void registerItemGroups(){
        Xenovations.LOGGER.info("Registering Item Groups for " + Xenovations.MOD_ID);
    }
}
