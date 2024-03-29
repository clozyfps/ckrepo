
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.client.model.ModelFingerBearernew;

import com.mojang.blaze3d.vertex.PoseStack;

public class FingerBearerRenderer extends MobRenderer<FingerBearerEntity, ModelFingerBearernew<FingerBearerEntity>> {
	public FingerBearerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFingerBearernew(context.bakeLayer(ModelFingerBearernew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(FingerBearerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.03f, 1.03f, 1.03f);
	}

	@Override
	public ResourceLocation getTextureLocation(FingerBearerEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/fingerbearertexture.png");
	}
}
