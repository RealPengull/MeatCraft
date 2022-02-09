
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pengull.meatcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import com.pengull.meatcraft.client.renderer.TestRenderer;
import com.pengull.meatcraft.client.renderer.DreamRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MeatcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MeatcraftModEntities.TEST, TestRenderer::new);
		event.registerEntityRenderer(MeatcraftModEntities.DREAM, DreamRenderer::new);
		event.registerEntityRenderer(MeatcraftModEntities.ANVIL_GUN, ThrownItemRenderer::new);
	}
}
