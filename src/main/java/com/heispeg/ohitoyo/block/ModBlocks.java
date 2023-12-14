package com.heispeg.ohitoyo.block;

import java.util.function.Supplier;

import com.heispeg.ohitoyo.Ohitoyo;
import com.heispeg.ohitoyo.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, Ohitoyo.MODID);
	
	public static final RegistryObject<Block> COOKIE_BLOCK = 
			registerBlock("cookie_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK)));
	
	private static <T extends Block> RegistryObject<T> registerBlock(String name,
			Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block); 
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
			RegistryObject<T> block) {
		return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
