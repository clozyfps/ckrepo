
package net.mcreator.craftkaisen.client.renderer;

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
