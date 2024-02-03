
package net.mcreator.craftkaisen.client.renderer;

public class ShinjukuGojoRenderer extends HumanoidMobRenderer<ShinjukuGojoEntity, HumanoidModel<ShinjukuGojoEntity>> {

	public ShinjukuGojoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(ShinjukuGojoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/gojo_satoru_minecraft_skin.png");
	}

}
