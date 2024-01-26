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

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbodyrepel1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelbodyrepel_1"), "main");
	public final ModelPart Bodyrepel;

	public Modelbodyrepel1(ModelPart root) {
		this.Bodyrepel = root.getChild("Bodyrepel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Bodyrepel = partdefinition.addOrReplaceChild("Bodyrepel",
				CubeListBuilder.create().texOffs(130, 151).addBox(-9.0F, -18.0F, -19.0F, 18.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(61, 0).addBox(-10.0F, -22.0F, -22.0F, 20.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(116, 62)
						.addBox(-10.0F, 0.0F, -18.0F, 20.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(176, 37).addBox(-10.0F, 2.0F, -20.0F, 20.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 101)
						.addBox(-8.0F, -21.0F, -9.0F, 16.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(54, 149).addBox(-8.0F, 0.0F, -9.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(172, 203)
						.addBox(9.0F, -20.0F, -21.0F, 2.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(188, 178).addBox(9.0F, -16.0F, -9.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(188, 142)
						.addBox(-10.0F, -16.0F, -9.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(198, 49).addBox(-11.0F, -20.0F, -21.0F, 2.0F, 23.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(-9.0F, -18.0F, -9.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(64, 21).addBox(-9.0F, -18.0F, 13.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(176, 1)
						.addBox(9.0F, -16.0F, 13.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(138, 179).addBox(-10.0F, -16.0F, 13.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(112, 104)
						.addBox(-8.0F, -20.0F, 13.0F, 16.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 146).addBox(-8.0F, 0.0F, 13.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(58, 61)
						.addBox(-9.0F, -18.0F, 35.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(46, 172).addBox(9.0F, -16.0F, 35.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(92, 172)
						.addBox(-10.0F, -16.0F, 35.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(54, 126).addBox(-8.0F, -19.0F, 35.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(108, 128)
						.addBox(-8.0F, 0.0F, 35.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-9.0F, -18.0F, 57.0F, 18.0F, 18.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 169)
						.addBox(9.0F, -16.0F, 57.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(170, 62).addBox(-10.0F, -16.0F, 57.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(122, 39)
						.addBox(-8.0F, -19.0F, 57.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 123).addBox(-8.0F, 0.0F, 57.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -18.0F, 79.0F, 18.0F, 18.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(70, 172).addBox(-8.0F, -17.0F, 101.0F, 16.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(122, 23)
						.addBox(-7.0F, -15.0F, 107.0F, 14.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(164, 157).addBox(9.0F, -16.0F, 79.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(166, 106)
						.addBox(-10.0F, -16.0F, 79.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(116, 79).addBox(-8.0F, -19.0F, 79.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-8.0F, 0.0F, 79.0F, 16.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 12.0F));
		PartDefinition cube_r1 = Bodyrepel.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(112, 102).addBox(-8.0F, 0.0F, -28.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 123).addBox(4.0F, 0.0F, -28.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 126)
						.addBox(0.0F, 0.0F, -29.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(108, 128).addBox(-4.0F, 0.0F, -29.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(127, 0)
						.addBox(-10.0F, 0.0F, -23.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 149).addBox(5.0F, 0.0F, -23.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Bodyrepel.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 43).addBox(4.0F, -27.0F, -14.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(5.0F, -28.0F, -9.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 17)
						.addBox(-8.0F, -28.0F, -9.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(116, 73).addBox(-4.0F, -28.0F, -11.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(122, 151)
						.addBox(1.0F, -28.0F, -11.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 83).addBox(0.0F, -27.0F, -16.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(108, 151)
						.addBox(8.0F, -27.0F, -11.0F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-10.0F, -27.0F, -11.0F, 2.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -27.0F, -14.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 146).addBox(-4.0F, -27.0F, -16.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Bodyrepel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
