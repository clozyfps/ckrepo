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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMegunaArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_meguna_armor"), "main");
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelMegunaArmor(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 74).addBox(-4.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(57, 72)
						.addBox(-4.0F, 0.0F, -2.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 13).addBox(-4.0F, 5.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(2.0F, 0.0F, -2.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 54).addBox(-4.0F, 0.0F, 1.5F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 69)
						.addBox(-4.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 62).addBox(2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 15)
						.addBox(-2.0F, -0.25F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 80).addBox(3.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 25)
						.addBox(-2.0F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 25).addBox(1.0F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(78, 100).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, 10.0F, -2.75F, -0.0869F, 0.0076F, -0.0876F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(71, 99).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 8.25F, -2.25F, -0.2182F, 0.0F, 0.0F));
		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(78, 100).mirror().addBox(-0.5F, -2.0F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.75F, 10.0F, -2.75F, -0.0869F, -0.0076F, 0.0876F));
		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(10, 67).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0581F, 6.7758F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(54, 67).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1272F, 6.3265F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(58, 31).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3265F, 2.1272F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(63, 84).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7758F, 2.0581F, -0.6109F, 0.0F, 0.0F));
		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(65, 5).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5646F, 1.7713F, 0.6109F, 0.0F, 0.0F));
		PartDefinition torso_r9 = torso.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(62, 34).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.4235F, 2.1272F, -0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r10 = torso.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(71, 64).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.6847F, 1.9957F, 0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r11 = torso.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(24, 49).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9957F, 10.6847F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition torso_r12 = torso.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(65, 72).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7713F, 9.5646F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition torso_r13 = torso.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(39, 69).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1272F, 10.4235F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition torso_r14 = torso.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(22, 74).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7713F, 9.5646F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition torso_r15 = torso.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(70, 36).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1272F, 10.4235F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition torso_r16 = torso.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(71, 77).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9957F, 10.6847F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition torso_r17 = torso.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(5, 80).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.6847F, -1.9957F, -0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r18 = torso.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(58, 29).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.4235F, -2.1272F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r19 = torso.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(4, 59).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.5646F, -1.7713F, -0.6109F, 0.0F, 0.0F));
		PartDefinition torso_r20 = torso.addOrReplaceChild("torso_r20", CubeListBuilder.create().texOffs(56, 15).addBox(-1.0F, -3.5F, -0.51F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7326F, 2.6793F, -2.2F, 0.0F, 0.0F, 0.48F));
		PartDefinition torso_r21 = torso.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(43, 74).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7326F, 2.6793F, -2.2F, 0.0F, 0.0F, -0.48F));
		PartDefinition torso_r22 = torso.addOrReplaceChild("torso_r22", CubeListBuilder.create().texOffs(27, 82).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1272F, 6.3265F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition torso_r23 = torso.addOrReplaceChild("torso_r23", CubeListBuilder.create().texOffs(58, 27).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3265F, -2.1272F, -0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r24 = torso.addOrReplaceChild("torso_r24", CubeListBuilder.create().texOffs(54, 49).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7758F, -2.0581F, 0.6109F, 0.0F, 0.0F));
		PartDefinition torso_r25 = torso.addOrReplaceChild("torso_r25", CubeListBuilder.create().texOffs(72, 43).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0581F, 6.7758F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.5F, 2.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.5F, 2.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(82, 57).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(0.0621F, -6.3486F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3453F, 1.7149F, 1.5708F, -1.5272F, -1.5708F));
		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(0.3218F, 1.207F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.3288F, 2.0451F, -1.5708F, -1.1781F, 1.5708F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(75, 11).addBox(-1.0621F, -6.3486F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3453F, -1.7149F, -1.5708F, -1.5272F, 1.5708F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(81, 9).addBox(-1.3218F, 1.207F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3288F, -2.0451F, 1.5708F, -1.1781F, -1.5708F));
		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9598F, 7.6823F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition right_leg_r4 = left_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(80, 36).mirror().addBox(-0.3483F, 0.0228F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.847F, -0.038F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(72, 53).addBox(-0.6517F, 0.0228F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.847F, -0.038F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(74, 69).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9598F, 7.6823F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r5 = right_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(75, 11).addBox(-1.0621F, -6.3486F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3453F, 1.7149F, 1.5708F, 1.5272F, 1.5708F));
		PartDefinition left_leg_r6 = right_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(81, 9).addBox(-1.3218F, 1.207F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.3288F, 2.0451F, -1.5708F, 1.1781F, -1.5708F));
		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(75, 11).mirror().addBox(0.0621F, -6.3486F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.3453F, -1.7149F, -1.5708F, 1.5272F, -1.5708F));
		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(0.3218F, 1.207F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.3288F, -2.0451F, 1.5708F, 1.1781F, 1.5708F));
		PartDefinition left_leg_r7 = right_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(78, 51).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9598F, 7.6823F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition left_leg_r8 = right_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(80, 36).addBox(-0.6517F, 0.0228F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.847F, -0.038F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(72, 53).mirror().addBox(-0.3483F, 0.0228F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.847F, -0.038F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9598F, 7.6823F, 0.0F, 0.0F, 0.0F, 0.3927F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
