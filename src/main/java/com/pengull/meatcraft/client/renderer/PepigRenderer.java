
package com.pengull.meatcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import com.pengull.meatcraft.entity.PepigEntity;

public class PepigRenderer extends MobRenderer<PepigEntity, PigModel<PepigEntity>> {
	public PepigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PepigEntity entity) {
		return new ResourceLocation("meatcraft:textures/entities/pepig.png");
	}
}
