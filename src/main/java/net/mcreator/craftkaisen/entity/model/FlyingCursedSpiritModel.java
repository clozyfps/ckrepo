package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FlyingCursedSpiritModel extends GeoModel<FlyingCursedSpiritEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/flyingcurse.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/flyingcurse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}