package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FloatingTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("floating")) {
			if (entity.getPersistentData().getDouble("floatingstage") == 0) {
				entity.getPersistentData().putDouble("floatingtick", (entity.getPersistentData().getDouble("floatingtick") + 1));
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 5, 0, false, false));
				if (entity.getPersistentData().getDouble("floatingtick") >= 100) {
					entity.getPersistentData().putDouble("floatingtick", 0);
					entity.getPersistentData().putDouble("floatingstage", 1);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Throughout Heaven And Earth, I alone am the honored one."), false);
					entity.setDeltaMovement(new Vec3(0, 0, 0));
				}
			}
			if (entity.getPersistentData().getDouble("floatingstage") == 1) {
				entity.getPersistentData().putDouble("floatingtick", (entity.getPersistentData().getDouble("floatingtick") + 1));
				if (!entity.getPersistentData().getBoolean("sentheaven")) {
					entity.getPersistentData().putBoolean("sentheaven", true);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Throughout Heaven And Earth, I alone am the honored one."), false);
				}
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				if (entity.getPersistentData().getDouble("floatingtick") >= 100) {
					entity.getPersistentData().putDouble("floatingtick", 0);
					entity.getPersistentData().putBoolean("sentheaven", false);
					entity.getPersistentData().putBoolean("purplegojo", true);
					entity.getPersistentData().putDouble("floatingstage", 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 5, 2, 2, 2, 0);
				}
			}
		}
	}
}
