
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;
import net.mcreator.craftkaisen.client.model.ModelMahoraga;

import com.mojang.blaze3d.vertex.PoseStack;

public class EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer extends MobRenderer<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity, ModelMahoraga<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity>> {
	public EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMahoraga(context.bakeLayer(ModelMahoraga.LAYER_LOCATION)), 2f);
	}

	@Override
	protected void scale(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/mahoragatexture.png");
	}
}
