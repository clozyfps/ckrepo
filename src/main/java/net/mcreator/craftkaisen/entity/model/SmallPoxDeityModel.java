package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class SmallPoxDeityModel extends GeoModel<SmallPoxDeityEntity> {
	@Override
	public ResourceLocation getAnimationResource(SmallPoxDeityEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/smallpoxdiety.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SmallPoxDeityEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/smallpoxdiety.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SmallPoxDeityEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}