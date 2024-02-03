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
public class ModelRugbyFieldCurse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_rugby_field_curse"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_arm_1;
	public final ModelPart left_arm_2;
	public final ModelPart left_arm_3;
	public final ModelPart right_arm_1;
	public final ModelPart right_arm_2;
	public final ModelPart right_arm_3;

	public ModelRugbyFieldCurse(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm_1 = root.getChild("left_arm_1");
		this.left_arm_2 = root.getChild("left_arm_2");
		this.left_arm_3 = root.getChild("left_arm_3");
		this.right_arm_1 = root.getChild("right_arm_1");
		this.right_arm_2 = root.getChild("right_arm_2");
		this.right_arm_3 = root.getChild("right_arm_3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(96, 16).addBox(-11.0882F, -5.605F, -12.833F, 10.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(50, 87).addBox(-12.5882F, -4.605F, -10.833F, 13.0F, 13.0F, 11.0F, new CubeDeformation(0.0F))
						.texOffs(68, 6).addBox(-13.3382F, -2.605F, -8.833F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 0).addBox(-13.3382F, -2.355F, -6.333F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.1618F, -2.355F, -6.333F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14).addBox(0.1618F, -2.605F, -8.833F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
						.addBox(-11.5882F, 6.395F, -11.583F, 11.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0882F, 8.3636F, -22.2864F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 16).addBox(-0.8597F, -0.9002F, -0.8728F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -9.0F, -0.0353F, -0.2593F, 0.1412F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 16).addBox(-0.6655F, -4.5743F, -0.8728F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -9.0F, 0.0346F, -0.2594F, -0.1297F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 41).addBox(-0.8695F, -4.4914F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3382F, 5.8864F, -11.4636F, -0.114F, -0.1459F, -0.114F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 75).addBox(-1.1305F, -3.4914F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3382F, 10.5424F, -12.0765F, -0.1478F, -0.1115F, 0.1478F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 87).addBox(-0.8695F, -3.4914F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.8382F, 10.5424F, -12.0765F, -0.1478F, 0.1115F, -0.1478F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 0).addBox(-1.1305F, -4.4914F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.8382F, 5.8864F, -11.4636F, -0.114F, 0.1459F, 0.114F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 16).addBox(-1.3345F, -4.5743F, -0.8728F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1765F, 6.0F, -9.0F, 0.0346F, 0.2594F, 0.1297F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 16).addBox(-1.1403F, -0.9002F, -0.8728F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1765F, 6.0F, -9.0F, -0.0353F, 0.2593F, -0.1412F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.5F, 15.749F, 36.9793F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(32, 109).addBox(0.0F, -6.0F, -8.5F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(103, 75).addBox(-1.5F, -4.0F, -8.5F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.0F, -1.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(32, 101).addBox(0.0F, -10.0F, -8.5F, 0.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(98, 43).addBox(-2.0F, -7.0F, -8.5F, 4.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -7.0F, -16.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(32, 93).addBox(0.5F, -9.75F, -11.75F, 0.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(62, 18).addBox(-2.5F, -6.75F, -11.75F, 6.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9628F, -32.4787F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(32, 92).addBox(0.5F, -14.0F, -9.25F, 0.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(79, 92).addBox(-2.0F, -10.0F, -9.25F, 5.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.249F, -51.9793F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 75).addBox(-4.0F, -4.0F, -8.5F, 8.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, -1.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(57, 58).addBox(-6.0F, -6.0F, -8.5F, 12.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -5.0F, -16.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-9.5F, -6.75F, -11.75F, 20.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.9628F, -32.4787F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 40).addBox(-9.0F, -10.0F, -8.25F, 19.0F, 17.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.249F, -51.9793F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_1 = partdefinition.addOrReplaceChild("left_arm_1",
				CubeListBuilder.create().texOffs(33, 75).addBox(0.0174F, 13.0F, -6.7757F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(95, 50).addBox(1.0174F, 14.0F, -11.7757F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.9826F, 8.0F, -16.0101F));
		PartDefinition cube_r17 = left_arm_1.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(97, 0).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.0F, 15.0F, -2.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r18 = left_arm_1.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(86, 45).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9826F, 15.0F, -8.2757F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r19 = left_arm_1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(95, 43).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0174F, 15.0F, -8.2757F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r20 = left_arm_1.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -5.5F, -2.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0174F, 10.0824F, 1.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r21 = left_arm_1.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -5.5F, -2.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0174F, 3.0F, 1.2601F, 0.48F, 0.0F, 0.0F));
		PartDefinition left_arm_2 = partdefinition.addOrReplaceChild("left_arm_2",
				CubeListBuilder.create().texOffs(33, 75).addBox(0.0174F, 13.0F, -7.7757F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(95, 50).addBox(1.0174F, 14.0F, -12.7757F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.9826F, 8.0F, -0.0101F));
		PartDefinition cube_r22 = left_arm_2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(97, 0).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-1.0F, 15.0F, -3.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r23 = left_arm_2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(86, 45).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9826F, 15.0F, -9.2757F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r24 = left_arm_2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(95, 43).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0174F, 15.0F, -9.2757F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r25 = left_arm_2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -5.5F, -2.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0174F, 10.0824F, 0.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r26 = left_arm_2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -5.5F, -2.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0174F, 3.0F, 0.2601F, 0.48F, 0.0F, 0.0F));
		PartDefinition left_arm_3 = partdefinition.addOrReplaceChild("left_arm_3",
				CubeListBuilder.create().texOffs(56, 43).addBox(-1.9826F, 10.0F, -5.7757F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(47, 85).addBox(-0.9826F, 11.0F, -10.7757F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.2326F, 11.0F, 14.9899F));
		PartDefinition cube_r27 = left_arm_3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(73, 43).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-3.0F, 12.0F, 0.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r28 = left_arm_3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(77, 50).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9826F, 12.0F, -7.2757F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r29 = left_arm_3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 85).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0174F, 12.0F, -7.2757F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r30 = left_arm_3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 75).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0174F, 7.0824F, 2.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r31 = left_arm_3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 100).addBox(-4.0F, -5.5F, -6.5F, 7.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0174F, 0.25F, 1.7601F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_arm_1 = partdefinition.addOrReplaceChild("right_arm_1", CubeListBuilder.create().texOffs(33, 75).mirror().addBox(-4.0174F, 13.0F, -6.7757F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 50)
				.mirror().addBox(-3.0174F, 14.0F, -11.7757F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.9826F, 8.0F, -16.0101F));
		PartDefinition cube_r32 = right_arm_1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 15.0F, -2.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r33 = right_arm_1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9826F, 15.0F, -8.2757F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r34 = right_arm_1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0174F, 15.0F, -8.2757F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r35 = right_arm_1.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.5F, -5.5F, -2.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0174F, 10.0824F, 1.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r36 = right_arm_1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -5.5F, -2.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0174F, 3.0F, 1.2601F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_arm_2 = partdefinition.addOrReplaceChild("right_arm_2", CubeListBuilder.create().texOffs(33, 75).mirror().addBox(-4.0174F, 13.0F, -7.7757F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 50)
				.mirror().addBox(-3.0174F, 14.0F, -12.7757F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.9826F, 8.0F, -0.0101F));
		PartDefinition cube_r37 = right_arm_2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(97, 0).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 15.0F, -3.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r38 = right_arm_2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(86, 45).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9826F, 15.0F, -9.2757F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r39 = right_arm_2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(95, 43).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0174F, 15.0F, -9.2757F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r40 = right_arm_2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-1.5F, -5.5F, -2.0F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0174F, 10.0824F, 0.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r41 = right_arm_2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -5.5F, -2.5F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0174F, 3.0F, 0.2601F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_arm_3 = partdefinition.addOrReplaceChild("right_arm_3", CubeListBuilder.create().texOffs(56, 43).mirror().addBox(-2.0174F, 10.0F, -5.7757F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 85)
				.mirror().addBox(-1.0174F, 11.0F, -10.7757F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.2326F, 11.0F, 14.9899F));
		PartDefinition cube_r42 = right_arm_3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(73, 43).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, 12.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r43 = right_arm_3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 50).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.9826F, 12.0F, -7.2757F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r44 = right_arm_3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(33, 85).mirror().addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0174F, 12.0F, -7.2757F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r45 = right_arm_3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-1.5F, -1.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0174F, 7.0824F, 2.2243F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r46 = right_arm_3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, -5.5F, -6.5F, 7.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0174F, 0.25F, 1.7601F, 0.48F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_arm_3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm_2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm_3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm_1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm_2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_arm_1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
