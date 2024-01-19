
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.client.model.ModelJogoModel;

public class JogoRenderer extends MobRenderer<JogoEntity, ModelJogoModel<JogoEntity>> {
	public JogoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJogoModel(context.bakeLayer(ModelJogoModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JogoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/jogotexture.png");
	}
}
