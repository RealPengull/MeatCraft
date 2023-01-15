package com.pengull.meatcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

import com.pengull.meatcraft.MeatcraftMod;

public class Test1RightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MeatcraftMod.queueServerWork(150, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		});
	}
}
