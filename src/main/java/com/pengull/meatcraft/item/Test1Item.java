
package com.pengull.meatcraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;

import com.pengull.meatcraft.procedures.Test1RightClickedOnBlockProcedure;
import com.pengull.meatcraft.init.MeatcraftModTabs;
import com.pengull.meatcraft.init.MeatcraftModSounds;

public class Test1Item extends RecordItem {
	public Test1Item() {
		super(0, MeatcraftModSounds.REGISTRY.get(new ResourceLocation("meatcraft:fortnite_default_dance")),
				new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("test_1");
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		Test1RightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ());
		return retval;
	}
}
