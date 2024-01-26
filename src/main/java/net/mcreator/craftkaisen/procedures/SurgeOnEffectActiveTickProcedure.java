package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SurgeOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof YutaOkkotsuEntity) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.94 0.41 0.78 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
		}
		if (entity instanceof HajimeKashimoEntity
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()) ? _livEnt.getEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()).getDuration() : 0) >= 8930) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.72 0.37 0.95 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY_PARTICLE.get()), x, y, z, 10, 4, 7, 4, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLASH, x, y, z, 2, 3, 3, 3, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 1, 5, 4, 5, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (entity instanceof HajimeKashimoEntity
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()) ? _livEnt.getEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()).getDuration() : 0) < 8930) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY_PARTICLE.get()), x, y, z, 1, 0.1, 2, 0.1, 0);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.72 0.37 0.95 1 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 10, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5, 0, false, false));
		}
	}
}
