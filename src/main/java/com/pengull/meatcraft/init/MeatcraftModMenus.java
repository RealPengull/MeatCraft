
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.pengull.meatcraft.world.inventory.MeatTableGuiMenu;
import com.pengull.meatcraft.world.inventory.FoxInvMenu;
import com.pengull.meatcraft.MeatcraftMod;

public class MeatcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MeatcraftMod.MODID);
	public static final RegistryObject<MenuType<MeatTableGuiMenu>> MEAT_TABLE_GUI = REGISTRY.register("meat_table_gui",
			() -> IForgeMenuType.create(MeatTableGuiMenu::new));
	public static final RegistryObject<MenuType<FoxInvMenu>> FOX_INV = REGISTRY.register("fox_inv", () -> IForgeMenuType.create(FoxInvMenu::new));
}
