
package net.mcreator.craftkaisen.client.renderer;

public class AwakenedMakiRenderer extends HumanoidMobRenderer<AwakenedMakiEntity, HumanoidModel<AwakenedMakiEntity>> {

	public AwakenedMakiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(AwakenedMakiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/maki_zenin.png");
	}

	@Override
	protected boolean isShaking(AwakenedMakiEntity entity) {
		return true;
	}

}
