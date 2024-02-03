package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelMahoraga<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_mahoraga"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelMahoraga(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(53, 177).addBox(-7.5F, -17.0F, -7.0F, 15.0F, 18.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -77.5F, -5.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(151, 226).addBox(-1.5F, -1.5F, -7.5F, 5.0F, 7.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 36.3647F, 36.5256F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(219, 148).addBox(-2.5F, -3.0F, -7.5F, 7.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 22.0163F, 34.5852F, -1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(203, 199).addBox(-4.0F, -5.0F, -7.5F, 9.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 9.7315F, 29.4603F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(202, 0).addBox(-5.5F, -7.4186F, -1.6248F, 11.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.113F, 16.8541F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(146, 0).addBox(-6.5F, -7.9377F, -13.4708F, 13.0F, 14.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.113F, 16.8541F, -0.4363F, 0.0F, 0.0F));
		PartDefinition wheel = head.addOrReplaceChild("wheel",
				CubeListBuilder.create().texOffs(39, 182).addBox(-5.9988F, -20.3185F, 7.3248F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(244, 128).addBox(-5.9988F, -20.3185F, -19.6752F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(248, 58).addBox(-0.9988F, -19.8185F, -21.6752F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(59, 98).addBox(-16.4988F, -19.8185F, -6.1752F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 260)
						.addBox(-2.4988F, -21.8185F, -7.6752F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(264, 215).addBox(-2.4988F, -21.8185F, -26.6752F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(258, 254)
						.addBox(-2.4988F, -21.8185F, 11.3248F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(193, 255).addBox(-21.4988F, -21.8185F, -7.6752F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(176, 226)
						.addBox(16.5012F, -21.8185F, -7.6752F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(124, 243).addBox(-0.9988F, -19.8185F, -2.6752F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(59, 95)
						.addBox(2.5012F, -19.8185F, -6.1752F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0012F, -10.5F, 10.4988F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r6 = wheel.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(264, 205).addBox(-2.6603F, -21.8185F, -1.9103F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0012F, 0.0F, -18.9988F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r7 = wheel.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(262, 113).addBox(-2.3397F, -21.8185F, -1.9103F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.9988F, 0.0F, -18.9988F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r8 = wheel.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(264, 264).addBox(-9.6603F, -21.8185F, -10.4103F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.9988F, 0.0F, 19.0012F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r9 = wheel.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 265).addBox(4.6603F, -21.8185F, -10.4103F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0012F, 0.0F, 19.0012F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r10 = wheel.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(248, 43).addBox(-11.6603F, -19.8185F, -8.1603F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 0.0F, 10.0012F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r11 = wheel.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(248, 15).addBox(9.6603F, -19.8185F, -8.1603F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 0.0F, 10.0012F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r12 = wheel.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(244, 113).addBox(2.3397F, -19.8185F, -13.1603F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 0.0F, -9.9988F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r13 = wheel.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(246, 211).addBox(-4.3397F, -19.8185F, -13.1603F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0012F, 0.0F, -9.9988F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r14 = wheel.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(248, 88).addBox(-9.6603F, -20.3185F, -4.6603F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(9.5367F, 0.0F, -9.5491F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r15 = wheel.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 186).addBox(-11.1764F, -20.3185F, -1.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4865F, 0.0F, 0.0159F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r16 = wheel.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(80, 210).addBox(-2.3397F, -20.3185F, -4.6603F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(9.5367F, 0.0F, 9.5514F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r17 = wheel.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(152, 193).addBox(-9.6603F, -20.3185F, -4.6603F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-9.5344F, 0.0F, 9.5514F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r18 = wheel.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 214).addBox(-11.1764F, -20.3185F, 26.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5159F, 0.0F, 0.0159F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r19 = wheel.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(244, 132).addBox(-2.3397F, -20.3185F, -4.6603F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-9.5344F, 0.0F, -9.5491F, 0.0F, 0.7854F, 0.0F));
		PartDefinition facewing = head.addOrReplaceChild("facewing", CubeListBuilder.create(), PartPose.offset(19.7843F, 8.5509F, -14.0203F));
		PartDefinition cube_r20 = facewing.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(248, 73).addBox(10.8294F, -1.8561F, -12.8467F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.5685F, -18.25F, 0.0F, 2.9708F, 0.5127F, -3.0353F));
		PartDefinition cube_r21 = facewing.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(236, 202).addBox(7.4561F, -1.8561F, -9.0905F, 3.0F, 3.0F, 9.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-39.5685F, -18.25F, 0.0F, 2.7722F, 1.148F, 2.9929F));
		PartDefinition cube_r22 = facewing.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(252, 240).addBox(2.9232F, -1.8561F, -8.6171F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(79, 32).addBox(-12.0768F, -0.3561F, -11.6171F, 15.0F, 0.0F, 29.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.5685F, -18.25F, 0.0F, 0.2738F, 0.9909F, 0.4214F));
		PartDefinition cube_r23 = facewing.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(252, 226).addBox(3.3381F, -1.8561F, 0.7687F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-39.5685F, -18.25F, 0.0F, 0.2013F, 0.7362F, 0.3269F));
		PartDefinition cube_r24 = facewing.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(89, 41).addBox(0.1784F, -1.8561F, 12.2316F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.5685F, -18.25F, 0.0F, 0.2738F, 0.9909F, 0.4214F));
		PartDefinition cube_r25 = facewing.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 250).addBox(-13.8294F, -1.8561F, -12.8467F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.25F, 0.0F, 2.9708F, -0.5127F, 3.0353F));
		PartDefinition cube_r26 = facewing.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(18, 250).addBox(-10.4561F, -1.8561F, -9.0905F, 3.0F, 3.0F, 9.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, -18.25F, 0.0F, 2.7722F, -1.148F, -2.9929F));
		PartDefinition cube_r27 = facewing.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(257, 191).addBox(-5.9232F, -1.8561F, -8.6171F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 95).addBox(-2.9232F, -0.3561F, -11.6171F, 15.0F, 0.0F, 29.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.25F, 0.0F, 0.2738F, -0.9909F, -0.4214F));
		PartDefinition cube_r28 = facewing.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(204, 255).addBox(-6.3381F, -1.8561F, 0.7687F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, -18.25F, 0.0F, 0.2013F, -0.7362F, -0.3269F));
		PartDefinition cube_r29 = facewing.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(98, 177).addBox(-3.1784F, -1.8561F, 12.2316F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.25F, 0.0F, 0.2738F, -0.9909F, -0.4214F));
		PartDefinition facewing2 = head.addOrReplaceChild("facewing2", CubeListBuilder.create(), PartPose.offset(16.5343F, -1.9491F, -14.0203F));
		PartDefinition cube_r30 = facewing2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(187, 0).addBox(10.8294F, -1.8561F, -12.8467F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.0685F, -20.0F, 0.0F, 3.0408F, 0.466F, -2.5207F));
		PartDefinition cube_r31 = facewing2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(203, 148).addBox(7.4561F, -1.8561F, -9.0905F, 3.0F, 3.0F, 9.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(-33.0685F, -20.0F, 0.0F, 2.9363F, 1.1142F, -2.6601F));
		PartDefinition cube_r32 = facewing2.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(135, 193).addBox(2.9232F, -1.8561F, -8.6171F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(77, 72).addBox(-12.0768F, -0.3561F, -11.6171F, 15.0F, 0.0F, 29.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.0685F, -20.0F, 0.0F, 0.1823F, 1.0519F, 0.825F));
		PartDefinition cube_r33 = facewing2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(190, 127).addBox(3.3381F, -1.8561F, 0.7687F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-33.0685F, -20.0F, 0.0F, 0.1285F, 0.7931F, 0.7581F));
		PartDefinition cube_r34 = facewing2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(89, 32).addBox(0.1784F, -1.8561F, 12.2316F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.0685F, -20.0F, 0.0F, 0.1823F, 1.0519F, 0.825F));
		PartDefinition cube_r35 = facewing2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(248, 136).addBox(-13.8294F, -1.8561F, -12.8467F, 3.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, 0.0F, 3.0408F, -0.466F, 2.5207F));
		PartDefinition cube_r36 = facewing2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(248, 151).addBox(-10.4561F, -1.8561F, -9.0905F, 3.0F, 3.0F, 9.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, 0.0F, 2.9363F, -1.1142F, 2.6601F));
		PartDefinition cube_r37 = facewing2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(176, 255).addBox(-5.9232F, -1.8561F, -8.6171F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(87, 0).addBox(-2.9232F, -0.3561F, -11.6171F, 15.0F, 0.0F, 29.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, 0.0F, 0.1823F, -1.0519F, -0.825F));
		PartDefinition cube_r38 = facewing2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(241, 254).addBox(-6.3381F, -1.8561F, 0.7687F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, 0.0F, 0.1285F, -0.7931F, -0.7581F));
		PartDefinition cube_r39 = facewing2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(41, 124).addBox(-3.1784F, -1.8561F, 12.2316F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, 0.0F, 0.1823F, -1.0519F, -0.825F));
		PartDefinition body = partdefinition
				.addOrReplaceChild(
						"body", CubeListBuilder.create().texOffs(0, 0).addBox(-22.5F, -2.0F, -6.0F, 45.0F, 19.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(127, 128).addBox(-12.5F, 21.0F, -6.0F, 25.0F, 20.0F, 13.0F, new CubeDeformation(0.0F))
								.texOffs(0, 280).addBox(-13.5F, 41.0F, -7.0F, 27.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-17.5F, 0.0F, -9.0F, 35.0F, 21.0F, 19.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -77.5F, 0.0F));
		PartDefinition necklace = body.addOrReplaceChild("necklace", CubeListBuilder.create().texOffs(98, 84).addBox(-1.5F, -20.4744F, -1.3639F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 29.4935F, -8.8585F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r40 = necklace.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(8, 9).addBox(5.3339F, -20.1285F, -3.0055F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7505F, 0.4594F, -0.0241F, -0.0873F, 0.0F, -0.3491F));
		PartDefinition cube_r41 = necklace.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(10, 85).addBox(5.3339F, -20.276F, -1.3724F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(11.9F, -1.9935F, 0.0085F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r42 = necklace
				.addOrReplaceChild(
						"cube_r42", CubeListBuilder.create().texOffs(103, 9).addBox(4.3247F, -19.7573F, -1.3724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 32)
								.addBox(2.3247F, -20.2573F, -1.3724F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 0).addBox(1.3247F, -19.7573F, -1.3724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(9.25F, -1.7435F, 0.0085F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r43 = necklace.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(100, 72).mirror().addBox(-0.8491F, -1.487F, -0.4989F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.227F, -16.3962F, -0.9067F, -0.0897F, 0.0006F, 0.1309F));
		PartDefinition cube_r44 = necklace.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(100, 72).addBox(-0.1509F, -1.487F, -0.4989F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.227F, -16.3962F, -0.9067F, -0.0897F, -0.0006F, -0.1309F));
		PartDefinition cube_r45 = necklace.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(100, 72).addBox(1.107F, -21.1521F, -3.1451F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1757F, 2.8017F, -0.0307F, -0.0897F, -0.0006F, -0.1309F));
		PartDefinition cube_r46 = necklace.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 9).addBox(1.107F, -21.3079F, -1.4223F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(4.9F, 0.0065F, 0.0085F, -0.0024F, -0.0006F, -0.1309F));
		PartDefinition cube_r47 = necklace.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(98, 98).addBox(1.108F, -20.31F, -1.3724F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7914F, -0.4264F, 0.0085F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r48 = necklace.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(99, 95).addBox(-3.108F, -20.31F, -1.3724F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7914F, -0.4264F, 0.0085F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r49 = necklace.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(101, 41).addBox(-2.107F, -21.1521F, -3.1451F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1757F, 2.8017F, -0.0307F, -0.0897F, 0.0006F, 0.1309F));
		PartDefinition cube_r50 = necklace.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(10, 32).addBox(-4.107F, -21.3079F, -1.4223F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-4.9F, 0.0065F, 0.0085F, -0.0024F, 0.0006F, 0.1309F));
		PartDefinition cube_r51 = necklace.addOrReplaceChild(
				"cube_r51", CubeListBuilder.create().texOffs(104, 35).addBox(-2.3247F, -19.7573F, -1.3724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 44)
						.addBox(-5.3247F, -19.7573F, -1.3724F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 41).addBox(-4.3247F, -20.2573F, -1.3724F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.25F, -1.7435F, 0.0085F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r52 = necklace.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(91, 95).addBox(-8.3339F, -20.276F, -1.3724F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-11.9F, -1.9935F, 0.0085F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r53 = necklace.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(101, 32).addBox(-6.3339F, -20.1285F, -3.0055F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7505F, 0.4594F, -0.0241F, -0.0873F, 0.0F, 0.3491F));
		PartDefinition plate = body.addOrReplaceChild("plate", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 31.35F, -6.825F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r54 = plate.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(190, 199).addBox(-17.334F, 8.334F, -2.175F, 9.0F, 9.0F, 4.0F, new CubeDeformation(-1.35F)).texOffs(0, 85).addBox(1.783F, 1.9952F, -1.425F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0618F, -0.0617F, -0.7835F));
		PartDefinition cube_r55 = plate.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(248, 30).addBox(-4.5F, 9.15F, -1.175F, 9.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 161)
				.addBox(-5.5F, 0.15F, -1.425F, 11.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(212, 57).addBox(-4.0F, -1.15F, -1.325F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.101F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r56 = plate.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(88, 84).addBox(-3.783F, 1.9952F, -1.425F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0618F, 0.0617F, 0.7835F));
		PartDefinition skirt = body.addOrReplaceChild("skirt", CubeListBuilder.create().texOffs(0, 72).addBox(-2.0257F, -4.6631F, -0.3347F, 35.0F, 5.0F, 18.0F, new CubeDeformation(0.1F)), PartPose.offset(-15.4743F, 37.6631F, -7.5653F));
		PartDefinition cube_r57 = skirt.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(74, 240).addBox(0.75F, -1.0F, -0.25F, 4.0F, 34.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3946F, -0.0265F, 0.0001F, -0.1745F, 0.0175F, 0.1309F));
		PartDefinition cube_r58 = skirt.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(234, 225).addBox(-1.25F, -1.0F, -0.25F, 3.0F, 34.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4077F, -0.1885F, 0.1112F, -0.1745F, 0.0175F, 0.1309F));
		PartDefinition cube_r59 = skirt.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(190, 50).addBox(-1.5F, -1.0F, -8.0F, 3.0F, 34.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2257F, 0.3369F, 8.0653F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r60 = skirt.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(90, 219).addBox(-1.25F, -1.0F, -5.75F, 3.0F, 34.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4077F, -0.1885F, 16.0194F, 0.1745F, -0.0175F, 0.1309F));
		PartDefinition cube_r61 = skirt.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 95).addBox(0.75F, -1.0F, -2.75F, 4.0F, 34.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3946F, -0.0265F, 17.3806F, 0.1745F, -0.0175F, 0.1309F));
		PartDefinition cube_r62 = skirt.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(138, 29).addBox(-15.5F, -13.0F, -1.5F, 31.0F, 34.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4743F, 12.3369F, 18.3153F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r63 = skirt.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 240).addBox(-4.75F, -1.0F, -2.75F, 4.0F, 34.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.3433F, -0.0265F, 17.3806F, 0.1745F, 0.0175F, -0.1309F));
		PartDefinition cube_r64 = skirt.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(228, 57).addBox(-1.75F, -1.0F, -5.75F, 3.0F, 34.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.3563F, -0.1885F, 16.0194F, 0.1745F, 0.0175F, -0.1309F));
		PartDefinition cube_r65 = skirt.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(113, 193).addBox(-1.5F, -1.0F, -8.0F, 3.0F, 34.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.1743F, 0.3369F, 8.0653F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r66 = skirt.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(42, 240).addBox(-1.75F, -1.0F, -0.25F, 3.0F, 34.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.3563F, -0.1885F, 0.1112F, -0.1745F, -0.0175F, -0.1309F));
		PartDefinition cube_r67 = skirt.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(110, 243).addBox(-4.75F, -1.0F, -0.25F, 4.0F, 34.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.3433F, -0.0265F, 0.0001F, -0.1745F, -0.0175F, -0.1309F));
		PartDefinition cube_r68 = skirt.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 145).addBox(-15.5F, -13.0F, -1.5F, 31.0F, 34.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4743F, 12.3369F, -0.9347F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r69 = skirt.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 101).addBox(-2.0F, 7.5173F, -3.601F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(14.7243F, -1.7515F, -0.7783F, -0.0873F, 0.0F, 0.1745F));
		PartDefinition cube_r70 = skirt.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(14, 95).addBox(-2.0F, -2.1527F, -2.2567F, 5.0F, 10.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(14.7243F, -1.7515F, -0.7783F, -0.2618F, 0.0F, 0.1745F));
		PartDefinition cube_r71 = skirt.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(124, 258).addBox(-3.0F, 7.5173F, -3.601F, 6.0F, 18.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(16.2243F, -3.2515F, -1.2783F, -0.0873F, 0.0F, -0.1745F));
		PartDefinition cube_r72 = skirt.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 72).addBox(-3.0F, -2.1527F, -2.2567F, 6.0F, 10.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(16.2243F, -3.2515F, -1.2783F, -0.2618F, 0.0F, -0.1745F));
		PartDefinition cube_r73 = skirt.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(108, 63).addBox(-6.5F, -2.5F, -1.0F, 13.0F, 5.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(15.4743F, -2.1631F, -1.3347F, -0.1745F, 0.0F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(10, 36).addBox(5.3001F, 16.2743F, -0.9536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.1537F, -70.3912F, 1.0F, 0.1309F, 0.049F, -0.0376F));
		PartDefinition cube_r74 = left_arm.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(151, 199).addBox(-6.5F, -9.25F, -7.0F, 13.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3001F, 17.2743F, -0.9536F, -0.0436F, 0.1309F, -0.1309F));
		PartDefinition cube_r75 = left_arm.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(116, 161).addBox(-7.5F, -8.5F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1464F, 0.9154F, -0.9536F, 0.0F, 0.1309F, -0.1309F));
		PartDefinition lower_leftarm = left_arm.addOrReplaceChild("lower_leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.3001F, 19.2743F, -0.9536F, -0.132F, -0.1298F, 0.0172F));
		PartDefinition cube_r76 = lower_leftarm.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(42, 226).addBox(-4.5516F, -9.6665F, -6.6074F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(192, 225).addBox(-3.5516F, -22.6665F, -6.1074F, 10.0F, 19.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4102F, 21.9895F, -7.5595F, -0.3377F, 0.0444F, -0.1299F));
		PartDefinition hand = lower_leftarm.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(4.9522F, 16.2604F, -6.5018F, -1.0362F, -1.0554F, 1.2122F));
		PartDefinition cube_r77 = hand.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(127, 128).addBox(-1.5F, -5.1513F, -2.0542F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(6.0539F, 11.3281F, 2.2555F, 1.0613F, 0.0472F, -0.1029F));
		PartDefinition cube_r78 = hand.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(206, 27).addBox(-1.5F, -0.3879F, -2.1885F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0539F, 11.3281F, 2.2555F, 1.6285F, 0.0472F, -0.1029F));
		PartDefinition cube_r79 = hand.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(177, 66).addBox(-1.5F, -5.2625F, -1.9924F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(3.3435F, 13.367F, 1.9631F, 0.7556F, 0.0516F, -0.0988F));
		PartDefinition cube_r80 = hand.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(212, 43).addBox(-1.5F, -0.2658F, -2.1079F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3435F, 13.367F, 1.9631F, 1.2356F, 0.0516F, -0.0988F));
		PartDefinition cube_r81 = hand.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(103, 0).addBox(-1.5F, -5.2075F, -2.0245F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(0.4702F, 15.3435F, 0.967F, 0.4504F, 0.0472F, -0.1029F));
		PartDefinition cube_r82 = hand.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(178, 82).addBox(-1.5F, -0.326F, -2.1495F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4702F, 15.3435F, 0.967F, 0.974F, 0.0472F, -0.1029F));
		PartDefinition cube_r83 = hand.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(218, 148).addBox(-1.5F, -0.4515F, -2.2247F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3779F, 14.5538F, 1.8474F, 1.275F, 0.0906F, -0.1032F));
		PartDefinition cube_r84 = hand.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(68, 145).addBox(-1.5F, -5.0938F, -2.0813F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(-2.3779F, 14.5538F, 1.8474F, 0.6641F, 0.0906F, -0.1032F));
		PartDefinition cube_r85 = hand.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(239, 0).addBox(-4.4989F, -10.2627F, -3.9347F, 12.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, -0.0759F, 0.0444F, -0.1299F));
		PartDefinition cube_r86 = hand.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(113, 193).addBox(-1.8823F, -4.6681F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(-6.5244F, 5.5545F, 0.7058F, 0.1155F, 0.4353F, 0.1418F));
		PartDefinition cube_r87 = hand.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(187, 0).addBox(-1.8823F, -0.3319F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5244F, 5.5545F, 0.7058F, -0.051F, 0.4467F, -0.2445F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 36).addBox(-6.3001F, 16.2743F, -0.9536F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.1537F, -70.3912F, 1.0F, 0.1309F, -0.049F, 0.0376F));
		PartDefinition cube_r88 = right_arm.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(195, 100).addBox(-6.5F, -9.25F, -7.0F, 13.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3001F, 17.2743F, -0.9536F, -0.0436F, -0.1309F, 0.1309F));
		PartDefinition cube_r89 = right_arm.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(68, 145).addBox(-8.5F, -8.5F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1464F, 0.9154F, -0.9536F, 0.0F, -0.1309F, 0.1309F));
		PartDefinition lower_rightarm = right_arm.addOrReplaceChild("lower_rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.3001F, 19.2743F, -0.9536F, -0.132F, 0.1298F, -0.0172F));
		PartDefinition cube_r90 = lower_rightarm.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(88, 72).addBox(-1.5F, -6.55F, -4.45F, 3.0F, 6.0F, 6.0F, new CubeDeformation(-0.87F)),
				PartPose.offsetAndRotation(-9.4214F, 40.5385F, -16.8706F, -1.1231F, -0.0444F, 0.1299F));
		PartDefinition cube_r91 = lower_rightarm.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(0, 32).addBox(-7.9484F, 5.8335F, -2.1074F, 2.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(156, 248).addBox(-7.9484F, -4.1665F, -3.1074F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.293F, 21.6342F, -8.929F, -0.3377F, -0.0444F, 0.1299F));
		PartDefinition cube_r92 = lower_rightarm.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(212, 43).addBox(-7.4484F, -9.6665F, -6.6074F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 220).addBox(-6.4484F, -22.6665F, -6.1074F, 10.0F, 19.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4102F, 21.9895F, -7.5595F, -0.3377F, -0.0444F, 0.1299F));
		PartDefinition hand2 = lower_rightarm.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9522F, 16.2604F, -6.5018F, -1.0362F, 1.0554F, -1.2122F));
		PartDefinition cube_r93 = hand2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(110, 101).addBox(-1.5F, -5.1513F, -2.0542F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(-6.0539F, 11.3281F, 2.2555F, 1.0613F, -0.0472F, 0.1029F));
		PartDefinition cube_r94 = hand2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(195, 100).addBox(-1.5F, -0.3879F, -2.1885F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0539F, 11.3281F, 2.2555F, 1.6285F, -0.0472F, 0.1029F));
		PartDefinition cube_r95 = hand2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(146, 0).addBox(-1.5F, -5.2625F, -1.9924F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(-3.3435F, 13.367F, 1.9631F, 0.7556F, -0.0516F, 0.0988F));
		PartDefinition cube_r96 = hand2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(113, 201).addBox(-1.5F, -0.2658F, -2.1079F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3435F, 13.367F, 1.9631F, 1.2356F, -0.0516F, 0.0988F));
		PartDefinition cube_r97 = hand2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -5.2075F, -2.0245F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(-0.4702F, 15.3435F, 0.967F, 0.4504F, -0.0472F, 0.1029F));
		PartDefinition cube_r98 = hand2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(110, 110).addBox(-1.5F, -0.326F, -2.1495F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4702F, 15.3435F, 0.967F, 0.974F, -0.0472F, 0.1029F));
		PartDefinition cube_r99 = hand2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(205, 0).addBox(-1.5F, -0.4515F, -2.2247F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3779F, 14.5538F, 1.8474F, 1.275F, -0.0906F, 0.1032F));
		PartDefinition cube_r100 = hand2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(14, 114).addBox(-1.5F, -5.0938F, -2.0813F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(2.3779F, 14.5538F, 1.8474F, 0.6641F, -0.0906F, 0.1032F));
		PartDefinition cube_r101 = hand2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(236, 187).addBox(-7.5011F, -10.2627F, -3.9347F, 12.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, -0.0759F, -0.0444F, 0.1299F));
		PartDefinition cube_r102 = hand2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(178, 90).addBox(-1.1177F, -4.6681F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.005F)),
				PartPose.offsetAndRotation(6.5244F, 5.5545F, 0.7058F, 0.1155F, -0.4353F, -0.1418F));
		PartDefinition cube_r103 = hand2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(0, 182).addBox(-1.1177F, -0.3319F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5244F, 5.5545F, 0.7058F, -0.051F, -0.4467F, 0.2445F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(203, 127).addBox(-5.75F, 47.5F, -6.5F, 13.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(234, 98).addBox(-5.75F, 48.5F, -16.5F, 13.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, -29.5F, 0.75F));
		PartDefinition cube_r104 = left_leg.addOrReplaceChild("cube_r104",
				CubeListBuilder.create().texOffs(38, 210).addBox(-7.0F, 7.5F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 182).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 36.0F, 0.0F, 0.1308F, 0.0057F, -0.0433F));
		PartDefinition cube_r105 = left_leg.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(127, 84).addBox(-9.0F, -13.0F, -8.5F, 17.0F, 27.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 12.0F, -0.75F, -0.0815F, -0.1308F, -0.044F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(203, 127).mirror().addBox(-7.25F, 47.5F, -6.5F, 13.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(234, 98).mirror()
				.addBox(-7.25F, 48.5F, -16.5F, 13.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-10.0F, -29.5F, 0.75F));
		PartDefinition cube_r106 = right_leg.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 210).mirror().addBox(-7.0F, 7.5F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 182).mirror()
				.addBox(-6.5F, -12.0F, -6.5F, 13.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 36.0F, 0.0F, 0.1308F, -0.0057F, 0.0433F));
		PartDefinition cube_r107 = right_leg.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(127, 84).mirror().addBox(-8.0F, -13.0F, -8.5F, 17.0F, 27.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 12.0F, -0.75F, -0.0815F, 0.1308F, 0.044F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
