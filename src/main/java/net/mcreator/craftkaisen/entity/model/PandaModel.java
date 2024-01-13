package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.entity.PandaEntity;

public class PandaModel extends GeoModel<PandaEntity> {
	@Override
	public ResourceLocation getAnimationResource(PandaEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/pandacurse.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PandaEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/pandacurse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PandaEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}
