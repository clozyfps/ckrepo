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
public class ModelCrowProjectileFlying<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_crow_projectile_flying"), "main");
	public final ModelPart body;

	public ModelCrowProjectileFlying(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.8845F, -3.94F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(9, 18).addBox(-1.5F, -1.6345F, -6.94F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 7)
						.addBox(-2.0F, -1.6345F, 3.06F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-2.0F, -1.3845F, 5.06F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 21)
						.addBox(-7.0F, -1.6345F, -2.94F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 0).addBox(-12.0F, -1.1345F, -0.94F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(2.0F, -1.6345F, -2.94F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(2.0F, -1.1345F, -0.94F, 10.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.8845F, -0.06F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 1.25F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 19)
						.addBox(4.0F, 1.25F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(4.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 1.6155F, 2.56F, 1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 4).addBox(-2.5F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(9.0836F, -1.1345F, -1.2345F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 15).addBox(-3.5F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-9.0836F, -1.1345F, -1.2345F, 0.0F, 0.3054F, 0.0F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3655F, -8.44F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1155F, -7.19F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
