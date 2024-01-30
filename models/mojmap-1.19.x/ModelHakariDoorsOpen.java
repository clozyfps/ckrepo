// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHakariDoorsOpen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hakaridoorsopen"), "main");
	private final ModelPart door1;
	private final ModelPart door2;

	public ModelHakariDoorsOpen(ModelPart root) {
		this.door1 = root.getChild("door1");
		this.door2 = root.getChild("door2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition door1 = partdefinition.addOrReplaceChild("door1",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(8.0F, -1.0F, -38.0F, 3.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -1.0F, -38.0F, 3.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-2.0F, -1.0F, -38.0F, 10.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -1.0F, -9.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(-2.0F, -0.5F, -23.0F, 10.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(14.0F, 8.0F, 22.0F));

		PartDefinition door2 = partdefinition.addOrReplaceChild("door2",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(8.0F, -1.0F, -38.0F, 3.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -1.0F, -38.0F, 3.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-2.0F, -1.0F, -38.0F, 10.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -1.0F, -9.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(-2.0F, -0.5F, -23.0F, 10.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-20.0F, 8.0F, 22.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		door1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		door2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}