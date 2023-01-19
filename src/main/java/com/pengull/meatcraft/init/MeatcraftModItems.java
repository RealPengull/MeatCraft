
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.pengull.meatcraft.item.Test1Item;
import com.pengull.meatcraft.item.SuperAppleBombItem;
import com.pengull.meatcraft.item.StickybombItem;
import com.pengull.meatcraft.item.GodlyAppleBombItem;
import com.pengull.meatcraft.item.GlueItem;
import com.pengull.meatcraft.item.EmptyJarItem;
import com.pengull.meatcraft.item.CumsocksItem;
import com.pengull.meatcraft.item.CumJarItem;
import com.pengull.meatcraft.item.CookedChickAxeItem;
import com.pengull.meatcraft.item.ChickAxeItem;
import com.pengull.meatcraft.item.AnvilGunItem;
import com.pengull.meatcraft.item.AirpodsItem;
import com.pengull.meatcraft.MeatcraftMod;

public class MeatcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MeatcraftMod.MODID);
	public static final RegistryObject<Item> AIRPODS_HELMET = REGISTRY.register("airpods_helmet", () -> new AirpodsItem.Helmet());
	public static final RegistryObject<Item> CUMSOCKS_BOOTS = REGISTRY.register("cumsocks_boots", () -> new CumsocksItem.Boots());
	public static final RegistryObject<Item> DEFAULTDANCE = REGISTRY.register("defaultdance", () -> new Test1Item());
	public static final RegistryObject<Item> DREAM = REGISTRY.register("dream_spawn_egg",
			() -> new ForgeSpawnEggItem(MeatcraftModEntities.DREAM, -1, -16410110, new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT)));
	public static final RegistryObject<Item> ANVIL_GUN = REGISTRY.register("anvil_gun", () -> new AnvilGunItem());
	public static final RegistryObject<Item> CHICK_AXE = REGISTRY.register("chick_axe", () -> new ChickAxeItem());
	public static final RegistryObject<Item> COOKED_CHICK_AXE = REGISTRY.register("cooked_chick_axe", () -> new CookedChickAxeItem());
	public static final RegistryObject<Item> MEAT_TABLE = block(MeatcraftModBlocks.MEAT_TABLE, MeatcraftModTabs.TAB_MEATCRAFT);
	public static final RegistryObject<Item> EMPTY_JAR = REGISTRY.register("empty_jar", () -> new EmptyJarItem());
	public static final RegistryObject<Item> CUM_JAR = REGISTRY.register("cum_jar", () -> new CumJarItem());
	public static final RegistryObject<Item> PEPIG = REGISTRY.register("pepig_spawn_egg",
			() -> new ForgeSpawnEggItem(MeatcraftModEntities.PEPIG, -1, -2646982, new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT)));
	public static final RegistryObject<Item> APPLEBOMB = REGISTRY.register("applebomb", () -> new StickybombItem());
	public static final RegistryObject<Item> SUPER_APPLE_BOMB = REGISTRY.register("super_apple_bomb", () -> new SuperAppleBombItem());
	public static final RegistryObject<Item> GODLY_APPLE_BOMB = REGISTRY.register("godly_apple_bomb", () -> new GodlyAppleBombItem());
	public static final RegistryObject<Item> GLUE = REGISTRY.register("glue", () -> new GlueItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
