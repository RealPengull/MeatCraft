
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import com.pengull.meatcraft.item.Test1Item;
import com.pengull.meatcraft.item.CumsocksItem;
import com.pengull.meatcraft.item.CumJarItem;
import com.pengull.meatcraft.item.CookedChickAxeItem;
import com.pengull.meatcraft.item.ChickAxeItem;
import com.pengull.meatcraft.item.AnvilGunItem;
import com.pengull.meatcraft.item.AirpodsItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MeatcraftModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item AIRPODS_HELMET = register(new AirpodsItem.Helmet());
	public static final Item CUMSOCKS_BOOTS = register(new CumsocksItem.Boots());
	public static final Item TEST = register(
			new SpawnEggItem(MeatcraftModEntities.TEST, -16711681, -1, new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT))
					.setRegistryName("test_spawn_egg"));
	public static final Item TEST_1 = register(new Test1Item());
	public static final Item DREAM = register(
			new SpawnEggItem(MeatcraftModEntities.DREAM, -1, -16410110, new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT))
					.setRegistryName("dream_spawn_egg"));
	public static final Item ANVIL_GUN = register(new AnvilGunItem());
	public static final Item CUM_JAR = register(new CumJarItem());
	public static final Item CHICK_AXE = register(new ChickAxeItem());
	public static final Item COOKED_CHICK_AXE = register(new CookedChickAxeItem());
	public static final Item MEAT_TABLE = register(MeatcraftModBlocks.MEAT_TABLE, MeatcraftModTabs.TAB_MEATCRAFT);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
