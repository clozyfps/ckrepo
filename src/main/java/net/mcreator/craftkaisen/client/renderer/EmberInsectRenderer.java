
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.EmberInsectEntity;
import net.mcreator.craftkaisen.client.model.ModelEmberInsect;

public class EmberInsectRenderer extends MobRenderer<EmberInsectEntity, ModelEmberInsect<EmberInsectEntity>> {
	public EmberInsectRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEmberInsect(context.bakeLayer(ModelEmberInsect.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmberInsectEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/emberinsecttexture.png");
	}
}
