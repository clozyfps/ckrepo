// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSorcererArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sorcererarmor"), "main");
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelSorcererArmor(ModelPart root) {
		this.head = root.getChild("head");
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 8).addBox(
				-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso_r1 = head.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(52, 19).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, -0.1F, -4.2F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(58, 29).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3F, -4.15F, 0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r2 = head.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(48, 25).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -0.8F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(58, 31).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3F, 4.15F, -0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r3 = head.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(8, 50).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -0.8F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 25)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 1)
						.addBox(-4.0F, -0.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 88)
						.addBox(3.0F, 0.0F, -2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 45)
						.addBox(2.5F, 1.0F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 17)
						.addBox(-4.0F, 0.0F, -2.5F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 54)
						.addBox(-4.0F, 0.0F, 1.5F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(62, 6).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8087F, 1.9619F, 0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(36, 61).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.2737F, 1.9619F, -0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(26, 54).addBox(-4.0F, -3.0F, -0.5F, 8.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0577F, 2.1304F, 0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(20, 73).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1304F, 10.0577F, 0.0F, 0.0F, 1.5708F, 0.0436F));

		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(8, 87).addBox(-4.0F, -0.2793F, -0.6744F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0766F, 6.5412F, -2.0F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition torso_r9 = torso.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(84, 25).addBox(-4.0F, -0.7207F, -0.6744F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0766F, 6.5412F, -2.0F, 0.0F, 1.5708F, 0.3927F));

		PartDefinition torso_r10 = torso.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(10, 72).addBox(-4.0F, -6.5412F, -0.4234F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0766F, 6.5412F, -2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition torso_r11 = torso.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(74, 33).addBox(0.0F, -6.5412F, -0.4234F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0766F, 6.5412F, -2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition torso_r12 = torso.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(65, 87).addBox(0.0F, -0.7207F, -0.6744F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0766F, 6.5412F, -2.0F, 0.0F, -1.5708F, -0.3927F));

		PartDefinition torso_r13 = torso.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(28, 87).addBox(0.0F, -0.2793F, -0.6744F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0766F, 6.5412F, -2.0F, 0.0F, -1.5708F, 0.3927F));

		PartDefinition torso_r14 = torso.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(74, 20).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1304F, 10.0577F, 0.0F, 0.0F, -1.5708F, -0.0436F));

		PartDefinition torso_r15 = torso.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(58, 22).addBox(-4.0F, -3.0F, -0.5F, 7.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0577F, -2.1304F, -0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r16 = torso.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(62, 8).addBox(-4.0F, -1.0F, -0.5F, 7.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.2737F, -1.9619F, 0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r17 = torso.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(18, 50).addBox(-4.0F, 0.0F, -0.5F, 7.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8087F, -1.9619F, -0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r18 = torso.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(17, 88).addBox(3.0F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0577F, -2.0304F, -0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r19 = torso.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(48, 13).addBox(3.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.2737F, -1.8619F, 0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r20 = torso.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(51, 14).addBox(3.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8087F, -1.8619F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(24, 61)
				.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(55, 86).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.5357F, 2.0653F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(82, 66).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 4.6919F, 1.9347F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(55, 82).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3438F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r4 = left_arm
				.addOrReplaceChild("left_arm_r4",
						CubeListBuilder.create().texOffs(82, 51).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -0.5F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(65, 83).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 4.6919F, -1.9347F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(86, 79).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.5357F, -2.0653F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(29, 83).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.5F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(10, 83).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3438F, -2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(36, 77).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0653F, 7.5357F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(72, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9347F, 4.6919F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(54, 72).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.3438F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r4 = left_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(72, 48).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(72, 63).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9347F, 4.6919F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(66, 77).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0653F, 7.5357F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(42, 73).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 2.3438F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(60, 47).addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(86, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 7.5357F, 2.0653F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(80, 40).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.6919F, 1.9347F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(80, 70).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.3438F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(0, 82).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(82, 4).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.6919F, -1.9347F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(86, 13).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 7.5357F, -2.0653F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(82, 27).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, -2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(45, 82).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.3438F, -2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r13 = right_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(76, 27).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0653F, 7.5357F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r14 = right_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(68, 38).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9347F, 4.6919F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r15 = right_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(48, 69).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3438F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r16 = right_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(70, 13).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(36, 70).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9347F, 4.6919F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(48, 76).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0653F, 7.5357F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(68, 70).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 2.3438F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(40, 17)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 6)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 80)
						.addBox(-2.0F, 9.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 67)
						.addBox(1.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 60)
						.addBox(-2.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 60)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(60, 75).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(20, 66).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(10, 65).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(76, 6).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(30, 66).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(42, 66).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(84, 36).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, 1.8353F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(10, 79).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, 1.9224F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(78, 62).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, 1.8353F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(76, 79).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, -1.8353F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(80, 16).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, -1.9224F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(84, 44).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, -1.8353F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r10 = left_leg.addOrReplaceChild("left_leg_r10",
				CubeListBuilder.create().texOffs(42, 63).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 9.5964F, -2.3799F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(24, 25)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 41)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 47)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 55)
						.addBox(-2.0F, 9.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 64)
						.addBox(-2.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 52)
						.addBox(1.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r11 = right_leg.addOrReplaceChild("left_leg_r11",
				CubeListBuilder.create().texOffs(74, 41).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r12 = right_leg.addOrReplaceChild("left_leg_r12",
				CubeListBuilder.create().texOffs(50, 61).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r13 = right_leg.addOrReplaceChild("left_leg_r13",
				CubeListBuilder.create().texOffs(36, 63).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(74, 73).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(64, 10).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(40, 34).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, 1.8353F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(26, 41).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, 1.9224F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(76, 12).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, 1.8353F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(0, 78).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, -1.8353F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11",
				CubeListBuilder.create().texOffs(78, 47).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, -1.9224F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12",
				CubeListBuilder.create().texOffs(82, 59).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, -1.8353F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r13 = right_leg.addOrReplaceChild("right_leg_r13",
				CubeListBuilder.create().texOffs(41, 6).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5964F, -2.3799F, 0.2182F, 0.0F, 0.0F));

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
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}