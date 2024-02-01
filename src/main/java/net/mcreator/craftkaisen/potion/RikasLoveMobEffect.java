
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.RikasLoveOnEffectActiveTickProcedure;

public class RikasLoveMobEffect extends MobEffect {
	public RikasLoveMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.rikas_love";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RikasLoveOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
