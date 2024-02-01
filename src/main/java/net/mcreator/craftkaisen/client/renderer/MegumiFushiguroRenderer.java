
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MegumiFushiguroEntity;
import net.mcreator.craftkaisen.client.model.ModelMegumiFushiguro;

public class MegumiFushiguroRenderer extends MobRenderer<MegumiFushiguroEntity, ModelMegumiFushiguro<MegumiFushiguroEntity>> {
	public MegumiFushiguroRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMegumiFushiguro(context.bakeLayer(ModelMegumiFushiguro.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MegumiFushiguroEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/megumifushigurotexture.png");
	}
}
