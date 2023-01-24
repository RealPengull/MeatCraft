
package com.pengull.meatcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pengull.meatcraft.entity.RedFoxEntity;
import com.pengull.meatcraft.client.model.Modelcustom_model;

public class RedFoxRenderer extends MobRenderer<RedFoxEntity, Modelcustom_model<RedFoxEntity>> {
	public RedFoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedFoxEntity entity) {
		return new ResourceLocation("meatcraft:textures/entities/fox_with_bags.png");
	}
}
