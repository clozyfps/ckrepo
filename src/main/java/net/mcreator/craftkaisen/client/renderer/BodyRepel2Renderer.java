
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BodyRepel2Entity;
import net.mcreator.craftkaisen.client.model.Modelbodyrepelpincer;

public class BodyRepel2Renderer extends MobRenderer<BodyRepel2Entity, Modelbodyrepelpincer<BodyRepel2Entity>> {
	public BodyRepel2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbodyrepelpincer(context.bakeLayer(Modelbodyrepelpincer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BodyRepel2Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/bodyrepelpincer.png");
	}
}
