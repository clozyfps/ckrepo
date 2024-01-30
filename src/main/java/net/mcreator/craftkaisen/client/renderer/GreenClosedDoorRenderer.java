
package net.mcreator.craftkaisen.client.renderer;

public class GreenClosedDoorRenderer extends MobRenderer<GreenClosedDoorEntity, ModelHakariDoorsClosed<GreenClosedDoorEntity>> {

	public GreenClosedDoorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHakariDoorsClosed(context.bakeLayer(ModelHakariDoorsClosed.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(GreenClosedDoorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hakaridoorstexturegreen.png");
	}

}
