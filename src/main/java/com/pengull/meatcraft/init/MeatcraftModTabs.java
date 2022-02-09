
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MeatcraftModTabs {
	public static CreativeModeTab TAB_MEATCRAFT;

	public static void load() {
		TAB_MEATCRAFT = new CreativeModeTab("tabmeatcraft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MeatcraftModItems.AIRPODS_HELMET);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
