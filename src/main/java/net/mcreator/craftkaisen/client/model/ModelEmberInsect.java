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
public class ModelEmberInsect<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_ember_insect"), "main");
	public final ModelPart body;

	public ModelEmberInsect(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -2.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-1.5F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 3)
						.addBox(-0.5F, -1.65F, -9.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 5).addBox(1.5F, -2.5F, -4.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(22, 5).mirror()
						.addBox(-2.5F, -2.5F, -4.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(9, 10).addBox(-1.5F, -3.0F, -5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(21, 0)
						.addBox(1.25F, -1.75F, -3.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(18, 11).addBox(-2.25F, -1.75F, -3.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(9, 8)
						.addBox(-1.0F, -2.0F, -5.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(0, 0).addBox(-1.5F, -3.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.5F, -3.0F, -0.3054F, 0.0F, 0.0873F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 19).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-2.0814F, 1.4306F, -3.7486F, -0.829F, 0.0F, 0.0873F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 4).addBox(-0.5F, -1.808F, -0.2835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7816F, 0.8883F, 0.1818F, 0.2606F, -0.0298F, 0.082F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 0).addBox(-0.5F, -0.192F, -0.2835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-1.7699F, 0.7278F, 0.2009F, -0.4812F, -0.0298F, 0.082F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9196F, -0.4266F, 2.5541F, 1.0023F, -0.0298F, 0.082F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.192F, -0.2835F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-1.9783F, -0.0132F, 3.347F, -0.2194F, -0.0298F, 0.082F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 16).addBox(-0.5F, -0.192F, -0.2835F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(1.9783F, -0.0132F, 3.347F, -0.2194F, 0.0298F, -0.082F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 16).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9196F, -0.4266F, 2.5541F, 1.0023F, 0.0298F, -0.082F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.192F, -0.2835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(1.7699F, 0.7278F, 0.2009F, -0.4812F, 0.0298F, -0.082F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(18, 8).addBox(-0.5F, -1.808F, -0.2835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7816F, 0.8883F, 0.1818F, 0.2606F, 0.0298F, -0.082F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(2.0814F, 1.4306F, -3.7486F, -0.829F, 0.0F, -0.0873F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(20, 15).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.5F, -3.0F, -0.3054F, 0.0F, -0.0873F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -4.25F, 0.25F, -0.5527F, 0.3479F, -1.2585F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(6, 13).addBox(0.0F, -3.0F, -1.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -4.25F, 0.25F, -0.5527F, -0.3479F, 1.2585F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
