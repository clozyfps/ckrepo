
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.FlyHeadEntity;
import net.mcreator.craftkaisen.client.model.ModelFlyHead;

public class FlyHeadRenderer extends MobRenderer<FlyHeadEntity, ModelFlyHead<FlyHeadEntity>> {
	public FlyHeadRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFlyHead(context.bakeLayer(ModelFlyHead.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyHeadEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/flyheadtex.png");
	}
}
