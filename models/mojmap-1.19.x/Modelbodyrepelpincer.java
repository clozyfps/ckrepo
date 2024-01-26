// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbodyrepelpincer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bodyrepelpincer"), "main");
	private final ModelPart Bodyrepel;

	public Modelbodyrepelpincer(ModelPart root) {
		this.Bodyrepel = root.getChild("Bodyrepel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Bodyrepel = partdefinition.addOrReplaceChild("Bodyrepel",
				CubeListBuilder.create().texOffs(130, 151)
						.addBox(-9.0F, -18.0F, -19.0F, 18.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(116, 62)
						.addBox(-10.0F, -22.0F, -22.0F, 20.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(61, 0)
						.addBox(-10.0F, -26.0F, -23.0F, 20.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(122, 28)
						.addBox(-10.0F, 0.0F, -18.0F, 20.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(176, 37)
						.addBox(-10.0F, 2.0F, -20.0F, 20.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(190, 98)
						.addBox(-9.0F, 4.0F, -20.0F, 18.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 101)
						.addBox(-8.0F, -21.0F, -9.0F, 16.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(54, 149)
						.addBox(-8.0F, 0.0F, -9.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(172, 203)
						.addBox(9.0F, -20.0F, -21.0F, 2.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(188, 178)
						.addBox(9.0F, -16.0F, -9.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(188, 142)
						.addBox(-10.0F, -16.0F, -9.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(198, 49)
						.addBox(-11.0F, -20.0F, -21.0F, 2.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(-9.0F, -18.0F, -9.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(64, 21)
						.addBox(-9.0F, -18.0F, 13.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(176, 1)
						.addBox(9.0F, -16.0F, 13.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(138, 179)
						.addBox(-10.0F, -16.0F, 13.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(112, 104)
						.addBox(-8.0F, -20.0F, 13.0F, 16.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 146)
						.addBox(-8.0F, 0.0F, 13.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(58, 61)
						.addBox(-9.0F, -18.0F, 35.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(46, 172)
						.addBox(9.0F, -16.0F, 35.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(92, 172)
						.addBox(-10.0F, -16.0F, 35.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(54, 126)
						.addBox(-8.0F, -19.0F, 35.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(108, 128)
						.addBox(-8.0F, 0.0F, 35.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-9.0F, -18.0F, 57.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 169)
						.addBox(9.0F, -16.0F, 57.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(170, 62)
						.addBox(-10.0F, -16.0F, 57.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(122, 39)
						.addBox(-8.0F, -19.0F, 57.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 123)
						.addBox(-8.0F, 0.0F, 57.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -18.0F, 79.0F, 18.0F, 18.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(70, 172)
						.addBox(-8.0F, -17.0F, 101.0F, 16.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 172)
						.addBox(-7.0F, -15.0F, 107.0F, 14.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(164, 157)
						.addBox(9.0F, -16.0F, 79.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(166, 106)
						.addBox(-10.0F, -16.0F, 79.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(116, 79)
						.addBox(-8.0F, -19.0F, 79.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-8.0F, 0.0F, 79.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 12.0F));

		PartDefinition cube_r1 = Bodyrepel.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 83)
						.addBox(-10.0F, -18.0F, -26.0F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-8.0F, -24.0F, -29.0F, 4.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 205)
						.addBox(-4.0F, -36.0F, -31.0F, 4.0F, 30.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -24.0F, -29.0F, 4.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 205)
						.addBox(0.0F, -36.0F, -31.0F, 4.0F, 30.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(8.0F, -18.0F, -26.0F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, -3.1416F));

		PartDefinition cube_r2 = Bodyrepel.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(72, 208)
						.addBox(4.0F, -33.0F, -14.0F, 4.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 208)
						.addBox(0.0F, -45.0F, -16.0F, 4.0F, 30.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(112, 102)
						.addBox(8.0F, -27.0F, -11.0F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 123)
						.addBox(-10.0F, -27.0F, -11.0F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(200, 0)
						.addBox(-8.0F, -33.0F, -14.0F, 4.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 208)
						.addBox(-4.0F, -45.0F, -16.0F, 4.0F, 30.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Bodyrepel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}