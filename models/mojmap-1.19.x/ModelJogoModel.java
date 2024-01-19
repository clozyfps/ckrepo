// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJogoModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jogomodel"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelJogoModel(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(30, 24)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
						.addBox(-3.0F, -10.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 38)
						.addBox(-2.5F, -5.8971F, -4.0346F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
						.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
						.addBox(-4.5F, -5.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -4.5F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 36)
						.addBox(4.5F, -4.5F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 77)
						.addBox(3.5F, -5.0F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, -1.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(76, 54).addBox(-2.5217F, -1.0019F, 0.0282F, 5.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -4.1F, 0.0F, 0.0F, -0.0436F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -1.5F, -3.0F, 18.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(37, 16)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(3.25F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 65)
						.addBox(-4.25F, 6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 47)
						.addBox(-4.0F, 6.0F, -2.25F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 40)
						.addBox(-4.0F, 6.0F, 1.25F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso_r1 = body.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(24, 40).addBox(-1.0F, -5.5F, -3.5F, 1.0F, 11.0F, 7.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-8.5197F, 4.022F, 0.499F, 0.0F, 0.0F, 0.0873F));

		PartDefinition torso_r2 = body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(40, 40).addBox(0.0F, -5.5F, -3.5F, 1.0F, 11.0F, 7.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(8.5197F, 4.022F, 0.499F, 0.0F, 0.0F, -0.0873F));

		PartDefinition torso_r3 = body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(0, 8).addBox(-9.0F, -5.5F, -1.0F, 18.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9338F, 4.5168F, 0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r4 = body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(0, 20).addBox(-9.0F, -5.5F, 0.0F, 18.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9338F, -3.5168F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r5 = body.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(0, 83).addBox(-6.0F, -3.0F, -5.0F, 12.0F, 8.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0868F, -0.5904F, 0.829F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(52, 54).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.25F, 1.25F, 0.0F, 0.2182F, -0.1745F, -0.1745F));

		PartDefinition lower_left_arm = left_arm.addOrReplaceChild("lower_left_arm",
				CubeListBuilder.create().texOffs(0, 56).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 5.0F, 0.0F, -0.3494F, -0.041F, 0.0149F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(14, 54).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, 1.25F, 0.0F, 0.2182F, 0.1745F, 0.1745F));

		PartDefinition lower_right_arm = right_arm.addOrReplaceChild("lower_right_arm",
				CubeListBuilder.create().texOffs(54, 21).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 5.0F, 0.0F, -0.3494F, 0.041F, -0.0149F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(62, 8)
						.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 71)
						.addBox(-1.5F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 23)
						.addBox(-1.5F, 5.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 11.6F, 0.0F, -0.258F, -0.045F, -0.1687F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(41, 76)
						.addBox(-1.5F, -3.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(0, 48)
						.addBox(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.705F, 2.1451F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(56, 8).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 5.426F, 2.1243F, -0.3054F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(38, 58).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.426F, -2.1243F, 0.3054F, 0.0F, 0.0F));

		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(41, 45).addBox(-1.0F, -0.5F, -0.5001F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5168F, 4.2243F, 2.3451F, 0.0754F, -0.1071F, 0.9559F));

		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(33, 40).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9079F, 5.1132F, 2.2558F, 0.0901F, 0.5888F, 1.0141F));

		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(33, 42).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9079F, 5.1132F, -2.2558F, -0.0901F, -0.5888F, 1.0141F));

		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(56, 11).addBox(-1.0F, -0.5F, -0.4999F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5168F, 4.2243F, -2.3451F, -0.0754F, 0.1071F, 0.9559F));

		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(76, 28)
						.addBox(-1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 75)
						.addBox(-0.5F, -3.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.705F, -2.1451F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(12, 48).addBox(0.5327F, -3.066F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4311F, 7.7374F, 0.0F, 0.0F, 0.0F, -0.6021F));

		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(10, 65).addBox(-1.3222F, -7.817F, -2.0F, 2.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4311F, 7.7374F, 0.0F, 0.0F, 0.0F, 0.0087F));

		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(32, 68).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6451F, 2.705F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_leg_r10 = left_leg.addOrReplaceChild("left_leg_r10",
				CubeListBuilder.create().texOffs(72, 6).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6243F, 5.426F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition lower_left_leg = left_leg.addOrReplaceChild("lower_left_leg",
				CubeListBuilder.create().texOffs(62, 61)
						.addBox(-1.4778F, 0.0525F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 67)
						.addBox(-1.4778F, -0.1975F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0222F, 5.9475F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition left_leg_r11 = lower_left_leg.addOrReplaceChild("left_leg_r11",
				CubeListBuilder.create().texOffs(66, 59).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0222F, 1.0937F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg_r12 = lower_left_leg.addOrReplaceChild("left_leg_r12",
				CubeListBuilder.create().texOffs(18, 65).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0222F, 0.5525F, 2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg_r13 = lower_left_leg.addOrReplaceChild("left_leg_r13",
				CubeListBuilder.create().texOffs(10, 56).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0222F, 1.0937F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg_r14 = lower_left_leg.addOrReplaceChild("left_leg_r14",
				CubeListBuilder.create().texOffs(57, 18).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0222F, 0.5525F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = lower_left_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(73, 42).addBox(-0.9897F, -1.622F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4089F, 1.7899F, 0.0F, 0.0F, 0.0F, 0.2269F));

		PartDefinition right_leg_r4 = lower_left_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(74, 14).addBox(-0.26F, -1.1397F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4089F, 1.7899F, 0.0F, 0.0F, 0.0F, -0.5585F));

		PartDefinition left_leg_r15 = lower_left_leg.addOrReplaceChild("left_leg_r15",
				CubeListBuilder.create().texOffs(72, 67).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5222F, 1.0937F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_leg_r16 = lower_left_leg.addOrReplaceChild("left_leg_r16",
				CubeListBuilder.create().texOffs(72, 72).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5222F, 0.5525F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition foot = lower_left_leg.addOrReplaceChild("foot",
				CubeListBuilder.create().texOffs(50, 0).addBox(-1.4797F, 0.0F, -6.0008F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.002F, 6.0525F, 2.0008F, -0.3878F, 0.0594F, 0.1642F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(28, 58)
						.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 18)
						.addBox(-1.5F, -0.25F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(33, 40)
						.addBox(-1.5F, 5.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 11.6F, 0.0F, -0.258F, 0.045F, 0.1687F));

		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(74, 47)
						.addBox(-1.5F, -3.0F, -0.5001F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.001F)).texOffs(38, 8)
						.addBox(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.705F, 2.1451F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(38, 21).addBox(-1.5F, -1.0F, -0.5003F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, 5.426F, 2.1243F, -0.3054F, 0.0F, 0.0F));

		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(46, 21).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.426F, -2.1243F, 0.3054F, 0.0F, 0.0F));

		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -0.5F, -0.5001F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5168F, 4.2243F, 2.3451F, 0.0754F, 0.1071F, -0.9559F));

		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9079F, 5.1132F, 2.2558F, 0.0901F, -0.5888F, -1.0141F));

		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9079F, 5.1132F, -2.2558F, -0.0901F, 0.5888F, -1.0141F));

		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11",
				CubeListBuilder.create().texOffs(24, 45).addBox(-1.0F, -0.5F, -0.4999F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5168F, 4.2243F, -2.3451F, -0.0754F, -0.1071F, -0.9559F));

		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12",
				CubeListBuilder.create().texOffs(24, 40)
						.addBox(0.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 75)
						.addBox(-2.5F, -3.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.705F, -2.1451F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_leg_r17 = right_leg.addOrReplaceChild("left_leg_r17",
				CubeListBuilder.create().texOffs(43, 0).addBox(-2.5327F, -3.066F, -2.0F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4311F, 7.7374F, 0.0F, 0.0F, 0.0F, 0.6021F));

		PartDefinition left_leg_r18 = right_leg.addOrReplaceChild("left_leg_r18",
				CubeListBuilder.create().texOffs(64, 28).addBox(-0.6778F, -7.817F, -2.0F, 2.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4311F, 7.7374F, 0.0F, 0.0F, 0.0F, -0.0087F));

		PartDefinition right_leg_r13 = right_leg.addOrReplaceChild("right_leg_r13",
				CubeListBuilder.create().texOffs(67, 37).addBox(-0.5F, -3.0F, -2.0F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6451F, 2.705F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_leg_r14 = right_leg.addOrReplaceChild("right_leg_r14",
				CubeListBuilder.create().texOffs(62, 71).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6243F, 5.426F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition lower_right_leg = right_leg.addOrReplaceChild("lower_right_leg",
				CubeListBuilder.create().texOffs(42, 61)
						.addBox(-1.5222F, 0.0525F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 54)
						.addBox(-1.5222F, -0.1975F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0222F, 5.9475F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition right_leg_r15 = lower_right_leg.addOrReplaceChild("right_leg_r15",
				CubeListBuilder.create().texOffs(62, 56).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0222F, 1.0937F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition right_leg_r16 = lower_right_leg.addOrReplaceChild("right_leg_r16",
				CubeListBuilder.create().texOffs(64, 23).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0222F, 0.5525F, 2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_leg_r17 = lower_right_leg.addOrReplaceChild("right_leg_r17",
				CubeListBuilder.create().texOffs(20, 34).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0222F, 1.0937F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_leg_r18 = lower_right_leg.addOrReplaceChild("right_leg_r18",
				CubeListBuilder.create().texOffs(33, 45).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0222F, 0.5525F, -2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg_r19 = lower_right_leg.addOrReplaceChild("left_leg_r19",
				CubeListBuilder.create().texOffs(73, 33).addBox(-0.0103F, -1.622F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4089F, 1.7899F, 0.0F, 0.0F, 0.0F, -0.2269F));

		PartDefinition left_leg_r20 = lower_right_leg.addOrReplaceChild("left_leg_r20",
				CubeListBuilder.create().texOffs(6, 74).addBox(-0.74F, -1.1397F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4089F, 1.7899F, 0.0F, 0.0F, 0.0F, 0.5585F));

		PartDefinition right_leg_r19 = lower_right_leg.addOrReplaceChild("right_leg_r19",
				CubeListBuilder.create().texOffs(52, 72).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5222F, 1.0937F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_leg_r20 = lower_right_leg.addOrReplaceChild("right_leg_r20",
				CubeListBuilder.create().texOffs(72, 59).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5222F, 0.5525F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition foot2 = lower_right_leg.addOrReplaceChild("foot2",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.5203F, 0.0F, -6.0008F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.002F, 6.0525F, 2.0008F, -0.3878F, -0.0594F, -0.1642F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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