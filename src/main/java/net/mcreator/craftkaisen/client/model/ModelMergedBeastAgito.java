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
public class ModelMergedBeastAgito<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_merged_beast_agito"), "main");
	public final ModelPart head;
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelMergedBeastAgito(ModelPart root) {
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
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, -10.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(92, 19)
				.addBox(-3.0F, -4.0F, -7.01F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-2.5F, 0.0F, -6.899F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, -38.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.0F, -0.498F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 108).addBox(1.0F, -0.5F, -0.497F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -7.0F, -6.5F, 0.0F, 0.0F, -0.1309F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(106, 16).addBox(-2.0F, -0.5F, -0.497F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-1.5F, -1.0F, -0.499F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -7.0F, -6.5F, 0.0F, 0.0F, 0.1309F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(4, 108).addBox(0.0F, -2.5F, -0.48F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6501F, -1.7685F, -6.51F, 0.0F, 0.0F, 0.3927F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(21, 108).addBox(-1.0F, -2.5F, -0.48F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6501F, -1.7685F, -6.51F, 0.0F, 0.0F, -0.3927F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(96, 92).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.0F, -6.5F, 0.3927F, 0.2618F, 0.0F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(98, 44).addBox(-0.5F, -1.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -6.0F, -6.5F, 0.3927F, -0.2618F, 0.0F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(112, 0).addBox(-1.5F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4511F, -4.0F, 2.4306F, 0.0F, -1.2654F, 0.0F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(118, 16).addBox(-6.0F, -6.5F, 0.0F, 12.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.4069F, 7.3459F, -1.3526F, 0.0F, 0.0F));
		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-5.5F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.4511F, -4.0F, 2.4306F, 0.0F, 1.2654F, 0.0F));
		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(118, 16).addBox(-6.0F, -6.5F, 0.0F, 12.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.6823F, 0.2785F, -1.309F, 0.0F, 0.0F));
		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(112, 0).mirror().addBox(-5.5F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.4511F, -4.0F, -4.5694F, 0.0F, 1.2654F, 0.0F));
		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(112, 0).addBox(-1.5F, -6.0F, 0.0F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4511F, -4.0F, -4.5694F, 0.0F, -1.2654F, 0.0F));
		PartDefinition left_antler = head.addOrReplaceChild("left_antler", CubeListBuilder.create(), PartPose.offsetAndRotation(6.495F, -15.4415F, 1.6471F, -0.6527F, 0.0531F, 0.0693F));
		PartDefinition head_r13 = left_antler.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(25, 108).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1918F, -5.599F, -0.8628F, 0.0859F, -0.3582F, 0.1876F));
		PartDefinition head_r14 = left_antler.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(107, 43).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4175F, -4.504F, 0.5782F, -0.1591F, -0.3332F, 0.8845F));
		PartDefinition head_r15 = left_antler.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(98, 24).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3227F, -1.4234F, 0.3371F, -0.0141F, -0.3677F, 0.4676F));
		PartDefinition head_r16 = left_antler.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(68, 101).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.745F, 7.4415F, -0.6471F, -0.3927F, 0.0F, 0.6109F));
		PartDefinition head_r17 = left_antler.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(72, 108).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1941F, 3.6272F, 0.7779F, -0.2602F, -0.2975F, -0.2226F));
		PartDefinition head_r18 = left_antler.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(6, 72).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5134F, 1.9468F, 0.5837F, 0.2198F, -0.2975F, -0.2226F));
		PartDefinition right_antler = head.addOrReplaceChild("right_antler", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.495F, -15.4415F, 1.6471F, -0.6527F, -0.0531F, -0.0693F));
		PartDefinition head_r19 = right_antler.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(8, 55).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1918F, -5.599F, -0.8628F, 0.0859F, 0.3582F, -0.1876F));
		PartDefinition head_r20 = right_antler.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(36, 78).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4175F, -4.504F, 0.5782F, -0.1591F, 0.3332F, -0.8845F));
		PartDefinition head_r21 = right_antler.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(38, 19).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3227F, -1.4234F, 0.3371F, -0.0141F, 0.3677F, -0.4676F));
		PartDefinition head_r22 = right_antler.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(36, 72).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.745F, 7.4415F, -0.6471F, -0.3927F, 0.0F, -0.6109F));
		PartDefinition head_r23 = right_antler.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(88, 37).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1941F, 3.6272F, 0.7779F, -0.2602F, 0.2975F, 0.2226F));
		PartDefinition head_r24 = right_antler.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(54, 59).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5134F, 1.9468F, 0.5837F, 0.2198F, 0.2975F, 0.2226F));
		PartDefinition torso = partdefinition
				.addOrReplaceChild(
						"torso", CubeListBuilder.create().texOffs(40, 83).addBox(-6.0F, 15.75F, -4.0F, 12.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-12.0F, 6.75F, 5.999F, 24.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
								.texOffs(76, 12).addBox(-12.0F, 6.75F, -5.501F, 24.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -0.25F, -5.5F, 26.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -38.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(52, 33).addBox(-13.0F, -1.0F, 0.0F, 26.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7117F, 5.613F, 1.0908F, 0.0F, 0.0F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(52, 35).addBox(-13.0F, -1.0F, 0.0F, 26.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.7117F, -4.613F, -1.0908F, 0.0F, 0.0F));
		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(24, 117).addBox(-6.7318F, -4.1025F, -4.1025F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 10.25F, -3.125F, 0.7854F, 0.1309F, 0.0F));
		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(0, 123).addBox(0.7318F, -4.1025F, -4.1025F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 10.25F, -3.125F, 0.7854F, -0.1309F, 0.0F));
		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(38, 19).addBox(-12.0F, -6.5F, -3.0F, 24.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 38).addBox(-9.0F, -5.5F, -5.0F, 18.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.5F, 0.25F, -0.0436F, 0.0F, 0.0F));
		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(-0.25F, 19.5636F, 2.8723F));
		PartDefinition torso_r6 = tail.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(53, 98).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -17.0F, 17.0F, -3.1339F, 0.1231F, 0.124F));
		PartDefinition torso_r7 = tail.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(60, 102).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -19.0784F, 18.8284F, 2.4083F, -0.639F, 0.493F));
		PartDefinition torso_r8 = tail.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(0, 92).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.1F)).texOffs(104, 22).addBox(-1.0F, -1.0F, 4.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -15.9393F, 18.0607F, 2.3562F, 0.0F, 0.0F));
		PartDefinition torso_r9 = tail.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(61, 98).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -17.0F, 17.0F, -3.1339F, -0.1231F, -0.124F));
		PartDefinition torso_r10 = tail.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(88, 44).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -15.0784F, 15.0784F, 1.994F, -0.3897F, 0.7006F));
		PartDefinition torso_r11 = tail.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(95, 99).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.005F)),
				PartPose.offsetAndRotation(0.25F, -9.7556F, 21.6309F, 1.8326F, 0.0F, 0.0F));
		PartDefinition torso_r12 = tail.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(0, 108).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -1.9639F, 22.3125F, 1.4835F, 0.0F, 0.0F));
		PartDefinition torso_r13 = tail.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(51, 108).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.005F)),
				PartPose.offsetAndRotation(0.25F, 4.7459F, 19.8704F, 0.9599F, 0.0F, 0.0F));
		PartDefinition torso_r14 = tail.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(113, 61).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 8.6448F, 14.5529F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r15 = tail.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(113, 83).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.005F)),
				PartPose.offsetAndRotation(0.25F, 8.501F, 7.9607F, -0.3491F, 0.0F, 0.0F));
		PartDefinition torso_r16 = tail.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(114, 41).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 4.4364F, 1.8777F, -0.829F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(14.0F, -33.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(36, 48).addBox(-1.5F, -5.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3887F, 1.5095F, 3.6405F, 0.0F, 1.1345F, -0.0436F));
		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(76, 16).addBox(-5.0F, -1.5F, 0.0F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5143F, -3.8733F, 3.6405F, 1.1345F, 0.0F, -0.0436F));
		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(48, 59).addBox(-1.5F, -5.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3887F, 1.5095F, -3.6405F, 0.0F, -1.1345F, -0.0436F));
		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(88, 41).addBox(-5.0F, -1.5F, 0.0F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5143F, -3.8733F, -3.6405F, -1.1345F, 0.0F, -0.0436F));
		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(0, 72).addBox(-5.0F, -10.5F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(90, 51).addBox(-4.0F, -4.5F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 7.25F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition left_lower_arm = left_arm.addOrReplaceChild("left_lower_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0614F, 11.1226F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition left_arm_r6 = left_lower_arm.addOrReplaceChild("left_arm_r6", CubeListBuilder.create().texOffs(8, 19).addBox(-1.5F, -6.5F, 0.0F, 3.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0673F, 6.6613F, 4.1405F, 0.0F, 1.1345F, 0.0436F));
		PartDefinition left_arm_r7 = left_lower_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(40, 72).addBox(-3.1962F, -10.7224F, 0.0F, 3.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-0.1962F, -11.7224F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.263F, 9.6894F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition left_arm_r8 = left_lower_arm.addOrReplaceChild("left_arm_r8", CubeListBuilder.create().texOffs(0, 72).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7202F, 14.5665F, 2.6405F, 0.0F, 1.1345F, 0.0436F));
		PartDefinition left_arm_r9 = left_lower_arm.addOrReplaceChild("left_arm_r9", CubeListBuilder.create().texOffs(60, 123).addBox(-0.1962F, -0.2776F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.263F, 9.6894F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition left_arm_r10 = left_lower_arm.addOrReplaceChild("left_arm_r10", CubeListBuilder.create().texOffs(30, 72).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7202F, 14.5665F, -2.6405F, 0.0F, -1.1345F, 0.0436F));
		PartDefinition left_arm_r11 = left_lower_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(72, 92).addBox(-4.25F, 0.75F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 59).addBox(-5.25F, -12.25F, -5.5F, 11.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4386F, 12.1274F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition left_arm_r12 = left_lower_arm.addOrReplaceChild("left_arm_r12", CubeListBuilder.create().texOffs(32, 92).addBox(-1.5F, -6.5F, 0.0F, 3.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0673F, 6.6613F, -4.1405F, 0.0F, -1.1345F, 0.0436F));
		PartDefinition left_hand = left_lower_arm.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(42, 123).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4386F, 19.6274F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition finger1 = left_hand.addOrReplaceChild("finger1", CubeListBuilder.create().texOffs(22, 92).addBox(-0.9187F, -0.3478F, -0.8426F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 6.0F, -2.0F, -0.0381F, 0.1704F, 0.3894F));
		PartDefinition fingie1 = finger1.addOrReplaceChild("fingie1",
				CubeListBuilder.create().texOffs(0, 92).addBox(-1.3539F, -0.9342F, -0.842F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(0.3961F, 2.0658F, -0.3426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition finger2 = left_hand.addOrReplaceChild("finger2", CubeListBuilder.create().texOffs(72, 83).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 6.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition fingie2 = finger2.addOrReplaceChild("fingie2",
				CubeListBuilder.create().texOffs(81, 64).addBox(-1.5F, -0.866F, -0.99F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(0.25F, 2.134F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition finger3 = left_hand.addOrReplaceChild("finger3", CubeListBuilder.create().texOffs(81, 59).addBox(-0.8841F, -0.4316F, -1.2461F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 6.0F, 2.0F, 0.035F, -0.2595F, 0.4754F));
		PartDefinition fingie3 = finger3.addOrReplaceChild("fingie3",
				CubeListBuilder.create().texOffs(0, 55).addBox(-1.6133F, -1.1323F, -1.247F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 8).addBox(0.1367F, 1.8677F, -0.7461F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition leftthumb = left_hand.addOrReplaceChild("leftthumb", CubeListBuilder.create().texOffs(22, 97).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.0F, -3.0F, -0.1787F, 0.2148F, 0.1797F));
		PartDefinition thumbie = leftthumb.addOrReplaceChild("thumbie",
				CubeListBuilder.create().texOffs(0, 97).addBox(-1.0119F, -0.3587F, -0.9461F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 10).addBox(-0.5119F, 2.6413F, -0.6961F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.298F, -0.0098F, 0.0651F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.0F, -33.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-1.5F, -5.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.3887F, 1.5095F, 3.6405F, 0.0F, -1.1345F, 0.0436F));
		PartDefinition right_arm_r2 = right_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(76, 16).mirror().addBox(-5.0F, -1.5F, 0.0F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5143F, -3.8733F, 3.6405F, 1.1345F, 0.0F, 0.0436F));
		PartDefinition right_arm_r3 = right_arm.addOrReplaceChild("right_arm_r3", CubeListBuilder.create().texOffs(48, 59).mirror().addBox(-1.5F, -5.0F, 0.0F, 3.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.3887F, 1.5095F, -3.6405F, 0.0F, 1.1345F, 0.0436F));
		PartDefinition right_arm_r4 = right_arm.addOrReplaceChild("right_arm_r4", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-5.0F, -1.5F, 0.0F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5143F, -3.8733F, -3.6405F, -1.1345F, 0.0F, 0.0436F));
		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-5.0F, -10.5F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(90, 51).mirror()
				.addBox(-4.0F, -4.5F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 7.25F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition right_lower_arm = right_arm.addOrReplaceChild("right_lower_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0614F, 11.1226F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition right_arm_r6 = right_lower_arm.addOrReplaceChild("right_arm_r6", CubeListBuilder.create().texOffs(8, 19).mirror().addBox(-1.5F, -6.5F, 0.0F, 3.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0673F, 6.6613F, 4.1405F, 0.0F, -1.1345F, -0.0436F));
		PartDefinition right_arm_r7 = right_lower_arm.addOrReplaceChild("right_arm_r7", CubeListBuilder.create().texOffs(40, 72).mirror().addBox(0.1962F, -10.7224F, 0.0F, 3.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 19)
				.mirror().addBox(-1.8038F, -11.7224F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.263F, 9.6894F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition right_arm_r8 = right_lower_arm.addOrReplaceChild("right_arm_r8", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-1.5F, -1.5F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.7202F, 14.5665F, 2.6405F, 0.0F, -1.1345F, -0.0436F));
		PartDefinition right_arm_r9 = right_lower_arm.addOrReplaceChild("right_arm_r9", CubeListBuilder.create().texOffs(60, 123).mirror().addBox(-1.8038F, -0.2776F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.263F, 9.6894F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition right_arm_r10 = right_lower_arm.addOrReplaceChild("right_arm_r10", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-1.5F, -1.5F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.7202F, 14.5665F, -2.6405F, 0.0F, 1.1345F, -0.0436F));
		PartDefinition right_arm_r11 = right_lower_arm.addOrReplaceChild("right_arm_r11", CubeListBuilder.create().texOffs(72, 92).mirror().addBox(-3.75F, 0.75F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 59)
				.mirror().addBox(-5.75F, -12.25F, -5.5F, 11.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4386F, 12.1274F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition right_arm_r12 = right_lower_arm.addOrReplaceChild("right_arm_r12", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(-1.5F, -6.5F, 0.0F, 3.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0673F, 6.6613F, -4.1405F, 0.0F, 1.1345F, -0.0436F));
		PartDefinition right_hand = right_lower_arm.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(42, 123).mirror().addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.4386F, 19.6274F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition finger4 = right_hand.addOrReplaceChild("finger4", CubeListBuilder.create().texOffs(22, 92).mirror().addBox(-1.0813F, -0.3478F, -0.8426F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 6.0F, -2.0F, -0.0381F, -0.1704F, -0.3894F));
		PartDefinition fingie4 = finger4.addOrReplaceChild("fingie4", CubeListBuilder.create().texOffs(0, 92).mirror().addBox(-0.6461F, -0.9342F, -0.842F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 9).mirror()
				.addBox(-0.3961F, 2.0658F, -0.3426F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition finger5 = right_hand.addOrReplaceChild("finger5", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition fingie5 = finger5.addOrReplaceChild("fingie5", CubeListBuilder.create().texOffs(81, 64).mirror().addBox(-0.5F, -0.866F, -0.99F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).mirror()
				.addBox(-0.25F, 2.134F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition finger6 = right_hand.addOrReplaceChild("finger6", CubeListBuilder.create().texOffs(81, 59).mirror().addBox(-1.1159F, -0.4316F, -1.2461F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 6.0F, 2.0F, 0.035F, 0.2595F, -0.4754F));
		PartDefinition fingie6 = finger6.addOrReplaceChild("fingie6", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.3867F, -1.1323F, -1.247F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 8).mirror()
				.addBox(-0.1367F, 1.8677F, -0.7461F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition rightthumb = right_hand.addOrReplaceChild("rightthumb", CubeListBuilder.create().texOffs(22, 97).mirror().addBox(-1.0F, -1.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, 1.0F, -3.0F, -0.1787F, -0.2148F, -0.1797F));
		PartDefinition thumbie2 = rightthumb.addOrReplaceChild("thumbie2", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-0.9881F, -0.3587F, -0.9461F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 10).mirror()
				.addBox(-0.4881F, 2.6413F, -0.6961F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.298F, 0.0098F, -0.0651F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -16.0F, 1.0F, 0.0F, -0.0873F, 0.0F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-5.7206F, -6.2142F, -7.0327F, 12.0F, 15.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4962F, 6.2259F, -1.1486F, -0.0433F, -0.0057F, -0.1308F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(82, 73).addBox(-5.0F, -4.5F, -5.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2471F, 17.7119F, -1.7581F, -0.0868F, 0.0114F, 0.0865F));
		PartDefinition left_foot = left_leg.addOrReplaceChild("left_foot", CubeListBuilder.create().texOffs(94, 27).addBox(-3.5F, 14.688F, -6.4252F, 7.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 21.312F, -1.5748F, 0.0F, 0.0873F, 0.0F));
		PartDefinition left_leg_r3 = left_foot.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(81, 114).addBox(-3.51F, -8.0F, -3.0F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0173F, 1.6099F, -0.3927F, 0.0F, 0.0F));
		PartDefinition left_leg_r4 = left_foot.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(32, 98).addBox(-3.5F, -10.2542F, 0.3995F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.9621F, 0.162F, 0.5236F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -16.0F, 1.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition right_leg_r1 = right_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-6.2794F, -6.2142F, -7.0327F, 12.0F, 15.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4962F, 6.2259F, -1.1486F, -0.0433F, 0.0057F, 0.1308F));
		PartDefinition right_leg_r2 = right_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(82, 73).mirror().addBox(-5.0F, -4.5F, -5.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2471F, 17.7119F, -1.7581F, -0.0868F, -0.0114F, -0.0865F));
		PartDefinition right_foot = right_leg.addOrReplaceChild("right_foot", CubeListBuilder.create().texOffs(94, 27).mirror().addBox(-3.5F, 14.688F, -6.4252F, 7.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 21.312F, -1.5748F, 0.0F, -0.0873F, 0.0F));
		PartDefinition right_leg_r3 = right_foot.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(81, 114).mirror().addBox(-3.49F, -8.0F, -3.0F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 13.0173F, 1.6099F, -0.3927F, 0.0F, 0.0F));
		PartDefinition right_leg_r4 = right_foot.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(32, 98).mirror().addBox(-3.5F, -10.2542F, 0.3995F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.9621F, 0.162F, 0.5236F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
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
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
