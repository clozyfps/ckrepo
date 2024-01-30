
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.GreenClosedDoorEntity;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsClosed;

public class GreenClosedDoorRenderer extends MobRenderer<GreenClosedDoorEntity, ModelHakariDoorsClosed<GreenClosedDoorEntity>> {
	public GreenClosedDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsClosed(context.bakeLayer(ModelHakariDoorsClosed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreenClosedDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexturegreen.png");
	}
}
