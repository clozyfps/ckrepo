
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RedClosedDoorEntity;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsClosed;

public class RedClosedDoorRenderer extends MobRenderer<RedClosedDoorEntity, ModelHakariDoorsClosed<RedClosedDoorEntity>> {
	public RedClosedDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsClosed(context.bakeLayer(ModelHakariDoorsClosed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedClosedDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexture.png");
	}

	@Override
	protected boolean isShaking(RedClosedDoorEntity entity) {
		return true;
	}
}
