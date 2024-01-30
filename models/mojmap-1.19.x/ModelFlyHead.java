// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFlyHead<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flyhead"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public ModelFlyHead(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-1.75F, -1.25F, -3.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 13)
						.addBox(-1.5F, -1.0F, -3.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 25)
						.addBox(-1.0F, 0.25F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.9F, -0.5F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9).mirror()
						.addBox(-1.9F, -0.5F, -2.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(5, 25).addBox(0.75F, -1.25F, -3.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.5F, -3.5F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 21.5F, -3.5F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 4).addBox(-0.375F, -1.3664F, -3.0787F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(1.125F, 1.7087F, 8.6706F, 1.9676F, 0.2148F, 0.0385F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(21, 25).addBox(-0.625F, -1.3664F, -3.0787F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-1.125F, 1.7087F, 8.6706F, 1.9676F, -0.2148F, -0.0385F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 12).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.993F, 9.6937F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.1647F, 8.1751F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(8, 20).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.5F, 0.5F, 1.75F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(14, 20).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.5F, 4.5784F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.75F, 4.5784F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(11, 11).addBox(-3.5F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-3.8432F, -1.1345F, 1.2894F, 0.7762F, 0.1945F, 0.1893F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(12, 2).addBox(-3.5F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.8432F, -1.1345F, 1.2894F, 0.7762F, -0.1945F, -0.1893F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(10, 9).addBox(-3.5F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-3.8432F, -2.1345F, 1.0394F, 0.7864F, 0.1671F, 0.5303F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(11, 0).addBox(-3.5F, 0.0F, -0.5F, 7.0F, 0.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(3.8432F, -2.1345F, 1.0394F, 0.7864F, -0.1671F, -0.5303F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 0.75F, 1.75F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(2.0F, 22.5F, -3.0F));

		PartDefinition cube_r13 = leftarm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(26, 23).addBox(-0.375F, -1.3664F, -3.0787F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.375F, 2.7087F, 0.4206F, 1.9676F, 0.2148F, 0.0385F));

		PartDefinition cube_r14 = leftarm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(18, 20).addBox(-0.375F, -0.2039F, -1.7279F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.375F, 2.7087F, 0.4206F, 1.1822F, 0.2148F, 0.0385F));

		PartDefinition cube_r15 = leftarm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(24, 18).addBox(-1.125F, -3.2392F, 0.396F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.375F, 2.7087F, 0.4206F, 0.7459F, 0.2148F, 0.0385F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 22.5F, -3.0F));

		PartDefinition cube_r16 = rightarm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(26, 7).addBox(-0.625F, -1.3664F, -3.0787F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-0.375F, 2.7087F, 0.4206F, 1.9676F, -0.2148F, -0.0385F));

		PartDefinition cube_r17 = rightarm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(18, 3).addBox(-0.625F, -0.2039F, -1.7279F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.375F, 2.7087F, 0.4206F, 1.1822F, -0.2148F, -0.0385F));

		PartDefinition cube_r18 = rightarm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 23).addBox(-0.875F, -3.2392F, 0.396F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-0.375F, 2.7087F, 0.4206F, 0.7459F, -0.2148F, -0.0385F));

		return LayerDefinition.create(meshdefinition, 32, 32);
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
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}