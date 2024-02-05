package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ShinjukuGojoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SatoruGojoOnEntityTickUpdateProcedure.execute(world, x, y, z, entity);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 4, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999999, 2, false, false));
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.002) {
				if (!(entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(CraftKaisenModMobEffects.EVADE_COOLDOWN.get()))) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 800) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.67 0.2 0.84 3 ^0 ^0 ^0 10 5 10 0 95");
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 100, 10, 5, 10, 0.2);
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 25, Level.ExplosionInteraction.BLOCK);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 150, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.EVADE_COOLDOWN.get(), 999999, 0, false, false));
					}
				}
			}
		}
	}
}
