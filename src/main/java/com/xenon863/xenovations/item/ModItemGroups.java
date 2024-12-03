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

    public static void registerItemGroups(){
        Xenovations.LOGGER.info("Registering Item Groups for " + Xenovations.MOD_ID);
    }
}
