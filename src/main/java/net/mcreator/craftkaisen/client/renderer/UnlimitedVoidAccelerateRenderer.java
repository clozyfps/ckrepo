
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.entity.UnlimitedVoidAccelerateEntity;
import net.mcreator.craftkaisen.client.model.ModelVoidAccelerate;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class UnlimitedVoidAccelerateRenderer extends MobRenderer<UnlimitedVoidAccelerateEntity, ModelVoidAccelerate<UnlimitedVoidAccelerateEntity>> {
	public UnlimitedVoidAccelerateRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVoidAccelerate(context.bakeLayer(ModelVoidAccelerate.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<UnlimitedVoidAccelerateEntity, ModelVoidAccelerate<UnlimitedVoidAccelerateEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craft_kaisen:textures/entities/voidacceleratetexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, UnlimitedVoidAccelerateEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelVoidAccelerate(Minecraft.getInstance().getEntityModels().bakeLayer(ModelVoidAccelerate.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(UnlimitedVoidAccelerateEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/a2ie_layer_2.png");
	}

	@Override
	protected boolean isBodyVisible(UnlimitedVoidAccelerateEntity entity) {
		return false;
	}
}
