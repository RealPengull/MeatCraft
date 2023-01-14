
package com.pengull.meatcraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;

import com.pengull.meatcraft.procedures.Test1RightClickedOnBlockProcedure;
import com.pengull.meatcraft.init.MeatcraftModTabs;

public class Test1Item extends RecordItem {
	public Test1Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("meatcraft:fortnite_default_dance")),
				new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT).stacksTo(1).rarity(Rarity.RARE), 0);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Test1RightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
