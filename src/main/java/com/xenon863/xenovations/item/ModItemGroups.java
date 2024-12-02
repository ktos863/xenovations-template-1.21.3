package com.xenon863.xenovations.item;

import com.xenon863.xenovations.Xenovations;
import com.xenon863.xenovations.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class ModItemGroups {

    public static final ItemGroup XENOVATIONS_BUILDING_BLOCKS = FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.xenovations.xenovations_building_blocks"))
            .icon(() -> new ItemStack(ModBlocks.ANDESITE_BRICKS))
            .entries(((displayContext, entries) -> {
                entries.add(ModBlocks.ANDESITE_BRICKS);
                entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                entries.add(ModBlocks.ANDESITE_BRICK_WALL);
            })).build();


    public static void registerItemGroups(){
        Xenovations.LOGGER.info("Registering Item Groups for " + Xenovations.MOD_ID);
    }
}
