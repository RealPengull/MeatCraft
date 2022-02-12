package com.pengull.meatcraft.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class MeatTableGuiWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			((Slot) _slots.get(9)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		MeatTableCraftingProcedureProcedure.execute(entity);
	}
}
