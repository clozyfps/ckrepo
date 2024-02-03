
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BindingIceBlockEntity;
import net.mcreator.craftkaisen.client.model.ModelIceBlock;

public class BindingIceBlockRenderer extends MobRenderer<BindingIceBlockEntity, ModelIceBlock<BindingIceBlockEntity>> {
	public BindingIceBlockRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIceBlock(context.bakeLayer(ModelIceBlock.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BindingIceBlockEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/bindingicetexture.png");
	}
}
