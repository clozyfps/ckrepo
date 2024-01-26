
package net.mcreator.craftkaisen.client.renderer;

public class MegunaRenderer extends MobRenderer<MegunaEntity, ModelMeguna<MegunaEntity>> {

	public MegunaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMeguna(context.bakeLayer(ModelMeguna.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MegunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/megunatexture.png");
	}

}
