
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import java.util.List;
import java.util.ArrayList;

import com.pengull.meatcraft.item.Test1Item;
import com.pengull.meatcraft.item.NmjItem;
import com.pengull.meatcraft.item.CumsocksItem;
import com.pengull.meatcraft.item.CumJarItem;
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
	public static final Item NMJ = register(new NmjItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
