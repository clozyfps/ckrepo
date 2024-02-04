
package net.mcreator.craftkaisen.client.renderer;

public class BindingIceBlockRenderer extends MobRenderer<BindingIceBlockEntity, ModelIceBlock<BindingIceBlockEntity>> {

	public BindingIceBlockRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIceBlock(context.bakeLayer(ModelIceBlock.LAYER_LOCATION)), 0f);

	}

	@Override
	public ResourceLocation getTextureLocation(BindingIceBlockEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/bindingicetexture.png");
	}

}
