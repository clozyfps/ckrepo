
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BodyRepel3Entity;
import net.mcreator.craftkaisen.client.model.Modelrepelpink;

public class BodyRepel3Renderer extends MobRenderer<BodyRepel3Entity, Modelrepelpink<BodyRepel3Entity>> {
	public BodyRepel3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelrepelpink(context.bakeLayer(Modelrepelpink.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BodyRepel3Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/pinkrepel.png");
	}
}
