package com.xenon863.xenovations;

import com.xenon863.xenovations.block.ModBlocks;
import com.xenon863.xenovations.item.ModItemGroups;
import com.xenon863.xenovations.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xenovations implements ModInitializer {
	public static final String MOD_ID = "xenovations";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}