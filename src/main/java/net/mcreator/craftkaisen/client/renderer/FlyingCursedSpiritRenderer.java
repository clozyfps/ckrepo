
package net.mcreator.craftkaisen.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftkaisen.entity.model.FlyingCursedSpiritModel;
import net.mcreator.craftkaisen.entity.FlyingCursedSpiritEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FlyingCursedSpiritRenderer extends GeoEntityRenderer<FlyingCursedSpiritEntity> {
	public FlyingCursedSpiritRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FlyingCursedSpiritModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(FlyingCursedSpiritEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FlyingCursedSpiritEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
