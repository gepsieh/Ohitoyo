package com.heispeg.ohitoyo.item;

import com.heispeg.ohitoyo.Ohitoyo;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, Ohitoyo.MODID);
	
	public static final RegistryObject<Item> NORMAL_COOKIE = ITEMS.register("normal_cookie", 
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> DUBIOUS_COOKIE = ITEMS.register("dubious_cookie", 
			() -> new Item(new Item.Properties()));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
