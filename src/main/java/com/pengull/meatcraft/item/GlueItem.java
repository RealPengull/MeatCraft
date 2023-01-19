
package com.pengull.meatcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.pengull.meatcraft.init.MeatcraftModTabs;

public class GlueItem extends Item {
	public GlueItem() {
		super(new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
