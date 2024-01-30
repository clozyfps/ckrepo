// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMouthSpirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mouthspirit"), "main");
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelMouthSpirit(ModelPart root) {
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(20, 49)
				.addBox(-2.5F, -8.4782F, -3.0055F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.9742F, -0.1551F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 28).addBox(-4.5F, -4.0F, -4.0F, 9.0F, 8.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(34, 28).addBox(-4.5F, -3.5F, -3.0F, 9.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.3587F, 9.0449F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(48, 43).addBox(-2.5F, -2.3737F, -8.2255F, 5.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.7217F, -7.8203F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(28, 41).addBox(-3.5F, -1.7168F, -2.764F, 7.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.7217F, -7.8203F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(35, 0).addBox(-4.0F, -2.9235F, 2.2073F, 8.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.7217F, -7.8203F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -12.5F, -7.5F, 12.0F, 17.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 15.4704F, 4.3295F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(5.5F, -3.0F, 0.0F));

		PartDefinition cube_r7 = left_arm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(58, 22).addBox(-1.5F, -8.4771F, -1.0342F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0978F, 6.0408F, -0.9738F, -0.0415F, -0.0338F, -0.1265F));

		PartDefinition cube_r8 = left_arm.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(64, 50).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4399F, 17.8811F, -3.572F, 0.2639F, -0.0338F, -0.1265F));

		PartDefinition cube_r9 = left_arm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(52, 50).addBox(-1.75F, -1.4626F, -0.8763F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(1.0978F, 6.0408F, -0.9738F, -0.3906F, -0.0338F, -0.1265F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-5.5F, -3.0F, 0.0F));

		PartDefinition cube_r10 = right_arm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(58, 22).mirror()
						.addBox(-1.5F, -8.4771F, -1.0342F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0978F, 6.0408F, -0.9738F, -0.0415F, 0.0338F, 0.1265F));

		PartDefinition cube_r11 = right_arm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(64, 50).mirror()
						.addBox(-1.5F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4399F, 17.8811F, -3.572F, 0.2639F, 0.0338F, 0.1265F));

		PartDefinition cube_r12 = right_arm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(52, 50).mirror()
						.addBox(-1.25F, -1.4626F, -0.8763F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.001F))
						.mirror(false),
				PartPose.offsetAndRotation(-1.0978F, 6.0408F, -0.9738F, -0.3906F, 0.0338F, 0.1265F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(64, 43)
						.addBox(-1.0F, 15.0F, -6.9511F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-1.0F, 15.0F, -7.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(59, 36)
						.addBox(-2.5F, 14.0F, -2.9511F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 8.0F, 2.0F));

		PartDefinition cube_r13 = left_leg.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(46, 8).addBox(-1.875F, -6.3728F, -3.1327F, 4.0F, 8.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.376F, 3.9637F, -0.0151F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = left_leg.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(66, 10).addBox(-1.625F, -0.4802F, -2.7522F, 3.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.376F, 3.9637F, -0.0151F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r15 = left_leg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(63, 0).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 7.0F, 3.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-0.5F, 10.916F, 0.6794F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r16 = left_leg.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(46, 22)
						.addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(-0.5F, -0.5F, -1.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0F, 15.5F, -5.3261F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r17 = left_leg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(14, 44)
						.addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-0.5F, -0.5F, -1.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-3.0F, 15.5F, -5.3261F, 0.0F, 0.3927F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(64, 43).mirror()
						.addBox(0.0F, 15.0F, -6.9511F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(6, 5).mirror()
						.addBox(0.0F, 15.0F, -7.7011F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false)
						.texOffs(59, 36).mirror()
						.addBox(-1.5F, 14.0F, -2.9511F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.0F, 8.0F, 2.0F));

		PartDefinition cube_r18 = right_leg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(46, 8).mirror()
						.addBox(-2.125F, -6.3728F, -3.1327F, 4.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.376F, 3.9637F, -0.0151F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r19 = right_leg.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(66, 10).mirror()
						.addBox(-1.375F, -0.4802F, -2.7522F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.376F, 3.9637F, -0.0151F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r20 = right_leg.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(63, 0).mirror()
						.addBox(-1.5F, -3.5F, -1.5F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, 10.916F, 0.6794F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = right_leg.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(46, 22).mirror()
						.addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(6, 2).mirror()
						.addBox(-0.5F, -0.5F, -1.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 15.5F, -5.3261F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r22 = right_leg.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(14, 44).mirror()
						.addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(6, 0).mirror()
						.addBox(-0.5F, -0.5F, -1.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, 15.5F, -5.3261F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}