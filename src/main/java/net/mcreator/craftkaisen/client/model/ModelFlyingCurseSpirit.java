package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
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
public class ModelFlyingCurseSpirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_flying_curse_spirit"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_wing;
	public final ModelPart right_wing;

	public ModelFlyingCurseSpirit(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_wing = root.getChild("left_wing");
		this.right_wing = root.getChild("right_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(72, 19).addBox(-8.0F, -2.0F, -18.0F, 16.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(-10.0F, -3.0F, -15.0F, 20.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, -6.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 6.0F, 8.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(7.0329F, 0.0F, -18.3461F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).addBox(-2.3908F, -0.5145F, -1.5796F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -3.5F, -9.5F, -0.1068F, 0.3786F, -0.2823F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 43).addBox(-1.6092F, -0.5145F, -1.5796F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -3.5F, -9.5F, -0.1068F, -0.3786F, 0.2823F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 6.0F, 8.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-7.0329F, 0.0F, -18.3461F, 0.0F, -0.2618F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -2.2647F, -0.4947F, 22.0F, 8.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.7647F, -8.5053F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 92).addBox(-3.5F, -1.0F, -4.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.1651F, -1.0147F, 28.8534F, 0.1309F, -0.5236F, 0.0F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(100, 26).addBox(-2.5F, -1.0F, -4.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.1651F, -1.0147F, 28.8534F, 0.1309F, 0.5236F, 0.0F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 106).addBox(-4.0F, -3.0F, -6.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4166F, 1.7353F, 31.9156F, 0.0873F, 0.2618F, 0.0F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 108).addBox(-1.0F, -1.0F, -8.25F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5581F, 66.4859F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 92).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.1674F, 50.634F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 84).addBox(-5.0F, -3.0F, -8.0F, 10.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3835F, 35.1286F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 94).addBox(-4.0F, -3.0F, -6.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4166F, 1.7353F, 31.9156F, 0.0873F, -0.2618F, 0.0F));
		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 64).addBox(0.0F, -1.0F, -10.0F, 22.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.75F, 19.0F, 1.25F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r12 = left_wing.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 64).addBox(-11.5F, -0.25F, -8.0F, 22.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.0331F, -0.4808F, -1.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 36).addBox(-22.0F, -1.0F, -10.0F, 22.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.75F, 19.0F, 1.25F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r13 = right_wing.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(68, 36).addBox(-10.5F, -0.25F, -8.0F, 22.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.0331F, -0.4808F, -1.0F, 0.0F, 0.0F, 0.0436F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
