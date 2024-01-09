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
public class Modelrepelpink<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelrepelpink"), "main");
	public final ModelPart Bodyrepelwormspike;

	public Modelrepelpink(ModelPart root) {
		this.Bodyrepelwormspike = root.getChild("Bodyrepelwormspike");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Bodyrepelwormspike = partdefinition.addOrReplaceChild("Bodyrepelwormspike",
				CubeListBuilder.create().texOffs(0, 159).addBox(-8.0F, -16.0F, -10.0F, 16.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(123, 112).addBox(-12.0F, -14.0F, -9.0F, 24.0F, 15.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(163, 242)
						.addBox(-13.0F, -13.0F, -8.0F, 1.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(70, 125).addBox(12.0F, -13.0F, -8.0F, 1.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(152, 140)
						.addBox(-11.0F, -15.0F, -9.0F, 22.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(162, 43).addBox(-7.0F, -15.0F, -11.0F, 14.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(116, 70)
						.addBox(-7.0F, -14.0F, 3.0F, 14.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(152, 212).addBox(7.0F, -12.0F, 3.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(209, 204)
						.addBox(-8.0F, -12.0F, 3.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -16.0F, 2.0F, 12.0F, 16.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(207, 52)
						.addBox(-8.0F, -12.0F, 25.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(209, 174).addBox(7.0F, -12.0F, 25.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 112)
						.addBox(-7.0F, -14.0F, 25.0F, 14.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 75).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 15.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(116, 204)
						.addBox(-8.0F, -12.0F, 47.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(205, 137).addBox(7.0F, -12.0F, 47.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(94, 35)
						.addBox(-7.0F, -14.0F, 47.0F, 14.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(46, 53).addBox(-6.0F, -15.0F, 46.0F, 12.0F, 15.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(80, 196)
						.addBox(-8.0F, -12.0F, 69.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(197, 12).addBox(7.0F, -12.0F, 69.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(92, 0)
						.addBox(-7.0F, -14.0F, 69.0F, 14.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(46, 16).addBox(-6.0F, -15.0F, 68.0F, 12.0F, 15.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-6.0F, -15.0F, 90.0F, 12.0F, 15.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(235, 19).addBox(-6.0F, -14.0F, 110.0F, 12.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(164, 69)
						.addBox(-8.0F, -14.0F, 113.0F, 16.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(79, 167).addBox(-5.0F, -12.0F, 116.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-7.0F, -11.0F, 116.0F, 14.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(184, 98).addBox(-4.0F, -8.0F, 124.0F, 7.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(197, 118)
						.addBox(-3.0F, -9.0F, 124.0F, 5.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(142, 43).addBox(-5.0F, -10.0F, 124.0F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(68, 90)
						.addBox(-7.0F, -14.0F, 91.0F, 14.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(190, 191).addBox(7.0F, -12.0F, 91.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(44, 196)
						.addBox(-8.0F, -12.0F, 91.0F, 1.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(55, 226).addBox(-6.0F, -14.0F, -13.0F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 220)
						.addBox(-5.0F, -12.0F, -18.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(86, 0).addBox(-4.0F, -13.0F, -17.0F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(4.0F, -11.0F, -17.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 5).addBox(-6.0F, -11.0F, -17.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(99, 196)
						.addBox(-4.0F, -10.0F, -24.0F, 7.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(140, 0).addBox(-3.0F, -11.0F, -23.0F, 5.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(3.0F, -9.0F, -24.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -9.0F, -24.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(63, 196)
						.addBox(-2.0F, -9.0F, -30.0F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(169, 191).addBox(1.0F, -9.0F, -27.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(173, 98)
						.addBox(-3.0F, -9.0F, -27.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 4.0F));
		PartDefinition cube_r1 = Bodyrepelwormspike.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(23, 189).addBox(6.0F, -12.0F, -20.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(211, 96).addBox(5.0F, -12.0F, -24.0F, 1.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(216, 0)
						.addBox(4.0F, -12.0F, -20.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(142, 9).addBox(5.0F, -11.0F, -29.0F, 1.0F, 8.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(184, 69)
						.addBox(6.0F, -11.0F, -24.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 189).addBox(4.0F, -11.0F, -24.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(127, 234)
						.addBox(7.0F, -11.0F, -20.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(207, 234).addBox(3.0F, -11.0F, -20.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r2 = Bodyrepelwormspike.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(188, 221).addBox(3.0F, -12.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(224, 118).addBox(5.0F, -12.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(98, 125)
						.addBox(4.0F, -12.0F, -18.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(91, 234).addBox(2.0F, -11.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(146, 183)
						.addBox(3.0F, -11.0F, -18.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(180, 162).addBox(5.0F, -11.0F, -18.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(124, 140)
						.addBox(4.0F, -11.0F, -23.0F, 1.0F, 8.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(228, 217).addBox(6.0F, -11.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0908F, 0.0F));
		PartDefinition cube_r3 = Bodyrepelwormspike.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(42, 125).addBox(-5.0F, -11.0F, -23.0F, 1.0F, 8.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(157, 154).addBox(-5.0F, -12.0F, -18.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(72, 226)
						.addBox(-7.0F, -11.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 218).addBox(-6.0F, -12.0F, -14.0F, 1.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(36, 226)
						.addBox(-4.0F, -12.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(226, 43).addBox(-6.0F, -12.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(56, 167)
						.addBox(-6.0F, -11.0F, -18.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(100, 167).addBox(-4.0F, -11.0F, -18.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(228, 68)
						.addBox(-3.0F, -11.0F, -14.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0908F, 0.0F));
		PartDefinition cube_r4 = Bodyrepelwormspike.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(228, 150).addBox(-8.0F, -11.0F, -20.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(228, 187).addBox(-4.0F, -11.0F, -20.0F, 1.0F, 8.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(170, 0)
						.addBox(-5.0F, -11.0F, -24.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(123, 175).addBox(-7.0F, -11.0F, -24.0F, 1.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(234, 93)
						.addBox(-7.0F, -12.0F, -20.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(235, 1).addBox(-5.0F, -12.0F, -20.0F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(212, 21)
						.addBox(-6.0F, -12.0F, -24.0F, 1.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(70, 133).addBox(-6.0F, -11.0F, -29.0F, 1.0F, 8.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Bodyrepelwormspike.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
