// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwintryicles<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wintryicles"), "main");
	private final ModelPart icespike;

	public Modelwintryicles(ModelPart root) {
		this.icespike = root.getChild("icespike");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition icespike = partdefinition.addOrReplaceChild("icespike",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-4.0F, 0.0F, -3.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(23, 23)
						.addBox(-3.0F, 7.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
						.addBox(-2.0F, 14.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(3.0F, 0.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 35)
						.addBox(-5.0F, 0.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(43, 12)
						.addBox(-3.5F, 0.0F, 4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 4)
						.addBox(-3.5F, 0.0F, -4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 33)
						.addBox(-2.5F, 7.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 43)
						.addBox(-2.5F, 7.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 25)
						.addBox(2.0F, 7.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 42)
						.addBox(-4.0F, 7.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
						.addBox(-1.75F, 14.0F, 2.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 46)
						.addBox(-1.75F, 14.0F, -2.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 55)
						.addBox(-4.0F, 11.0F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(55, 20)
						.addBox(1.0F, 17.0F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(12, 54)
						.addBox(2.0F, 11.0F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(6, 54)
						.addBox(-3.0F, 17.0F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(49, 22)
						.addBox(3.0F, 3.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(49, 16)
						.addBox(-5.0F, 3.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 40)
						.addBox(-5.0F, -6.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(3.0F, -6.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 53)
						.addBox(-3.0F, -19.75F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(53, 33)
						.addBox(2.0F, -13.75F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(1.0F, -19.75F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -13.75F, -0.25F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(14, 42)
						.addBox(-1.75F, -17.0F, -2.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(-1.75F, -17.0F, 2.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 42)
						.addBox(-4.0F, -11.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 17)
						.addBox(2.0F, -11.0F, -1.5F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 35)
						.addBox(-2.5F, -11.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-2.5F, -11.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
						.addBox(-3.5F, -3.0F, -4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
						.addBox(-3.5F, -3.0F, 4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
						.addBox(-5.0F, -3.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(3.0F, -3.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-2.0F, -21.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 9)
						.addBox(-3.0F, -14.0F, -2.0F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -7.0F, -3.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r1 = icespike.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(49, 0)
						.addBox(-1.75F, -17.0F, -3.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(-1.75F, -17.0F, 1.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 50)
						.addBox(-1.75F, 14.0F, 1.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 38)
						.addBox(-1.75F, 14.0F, -3.0F, 2.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = icespike.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 52)
						.addBox(-6.5F, -1.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(-12.5F, -1.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(39, 52)
						.addBox(-11.5F, -7.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(53, 28)
						.addBox(-7.5F, -7.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(18, 54)
						.addBox(-7.5F, 29.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(24, 54)
						.addBox(-11.5F, 29.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(30, 54)
						.addBox(-12.5F, 23.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)).texOffs(55, 14)
						.addBox(-6.5F, 23.375F, -3.75F, 1.0F, 2.75F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -12.375F, -8.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = icespike.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 46)
						.addBox(5.5F, -1.5F, 2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 46)
						.addBox(13.5F, -1.5F, 2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 48)
						.addBox(13.5F, 7.5F, 2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(33, 48)
						.addBox(5.5F, 7.5F, 2.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -4.5F, 10.5F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		icespike.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}