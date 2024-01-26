
package net.mcreator.craftkaisen.client.renderer;

public class MegumiFushiguroRenderer extends MobRenderer<MegumiFushiguroEntity, ModelMegumiFushiguro<MegumiFushiguroEntity>> {

	public MegumiFushiguroRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMegumiFushiguro(context.bakeLayer(ModelMegumiFushiguro.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MegumiFushiguroEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/megumifushigurotexture.png");
	}

}
