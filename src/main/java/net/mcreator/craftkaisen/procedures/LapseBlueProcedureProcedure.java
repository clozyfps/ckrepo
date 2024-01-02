package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class LapseBlueProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get()))) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftKaisenModMobEffects.COOLDOWN.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get(), 99999, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 250, 0, false, false));
			}
		} else if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get());
		}
	}
}
