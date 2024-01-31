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
public class ModelRoppongiCurse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_roppongi_curse"), "main");
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelRoppongiCurse(ModelPart root) {
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -31.0F, -7.0F, 22.0F, 32.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(-6.0F, -32.25F, 2.0F, 12.0F, 23.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 46)
						.addBox(-7.0F, -34.25F, -9.0F, 14.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(32, 90).addBox(-7.0F, -21.0F, -9.0F, 14.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(99, 62)
						.addBox(-3.0F, -19.0F, -10.0F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 86).addBox(-7.0F, -25.0F, -8.0F, 14.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 1.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 64).addBox(-6.0F, -3.5F, -2.0F, 12.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -25.25F, -8.0F, -0.1585F, -0.0735F, -0.4305F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 75).addBox(-6.0F, -3.5F, -2.0F, 12.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -25.25F, -8.0F, -0.1585F, 0.0735F, 0.4305F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(71, 86).addBox(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(70, 108).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -32.0F, -5.0F, 0.48F, 0.0F, -1.0908F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(88, 48).addBox(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(78, 108).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -32.0F, -5.0F, 0.48F, 0.0F, 1.0908F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(10.5292F, -4.1254F, -0.0573F, 0.0F, -0.6545F, 0.0F));
		PartDefinition cube_r5 = left_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(106, 71).addBox(-1.2047F, -2.9923F, -1.1433F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.9109F, 18.9144F, -8.5064F, 1.6348F, 0.7522F, 0.8018F));
		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 108).addBox(2.7953F, -2.927F, -1.1236F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.9224F, 16.9075F, -4.2474F, 1.1549F, 0.7522F, 0.8018F));
		PartDefinition cube_r7 = left_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 108).addBox(-1.2047F, -2.9554F, -1.1364F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4171F, 17.4731F, -5.6214F, 1.373F, 0.7522F, 0.8018F));
		PartDefinition cube_r8 = left_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(109, 33).addBox(-0.671F, -2.3257F, -1.0536F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-14.1855F, 11.7874F, -6.8745F, 0.6528F, 0.6326F, 1.0396F));
		PartDefinition cube_r9 = left_arm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(101, 0).addBox(-2.7047F, -2.8668F, -1.0536F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.458F, 14.5515F, -9.3478F, 0.5004F, 0.7522F, 0.8018F));
		PartDefinition cube_r10 = left_arm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 98).addBox(-1.4547F, -7.1156F, -2.1995F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2642F, 9.2051F, -7.7533F, -0.2414F, 0.7522F, 0.8018F));
		PartDefinition cube_r11 = left_arm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(77, 26).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8546F, 2.6254F, -3.5042F, -0.7777F, 0.1231F, 0.4731F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.5292F, -4.1254F, -0.0573F, 0.0F, 0.6545F, 0.0F));
		PartDefinition cube_r12 = right_arm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(38, 64).addBox(-0.7953F, -2.9923F, -1.1433F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.9109F, 18.9144F, -8.5064F, 1.6348F, -0.7522F, -0.8018F));
		PartDefinition cube_r13 = right_arm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(72, 26).addBox(-4.7953F, -2.927F, -1.1236F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.9224F, 16.9075F, -4.2474F, 1.1549F, -0.7522F, -0.8018F));
		PartDefinition cube_r14 = right_arm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 76).addBox(-0.7953F, -2.9554F, -1.1364F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4171F, 17.4731F, -5.6214F, 1.373F, -0.7522F, -0.8018F));
		PartDefinition cube_r15 = right_arm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(86, 108).addBox(-1.329F, -2.3257F, -1.0536F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(14.1855F, 11.7874F, -6.8745F, 0.6528F, -0.6326F, -1.0396F));
		PartDefinition cube_r16 = right_arm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 100).addBox(-3.2953F, -2.8668F, -1.0536F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.458F, 14.5515F, -9.3478F, 0.5004F, -0.7522F, -0.8018F));
		PartDefinition cube_r17 = right_arm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(95, 96).addBox(-3.5453F, -7.1156F, -2.1995F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2642F, 9.2051F, -7.7533F, -0.2414F, -0.7522F, -0.8018F));
		PartDefinition cube_r18 = right_arm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 76).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8546F, 2.6254F, -3.5042F, -0.7777F, -0.1231F, -0.4731F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(9.75F, 10.75F, 0.5F));
		PartDefinition cube_r19 = left_leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(77, 48).addBox(-1.0F, -0.74F, -1.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, 12.0F, -12.75F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r20 = left_leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(101, 26).addBox(-1.0F, -0.74F, -1.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -13.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r21 = left_leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 99).addBox(-3.0F, 3.75F, -5.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 6.5F, -5.25F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r22 = left_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 99).addBox(-3.0F, -6.5F, -3.0F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 4.5F, -6.5F, 0.1745F, 0.0F, 0.1309F));
		PartDefinition cube_r23 = left_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 76).addBox(-1.0F, -0.74F, -1.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 12.0F, -12.75F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r24 = left_leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 0).addBox(-4.0F, -2.0F, -5.5F, 9.0F, 15.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.25F, -2.75F, -3.0F, 0.3054F, 0.0F, 0.3054F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-9.75F, 10.75F, 0.5F));
		PartDefinition cube_r25 = right_leg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.74F, -1.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 12.0F, -12.75F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r26 = right_leg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.74F, -1.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -13.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r27 = right_leg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 0).addBox(-2.0F, 3.75F, -5.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 6.5F, -5.25F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r28 = right_leg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(18, 98).addBox(-2.0F, -6.5F, -3.0F, 5.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 4.5F, -6.5F, 0.1745F, 0.0F, -0.1309F));
		PartDefinition cube_r29 = right_leg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(31, 46).addBox(-1.0F, -0.74F, -1.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, 12.0F, -12.75F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r30 = right_leg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 64).addBox(-5.0F, -2.0F, -5.5F, 9.0F, 15.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, -2.75F, -3.0F, 0.3054F, 0.0F, -0.3054F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
