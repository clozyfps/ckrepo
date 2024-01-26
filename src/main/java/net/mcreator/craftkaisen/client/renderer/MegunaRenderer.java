
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.client.model.ModelMeguna;

public class MegunaRenderer extends MobRenderer<MegunaEntity, ModelMeguna<MegunaEntity>> {
	public MegunaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMeguna(context.bakeLayer(ModelMeguna.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MegunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/megunatexture.png");
	}
}
