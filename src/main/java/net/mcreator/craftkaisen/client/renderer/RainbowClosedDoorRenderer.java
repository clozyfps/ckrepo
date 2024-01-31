
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RainbowClosedDoorEntity;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsClosed;

public class RainbowClosedDoorRenderer extends MobRenderer<RainbowClosedDoorEntity, ModelHakariDoorsClosed<RainbowClosedDoorEntity>> {
	public RainbowClosedDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsClosed(context.bakeLayer(ModelHakariDoorsClosed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RainbowClosedDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexturerainbow.png");
	}
}
