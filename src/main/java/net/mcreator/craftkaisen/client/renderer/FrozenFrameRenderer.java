
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.FrozenFrameEntity;
import net.mcreator.craftkaisen.client.model.Modelframewall;

public class FrozenFrameRenderer extends MobRenderer<FrozenFrameEntity, Modelframewall<FrozenFrameEntity>> {
	public FrozenFrameRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelframewall(context.bakeLayer(Modelframewall.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrozenFrameEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/steve.png");
	}
}
