// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelInventoryCurse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "inventorycurse"), "main");
	private final ModelPart head;
	private final ModelPart body;

	public ModelInventoryCurse(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.1768F, -4.1059F, -6.3617F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 59)
				.addBox(-3.8768F, -2.3559F, -7.1117F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(0, 60)
				.addBox(1.5232F, -2.3559F, -7.1117F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(41, 14)
				.addBox(-1.6768F, 1.3941F, -6.6117F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.1971F, 21.0366F, -7.4818F, -0.0294F, 0.2602F, 0.0109F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(10.5911F, 0.0393F, 2.5586F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2679F, 1.7941F, -9.4676F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 2).addBox(10.5901F, -1.1372F, 2.5381F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2679F, 0.7441F, -9.4676F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(57, 39)
						.addBox(13.5F, -2.5F, -9.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 58)
						.addBox(14.0F, 1.25F, -8.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 57)
						.addBox(5.5F, -2.5F, -9.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 55)
						.addBox(6.0F, 1.25F, -8.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 21.75F, 1.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(21, 48).addBox(5.1668F, -1.625F, -0.8471F, 4.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3187F, -0.625F, -5.7039F, 0.0F, 1.1781F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 14).addBox(2.5222F, -3.375F, -3.5187F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3187F, -0.625F, -5.7039F, 3.1416F, 1.4835F, 3.1416F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(19, 20).addBox(2.1734F, -3.375F, -2.7334F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.3187F, -0.625F, -5.7039F, -3.1416F, 0.6109F, 3.1416F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(21, 7).addBox(2.5121F, -3.375F, -5.6505F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3187F, -0.625F, -5.7039F, -3.1416F, 0.1309F, 3.1416F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 27).addBox(4.2137F, -3.375F, -6.7463F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.3187F, -0.625F, -5.7039F, -3.1416F, -0.48F, 3.1416F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(19, 33).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5779F, -1.0F, 4.2808F, -3.1416F, -1.0472F, 3.1416F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(38, 26).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.319F, -1.0F, 5.479F, 0.0F, -1.5272F, 0.0F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(38, 39).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.897F, -1.0F, 3.8128F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(9.6519F, -1.0F, -0.4689F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(36, 59)
						.addBox(3.75F, -3.125F, -1.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 23)
						.addBox(4.25F, 0.625F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 0)
						.addBox(-4.25F, -3.125F, -1.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 22)
						.addBox(-3.75F, 0.625F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2687F, 0.625F, -10.1443F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(33, 0)
						.addBox(2.5F, -3.125F, -0.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 29)
						.addBox(3.0F, 0.625F, -0.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 22)
						.addBox(-5.0F, 0.625F, -0.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-5.5F, -3.125F, -0.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9866F, 0.625F, -4.6913F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(51, 52)
						.addBox(-4.5F, -3.125F, -5.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 52)
						.addBox(-4.0F, 0.625F, -4.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 52)
						.addBox(2.0F, -3.125F, -5.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 59)
						.addBox(2.5F, 0.625F, -4.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5722F, 0.625F, -11.6023F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(18, 62)
						.addBox(2.0F, 0.625F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 54)
						.addBox(1.5F, -3.125F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 61)
						.addBox(-6.0F, 0.625F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-6.5F, -3.125F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.201F, 0.625F, 4.0801F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(63, 30)
						.addBox(1.25F, 0.625F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 22)
						.addBox(0.75F, -3.125F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(-6.75F, 0.625F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 13)
						.addBox(-7.25F, -3.125F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.625F, 0.5F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -3.0F, -3.5F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -1.0F, -5.5F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}