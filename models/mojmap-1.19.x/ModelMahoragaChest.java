// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMahoragaChest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mahoragachest"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelMahoragaChest(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(18, 10)
						.addBox(-4.0F, 8.65F, -2.6F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 19)
						.addBox(-2.0F, 8.65F, -2.85F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(53, 9)
						.addBox(-2.0F, 7.65F, -2.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-4.0F, 8.65F, 1.6F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 31)
						.addBox(3.6F, 8.65F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.6F, 8.65F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 11.75F, 2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(4.0F, 11.75F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 11.75F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(10, 19).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-4.0F, 11.75F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 15).addBox(-0.153F, 0.264F, -0.363F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 4.1058F, -1.7438F, -0.133F, -0.0063F, -0.1307F));

		PartDefinition cube_r2 = torso.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(6, 18).addBox(1.5638F, -3.386F, -0.4786F, 3.0F, 3.0F, 1.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.2F, 4.6058F, -2.1438F, -0.0433F, -0.0057F, -0.1308F));

		PartDefinition cube_r3 = torso.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 18).addBox(-0.153F, 0.264F, -0.363F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.3F, 3.1058F, -1.8438F, -0.133F, -0.0063F, -0.1307F));

		PartDefinition cube_r4 = torso.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(22, 26).addBox(-0.847F, 0.264F, -0.363F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.3F, 3.1058F, -1.8438F, -0.133F, 0.0063F, 0.1307F));

		PartDefinition cube_r5 = torso.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 30).addBox(-0.847F, 0.264F, -0.363F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 4.1058F, -1.7438F, -0.133F, 0.0063F, 0.1307F));

		PartDefinition cube_r6 = torso.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(53, 11).addBox(-1.5F, -2.3368F, -0.4786F, 3.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.1058F, -1.7438F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r7 = torso.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 37).addBox(-4.5638F, -3.386F, -0.4786F, 3.0F, 3.0F, 1.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.2F, 4.6058F, -2.1438F, -0.0433F, 0.0057F, 0.1308F));

		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(18, 3).addBox(-1.0F, -3.5F, -0.009F, 2.0F, 5.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 12.15F, -3.05F, -0.043F, 0.0076F, 0.1744F));

		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -3.5F, -0.01F, 2.0F, 7.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 12.15F, -3.05F, -0.043F, -0.0076F, -0.1744F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(13, 13)
				.addBox(-1.5F, 7.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(45, 12).addBox(-3.0F, 9.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(20, 22)
						.addBox(-2.0F, 1.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
						.addBox(-2.0F, -3.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 7.5F, -1.75F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_arm_r2 = right_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(28, 13)
						.addBox(-2.0F, 1.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 49)
						.addBox(-2.0F, -3.5F, -0.5F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 7.5F, 1.75F, -0.0436F, 0.0F, 0.0F));

		PartDefinition left_arm_r1 = right_arm
				.addOrReplaceChild("left_arm_r1",
						CubeListBuilder.create().texOffs(31, 36).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.75F, 7.5F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_arm_r3 = right_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(29, 15).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.75F, 7.5F, 0.0F, 0.0F, 0.0F, -0.0436F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}