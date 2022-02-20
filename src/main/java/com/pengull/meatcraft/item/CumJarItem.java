
package com.pengull.meatcraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import com.pengull.meatcraft.procedures.CumJarFoodEatenProcedure;
import com.pengull.meatcraft.init.MeatcraftModTabs;

public class CumJarItem extends Item {
	public CumJarItem() {
		super(new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f).alwaysEat().meat().build()));
		setRegistryName("cum_jar");
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CumJarFoodEatenProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
