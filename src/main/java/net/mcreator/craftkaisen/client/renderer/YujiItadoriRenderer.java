
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.YujiItadoriDisplayConditionProcedure;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.client.model.ModelYujikuna;
import net.mcreator.craftkaisen.client.model.ModelItadoriYuji;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class YujiItadoriRenderer extends MobRenderer<YujiItadoriEntity, ModelItadoriYuji<YujiItadoriEntity>> {
	public YujiItadoriRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelItadoriYuji(context.bakeLayer(ModelItadoriYuji.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<YujiItadoriEntity, ModelItadoriYuji<YujiItadoriEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craft_kaisen:textures/entities/yujikunatexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, YujiItadoriEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (YujiItadoriDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelYujikuna(Minecraft.getInstance().getEntityModels().bakeLayer(ModelYujikuna.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(YujiItadoriEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/itadoriyujitexture.png");
	}
}
