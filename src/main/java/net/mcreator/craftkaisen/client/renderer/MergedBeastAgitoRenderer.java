
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MergedBeastAgitoEntity;
import net.mcreator.craftkaisen.client.model.ModelMergedBeastAgito;

public class MergedBeastAgitoRenderer extends MobRenderer<MergedBeastAgitoEntity, ModelMergedBeastAgito<MergedBeastAgitoEntity>> {
	public MergedBeastAgitoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMergedBeastAgito(context.bakeLayer(ModelMergedBeastAgito.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MergedBeastAgitoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/mergedbeastagitotexture.png");
	}
}
