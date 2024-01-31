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
public class ModelMahoragaWheel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_mahoraga_wheel"), "main");
	public final ModelPart head;

	public ModelMahoragaWheel(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(51, 0).addBox(-2.5F, -5.75F, 5.0711F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 51).addBox(-2.5F, -5.75F, -6.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
						.addBox(-0.5F, -5.25F, 1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 26).addBox(-0.5F, -5.25F, -7.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 47)
						.addBox(1.5F, -5.25F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 47).addBox(-7.5F, -5.25F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 33)
						.addBox(7.0F, -6.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 39).addBox(-10.0F, -6.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-1.5F, -6.25F, 7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-1.5F, -6.25F, -10.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 44)
						.addBox(-1.5F, -6.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(50, 39).addBox(-2.5251F, -5.75F, 5.0607F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 51).addBox(-2.5251F, -5.75F, -6.0104F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 33)
						.addBox(-7.5962F, -5.25F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 45).addBox(1.5962F, -5.25F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 18)
						.addBox(7.0888F, -6.25F, -1.4749F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 24).addBox(-10.0888F, -6.25F, -1.5251F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, 0.0F, -0.3038F, 0.762F, -0.2132F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(50, 32).addBox(-2.4749F, -5.75F, 5.0607F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 26).addBox(-2.4749F, -5.75F, -6.0104F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 30)
						.addBox(1.5962F, -5.25F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 45).addBox(-7.5962F, -5.25F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 38)
						.addBox(-10.0888F, -6.25F, -1.4749F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 6).addBox(7.0888F, -6.25F, -1.5251F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, 0.0F, -0.3038F, -0.762F, 0.2132F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(48, 17).addBox(-2.5355F, -5.75F, -6.0355F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, 0.0F, -1.5708F, 1.3526F, -1.5708F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(50, 6).addBox(-2.4645F, -5.75F, -6.0355F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.75F, 0.0F, -1.5708F, -1.3526F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
