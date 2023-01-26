
package com.pengull.meatcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.pengull.meatcraft.init.MeatcraftModTabs;

public class RawBeefSwordItem extends Item {
	public RawBeefSwordItem() {
		super(new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
