
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
import com.pengull.meatcraft.item.Raw_beefSwordItem;
import com.pengull.meatcraft.item.Raw_beefShovelItem;
import com.pengull.meatcraft.item.Raw_beefPickaxeItem;
import com.pengull.meatcraft.item.Raw_beefAxeItem;
import com.pengull.meatcraft.item.Raw_PorkSwordItem;
import com.pengull.meatcraft.item.Raw_PorkShovelItem;
import com.pengull.meatcraft.item.Raw_PorkPickaxeItem;
import com.pengull.meatcraft.item.Raw_PorkAxeItem;
import com.pengull.meatcraft.item.Raw_MuttonSwordItem;
import com.pengull.meatcraft.item.Raw_MuttonShovelItem;
import com.pengull.meatcraft.item.Raw_MuttonPickaxeItem;
import com.pengull.meatcraft.item.Raw_MuttonAxeItem;
import com.pengull.meatcraft.item.GodlyAppleBombItem;
import com.pengull.meatcraft.item.GlueItem;
import com.pengull.meatcraft.item.EmptyJarItem;
import com.pengull.meatcraft.item.CumsocksItem;
import com.pengull.meatcraft.item.CumJarItem;
import com.pengull.meatcraft.item.Cooked_muttonSwordItem;
import com.pengull.meatcraft.item.Cooked_muttonShovelItem;
import com.pengull.meatcraft.item.Cooked_muttonPickaxeItem;
import com.pengull.meatcraft.item.Cooked_muttonAxeItem;
import com.pengull.meatcraft.item.Cooked_PorkSwordItem;
import com.pengull.meatcraft.item.Cooked_PorkShovelItem;
import com.pengull.meatcraft.item.Cooked_PorkPickaxeItem;
import com.pengull.meatcraft.item.Cooked_PorkAxeItem;
import com.pengull.meatcraft.item.Cooked_BeefSwordItem;
import com.pengull.meatcraft.item.Cooked_BeefShovelItem;
import com.pengull.meatcraft.item.Cooked_BeefPickaxeItem;
import com.pengull.meatcraft.item.Cooked_BeefAxeItem;
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
	public static final RegistryObject<Item> RAW_PORK_PICKAXE = REGISTRY.register("raw_pork_pickaxe", () -> new Raw_PorkPickaxeItem());
	public static final RegistryObject<Item> RAW_PORK_AXE = REGISTRY.register("raw_pork_axe", () -> new Raw_PorkAxeItem());
	public static final RegistryObject<Item> RAW_PORK_SWORD = REGISTRY.register("raw_pork_sword", () -> new Raw_PorkSwordItem());
	public static final RegistryObject<Item> RAW_PORK_SHOVEL = REGISTRY.register("raw_pork_shovel", () -> new Raw_PorkShovelItem());
	public static final RegistryObject<Item> RAW_BEEF_PICKAXE = REGISTRY.register("raw_beef_pickaxe", () -> new Raw_beefPickaxeItem());
	public static final RegistryObject<Item> RAW_BEEF_AXE = REGISTRY.register("raw_beef_axe", () -> new Raw_beefAxeItem());
	public static final RegistryObject<Item> RAW_BEEF_SWORD = REGISTRY.register("raw_beef_sword", () -> new Raw_beefSwordItem());
	public static final RegistryObject<Item> RAW_BEEF_SHOVEL = REGISTRY.register("raw_beef_shovel", () -> new Raw_beefShovelItem());
	public static final RegistryObject<Item> RAW_MUTTON_PICKAXE = REGISTRY.register("raw_mutton_pickaxe", () -> new Raw_MuttonPickaxeItem());
	public static final RegistryObject<Item> RAW_MUTTON_AXE = REGISTRY.register("raw_mutton_axe", () -> new Raw_MuttonAxeItem());
	public static final RegistryObject<Item> RAW_MUTTON_SWORD = REGISTRY.register("raw_mutton_sword", () -> new Raw_MuttonSwordItem());
	public static final RegistryObject<Item> RAW_MUTTON_SHOVEL = REGISTRY.register("raw_mutton_shovel", () -> new Raw_MuttonShovelItem());
	public static final RegistryObject<Item> COOKED_MUTTON_PICKAXE = REGISTRY.register("cooked_mutton_pickaxe", () -> new Cooked_muttonPickaxeItem());
	public static final RegistryObject<Item> COOKED_MUTTON_AXE = REGISTRY.register("cooked_mutton_axe", () -> new Cooked_muttonAxeItem());
	public static final RegistryObject<Item> COOKED_MUTTON_SWORD = REGISTRY.register("cooked_mutton_sword", () -> new Cooked_muttonSwordItem());
	public static final RegistryObject<Item> COOKED_MUTTON_SHOVEL = REGISTRY.register("cooked_mutton_shovel", () -> new Cooked_muttonShovelItem());
	public static final RegistryObject<Item> COOKED_BEEF_PICKAXE = REGISTRY.register("cooked_beef_pickaxe", () -> new Cooked_BeefPickaxeItem());
	public static final RegistryObject<Item> COOKED_BEEF_AXE = REGISTRY.register("cooked_beef_axe", () -> new Cooked_BeefAxeItem());
	public static final RegistryObject<Item> COOKED_BEEF_SWORD = REGISTRY.register("cooked_beef_sword", () -> new Cooked_BeefSwordItem());
	public static final RegistryObject<Item> COOKED_BEEF_SHOVEL = REGISTRY.register("cooked_beef_shovel", () -> new Cooked_BeefShovelItem());
	public static final RegistryObject<Item> COOKED_PORK_PICKAXE = REGISTRY.register("cooked_pork_pickaxe", () -> new Cooked_PorkPickaxeItem());
	public static final RegistryObject<Item> COOKED_PORK_AXE = REGISTRY.register("cooked_pork_axe", () -> new Cooked_PorkAxeItem());
	public static final RegistryObject<Item> COOKED_PORK_SWORD = REGISTRY.register("cooked_pork_sword", () -> new Cooked_PorkSwordItem());
	public static final RegistryObject<Item> COOKED_PORK_SHOVEL = REGISTRY.register("cooked_pork_shovel", () -> new Cooked_PorkShovelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
