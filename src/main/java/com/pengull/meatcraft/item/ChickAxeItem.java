
package com.pengull.meatcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import com.pengull.meatcraft.init.MeatcraftModTabs;

public class ChickAxeItem extends AxeItem {
	public ChickAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.CHICKEN), new ItemStack(Items.BONE));
			}
		}, 1, 6f, new Item.Properties().tab(MeatcraftModTabs.TAB_MEATCRAFT));
	}
}
