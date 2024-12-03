package com.xenon863.xenovations.item;

import com.xenon863.xenovations.Xenovations;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Xenovations.MOD_ID, name), item);
    }

    public static void RegisterModItems(){

    }
}
