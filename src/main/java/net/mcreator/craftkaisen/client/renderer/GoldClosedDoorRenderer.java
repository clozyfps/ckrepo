
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.GoldClosedDoorEntity;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsClosed;

public class GoldClosedDoorRenderer extends MobRenderer<GoldClosedDoorEntity, ModelHakariDoorsClosed<GoldClosedDoorEntity>> {
	public GoldClosedDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsClosed(context.bakeLayer(ModelHakariDoorsClosed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldClosedDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexturegold.png");
	}
}
