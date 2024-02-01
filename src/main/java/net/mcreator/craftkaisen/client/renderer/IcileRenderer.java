
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.IcileEntity;
import net.mcreator.craftkaisen.client.model.Modelwintryicles;

public class IcileRenderer extends MobRenderer<IcileEntity, Modelwintryicles<IcileEntity>> {
	public IcileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwintryicles(context.bakeLayer(Modelwintryicles.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IcileEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/wintryiceles.png");
	}
}
