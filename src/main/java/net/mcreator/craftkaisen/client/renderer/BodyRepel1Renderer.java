
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BodyRepel1Entity;
import net.mcreator.craftkaisen.client.model.Modelbodyrepel1;

public class BodyRepel1Renderer extends MobRenderer<BodyRepel1Entity, Modelbodyrepel1<BodyRepel1Entity>> {
	public BodyRepel1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbodyrepel1(context.bakeLayer(Modelbodyrepel1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BodyRepel1Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/bodyrepeltex.png");
	}
}
