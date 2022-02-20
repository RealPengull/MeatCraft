
package com.pengull.meatcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.pengull.meatcraft.init.MeatcraftModTabs;

public class EmptyJarItem extends Item {
	public EmptyJarItem() {
		super(new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("empty_jar");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
