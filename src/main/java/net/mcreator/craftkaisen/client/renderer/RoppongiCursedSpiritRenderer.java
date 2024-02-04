
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.client.model.ModelRoppongiCurse;

public class RoppongiCursedSpiritRenderer extends MobRenderer<RoppongiCursedSpiritEntity, ModelRoppongiCurse<RoppongiCursedSpiritEntity>> {
	public RoppongiCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRoppongiCurse(context.bakeLayer(ModelRoppongiCurse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoppongiCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/roppongicursetexture.png");
	}
}
