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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfist<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelfist"), "main");
	public final ModelPart fist;

	public Modelfist(ModelPart root) {
		this.fist = root.getChild("fist");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition fist = partdefinition.addOrReplaceChild("fist",
				CubeListBuilder.create().texOffs(98, 90).addBox(3.6545F, -4.1029F, -12.6081F, 8.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(3.6545F, -3.1029F, -4.6081F, 12.0F, 17.0F, 11.7F, new CubeDeformation(0.0F))
						.texOffs(49, 41).addBox(-8.3455F, -0.1029F, -4.6081F, 12.0F, 14.0F, 11.7F, new CubeDeformation(0.0F)).texOffs(31, 101).addBox(11.6545F, -3.1029F, -11.6081F, 8.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 49)
						.addBox(-4.3455F, -2.1029F, -11.6081F, 8.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 126).addBox(-12.3455F, 0.8971F, -10.6081F, 8.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.6545F, -9.8971F, -11.3919F));
		PartDefinition cube_r1 = fist.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 68).addBox(-13.2F, -14.3F, -0.5F, 8.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7028F, -0.1298F, 0.0172F));
		PartDefinition cube_r2 = fist.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(89, 20).addBox(-4.7F, -12.5F, -2.5F, 8.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7018F, -0.0433F, 0.0057F));
		PartDefinition cube_r3 = fist.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 97).addBox(-11.7F, -13.2F, -4.5F, 8.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6545F, -0.1807F, -1.3723F, -1.7018F, 0.0433F, -0.0057F));
		PartDefinition cube_r4 = fist.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 97).addBox(-3.0F, -12.5F, -3.5F, 8.0F, 21.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6545F, -0.1807F, -1.3723F, -1.7028F, 0.1298F, -0.0172F));
		PartDefinition cube_r5 = fist.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(90, 119).addBox(-4.0F, -12.0F, 6.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.8536F, 17.8346F, -2.724F, -2.9004F, -0.281F, 1.7506F));
		PartDefinition cube_r6 = fist.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 68).addBox(-3.2F, -12.0F, -2.6F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.6297F, 16.7875F, -2.7977F, 1.6811F, -0.281F, 1.7506F));
		PartDefinition cube_r7 = fist.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(122, 77).addBox(-2.0F, -10.5F, -2.5F, 8.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5545F, 10.9317F, 9.4925F, 0.4931F, -0.1123F, 1.7979F));
		PartDefinition cube_r8 = fist.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 71).addBox(21.9F, -8.5F, 0.0F, 10.0F, 18.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(31, 129).addBox(21.7F, -6.5F, 7.0F, 4.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(79, 144)
						.addBox(-3.3F, -6.5F, 7.0F, 4.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.7F, -8.5F, 7.0F, 22.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(120, 13)
						.addBox(12.7F, -8.5F, 0.0F, 8.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(123, 112).addBox(3.0F, -7.5F, 0.0F, 8.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(67, 0)
						.addBox(1.0F, -6.5F, 0.0F, 22.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(-6.0F, -6.5F, 0.0F, 8.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.3455F, 9.3971F, 5.8919F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r9 = fist.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(129, 38).addBox(-28.0F, 2.0F, -11.1F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(129, 95).addBox(-20.0F, 2.0F, -11.1F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(136, 53)
						.addBox(-12.0F, 2.0F, -10.1F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(116, 137).addBox(-4.0F, 2.0F, -10.1F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6545F, 6.8971F, -8.1081F, 1.6581F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
