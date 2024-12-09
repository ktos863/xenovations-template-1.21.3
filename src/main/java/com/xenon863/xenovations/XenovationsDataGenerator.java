package com.xenon863.xenovations;

import com.xenon863.xenovations.datagen.ModBlockLootTableProvider;
import com.xenon863.xenovations.datagen.ModBlockTagProvider;
import com.xenon863.xenovations.datagen.ModModelProvider;
import com.xenon863.xenovations.datagen.recipes.ModBuildingBlocksRecipeProvider;
import com.xenon863.xenovations.datagen.recipes.ModDecorationsRecipeProvider;
import com.xenon863.xenovations.datagen.recipes.ModStonecutterRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;

public class XenovationsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModModelProvider::new);

		pack.addProvider(ModBuildingBlocksRecipeProvider::new);
		pack.addProvider(ModDecorationsRecipeProvider::new);
		pack.addProvider(ModStonecutterRecipeProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder){

	}
}
