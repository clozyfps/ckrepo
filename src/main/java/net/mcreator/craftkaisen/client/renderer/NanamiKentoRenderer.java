
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.craftkaisen.procedures.NanamiKentoDisplayConditionProcedure;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NanamiKentoRenderer extends HumanoidMobRenderer<NanamiKentoEntity, HumanoidModel<NanamiKentoEntity>> {
	public NanamiKentoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<NanamiKentoEntity, HumanoidModel<NanamiKentoEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craft_kaisen:textures/entities/nanami-kento-on-planetminecraft-com.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, NanamiKentoEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (NanamiKentoDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NanamiKentoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/kento-nanami-by-user-buhh-steve-model-on-planetminecraft-com.png");
	}
}
