
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.CrowMeiMeiEntity;
import net.mcreator.craftkaisen.client.model.ModelCrowProjectileFlying;

public class CrowMeiMeiRenderer extends MobRenderer<CrowMeiMeiEntity, ModelCrowProjectileFlying<CrowMeiMeiEntity>> {
	public CrowMeiMeiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrowProjectileFlying(context.bakeLayer(ModelCrowProjectileFlying.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrowMeiMeiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/projectilecrow.png");
	}
}
