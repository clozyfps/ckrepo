
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.InventoryCurseMobEntity;
import net.mcreator.craftkaisen.client.model.ModelInventoryCurse;

public class InventoryCurseMobRenderer extends MobRenderer<InventoryCurseMobEntity, ModelInventoryCurse<InventoryCurseMobEntity>> {
	public InventoryCurseMobRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInventoryCurse(context.bakeLayer(ModelInventoryCurse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InventoryCurseMobEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/invcursetex.png");
	}
}
