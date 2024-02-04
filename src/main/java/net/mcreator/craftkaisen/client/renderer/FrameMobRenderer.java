
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.FrameMobEntity;
import net.mcreator.craftkaisen.client.model.ModelFrame;

public class FrameMobRenderer extends MobRenderer<FrameMobEntity, ModelFrame<FrameMobEntity>> {
	public FrameMobRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFrame(context.bakeLayer(ModelFrame.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrameMobEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/white.png");
	}

	@Override
	protected boolean isBodyVisible(FrameMobEntity entity) {
		return false;
	}
}
