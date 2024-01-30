
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.FlyingCursedSpiritEntity;
import net.mcreator.craftkaisen.client.model.ModelFlyingCurseSpirit;

public class FlyingCursedSpiritRenderer extends MobRenderer<FlyingCursedSpiritEntity, ModelFlyingCurseSpirit<FlyingCursedSpiritEntity>> {
	public FlyingCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFlyingCurseSpirit(context.bakeLayer(ModelFlyingCurseSpirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyingCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/flyingcursespirittexture.png");
	}
}
