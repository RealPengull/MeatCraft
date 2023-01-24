
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.pengull.meatcraft.client.gui.MeatTableGuiScreen;
import com.pengull.meatcraft.client.gui.FoxInvScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MeatcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MeatcraftModMenus.MEAT_TABLE_GUI.get(), MeatTableGuiScreen::new);
			MenuScreens.register(MeatcraftModMenus.FOX_INV.get(), FoxInvScreen::new);
		});
	}
}
