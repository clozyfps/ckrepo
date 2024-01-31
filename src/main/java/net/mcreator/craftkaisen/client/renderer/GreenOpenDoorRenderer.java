
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.GreenOpenDoorEntity;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsOpen;

public class GreenOpenDoorRenderer extends MobRenderer<GreenOpenDoorEntity, ModelHakariDoorsOpen<GreenOpenDoorEntity>> {
	public GreenOpenDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsOpen(context.bakeLayer(ModelHakariDoorsOpen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreenOpenDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexturegreen.png");
	}
}
