
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.client.model.ModelYujikunaShirtless;

public class RyomenSukunaRenderer extends MobRenderer<RyomenSukunaEntity, ModelYujikunaShirtless<RyomenSukunaEntity>> {
	public RyomenSukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelYujikunaShirtless(context.bakeLayer(ModelYujikunaShirtless.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RyomenSukunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/yujikunashirtlesstexture.png");
	}
}
