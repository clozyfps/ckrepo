
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.client.model.Modelmalevolentshrine;

public class MalevolentShrineRenderer extends MobRenderer<MalevolentShrineEntity, Modelmalevolentshrine<MalevolentShrineEntity>> {
	public MalevolentShrineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmalevolentshrine(context.bakeLayer(Modelmalevolentshrine.LAYER_LOCATION)), 20f);
	}

	@Override
	public ResourceLocation getTextureLocation(MalevolentShrineEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/shrinetextureeeeeeeee.png");
	}
}
