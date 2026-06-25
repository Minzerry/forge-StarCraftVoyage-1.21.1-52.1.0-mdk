package com.minzerry.starcraftvoyage.item;

import com.minzerry.starcraftvoyage.StarCraftVoyage;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StarCraftVoyage.MOD_ID);

    public static final RegistryObject<Item> MINERALS = ITEMS.register("minerals",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VESPENEGAS = ITEMS.register("vespenegas",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIOMASS = ITEMS.register("biomass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KHAYDARINSHARDS = ITEMS.register("khaydarinshards",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
