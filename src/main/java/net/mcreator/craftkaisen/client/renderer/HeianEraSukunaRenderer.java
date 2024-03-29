
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.client.model.ModelTrueSukuna;

public class HeianEraSukunaRenderer extends MobRenderer<HeianEraSukunaEntity, ModelTrueSukuna<HeianEraSukunaEntity>> {
	public HeianEraSukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTrueSukuna(context.bakeLayer(ModelTrueSukuna.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeianEraSukunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/truesukunatexture.png");
	}
}
