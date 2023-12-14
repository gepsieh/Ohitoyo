package com.heispeg.ohitoyo.item;

import com.heispeg.ohitoyo.Ohitoyo;
import com.heispeg.ohitoyo.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ohitoyo.MODID);
	
	public static final RegistryObject<CreativeModeTab> OHITOYO_ITEM_TAB = 
			CREATIVE_MODE_TABS.register("ohitoyo_item_tab", () -> CreativeModeTab.builder()
					.title(Component.translatable("creativetab.ohitoyo_item_tab"))
					.icon(() -> new ItemStack(ModItems.NORMAL_COOKIE.get()))
					.displayItems((pParameters, pOutput) -> {
						pOutput.accept(ModItems.NORMAL_COOKIE.get());
						pOutput.accept(ModItems.DUBIOUS_COOKIE.get());
					})
					.build());
	
	public static final RegistryObject<CreativeModeTab> OHITOYO_BLOCK_TAB = 
			CREATIVE_MODE_TABS.register("ohitoyo_block_tab", () -> CreativeModeTab.builder()
					.title(Component.translatable("creativetab.ohitoyo_block_tab"))
					.icon(() -> new ItemStack(ModItems.NORMAL_COOKIE.get()))
					.displayItems((pParameters, pOutput) -> {
						pOutput.accept(ModBlocks.COOKIE_BLOCK.get());
					})
					.build());
	
	public static void register(IEventBus event) {
		CREATIVE_MODE_TABS.register(event);
	}
}
