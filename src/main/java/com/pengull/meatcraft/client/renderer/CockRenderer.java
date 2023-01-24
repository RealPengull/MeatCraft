
package com.pengull.meatcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SalmonModel;

import com.pengull.meatcraft.entity.CockEntity;

public class CockRenderer extends MobRenderer<CockEntity, SalmonModel<CockEntity>> {
	public CockRenderer(EntityRendererProvider.Context context) {
		super(context, new SalmonModel(context.bakeLayer(ModelLayers.SALMON)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CockEntity entity) {
		return new ResourceLocation("meatcraft:textures/entities/salmon.png");
	}
}
