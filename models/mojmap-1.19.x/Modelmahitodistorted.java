// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmahitodistorted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mahitodistorted"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelmahitodistorted(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-1.3125F, 9.6875F, 2.3125F, 3.375F, 2.3125F, 3.8125F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail5_r1 = Body.addOrReplaceChild("tail5_r1",
				CubeListBuilder.create().texOffs(0, 53)
						.addBox(-1.3125F, -1.7188F, 5.0313F, 2.8125F, 2.3125F, 3.8125F, new CubeDeformation(0.25F))
						.texOffs(0, 53)
						.addBox(-1.6875F, -1.7188F, 0.9063F, 3.375F, 2.3125F, 3.8125F, new CubeDeformation(0.25F))
						.texOffs(0, 53)
						.addBox(-1.6875F, -1.7188F, -2.0313F, 3.375F, 2.3125F, 3.8125F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.375F, 10.8438F, 8.4688F, 0.2443F, 0.0F, 0.0F));

		PartDefinition tail5_r2 = Body.addOrReplaceChild("tail5_r2",
				CubeListBuilder.create().texOffs(2, 57)
						.addBox(-0.5625F, -1.2812F, 2.3438F, 1.125F, 1.8125F, 2.5625F, new CubeDeformation(0.25F))
						.texOffs(0, 53)
						.addBox(-1.0625F, -1.5312F, -1.9063F, 2.125F, 2.3125F, 3.8125F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.375F, 7.6671F, 18.8846F, 0.4887F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 35)
						.addBox(-19.0F, 4.0F, -0.0625F, 16.0F, 4.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 40)
						.addBox(3.0F, 4.0F, -0.25F, 16.0F, 4.0F, 1.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}