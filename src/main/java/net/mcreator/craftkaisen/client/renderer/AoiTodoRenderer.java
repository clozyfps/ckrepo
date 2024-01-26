
package net.mcreator.craftkaisen.client.renderer;

public class AoiTodoRenderer extends HumanoidMobRenderer<AoiTodoEntity, HumanoidModel<AoiTodoEntity>> {

	public AoiTodoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	protected void scale(AoiTodoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.3f, 1.3f, 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(AoiTodoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/aoi-todo-with-shirt-jujutsu-kaisen-on-planetminecraft-com.png");
	}

}
