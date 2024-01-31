package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RemoveAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!(sourceentity instanceof Player || sourceentity instanceof ServerPlayer)) {
			if (sourceentity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftKaisenModMobEffects.STOP_ATTACKS.get())) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftKaisenModMobEffects.STOP_ATTACKS.get());
			}
		}
	}
}
