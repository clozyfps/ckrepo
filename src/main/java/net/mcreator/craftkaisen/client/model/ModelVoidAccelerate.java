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
public class ModelVoidAccelerate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_void_accelerate"), "main");
	public final ModelPart bone;

	public ModelVoidAccelerate(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(32, 48).addBox(-7.9997F, -19.314F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, -24.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, -24.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, 8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, 8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, 40.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, 40.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, 24.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, 24.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, 56.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, 56.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, -56.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, -56.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, -72.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, -72.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-7.9997F, -19.314F, -40.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-8.0004F, 19.3142F, -40.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0003F, -4.686F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, 0.5F, -8.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-8.0F, 0.5F, -40.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, 0.5F, -24.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-8.0F, 0.5F, 87.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, 0.5F, 55.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-8.0F, 0.5F, 71.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, 0.5F, 39.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-8.0F, 0.5F, 7.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, 0.5F, 23.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3029F, 13.3037F, -31.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 0).addBox(-8.0F, -0.5F, -8.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-8.0F, -0.5F, -40.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-8.0F, -0.5F, -24.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-8.0F, -0.5F, 87.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-8.0F, -0.5F, 55.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-8.0F, -0.5F, 71.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-8.0F, -0.5F, 39.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-8.0F, -0.5F, 7.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-8.0F, -0.5F, 23.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.8134F, -0.0003F, -31.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 16).addBox(-8.0F, -0.5F, -8.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16).addBox(-8.0F, -0.5F, -40.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-8.0F, -0.5F, -24.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16).addBox(-8.0F, -0.5F, 87.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-8.0F, -0.5F, 55.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16).addBox(-8.0F, -0.5F, 71.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-8.0F, -0.5F, 39.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16).addBox(-8.0F, -0.5F, 7.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-8.0F, -0.5F, 23.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.814F, -0.0003F, -31.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 32).addBox(-8.0F, -0.5F, -8.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-8.0F, -0.5F, -40.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-8.0F, -0.5F, -24.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-8.0F, -0.5F, 87.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-8.0F, -0.5F, 55.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-8.0F, -0.5F, 71.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-8.0F, -0.5F, 39.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-8.0F, -0.5F, 7.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-8.0F, -0.5F, 23.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.303F, -13.3036F, -31.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 48).addBox(-8.0F, -0.5F, -8.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-8.0F, -0.5F, -40.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-8.0F, -0.5F, -24.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-8.0F, -0.5F, 87.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-8.0F, -0.5F, 55.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-8.0F, -0.5F, 71.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-8.0F, -0.5F, 39.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-8.0F, -0.5F, 7.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-8.0F, -0.5F, 23.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.3036F, -13.3036F, -31.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 0.5F, -8.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, 0.5F, 7.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, 0.5F, 23.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, 0.5F, 87.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, 0.5F, 103.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, 0.5F, 119.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, 0.5F, 71.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, 0.5F, 39.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, 0.5F, 55.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.3037F, 13.3037F, -63.5F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.bone.zRot = ageInTicks;
	}
}
