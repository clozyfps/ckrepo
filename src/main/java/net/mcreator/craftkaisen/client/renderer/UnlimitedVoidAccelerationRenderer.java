
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.UnlimitedVoidAccelerationEntity;
import net.mcreator.craftkaisen.client.model.ModelVoidAccelerate;

public class UnlimitedVoidAccelerationRenderer extends MobRenderer<UnlimitedVoidAccelerationEntity, ModelVoidAccelerate<UnlimitedVoidAccelerationEntity>> {
	public UnlimitedVoidAccelerationRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVoidAccelerate(context.bakeLayer(ModelVoidAccelerate.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnlimitedVoidAccelerationEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/voidacceleratetexture.png");
	}
}
