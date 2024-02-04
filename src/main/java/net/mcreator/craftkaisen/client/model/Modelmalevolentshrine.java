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

// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmalevolentshrine<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmalevolentshrine"), "main");
	public final ModelPart shrine;

	public Modelmalevolentshrine(ModelPart root) {
		this.shrine = root.getChild("shrine");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition shrine = partdefinition.addOrReplaceChild("shrine", CubeListBuilder.create().texOffs(0, 874).addBox(-34.75F, -12.51F, -34.75F, 69.5F, 12.51F, 69.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rocks = shrine.addOrReplaceChild("rocks", CubeListBuilder.create(), PartPose.offset(-6.95F, 0.0F, -25.02F));
		PartDefinition rock_r1 = rocks.addOrReplaceChild("rock_r1",
				CubeListBuilder.create().texOffs(910, 745).addBox(-8.34F, -1.39F, -51.43F, 4.17F, 1.39F, 4.17F, new CubeDeformation(0.0F)).texOffs(911, 745).addBox(-16.68F, -2.78F, -50.04F, 6.95F, 2.78F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition rock_r2 = rocks.addOrReplaceChild("rock_r2", CubeListBuilder.create().texOffs(910, 745).addBox(-16.68F, -5.56F, -45.87F, 8.34F, 5.56F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9F, 0.0F, 0.0F, 0.0F, 1.2217F, 0.0F));
		PartDefinition rock_r3 = rocks.addOrReplaceChild("rock_r3",
				CubeListBuilder.create().texOffs(915, 749).addBox(-2.78F, -4.17F, -54.21F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)).texOffs(912, 749).addBox(1.39F, -1.39F, -56.99F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition rock_r4 = rocks.addOrReplaceChild("rock_r4",
				CubeListBuilder.create().texOffs(909, 748).addBox(-16.68F, -2.78F, -50.04F, 6.95F, 2.78F, 6.95F, new CubeDeformation(0.0F)).texOffs(911, 748).addBox(9.73F, -2.78F, 43.09F, 6.95F, 2.78F, 9.73F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.95F, 0.0F, 25.02F, 0.0F, 0.2618F, 0.0F));
		PartDefinition rock_r5 = rocks.addOrReplaceChild("rock_r5",
				CubeListBuilder.create().texOffs(910, 744).addBox(1.39F, -1.39F, -56.99F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)).texOffs(912, 746).addBox(-2.78F, -4.17F, -54.21F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F))
						.texOffs(909, 741).addBox(-8.34F, -6.95F, -51.43F, 8.34F, 6.95F, 6.95F, new CubeDeformation(0.0F)).texOffs(911, 746).addBox(-8.34F, -1.39F, 48.65F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)).texOffs(911, 746)
						.addBox(-4.17F, -4.17F, 47.26F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)).texOffs(915, 745).addBox(0.0F, -6.95F, 44.48F, 8.34F, 6.95F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.95F, 0.0F, 25.02F, 0.0F, 0.6981F, 0.0F));
		PartDefinition rock_r6 = rocks.addOrReplaceChild("rock_r6",
				CubeListBuilder.create().texOffs(910, 747).addBox(-16.68F, -5.56F, -45.87F, 6.95F, 5.56F, 6.95F, new CubeDeformation(0.0F)).texOffs(911, 741).addBox(9.73F, -5.56F, 38.92F, 6.95F, 5.56F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.95F, 0.0F, 25.02F, 0.0F, 0.3491F, 0.0F));
		PartDefinition rock_r7 = rocks.addOrReplaceChild("rock_r7",
				CubeListBuilder.create().texOffs(910, 742).addBox(-16.68F, -2.78F, 43.09F, 6.95F, 2.78F, 6.95F, new CubeDeformation(0.0F)).texOffs(915, 744).addBox(-8.34F, -1.39F, 47.26F, 4.17F, 1.39F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9F, 0.0F, 50.04F, 0.0F, -1.1345F, 0.0F));
		PartDefinition rock_r8 = rocks.addOrReplaceChild("rock_r8", CubeListBuilder.create().texOffs(906, 744).addBox(-16.68F, -5.56F, 38.92F, 8.34F, 5.56F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9F, 0.0F, 50.04F, 0.0F, -1.2217F, 0.0F));
		PartDefinition rock_r9 = rocks.addOrReplaceChild("rock_r9",
				CubeListBuilder.create().texOffs(908, 749).addBox(-2.78F, -3.17F, 47.26F, 6.95F, 3.17F, 6.95F, new CubeDeformation(0.0F)).texOffs(910, 745).addBox(1.39F, -1.39F, 48.65F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.9F, 0.0F, 50.04F, 0.0F, -1.5708F, 0.0F));
		PartDefinition rock_r10 = rocks.addOrReplaceChild("rock_r10",
				CubeListBuilder.create().texOffs(911, 741).addBox(-16.68F, -2.78F, 43.09F, 6.95F, 2.78F, 6.95F, new CubeDeformation(0.0F)).texOffs(244, 543).addBox(9.73F, -2.78F, -50.04F, 6.95F, 2.78F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.95F, 0.0F, 25.02F, 0.0F, -0.2618F, 0.0F));
		PartDefinition rock_r11 = rocks.addOrReplaceChild("rock_r11",
				CubeListBuilder.create().texOffs(909, 747).addBox(1.39F, -1.39F, 48.65F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)).texOffs(912, 746).addBox(-2.78F, -4.17F, 47.26F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F))
						.texOffs(911, 744).addBox(-8.34F, -6.95F, 44.48F, 8.34F, 6.95F, 6.95F, new CubeDeformation(0.0F)).texOffs(910, 745).addBox(-8.34F, -1.39F, -56.99F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)).texOffs(965, 734)
						.addBox(-4.17F, -4.17F, -54.21F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)).texOffs(907, 738).addBox(0.0F, -6.95F, -51.43F, 8.34F, 6.95F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.95F, 0.0F, 25.02F, 0.0F, -0.6981F, 0.0F));
		PartDefinition rock_r12 = rocks.addOrReplaceChild("rock_r12",
				CubeListBuilder.create().texOffs(915, 746).addBox(-16.68F, -5.56F, 38.92F, 6.95F, 5.56F, 6.95F, new CubeDeformation(0.0F)).texOffs(56, 540).addBox(9.73F, -5.56F, -45.87F, 6.95F, 5.56F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.95F, 0.0F, 25.02F, 0.0F, -0.3491F, 0.0F));
		PartDefinition rock_r13 = rocks.addOrReplaceChild("rock_r13",
				CubeListBuilder.create().texOffs(910, 744).addBox(8.34F, -2.78F, 43.09F, 8.34F, 2.78F, 9.73F, new CubeDeformation(0.0F)).texOffs(917, 745).addBox(4.17F, -1.39F, 47.26F, 4.17F, 1.39F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 50.04F, 0.0F, 1.1345F, 0.0F));
		PartDefinition rock_r14 = rocks.addOrReplaceChild("rock_r14", CubeListBuilder.create().texOffs(913, 746).addBox(8.34F, -5.56F, 38.92F, 8.34F, 5.56F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 50.04F, 0.0F, 1.2217F, 0.0F));
		PartDefinition rock_r15 = rocks.addOrReplaceChild("rock_r15",
				CubeListBuilder.create().texOffs(912, 743).addBox(-4.17F, -4.17F, 47.26F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)).texOffs(908, 747).addBox(-8.34F, -1.39F, 48.65F, 6.95F, 1.39F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 50.04F, 0.0F, 1.5708F, 0.0F));
		PartDefinition rock_r16 = rocks.addOrReplaceChild("rock_r16",
				CubeListBuilder.create().texOffs(913, 742).addBox(4.17F, -1.39F, -51.43F, 4.17F, 1.39F, 4.17F, new CubeDeformation(0.0F)).texOffs(502, 544).addBox(9.73F, -2.78F, -50.04F, 6.95F, 2.78F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition rock_r17 = rocks.addOrReplaceChild("rock_r17", CubeListBuilder.create().texOffs(910, 742).addBox(8.34F, -5.56F, -45.87F, 8.34F, 5.56F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2217F, 0.0F));
		PartDefinition rock_r18 = rocks.addOrReplaceChild("rock_r18",
				CubeListBuilder.create().texOffs(919, 739).addBox(-4.17F, -4.17F, -54.21F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)).texOffs(910, 744).addBox(-9.73F, -1.39F, -56.99F, 8.34F, 1.39F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition stairs = shrine.addOrReplaceChild("stairs",
				CubeListBuilder.create().texOffs(228, 473).addBox(-25.02F, -4.17F, 45.87F, 50.04F, 4.17F, 5.56F, new CubeDeformation(0.0F)).texOffs(163, 468).addBox(-25.02F, -9.73F, 34.75F, 50.04F, 9.73F, 5.56F, new CubeDeformation(0.0F))
						.texOffs(209, 473).addBox(-25.02F, -6.95F, 40.31F, 50.04F, 6.95F, 5.56F, new CubeDeformation(0.0F)).texOffs(261, 460).addBox(-25.02F, -4.17F, -51.43F, 50.04F, 4.17F, 5.56F, new CubeDeformation(0.0F)).texOffs(194, 452)
						.addBox(-25.02F, -9.73F, -40.31F, 50.04F, 9.73F, 5.56F, new CubeDeformation(0.0F)).texOffs(273, 462).addBox(-25.02F, -6.95F, -45.87F, 50.04F, 6.95F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = stairs.addOrReplaceChild(
				"cube_r1", CubeListBuilder.create().texOffs(249, 456).addBox(-25.02F, -4.17F, -51.43F, 50.04F, 4.17F, 5.56F, new CubeDeformation(0.0F)).texOffs(224, 465)
						.addBox(-25.02F, -9.73F, -40.31F, 50.04F, 9.73F, 5.56F, new CubeDeformation(0.0F)).texOffs(186, 453).addBox(-25.02F, -6.95F, -45.87F, 50.04F, 6.95F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = stairs.addOrReplaceChild(
				"cube_r2", CubeListBuilder.create().texOffs(265, 486).addBox(-25.02F, -4.17F, -51.43F, 50.04F, 4.17F, 5.56F, new CubeDeformation(0.0F)).texOffs(197, 459)
						.addBox(-25.02F, -9.73F, -40.31F, 50.04F, 9.73F, 5.56F, new CubeDeformation(0.0F)).texOffs(237, 462).addBox(-25.02F, -6.95F, -45.87F, 50.04F, 6.95F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cover = shrine.addOrReplaceChild("cover",
				CubeListBuilder.create().texOffs(173, 455).addBox(18.07F, -59.77F, -20.85F, 2.78F, 50.04F, 41.7F, new CubeDeformation(0.0F)).texOffs(141, 457).addBox(-20.85F, -59.77F, -20.85F, 2.78F, 50.04F, 41.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.78F, 0.0F));
		PartDefinition cube_r3 = cover.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(161, 454).addBox(-20.85F, -59.77F, -20.85F, 2.78F, 50.04F, 41.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r4 = cover.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(142, 453).addBox(-20.85F, -59.77F, -20.85F, 2.78F, 50.04F, 41.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition pillars = shrine.addOrReplaceChild("pillars", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon = pillars.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(673, 603).addBox(-12.5024F, -62.55F, 4.17F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(771, 542).addBox(-12.5024F, -62.55F, 17.375F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F))
						.texOffs(717, 598).addBox(-4.865F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(726, 484).addBox(-18.07F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.9F, -2.78F, 13.9F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(805, 576).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(695, 523).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(805, 546).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(665, 603).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(821, 490).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(725, 598).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(710, 609).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(681, 603).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(650, 480).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(657, 603).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(769, 583).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(689, 603).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.7854F, 0.0F));
		PartDefinition hexadecagon2 = pillars.addOrReplaceChild("hexadecagon2",
				CubeListBuilder.create().texOffs(821, 606).addBox(-12.5024F, -62.55F, 4.17F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(699, 519).addBox(-12.5024F, -62.55F, 17.375F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F))
						.texOffs(773, 599).addBox(-4.865F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(691, 503).addBox(-18.07F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.9F, -2.78F, -36.14F));
		PartDefinition hexadecagon_r5 = hexadecagon2.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(715, 503).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(823, 569).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(711, 510).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(813, 606).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r6 = hexadecagon2.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(804, 533).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(781, 599).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(788, 489).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(829, 606).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r7 = hexadecagon2.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(804, 570).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(805, 606).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r8 = hexadecagon2.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(719, 586).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(837, 606).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.7854F, 0.0F));
		PartDefinition hexadecagon3 = pillars.addOrReplaceChild("hexadecagon3",
				CubeListBuilder.create().texOffs(813, 597).addBox(-12.5024F, -62.55F, 4.17F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(745, 548).addBox(-12.5024F, -62.55F, 17.375F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F))
						.texOffs(690, 539).addBox(-4.865F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(737, 524).addBox(-18.07F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)),
				PartPose.offset(36.14F, -2.78F, -36.14F));
		PartDefinition hexadecagon_r9 = hexadecagon3.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(687, 506).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(773, 490).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(674, 472).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(811, 587).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r10 = hexadecagon3.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(771, 481).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(736, 515).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(649, 572).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(772, 573).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r11 = hexadecagon3.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(835, 520).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(829, 614).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r12 = hexadecagon3.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(704, 589).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(822, 576).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.7854F, 0.0F));
		PartDefinition hexadecagon4 = pillars.addOrReplaceChild("hexadecagon4",
				CubeListBuilder.create().texOffs(771, 557).addBox(-12.5024F, -62.55F, 4.17F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(690, 592).addBox(-12.5024F, -62.55F, 17.375F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F))
						.texOffs(711, 488).addBox(-4.865F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(685, 544).addBox(-18.07F, -62.55F, 9.7376F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)),
				PartPose.offset(36.14F, -2.78F, 13.9F));
		PartDefinition hexadecagon_r13 = hexadecagon4.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(698, 561).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(646, 462).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(723, 500).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(652, 473).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r14 = hexadecagon4.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(763, 540).addBox(-6.95F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F)).texOffs(806, 464).addBox(6.255F, -51.43F, -1.3824F, 0.695F, 52.82F, 2.7649F, new CubeDeformation(0.0F))
						.texOffs(747, 530).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(717, 560).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r15 = hexadecagon4.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(764, 492).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(793, 575).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r16 = hexadecagon4.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(728, 590).addBox(-1.3824F, -51.43F, 6.255F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)).texOffs(692, 560).addBox(-1.3824F, -51.43F, -6.95F, 2.7649F, 52.82F, 0.695F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.12F, -11.12F, 11.12F, 0.0F, 0.7854F, 0.0F));
		PartDefinition floorspikes = shrine.addOrReplaceChild("floorspikes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = floorspikes.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(926, 741).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, -33.4927F, 2.0508F, 0.3927F, 3.1416F));
		PartDefinition cube_r6 = floorspikes.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(917, 751).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, -33.4927F, 2.3998F, 0.3927F, -3.1416F));
		PartDefinition cube_r7 = floorspikes.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(912, 739).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, -33.4927F, 2.7489F, 0.3927F, 3.1416F));
		PartDefinition cube_r8 = floorspikes.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(950, 734).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, -33.4927F, -3.1416F, 0.3927F, 3.1416F));
		PartDefinition cube_r9 = floorspikes.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(912, 743).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.665F, -6.9457F, -43.2227F, 2.0508F, 0.9163F, 3.1416F));
		PartDefinition cube_r10 = floorspikes.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(916, 734).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.665F, -6.9457F, -43.2227F, 2.3998F, 0.9163F, -3.1416F));
		PartDefinition cube_r11 = floorspikes.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(931, 735).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.665F, -6.9457F, -43.2227F, 2.7489F, 0.9163F, 3.1416F));
		PartDefinition cube_r12 = floorspikes.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(980, 748).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.665F, -6.9457F, -43.2227F, -3.1416F, 0.9163F, 3.1416F));
		PartDefinition cube_r13 = floorspikes.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(910, 744).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, -43.2227F, 2.0508F, -1.0036F, 3.1416F));
		PartDefinition cube_r14 = floorspikes.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(908, 745).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, -43.2227F, 2.3998F, -1.0036F, -3.1416F));
		PartDefinition cube_r15 = floorspikes.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(910, 749).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, -43.2227F, 2.7489F, -1.0036F, 3.1416F));
		PartDefinition cube_r16 = floorspikes.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(910, 745).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, -43.2227F, -3.1416F, -1.0036F, 3.1416F));
		PartDefinition cube_r17 = floorspikes.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(914, 745).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, -33.4927F, 2.0508F, -0.6109F, 3.1416F));
		PartDefinition cube_r18 = floorspikes.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(904, 746).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, -33.4927F, 2.3998F, -0.6109F, -3.1416F));
		PartDefinition cube_r19 = floorspikes.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(908, 745).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, -33.4927F, 2.7489F, -0.6109F, 3.1416F));
		PartDefinition cube_r20 = floorspikes.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(909, 741).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, -33.4927F, -3.1416F, -0.6109F, 3.1416F));
		PartDefinition cube_r21 = floorspikes.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(910, 740).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, 33.2273F, -1.0908F, -0.3927F, 0.0F));
		PartDefinition cube_r22 = floorspikes.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(913, 743).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, 33.2273F, -0.7418F, -0.3927F, 0.0F));
		PartDefinition cube_r23 = floorspikes.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(914, 744).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, 33.2273F, -0.3927F, -0.3927F, 0.0F));
		PartDefinition cube_r24 = floorspikes.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(909, 748).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.785F, -6.9457F, 33.2273F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r25 = floorspikes.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(919, 747).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, 42.9573F, -1.0908F, -0.8727F, 0.0F));
		PartDefinition cube_r26 = floorspikes.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(915, 743).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, 42.9573F, -0.7418F, -0.8727F, 0.0F));
		PartDefinition cube_r27 = floorspikes.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(914, 746).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, 42.9573F, -0.3927F, -0.8727F, 0.0F));
		PartDefinition cube_r28 = floorspikes.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(914, 746).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.665F, -6.9457F, 42.9573F, 0.0F, -0.8727F, 0.0F));
		PartDefinition cube_r29 = floorspikes.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(913, 750).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.275F, -6.9457F, 44.3473F, -1.0908F, 0.9163F, 0.0F));
		PartDefinition cube_r30 = floorspikes.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(914, 745).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.275F, -6.9457F, 44.3473F, -0.7418F, 0.9163F, 0.0F));
		PartDefinition cube_r31 = floorspikes.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(913, 742).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.275F, -6.9457F, 44.3473F, -0.3927F, 0.9163F, 0.0F));
		PartDefinition cube_r32 = floorspikes.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(911, 746).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.275F, -6.9457F, 44.3473F, 0.0F, 0.9163F, 0.0F));
		PartDefinition cube_r33 = floorspikes.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(910, 744).addBox(-2.641F, -7.989F, -5.4092F, 5.282F, 5.56F, 5.282F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, 36.0073F, -1.0908F, 0.6109F, 0.0F));
		PartDefinition cube_r34 = floorspikes.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(909, 743).addBox(-2.919F, -4.2277F, -4.5134F, 5.838F, 5.56F, 5.838F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, 36.0073F, -0.7418F, 0.6109F, 0.0F));
		PartDefinition cube_r35 = floorspikes.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(910, 741).addBox(-3.197F, -0.3868F, -4.9581F, 6.394F, 5.56F, 6.394F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, 36.0073F, -0.3927F, 0.6109F, 0.0F));
		PartDefinition cube_r36 = floorspikes.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(907, 739).addBox(-3.475F, 2.7757F, -6.8173F, 6.95F, 4.17F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.785F, -6.9457F, 36.0073F, 0.0F, 0.6109F, 0.0F));
		PartDefinition roof1 = shrine.addOrReplaceChild("roof1",
				CubeListBuilder.create().texOffs(258, 327).addBox(-37.53F, -65.33F, -37.53F, 75.06F, 4.17F, 75.06F, new CubeDeformation(0.0F)).texOffs(47, 67).addBox(-43.09F, -69.5F, -43.09F, 86.18F, 4.17F, 86.18F, new CubeDeformation(0.0F))
						.texOffs(102, 305).addBox(-48.65F, -72.28F, -48.65F, 97.3F, 2.78F, 97.3F, new CubeDeformation(0.0F)).texOffs(199, 207).addBox(-54.21F, -75.06F, -54.21F, 108.42F, 2.78F, 108.42F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition roof2 = shrine.addOrReplaceChild("roof2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition angled = roof2.addOrReplaceChild("angled", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r37 = angled.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(428, 596).addBox(-2.78F, -4.865F, 0.0F, 5.56F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(447, 591).addBox(6.95F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F))
						.texOffs(325, 611).addBox(15.29F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(349, 592).addBox(23.63F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(262, 597)
						.addBox(31.97F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(341, 599).addBox(-11.12F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(383, 596)
						.addBox(-19.46F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(357, 600).addBox(-27.8F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(358, 600)
						.addBox(-36.14F, -4.865F, 0.0F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(173, 762).addBox(-45.87F, -4.865F, -2.78F, 91.74F, 13.9F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -81.315F, 44.48F, 0.6109F, 0.0F, 0.0F));
		PartDefinition angled2 = roof2.addOrReplaceChild("angled2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r38 = angled2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(217, 698).addBox(-2.78F, -4.865F, -1.39F, 5.56F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(368, 622).addBox(6.95F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F))
						.texOffs(325, 624).addBox(15.29F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(335, 591).addBox(23.63F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(453, 621)
						.addBox(31.97F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(271, 681).addBox(-11.12F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(323, 691)
						.addBox(-19.46F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(171, 728).addBox(-27.8F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(420, 729)
						.addBox(-36.14F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(155, 754).addBox(-45.87F, -4.865F, 0.0F, 91.74F, 13.9F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -81.315F, -44.48F, -0.6109F, 0.0F, 0.0F));
		PartDefinition angled3 = roof2.addOrReplaceChild("angled3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r39 = angled3.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(302, 594).addBox(-2.78F, -4.865F, -1.39F, 5.56F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(329, 611).addBox(6.95F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F))
						.texOffs(296, 591).addBox(15.29F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(317, 606).addBox(23.63F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(325, 612)
						.addBox(31.97F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(369, 604).addBox(-11.12F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(419, 591)
						.addBox(-19.46F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(418, 595).addBox(-27.8F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(410, 607)
						.addBox(-36.14F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(180, 753).addBox(-45.87F, -4.865F, 0.0F, 91.74F, 13.9F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -81.315F, -44.48F, -0.6109F, 0.0F, 0.0F));
		PartDefinition angled4 = roof2.addOrReplaceChild("angled4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r40 = angled4.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(318, 603).addBox(-2.78F, -4.865F, -1.39F, 5.56F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(378, 600).addBox(-11.12F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F))
						.texOffs(138, 613).addBox(-19.46F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(402, 628).addBox(-27.8F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(410, 604)
						.addBox(-36.14F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(341, 604).addBox(6.95F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(371, 580)
						.addBox(15.29F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(297, 599).addBox(23.63F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(130, 590)
						.addBox(31.97F, -4.865F, -1.39F, 4.17F, 15.29F, 1.39F, new CubeDeformation(0.0F)).texOffs(181, 763).addBox(-45.87F, -4.865F, 0.0F, 91.74F, 13.9F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -81.315F, -44.48F, -0.6109F, 0.0F, 0.0F));
		PartDefinition roof3 = shrine.addOrReplaceChild("roof3",
				CubeListBuilder.create().texOffs(170, 695).addBox(-41.7F, -86.18F, -41.7F, 83.4F, 2.78F, 83.4F, new CubeDeformation(0.0F)).texOffs(182, 454).addBox(-13.9F, -98.69F, -29.19F, 27.8F, 12.51F, 58.38F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r41 = roof3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(241, 881).addBox(-15.985F, -15.985F, -4.17F, 38.225F, 11.12F, 66.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -91.045F, -29.19F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r42 = roof3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(270, 875).addBox(-22.24F, -15.985F, -4.17F, 36.835F, 11.12F, 66.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -91.045F, -29.19F, 0.0F, 0.0F, -0.7854F));
		PartDefinition roofspikes = shrine.addOrReplaceChild("roofspikes",
				CubeListBuilder.create().texOffs(928, 245).addBox(-51.43F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(926, 297).addBox(-56.2688F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r43 = roofspikes.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(920, 296).addBox(-48.65F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r44 = roofspikes.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(953, 74).addBox(-49.206F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(936, 237).addBox(-49.762F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r45 = roofspikes.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(940, 511).addBox(-50.318F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r46 = roofspikes.addOrReplaceChild(
				"cube_r46", CubeListBuilder.create().texOffs(934, 265).addBox(-50.874F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(946, 259)
						.addBox(-51.43F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(946, 517).addBox(-51.43F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r47 = roofspikes.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(920, 252).addBox(-51.43F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r48 = roofspikes.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(913, 551).addBox(-51.43F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r49 = roofspikes.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(914, 99).addBox(-51.43F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(940, 499).addBox(-51.43F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r50 = roofspikes.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(910, 270).addBox(-51.43F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition roofspikes5 = shrine.addOrReplaceChild("roofspikes5",
				CubeListBuilder.create().texOffs(934, 139).addBox(-51.43F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(926, 494).addBox(-56.2688F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(13.9F, -11.12F, 18.07F));
		PartDefinition cube_r51 = roofspikes5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(968, 335).addBox(-48.65F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r52 = roofspikes5.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(967, 154).addBox(-49.206F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(915, 265).addBox(-49.762F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r53 = roofspikes5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(950, 493).addBox(-50.318F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r54 = roofspikes5.addOrReplaceChild(
				"cube_r54", CubeListBuilder.create().texOffs(944, 94).addBox(-50.874F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(925, 261)
						.addBox(-51.43F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(919, 545).addBox(-51.43F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r55 = roofspikes5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(916, 53).addBox(-51.43F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r56 = roofspikes5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(917, 430).addBox(-51.43F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r57 = roofspikes5.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(934, 109).addBox(-51.43F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(926, 289).addBox(-51.43F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r58 = roofspikes5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(934, 124).addBox(-51.43F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition roofspikes6 = shrine.addOrReplaceChild("roofspikes6",
				CubeListBuilder.create().texOffs(903, 251).addBox(40.31F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(954, 495).addBox(45.1488F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.9F, -11.12F, 18.07F));
		PartDefinition cube_r59 = roofspikes6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(939, 280).addBox(43.09F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r60 = roofspikes6.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(942, 107).addBox(42.534F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(920, 493).addBox(41.978F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r61 = roofspikes6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(939, 500).addBox(41.422F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r62 = roofspikes6.addOrReplaceChild(
				"cube_r62", CubeListBuilder.create().texOffs(948, 91).addBox(40.866F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(931, 261)
						.addBox(40.31F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(918, 263).addBox(40.31F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r63 = roofspikes6.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(943, 109).addBox(40.31F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r64 = roofspikes6.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(931, 252).addBox(40.31F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r65 = roofspikes6.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(949, 92).addBox(40.31F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(939, 498).addBox(40.31F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r66 = roofspikes6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(940, 344).addBox(40.31F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition roofspikes7 = shrine.addOrReplaceChild("roofspikes7",
				CubeListBuilder.create().texOffs(931, 325).addBox(40.31F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(931, 280).addBox(45.1488F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.9F, -11.12F, 73.67F));
		PartDefinition cube_r67 = roofspikes7.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(971, 490).addBox(43.09F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r68 = roofspikes7.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(973, 180).addBox(42.534F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(951, 268).addBox(41.978F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r69 = roofspikes7.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(931, 340).addBox(41.422F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r70 = roofspikes7.addOrReplaceChild(
				"cube_r70", CubeListBuilder.create().texOffs(923, 259).addBox(40.866F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(897, 60)
						.addBox(40.31F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(897, 75).addBox(40.31F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r71 = roofspikes7.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(897, 90).addBox(40.31F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r72 = roofspikes7.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(898, 457).addBox(40.31F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r73 = roofspikes7.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(931, 295).addBox(40.31F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(896, 536).addBox(40.31F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r74 = roofspikes7.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(931, 310).addBox(40.31F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition roofspikes8 = shrine.addOrReplaceChild("roofspikes8",
				CubeListBuilder.create().texOffs(938, 248).addBox(-51.43F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(937, 62).addBox(-56.2688F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(13.9F, -11.12F, 73.67F));
		PartDefinition cube_r75 = roofspikes8.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(947, 459).addBox(-48.65F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r76 = roofspikes8.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(980, 148).addBox(-49.206F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(945, 478).addBox(-49.762F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r77 = roofspikes8.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(941, 439).addBox(-50.318F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r78 = roofspikes8.addOrReplaceChild(
				"cube_r78", CubeListBuilder.create().texOffs(941, 103).addBox(-50.874F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(937, 303)
						.addBox(-51.43F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(896, 88).addBox(-51.43F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r79 = roofspikes8.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(901, 239).addBox(-51.43F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r80 = roofspikes8.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(903, 489).addBox(-51.43F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r81 = roofspikes8.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(937, 77).addBox(-51.43F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(903, 504).addBox(-51.43F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r82 = roofspikes8.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(903, 549).addBox(-51.43F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition roofspikes2 = shrine.addOrReplaceChild("roofspikes2",
				CubeListBuilder.create().texOffs(898, 240).addBox(40.31F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(948, 482).addBox(45.1488F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r83 = roofspikes2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(418, 615).addBox(43.09F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r84 = roofspikes2.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(956, 508).addBox(42.534F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(957, 62).addBox(41.978F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r85 = roofspikes2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(950, 126).addBox(41.422F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r86 = roofspikes2.addOrReplaceChild(
				"cube_r86", CubeListBuilder.create().texOffs(931, 371).addBox(40.866F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(909, 532)
						.addBox(40.31F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(929, 471).addBox(40.31F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r87 = roofspikes2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(933, 246).addBox(40.31F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r88 = roofspikes2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(923, 503).addBox(40.31F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r89 = roofspikes2.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(923, 563).addBox(40.31F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(930, 259).addBox(40.31F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r90 = roofspikes2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(954, 487).addBox(40.31F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition roofspikes3 = shrine.addOrReplaceChild("roofspikes3",
				CubeListBuilder.create().texOffs(944, 481).addBox(40.31F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(931, 253).addBox(45.1488F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 91.74F));
		PartDefinition cube_r91 = roofspikes3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(969, 264).addBox(43.09F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r92 = roofspikes3.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(967, 319).addBox(42.534F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(956, 307).addBox(41.978F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r93 = roofspikes3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(914, 405).addBox(41.422F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r94 = roofspikes3.addOrReplaceChild(
				"cube_r94", CubeListBuilder.create().texOffs(945, 268).addBox(40.866F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(935, 190)
						.addBox(40.31F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(935, 205).addBox(40.31F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r95 = roofspikes3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(935, 220).addBox(40.31F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r96 = roofspikes3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(921, 64).addBox(40.31F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r97 = roofspikes3.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(923, 360).addBox(40.31F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(929, 260).addBox(40.31F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r98 = roofspikes3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(939, 52).addBox(40.31F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition roofspikes4 = shrine.addOrReplaceChild("roofspikes4",
				CubeListBuilder.create().texOffs(924, 250).addBox(-51.43F, -79.23F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(932, 364).addBox(-56.2688F, -93.1185F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 91.74F));
		PartDefinition cube_r99 = roofspikes4.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(965, 409).addBox(-48.65F, -130.66F, -48.65F, 5.56F, 2.78F, 5.56F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-115.8376F, -0.4988F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r100 = roofspikes4.addOrReplaceChild("cube_r100",
				CubeListBuilder.create().texOffs(964, 228).addBox(-49.206F, -127.88F, -49.206F, 6.672F, 2.78F, 6.672F, new CubeDeformation(0.0F)).texOffs(949, 528).addBox(-49.762F, -125.1F, -49.762F, 7.784F, 4.17F, 7.784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-105.6406F, 5.7388F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition cube_r101 = roofspikes4.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(947, 470).addBox(-50.318F, -120.93F, -50.318F, 8.896F, 4.17F, 8.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-84.5331F, 14.4422F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r102 = roofspikes4.addOrReplaceChild(
				"cube_r102", CubeListBuilder.create().texOffs(934, 248).addBox(-50.874F, -116.76F, -50.874F, 10.008F, 4.17F, 10.008F, new CubeDeformation(0.0F)).texOffs(931, 213)
						.addBox(-51.43F, -112.59F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(931, 228).addBox(-51.43F, -108.42F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-62.7748F, 18.8518F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r103 = roofspikes4.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(920, 579).addBox(-51.43F, -104.25F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.4938F, 16.8624F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r104 = roofspikes4.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(945, 483).addBox(-51.43F, -95.91F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.2321F, -9.6176F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r105 = roofspikes4.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(920, 534).addBox(-51.43F, -91.74F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)).texOffs(946, 126).addBox(-51.43F, -87.57F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.2202F, -31.1864F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r106 = roofspikes4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(898, 442).addBox(-51.43F, -83.4F, -51.43F, 11.12F, 4.17F, 11.12F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1327F, -13.1327F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition sides5 = shrine.addOrReplaceChild("sides5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sides4 = sides5.addOrReplaceChild("sides4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition teeth4 = sides4.addOrReplaceChild("teeth4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.695F, -25.02F, 71.585F, -0.3491F, 0.0F, 0.0F));
		PartDefinition teethset7 = teeth4.addOrReplaceChild("teethset7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tooth37 = teethset7.addOrReplaceChild("tooth37", CubeListBuilder.create().texOffs(705, 826).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(13.9F, 16.2976F, -41.9815F));
		PartDefinition cube_r107 = tooth37.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(654, 824).addBox(-0.834F, -30.5046F, 69.7498F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r108 = tooth37.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(746, 770).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth38 = teethset7.addOrReplaceChild("tooth38", CubeListBuilder.create().texOffs(819, 762).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-15.29F, 16.2976F, -41.9815F));
		PartDefinition cube_r109 = tooth38.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(712, 874).addBox(-2.224F, -30.5046F, 69.7498F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r110 = tooth38.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(703, 850).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth39 = teethset7.addOrReplaceChild("tooth39", CubeListBuilder.create().texOffs(644, 824).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-9.73F, 16.2976F, -41.9815F));
		PartDefinition cube_r111 = tooth39.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(690, 824).addBox(-2.224F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r112 = tooth39.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(779, 819).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth40 = teethset7.addOrReplaceChild("tooth40", CubeListBuilder.create().texOffs(823, 767).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(8.34F, 16.2976F, -41.9815F));
		PartDefinition cube_r113 = tooth40.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(762, 771).addBox(-2.224F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r114 = tooth40.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(665, 825).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth41 = teethset7.addOrReplaceChild("tooth41", CubeListBuilder.create().texOffs(827, 744).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(2.78F, 16.2976F, -41.9815F));
		PartDefinition cube_r115 = tooth41.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(699, 816).addBox(-2.224F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r116 = tooth41.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(638, 867).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth42 = teethset7.addOrReplaceChild("tooth42", CubeListBuilder.create().texOffs(728, 876).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-4.17F, 16.2976F, -41.9815F));
		PartDefinition cube_r117 = tooth42.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(655, 839).addBox(-2.224F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r118 = tooth42.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(808, 753).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition teethset8 = teeth4.addOrReplaceChild("teethset8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.9F, -4.865F, -0.8727F, 0.0F, 0.0F));
		PartDefinition tooth43 = teethset8.addOrReplaceChild("tooth43", CubeListBuilder.create().texOffs(667, 834).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(13.9F, -16.2976F, -41.9815F));
		PartDefinition cube_r119 = tooth43.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(720, 839).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r120 = tooth43.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(865, 782).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth44 = teethset8.addOrReplaceChild("tooth44", CubeListBuilder.create().texOffs(648, 831).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-15.29F, -16.2976F, -41.9815F));
		PartDefinition cube_r121 = tooth44.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(739, 838).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r122 = tooth44.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(854, 767).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth45 = teethset8.addOrReplaceChild("tooth45", CubeListBuilder.create().texOffs(727, 834).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-9.73F, -16.2976F, -41.9815F));
		PartDefinition cube_r123 = tooth45.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(715, 754).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r124 = tooth45.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(673, 788).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth46 = teethset8.addOrReplaceChild("tooth46", CubeListBuilder.create().texOffs(640, 852).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(8.34F, -16.2976F, -41.9815F));
		PartDefinition cube_r125 = tooth46.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(801, 792).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r126 = tooth46.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(756, 848).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth47 = teethset8.addOrReplaceChild("tooth47", CubeListBuilder.create().texOffs(653, 784).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(2.78F, -16.2976F, -41.9815F));
		PartDefinition cube_r127 = tooth47.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(854, 770).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r128 = tooth47.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(711, 814).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth48 = teethset8.addOrReplaceChild("tooth48", CubeListBuilder.create().texOffs(777, 799).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-4.17F, -16.2976F, -41.9815F));
		PartDefinition cube_r129 = tooth48.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(651, 831).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r130 = tooth48.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(724, 846).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition circularthing7 = sides4.addOrReplaceChild("circularthing7", CubeListBuilder.create().texOffs(921, 820).addBox(-34.6146F, -24.5239F, 20.85F, 19.46F, 5.56F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(24.8846F, 6.4539F, 0.0F));
		PartDefinition cube_r131 = circularthing7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(931, 817).addBox(-9.73F, -27.8F, 20.85F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r132 = circularthing7.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(923, 824).addBox(-9.73F, -27.8F, 20.85F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition circularthing8 = circularthing7.addOrReplaceChild("circularthing8", CubeListBuilder.create().texOffs(246, 477).addBox(-44.3446F, 9.2339F, 20.85F, 38.92F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -78.2378F, 0.0F));
		PartDefinition cube_r133 = circularthing8.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(924, 831).addBox(-11.12F, 12.51F, 20.85F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r134 = circularthing8.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(922, 824).addBox(-9.73F, 12.51F, 20.85F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition sides3 = sides5.addOrReplaceChild("sides3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition teeth3 = sides3.addOrReplaceChild("teeth3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.695F, -25.02F, 71.585F, -0.3491F, 0.0F, 0.0F));
		PartDefinition teethset5 = teeth3.addOrReplaceChild("teethset5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tooth25 = teethset5.addOrReplaceChild("tooth25", CubeListBuilder.create().texOffs(752, 802).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-13.9F, 16.2976F, -41.9815F));
		PartDefinition cube_r135 = tooth25.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(713, 788).addBox(-2.224F, -30.5046F, 69.7498F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r136 = tooth25.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(718, 827).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth26 = teethset5.addOrReplaceChild("tooth26", CubeListBuilder.create().texOffs(776, 795).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(15.29F, 16.2976F, -41.9815F));
		PartDefinition cube_r137 = tooth26.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(661, 740).addBox(-0.834F, -30.5046F, 69.7498F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r138 = tooth26.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(745, 794).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth27 = teethset5.addOrReplaceChild("tooth27", CubeListBuilder.create().texOffs(682, 765).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(9.73F, 16.2976F, -41.9815F));
		PartDefinition cube_r139 = tooth27.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(820, 800).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r140 = tooth27.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(719, 831).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth28 = teethset5.addOrReplaceChild("tooth28", CubeListBuilder.create().texOffs(722, 831).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-8.34F, 16.2976F, -41.9815F));
		PartDefinition cube_r141 = tooth28.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(831, 879).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r142 = tooth28.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(741, 794).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth29 = teethset5.addOrReplaceChild("tooth29", CubeListBuilder.create().texOffs(738, 805).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-2.78F, 16.2976F, -41.9815F));
		PartDefinition cube_r143 = tooth29.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(719, 813).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r144 = tooth29.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(839, 748).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth30 = teethset5.addOrReplaceChild("tooth30", CubeListBuilder.create().texOffs(729, 792).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(4.17F, 16.2976F, -41.9815F));
		PartDefinition cube_r145 = tooth30.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(736, 786).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r146 = tooth30.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(791, 795).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition teethset6 = teeth3.addOrReplaceChild("teethset6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.9F, -4.865F, -0.8727F, 0.0F, 0.0F));
		PartDefinition tooth31 = teethset6.addOrReplaceChild("tooth31", CubeListBuilder.create().texOffs(733, 783).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-13.9F, -16.2976F, -41.9815F));
		PartDefinition cube_r147 = tooth31.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(660, 828).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r148 = tooth31.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(690, 860).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth32 = teethset6.addOrReplaceChild("tooth32", CubeListBuilder.create().texOffs(785, 839).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(15.29F, -16.2976F, -41.9815F));
		PartDefinition cube_r149 = tooth32.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(715, 813).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r150 = tooth32.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(690, 817).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth33 = teethset6.addOrReplaceChild("tooth33", CubeListBuilder.create().texOffs(717, 779).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(9.73F, -16.2976F, -41.9815F));
		PartDefinition cube_r151 = tooth33.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(766, 785).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r152 = tooth33.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(717, 809).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth34 = teethset6.addOrReplaceChild("tooth34", CubeListBuilder.create().texOffs(657, 847).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-8.34F, -16.2976F, -41.9815F));
		PartDefinition cube_r153 = tooth34.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(642, 831).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r154 = tooth34.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(728, 823).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth35 = teethset6.addOrReplaceChild("tooth35", CubeListBuilder.create().texOffs(740, 809).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-2.78F, -16.2976F, -41.9815F));
		PartDefinition cube_r155 = tooth35.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(741, 846).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r156 = tooth35.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(708, 789).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth36 = teethset6.addOrReplaceChild("tooth36", CubeListBuilder.create().texOffs(713, 817).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(4.17F, -16.2976F, -41.9815F));
		PartDefinition cube_r157 = tooth36.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(767, 836).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r158 = tooth36.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(674, 813).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition circularthing5 = sides3.addOrReplaceChild("circularthing5", CubeListBuilder.create().texOffs(923, 823).addBox(15.1546F, -24.5239F, 20.85F, 19.46F, 5.56F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(-24.8846F, 6.4539F, 0.0F));
		PartDefinition cube_r159 = circularthing5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(924, 805).addBox(-9.73F, -27.8F, 20.85F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r160 = circularthing5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(917, 817).addBox(-9.73F, -27.8F, 20.85F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition circularthing6 = circularthing5.addOrReplaceChild("circularthing6", CubeListBuilder.create().texOffs(251, 484).addBox(5.4246F, 9.2339F, 20.85F, 38.92F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -78.2378F, 0.0F));
		PartDefinition cube_r161 = circularthing6.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(910, 817).addBox(-9.73F, 12.51F, 20.85F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r162 = circularthing6.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(925, 821).addBox(-11.12F, 12.51F, 20.85F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition sides2 = sides5.addOrReplaceChild("sides2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition teeth2 = sides2.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.695F, -25.02F, 71.585F, -0.3491F, 0.0F, 0.0F));
		PartDefinition teethset3 = teeth2.addOrReplaceChild("teethset3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tooth13 = teethset3.addOrReplaceChild("tooth13", CubeListBuilder.create().texOffs(766, 741).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-13.9F, 16.2976F, -41.9815F));
		PartDefinition cube_r163 = tooth13.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(701, 830).addBox(-2.224F, -30.5046F, 69.7498F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r164 = tooth13.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(665, 771).addBox(-2.502F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth14 = teethset3.addOrReplaceChild("tooth14", CubeListBuilder.create().texOffs(745, 811).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(15.29F, 16.2976F, -41.9815F));
		PartDefinition cube_r165 = tooth14.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(688, 812).addBox(-0.834F, -30.5046F, 69.7498F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r166 = tooth14.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(728, 805).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth15 = teethset3.addOrReplaceChild("tooth15", CubeListBuilder.create().texOffs(815, 897).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(9.73F, 16.2976F, -41.9815F));
		PartDefinition cube_r167 = tooth15.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(790, 807).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r168 = tooth15.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(657, 762).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth16 = teethset3.addOrReplaceChild("tooth16", CubeListBuilder.create().texOffs(754, 826).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-8.34F, 16.2976F, -41.9815F));
		PartDefinition cube_r169 = tooth16.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(860, 739).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r170 = tooth16.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(680, 887).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth17 = teethset3.addOrReplaceChild("tooth17", CubeListBuilder.create().texOffs(682, 746).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-2.78F, 16.2976F, -41.9815F));
		PartDefinition cube_r171 = tooth17.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(831, 746).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r172 = tooth17.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(694, 854).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth18 = teethset3.addOrReplaceChild("tooth18", CubeListBuilder.create().texOffs(640, 821).addBox(-2.085F, 3.1624F, -1.8035F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(4.17F, 16.2976F, -41.9815F));
		PartDefinition cube_r173 = tooth18.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(760, 829).addBox(-0.834F, -29.1146F, 69.7498F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, -65.461F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r174 = tooth18.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(793, 763).addBox(-1.112F, -26.41F, 69.778F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, -68.8373F, 0.0873F, 0.0F, 0.0F));
		PartDefinition teethset4 = teeth2.addOrReplaceChild("teethset4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.9F, -4.865F, -0.8727F, 0.0F, 0.0F));
		PartDefinition tooth19 = teethset4.addOrReplaceChild("tooth19", CubeListBuilder.create().texOffs(779, 765).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-13.9F, -16.2976F, -41.9815F));
		PartDefinition cube_r175 = tooth19.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(671, 826).addBox(-2.224F, -74.1978F, 26.3346F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r176 = tooth19.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(789, 894).addBox(-2.502F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth20 = teethset4.addOrReplaceChild("tooth20", CubeListBuilder.create().texOffs(798, 784).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(15.29F, -16.2976F, -41.9815F));
		PartDefinition cube_r177 = tooth20.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(698, 802).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r178 = tooth20.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(732, 808).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth21 = teethset4.addOrReplaceChild("tooth21", CubeListBuilder.create().texOffs(794, 799).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(9.73F, -16.2976F, -41.9815F));
		PartDefinition cube_r179 = tooth21.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(742, 843).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r180 = tooth21.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(660, 831).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth22 = teethset4.addOrReplaceChild("tooth22", CubeListBuilder.create().texOffs(663, 825).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-8.34F, -16.2976F, -41.9815F));
		PartDefinition cube_r181 = tooth22.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(764, 784).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r182 = tooth22.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(826, 766).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth23 = teethset4.addOrReplaceChild("tooth23", CubeListBuilder.create().texOffs(836, 810).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-2.78F, -16.2976F, -41.9815F));
		PartDefinition cube_r183 = tooth23.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(688, 823).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r184 = tooth23.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(664, 841).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth24 = teethset4.addOrReplaceChild("tooth24", CubeListBuilder.create().texOffs(707, 824).addBox(-2.085F, 54.5226F, 18.3515F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(4.17F, -16.2976F, -41.9815F));
		PartDefinition cube_r185 = tooth24.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(702, 793).addBox(-0.834F, -74.1978F, 26.3346F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, -13.6909F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r186 = tooth24.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(792, 886).addBox(-1.112F, -74.782F, 23.63F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, -7.5552F, -0.0873F, 0.0F, 0.0F));
		PartDefinition circularthing3 = sides2.addOrReplaceChild("circularthing3", CubeListBuilder.create().texOffs(919, 824).addBox(15.1546F, -24.5239F, 20.85F, 19.46F, 5.56F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(-24.8846F, 6.4539F, 0.0F));
		PartDefinition cube_r187 = circularthing3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(919, 819).addBox(-9.73F, -27.8F, 20.85F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r188 = circularthing3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(919, 809).addBox(-9.73F, -27.8F, 20.85F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition circularthing4 = circularthing3.addOrReplaceChild("circularthing4", CubeListBuilder.create().texOffs(261, 484).addBox(5.4246F, 9.2339F, 20.85F, 38.92F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -78.2378F, 0.0F));
		PartDefinition cube_r189 = circularthing4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(909, 820).addBox(-9.73F, 12.51F, 20.85F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r190 = circularthing4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(918, 836).addBox(-11.12F, 12.51F, 20.85F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition sides = sides5.addOrReplaceChild("sides", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition teeth = sides.addOrReplaceChild("teeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.695F, -25.02F, -71.585F, 0.3491F, 0.0F, 0.0F));
		PartDefinition teethset1 = teeth.addOrReplaceChild("teethset1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tooth = teethset1.addOrReplaceChild("tooth", CubeListBuilder.create().texOffs(682, 859).addBox(-2.085F, 3.1624F, -3.7565F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-13.9F, 16.2976F, 41.9815F));
		PartDefinition cube_r191 = tooth.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(720, 778).addBox(-2.224F, -30.5046F, -74.1978F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 39.3748F, 65.461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r192 = tooth.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(778, 787).addBox(-2.502F, -26.41F, -74.782F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 33.2391F, 68.8373F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth2 = teethset1.addOrReplaceChild("tooth2", CubeListBuilder.create().texOffs(845, 794).addBox(-2.085F, 3.1624F, -3.7565F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(15.29F, 16.2976F, 41.9815F));
		PartDefinition cube_r193 = tooth2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(717, 782).addBox(-0.834F, -30.5046F, -74.1978F, 3.058F, 4.17F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, 65.461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r194 = tooth2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(655, 836).addBox(-1.112F, -26.41F, -74.782F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, 68.8373F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth3 = teethset1.addOrReplaceChild("tooth3", CubeListBuilder.create().texOffs(735, 843).addBox(-2.085F, 3.1624F, -3.7565F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(9.73F, 16.2976F, 41.9815F));
		PartDefinition cube_r195 = tooth3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(641, 829).addBox(-0.834F, -29.1146F, -74.1978F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, 65.461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r196 = tooth3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(784, 920).addBox(-1.112F, -26.41F, -74.782F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, 68.8373F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth4 = teethset1.addOrReplaceChild("tooth4", CubeListBuilder.create().texOffs(799, 756).addBox(-2.085F, 3.1624F, -3.7565F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-8.34F, 16.2976F, 41.9815F));
		PartDefinition cube_r197 = tooth4.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(678, 832).addBox(-0.834F, -29.1146F, -74.1978F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, 65.461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r198 = tooth4.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(805, 860).addBox(-1.112F, -26.41F, -74.782F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, 68.8373F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth5 = teethset1.addOrReplaceChild("tooth5", CubeListBuilder.create().texOffs(737, 844).addBox(-2.085F, 3.1624F, -3.7565F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(-2.78F, 16.2976F, 41.9815F));
		PartDefinition cube_r199 = tooth5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(790, 811).addBox(-0.834F, -29.1146F, -74.1978F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, 65.461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r200 = tooth5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(678, 806).addBox(-1.112F, -26.41F, -74.782F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, 68.8373F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tooth6 = teethset1.addOrReplaceChild("tooth6", CubeListBuilder.create().texOffs(842, 746).addBox(-2.085F, 3.1624F, -3.7565F, 4.17F, 4.17F, 5.56F, new CubeDeformation(0.0F)), PartPose.offset(4.17F, 16.2976F, 41.9815F));
		PartDefinition cube_r201 = tooth6.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(698, 815).addBox(-0.834F, -29.1146F, -74.1978F, 3.058F, 2.78F, 4.448F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 39.3748F, 65.461F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r202 = tooth6.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(707, 914).addBox(-1.112F, -26.41F, -74.782F, 3.614F, 2.78F, 5.004F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 33.2391F, 68.8373F, -0.0873F, 0.0F, 0.0F));
		PartDefinition teethset2 = teeth.addOrReplaceChild("teethset2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.9F, 4.865F, 0.8727F, 0.0F, 0.0F));
		PartDefinition tooth7 = teethset2.addOrReplaceChild("tooth7", CubeListBuilder.create().texOffs(717, 816).addBox(-2.085F, 54.5226F, -22.5215F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-13.9F, -16.2976F, 41.9815F));
		PartDefinition cube_r203 = tooth7.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(734, 816).addBox(-2.224F, -74.1978F, -30.5046F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 123.7401F, 13.6909F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r204 = tooth7.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(737, 839).addBox(-2.502F, -74.782F, -26.41F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.695F, 127.1163F, 7.5552F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth8 = teethset2.addOrReplaceChild("tooth8", CubeListBuilder.create().texOffs(689, 809).addBox(-2.085F, 54.5226F, -22.5215F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(15.29F, -16.2976F, 41.9815F));
		PartDefinition cube_r205 = tooth8.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(673, 823).addBox(-0.834F, -74.1978F, -30.5046F, 3.058F, 4.448F, 4.17F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, 13.6909F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r206 = tooth8.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(789, 904).addBox(-1.112F, -74.782F, -26.41F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, 7.5552F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth9 = teethset2.addOrReplaceChild("tooth9", CubeListBuilder.create().texOffs(858, 775).addBox(-2.085F, 54.5226F, -22.5215F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(9.73F, -16.2976F, 41.9815F));
		PartDefinition cube_r207 = tooth9.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(714, 781).addBox(-0.834F, -74.1978F, -29.1146F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, 13.6909F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r208 = tooth9.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(706, 888).addBox(-1.112F, -74.782F, -26.41F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, 7.5552F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth10 = teethset2.addOrReplaceChild("tooth10", CubeListBuilder.create().texOffs(689, 756).addBox(-2.085F, 54.5226F, -22.5215F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-8.34F, -16.2976F, 41.9815F));
		PartDefinition cube_r209 = tooth10.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(640, 835).addBox(-0.834F, -74.1978F, -29.1146F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, 13.6909F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r210 = tooth10.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(800, 838).addBox(-1.112F, -74.782F, -26.41F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, 7.5552F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth11 = teethset2.addOrReplaceChild("tooth11", CubeListBuilder.create().texOffs(801, 800).addBox(-2.085F, 54.5226F, -22.5215F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(-2.78F, -16.2976F, 41.9815F));
		PartDefinition cube_r211 = tooth11.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(735, 895).addBox(-0.834F, -74.1978F, -29.1146F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, 13.6909F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r212 = tooth11.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(728, 853).addBox(-1.112F, -74.782F, -26.41F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, 7.5552F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tooth12 = teethset2.addOrReplaceChild("tooth12", CubeListBuilder.create().texOffs(859, 756).addBox(-2.085F, 54.5226F, -22.5215F, 4.17F, 5.56F, 4.17F, new CubeDeformation(0.0F)), PartPose.offset(4.17F, -16.2976F, 41.9815F));
		PartDefinition cube_r213 = tooth12.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(843, 913).addBox(-0.834F, -74.1978F, -29.1146F, 3.058F, 4.448F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 123.7401F, 13.6909F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r214 = tooth12.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(724, 864).addBox(-1.112F, -74.782F, -26.41F, 3.614F, 5.004F, 2.78F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.695F, 127.1163F, 7.5552F, 0.0873F, 0.0F, 0.0F));
		PartDefinition circularthing = sides.addOrReplaceChild("circularthing", CubeListBuilder.create().texOffs(918, 820).addBox(15.1546F, -24.5239F, -29.19F, 19.46F, 5.56F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(-24.8846F, 6.4539F, 0.0F));
		PartDefinition cube_r215 = circularthing.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(925, 810).addBox(-9.73F, -27.8F, -29.19F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r216 = circularthing.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(923, 822).addBox(-9.73F, -27.8F, -29.19F, 19.46F, 8.34F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition circularthing2 = circularthing.addOrReplaceChild("circularthing2", CubeListBuilder.create().texOffs(238, 494).addBox(5.4246F, 9.2339F, -29.19F, 38.92F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -78.2378F, 0.0F));
		PartDefinition cube_r217 = circularthing2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(231, 468).addBox(-9.73F, 12.51F, -29.19F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r218 = circularthing2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(414, 464).addBox(-11.12F, 12.51F, -29.19F, 20.85F, 15.29F, 8.34F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.7692F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		shrine.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
