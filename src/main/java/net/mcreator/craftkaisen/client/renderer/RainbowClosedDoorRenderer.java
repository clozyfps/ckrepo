
package net.mcreator.craftkaisen.client.renderer;

public class RainbowClosedDoorRenderer extends MobRenderer<RainbowClosedDoorEntity, ModelHakariDoorsClosed<RainbowClosedDoorEntity>> {

	public RainbowClosedDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsClosed(context.bakeLayer(ModelHakariDoorsClosed.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RainbowClosedDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexturerainbow.png");
	}

}
