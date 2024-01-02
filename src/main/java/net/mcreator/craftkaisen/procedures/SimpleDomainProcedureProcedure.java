package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class SimpleDomainProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()))) {
			if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN_COOLDOWN.get()))) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get(), 1000, 1, false, false));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Given Simple Domain"), true);
				entity.getPersistentData().putDouble("simpledomainlevel", 4);
			}
		} else if (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get())
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()) ? _livEnt.getEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()).getDuration() : 0) < 1000) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get());
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Removed Simple Domain"), false);
		}
	}
}
