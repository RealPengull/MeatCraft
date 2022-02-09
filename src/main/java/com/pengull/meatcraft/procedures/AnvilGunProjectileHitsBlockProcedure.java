package com.pengull.meatcraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class AnvilGunProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.ANVIL.defaultBlockState().canSurvive(world, new BlockPos((int) x, (int) y, (int) z))) {
			if (world instanceof ServerLevel _level) {
				FallingBlockEntity blockToSpawn = new FallingBlockEntity(_level, x, y, z, Blocks.ANVIL.defaultBlockState());
				blockToSpawn.time = 1;
				_level.addFreshEntity(blockToSpawn);
			}
		}
	}
}
