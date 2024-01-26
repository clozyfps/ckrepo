package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelYujikunaShirtless<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_yujikuna_shirtless"), "main");
	public final ModelPart head;
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelYujikunaShirtless(ModelPart root) {
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
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-4.0F, -8.25F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(3.25F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 21).addBox(3.25F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 55)
						.addBox(3.25F, -7.0F, -2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 76).addBox(3.25F, -4.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(3.25F, -2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 5).addBox(-4.25F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 45)
						.addBox(-4.25F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 56).addBox(-4.25F, -7.0F, -2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(75, 22)
						.addBox(-4.25F, -4.0F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-4.25F, -2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 5)
						.addBox(-4.0F, -8.0F, -4.1F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 41).addBox(-4.0F, -8.0F, 3.25F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 91).mirror()
						.addBox(-0.5F, -6.7104F, -4.02F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.828F, -2.3604F, -4.1F, 0.0F, 0.0F, 0.1309F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(18, 91).mirror().addBox(-0.5F, -1.0F, 0.08F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.178F, -5.8104F, -4.1F, 0.0F, 0.0F, -0.1745F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(18, 91).addBox(-0.5F, -1.0F, 0.08F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.178F, -5.8104F, -4.1F, 0.0F, 0.0F, 0.1745F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(32, 24).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.828F, -2.3604F, -4.1F, 0.0F, 0.0F, -0.1309F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(48, 39).mirror().addBox(-1.25F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, -4.05F, -4.1F, 0.0F, 0.0F, 0.1309F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(48, 39).addBox(-1.75F, -1.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -4.05F, -4.1F, 0.0F, 0.0F, -0.1309F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(48, 35).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, -2.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(68, 8).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -3.0F, -2.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition Hair = head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -8.5F, -3.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.75F, 0.0F));
		PartDefinition Hair1 = Hair.addOrReplaceChild("Hair1", CubeListBuilder.create(), PartPose.offset(-5.6959F, -8.2351F, 0.124F));
		PartDefinition bone2 = Hair1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.3491F, 0.0F));
		PartDefinition bone15 = Hair1.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(11.3917F, 0.0F, 0.0F, 0.3927F, 0.3491F, 0.0F));
		PartDefinition bone3 = Hair1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -1.25F, -1.0F, -0.2264F, -0.713F, 0.7351F));
		PartDefinition head_r9 = bone3.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(28, 92).addBox(-0.8123F, -1.0824F, -1.0835F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition bone45 = Hair1.addOrReplaceChild("bone45", CubeListBuilder.create(), PartPose.offsetAndRotation(1.75F, -0.25F, -3.0F, -0.2264F, -0.713F, 0.7351F));
		PartDefinition head_r10 = bone45.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(28, 92).addBox(-0.8123F, -1.0824F, -1.0835F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition bone46 = Hair1.addOrReplaceChild("bone46", CubeListBuilder.create(), PartPose.offsetAndRotation(9.6417F, -0.25F, -3.0F, -0.2264F, 0.713F, -0.7351F));
		PartDefinition head_r11 = bone46.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(28, 92).mirror().addBox(-1.1877F, -1.0824F, -1.0835F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition bone30 = Hair1.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offsetAndRotation(9.6417F, -1.25F, -1.0F, -0.2264F, 0.713F, -0.7351F));
		PartDefinition head_r12 = bone30.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(92, 20).addBox(-1.1877F, -1.0824F, -1.0835F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition bone7 = Hair1.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(3.75F, -2.25F, -0.75F, -0.0606F, -0.4591F, 0.8822F));
		PartDefinition head_r13 = bone7.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(50, 94).addBox(-0.7172F, -1.0913F, -1.0424F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r14 = bone7.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(52, 90).addBox(-2.132F, -1.0913F, -1.0973F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone43 = Hair1.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offsetAndRotation(8.1417F, -1.75F, -2.75F, -0.0697F, 0.6768F, -0.899F));
		PartDefinition head_r15 = bone43.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(50, 94).mirror().addBox(-1.2828F, -1.0913F, -1.0424F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r16 = bone43.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(0.132F, -1.0913F, -1.0973F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone42 = Hair1.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(3.25F, -1.75F, -2.75F, -0.0697F, -0.6768F, 0.899F));
		PartDefinition head_r17 = bone42.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(50, 94).addBox(-0.7172F, -1.0913F, -1.0424F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r18 = bone42.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(52, 90).addBox(-2.132F, -1.0913F, -1.0973F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone32 = Hair1.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6417F, -2.25F, -0.75F, -0.0606F, 0.4591F, -0.8822F));
		PartDefinition head_r19 = bone32.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(42, 94).addBox(-1.2828F, -1.0913F, -1.0424F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r20 = bone32.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(90, 49).addBox(0.132F, -1.0913F, -1.0973F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone38 = Hair1.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 4.0F, 2.75F, -0.3423F, -0.6326F, -0.1394F));
		PartDefinition bone39 = Hair1.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offsetAndRotation(10.6417F, 4.0F, 2.75F, -0.3423F, 0.6326F, 0.1394F));
		PartDefinition Hair2 = Hair.addOrReplaceChild("Hair2", CubeListBuilder.create(), PartPose.offset(-5.6959F, -7.7351F, 2.124F));
		PartDefinition bone11 = Hair2.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.5F, -0.25F, -0.0873F, -0.3491F, 0.0F));
		PartDefinition head_r21 = bone11.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(46, 66).addBox(-0.4521F, -1.0936F, -0.4406F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r22 = bone11.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(73, 0).addBox(-1.5421F, -1.0936F, -0.8067F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone40 = Hair2.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offsetAndRotation(10.8917F, -0.5F, -0.25F, -0.0873F, 0.3491F, 0.0F));
		PartDefinition head_r23 = bone40.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(22, 87).addBox(-1.5479F, -1.0936F, -0.4406F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r24 = bone40.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(14, 87).addBox(-0.4579F, -1.0936F, -0.8067F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone16 = Hair2.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(10.8917F, -0.5F, -0.25F, -0.0873F, 0.3491F, 0.0F));
		PartDefinition bone13 = Hair2.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -2.75F, -0.5F, -0.2857F, -0.9242F, 0.8158F));
		PartDefinition head_r25 = bone13.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(94, 40).addBox(-0.7477F, -0.8317F, -0.9099F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r26 = bone13.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(44, 90).addBox(-2.0702F, -0.8317F, -0.9762F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone24 = Hair2.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(9.1417F, -2.75F, -0.5F, -0.2857F, 0.9242F, -0.8158F));
		PartDefinition head_r27 = bone24.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(94, 34).addBox(-1.2523F, -0.8317F, -0.9099F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r28 = bone24.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(90, 30).addBox(0.0702F, -0.8317F, -0.9762F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone14 = Hair2.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.25F, -0.25F, -0.0566F, -0.2849F, 0.8712F));
		PartDefinition head_r29 = bone14.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(94, 14).addBox(-0.5275F, -0.9683F, -0.689F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r30 = bone14.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(0, 90).addBox(-1.7596F, -0.9683F, -0.9485F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone28 = Hair2.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3917F, -3.25F, -0.25F, -0.0566F, 0.2849F, -0.8712F));
		PartDefinition head_r31 = bone28.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(94, 10).addBox(-1.4725F, -0.9683F, -0.689F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r32 = bone28.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(87, 89).addBox(-0.2404F, -0.9683F, -0.9485F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone17 = Hair2.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 1.5F, 0.5F, -0.0915F, -0.3042F, 0.0275F));
		PartDefinition bone12 = Hair2.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(10.6417F, 1.5F, 0.5F, -0.0915F, 0.3042F, -0.0275F));
		PartDefinition Hair3 = Hair.addOrReplaceChild("Hair3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6959F, -7.2351F, 3.624F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone9 = Hair3.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.5F, -0.25F, -0.0873F, -0.3491F, 0.0F));
		PartDefinition head_r33 = bone9.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(12, 95).addBox(-0.5579F, -0.7884F, -0.599F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r34 = bone9.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(81, 87).addBox(-1.725F, -0.7884F, -0.86F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone41 = Hair3.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offsetAndRotation(10.8917F, -0.5F, -0.25F, -0.0873F, 0.3491F, 0.0F));
		PartDefinition head_r35 = bone41.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(20, 95).addBox(-1.4421F, -0.7884F, -0.599F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r36 = bone41.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(30, 88).addBox(-0.275F, -0.7884F, -0.86F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone18 = Hair3.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(10.8917F, -0.5F, -0.25F, -0.0873F, 0.3491F, 0.0F));
		PartDefinition bone19 = Hair3.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -2.0F, -0.5F, -0.2264F, -0.713F, 0.7351F));
		PartDefinition head_r37 = bone19.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(76, 91).addBox(-0.605F, -0.7152F, -0.6514F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r38 = bone19.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(6, 64).addBox(-1.7947F, -0.7152F, -0.8698F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone20 = Hair3.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(9.1417F, -2.0F, -0.5F, -0.2264F, 0.713F, -0.7351F));
		PartDefinition head_r39 = bone20.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(68, 91).addBox(-1.395F, -0.7152F, -0.6514F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r40 = bone20.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(26, 45).addBox(-0.2053F, -0.7152F, -0.8698F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone21 = Hair3.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.25F, -0.25F, -0.0566F, -0.2849F, 0.8712F));
		PartDefinition head_r41 = bone21.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(94, 6).addBox(-0.5143F, -0.8502F, -0.4591F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r42 = bone21.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(89, 24).addBox(-1.6017F, -0.8502F, -0.7809F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone22 = Hair3.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3917F, -3.25F, -0.25F, -0.0566F, 0.2849F, -0.8712F));
		PartDefinition head_r43 = bone22.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(90, 93).addBox(-1.4857F, -0.8502F, -0.4591F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r44 = bone22.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(88, 80).addBox(-0.3983F, -0.8502F, -0.7809F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone23 = Hair3.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 1.5F, 0.5F, -0.0915F, -0.3042F, 0.0275F));
		PartDefinition bone10 = Hair3.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(10.6417F, 1.5F, 0.5F, -0.0915F, 0.3042F, -0.0275F));
		PartDefinition Hair4 = Hair.addOrReplaceChild("Hair4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6959F, -5.7351F, 3.624F, -1.1345F, 0.0F, 0.0F));
		PartDefinition bone27 = Hair4.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -2.0F, -0.5F, -0.2264F, -0.713F, 0.7351F));
		PartDefinition head_r45 = bone27.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(0, 95).addBox(-0.6415F, -0.6917F, -0.3374F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r46 = bone27.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(88, 60).addBox(-1.6209F, -0.6917F, -0.6059F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone8 = Hair4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(9.1417F, -2.0F, -0.5F, -0.2264F, 0.713F, -0.7351F));
		PartDefinition head_r47 = bone8.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(94, 82).addBox(-1.3585F, -0.6917F, -0.3374F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r48 = bone8.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(38, 88).addBox(-0.3791F, -0.6917F, -0.6059F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition bone29 = Hair4.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -3.25F, -0.25F, -0.0566F, -0.2849F, 0.8712F));
		PartDefinition head_r49 = bone29.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(74, 95).addBox(-0.6597F, -0.8241F, -0.1787F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, 1.3372F, 1.6694F));
		PartDefinition head_r50 = bone29.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(82, 93).addBox(-1.5328F, -0.8241F, -0.4727F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0959F, 0.7351F, -2.124F, 0.3441F, 0.8192F, 0.456F));
		PartDefinition bone5 = Hair4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3917F, -3.25F, -0.25F, -0.0566F, 0.2849F, -0.8712F));
		PartDefinition head_r51 = bone5.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(66, 95).addBox(-1.3403F, -0.8241F, -0.1787F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4722F, -1.3372F, -1.6694F));
		PartDefinition head_r52 = bone5.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(6, 93).addBox(-0.4672F, -0.8241F, -0.4727F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0959F, 0.7351F, -2.124F, 0.3441F, -0.8192F, -0.456F));
		PartDefinition Hair5 = Hair.addOrReplaceChild("Hair5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6959F, -3.9851F, 2.376F, -1.309F, 0.0F, 0.0F));
		PartDefinition bone25 = Hair5.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -2.0F, 0.5F, 0.2264F, 0.713F, 0.7351F));
		PartDefinition bone6 = Hair5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(9.1417F, -2.0F, 0.5F, 0.2264F, -0.713F, -0.7351F));
		PartDefinition bone26 = Hair5.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offsetAndRotation(9.1417F, -2.0F, 0.75F, 0.2264F, -0.713F, -0.7351F));
		PartDefinition bone31 = Hair5.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offsetAndRotation(3.75F, -3.75F, 0.25F, 0.062F, 0.5027F, 0.8852F));
		PartDefinition bone4 = Hair5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(7.6417F, -3.75F, 0.25F, 0.062F, -0.5027F, -0.8852F));
		PartDefinition bone33 = Hair.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(0.05F, -11.1454F, -0.8521F));
		PartDefinition head_r53 = bone33.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(60, 91).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.35F, -0.5F, -0.9163F, 0.0F, 0.0F));
		PartDefinition head_r54 = bone33.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.3249F, -1.1833F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone44 = Hair.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -9.8074F, -3.2399F, 0.2618F, 0.0F, 0.0F));
		PartDefinition head_r55 = bone44.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(60, 91).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -1.188F, 0.3878F, -0.9163F, 0.0F, 0.0F));
		PartDefinition head_r56 = bone44.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.4869F, -0.2955F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone34 = Hair.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -11.6454F, 1.8979F, -0.2618F, 0.0F, 0.0F));
		PartDefinition head_r57 = bone34.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(91, 53).addBox(-1.0F, -0.0381F, -0.6913F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition head_r58 = bone34.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(64, 55).addBox(-1.0F, -3.6622F, -0.8686F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2954F, -2.8979F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone35 = Hair.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -10.8954F, 4.8979F, -0.6545F, 0.0F, 0.0F));
		PartDefinition head_r59 = bone35.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(20, 91).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition head_r60 = bone35.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.5468F, -0.7113F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2954F, -2.8979F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone36 = Hair.addOrReplaceChild("bone36", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -7.3954F, 7.1479F, -1.5272F, 0.0F, 0.0F));
		PartDefinition head_r61 = bone36.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(12, 91).addBox(-1.0F, -0.1786F, -0.117F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition head_r62 = bone36.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(49, 85).addBox(-1.0F, -3.5468F, -0.2887F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2954F, -2.8979F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone37 = Hair.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offsetAndRotation(0.05F, -6.2454F, 6.8521F, -1.2217F, 0.0F, 0.0F));
		PartDefinition bone = Hair.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-3.7982F, -3.6662F, 1.7609F));
		PartDefinition head_r63 = bone.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(52, 17).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3158F, -0.3458F, -0.2381F));
		PartDefinition head_r64 = bone.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.35F, -2.3F, 1.0F, -1.0104F, -0.3458F, -0.2381F));
		PartDefinition head_r65 = bone.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -0.8F, 0.25F, -1.0104F, -0.3458F, -0.2381F));
		PartDefinition head_r66 = bone.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(44, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, -1.55F, -2.75F, -1.1071F, -0.5033F, -0.3207F));
		PartDefinition head_r67 = bone.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(32, 56).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.25F, -0.75F, -1.3158F, -0.3458F, -0.2381F));
		PartDefinition head_r68 = bone.addOrReplaceChild("head_r68", CubeListBuilder.create().texOffs(72, 50).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, -2.05F, -4.0F, -1.1071F, -0.5033F, -0.3207F));
		PartDefinition head_r69 = bone.addOrReplaceChild("head_r69", CubeListBuilder.create().texOffs(68, 67).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -3.25F, -2.0F, -1.3158F, -0.3458F, -0.2381F));
		PartDefinition head_r70 = bone.addOrReplaceChild("head_r70", CubeListBuilder.create().texOffs(6, 71).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.35F, -3.55F, -4.15F, -1.0104F, -0.3458F, -0.2381F));
		PartDefinition head_r71 = bone.addOrReplaceChild("head_r71", CubeListBuilder.create().texOffs(74, 70).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, -3.55F, 0.25F, -1.1071F, -0.5033F, -0.3207F));
		PartDefinition head_r72 = bone.addOrReplaceChild("head_r72", CubeListBuilder.create().texOffs(72, 43).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.9463F, -3.55F, -4.15F, -1.0104F, 0.3458F, 0.2381F));
		PartDefinition head_r73 = bone.addOrReplaceChild("head_r73", CubeListBuilder.create().texOffs(10, 73).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.9463F, -2.3F, 1.0F, -1.0104F, 0.3458F, 0.2381F));
		PartDefinition head_r74 = bone.addOrReplaceChild("head_r74", CubeListBuilder.create().texOffs(62, 64).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.6963F, -0.8F, 0.25F, -1.0104F, 0.3458F, 0.2381F));
		PartDefinition head_r75 = bone.addOrReplaceChild("head_r75", CubeListBuilder.create().texOffs(36, 69).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8463F, -3.25F, -2.0F, -1.3158F, 0.3458F, 0.2381F));
		PartDefinition head_r76 = bone.addOrReplaceChild("head_r76", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8463F, -2.25F, -0.75F, -1.3158F, 0.3458F, 0.2381F));
		PartDefinition head_r77 = bone.addOrReplaceChild("head_r77", CubeListBuilder.create().texOffs(74, 22).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5463F, -2.05F, -4.0F, -1.1071F, 0.5033F, 0.3207F));
		PartDefinition head_r78 = bone.addOrReplaceChild("head_r78", CubeListBuilder.create().texOffs(76, 28).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5463F, -3.55F, 0.25F, -1.1071F, 0.5033F, 0.3207F));
		PartDefinition head_r79 = bone.addOrReplaceChild("head_r79", CubeListBuilder.create().texOffs(50, 74).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5463F, -1.55F, -2.75F, -1.1071F, 0.5033F, 0.3207F));
		PartDefinition head_r80 = bone.addOrReplaceChild("head_r80", CubeListBuilder.create().texOffs(40, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5963F, 0.0F, 0.0F, -1.3158F, 0.3458F, 0.2381F));
		PartDefinition head_r81 = bone.addOrReplaceChild("head_r81", CubeListBuilder.create().texOffs(48, 8).addBox(-1.8741F, -3.4789F, -1.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0482F, 1.6662F, 1.4891F, -0.9231F, -0.3458F, -0.2381F));
		PartDefinition head_r82 = bone.addOrReplaceChild("head_r82", CubeListBuilder.create().texOffs(47, 0).addBox(0.8741F, -3.4789F, -1.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5482F, 1.6662F, 1.4891F, -0.9231F, 0.3458F, 0.2381F));
		PartDefinition head_r83 = bone.addOrReplaceChild("head_r83", CubeListBuilder.create().texOffs(30, 65).addBox(-1.2018F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.95F, 2.0F, -0.9672F, 0.0099F, 0.0F));
		PartDefinition head_r84 = bone.addOrReplaceChild("head_r84", CubeListBuilder.create().texOffs(0, 16).addBox(-2.8741F, -3.4789F, -2.3952F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, 0.1662F, 1.9891F, -0.9231F, -0.3458F, -0.2381F));
		PartDefinition head_r85 = bone.addOrReplaceChild("head_r85", CubeListBuilder.create().texOffs(57, 85).addBox(-1.674F, -2.3114F, -1.9746F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, -0.0838F, 1.9891F, -1.2339F, -0.0349F, -0.29F));
		PartDefinition head_r86 = bone.addOrReplaceChild("head_r86", CubeListBuilder.create().texOffs(6, 87).addBox(-0.326F, -2.3114F, -1.9746F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, -0.0838F, 1.9891F, -1.2339F, 0.0349F, 0.29F));
		PartDefinition head_r87 = bone.addOrReplaceChild("head_r87", CubeListBuilder.create().texOffs(0, 84).addBox(0.8741F, -3.4789F, -2.3952F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, 0.1662F, 1.9891F, -0.9231F, 0.3458F, 0.2381F));
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(20, 100).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-4.0F, 6.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(0, 99).addBox(-1.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-1.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, 2.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(-3.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 41).mirror()
				.addBox(-3.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.5F, 2.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(40, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 36).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 52)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(82, 56).addBox(-2.0F, 9.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 69)
						.addBox(1.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 69).addBox(-2.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(68, 77).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(67, 1).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(66, 60).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(0, 78).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(50, 67).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(62, 67).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(80, 74).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, 1.8353F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(81, 52).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, 1.9224F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(44, 81).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, 1.8353F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(54, 81).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, -1.8353F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(82, 28).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, -1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(84, 46).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, -1.8353F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r10 = left_leg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(6, 80).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 9.5964F, -2.3799F, 0.2182F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(24, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 41).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(81, 22).addBox(-2.0F, 9.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 66)
						.addBox(-2.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 66).addBox(1.25F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 57)
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r11 = right_leg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(76, 28).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r12 = right_leg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(34, 62).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r13 = right_leg.addOrReplaceChild("left_leg_r13", CubeListBuilder.create().texOffs(0, 64).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 6.7555F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(56, 64).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8353F, 4.8502F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(24, 65).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(40, 34).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, 1.8353F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(26, 41).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, 1.9224F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(78, 62).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, 1.8353F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(80, 70).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, -1.8353F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(78, 80).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, -1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12", CubeListBuilder.create().texOffs(16, 66).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7555F, -1.8353F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r13 = right_leg.addOrReplaceChild("right_leg_r13", CubeListBuilder.create().texOffs(0, 57).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5964F, -2.3799F, 0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
