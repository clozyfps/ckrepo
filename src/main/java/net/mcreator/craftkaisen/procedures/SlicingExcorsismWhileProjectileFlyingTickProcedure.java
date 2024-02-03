package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SlicingExcorsismWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 1 0 0 4 ^0 ^0 ^0 0.2 0.1 0.2 0 5");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x, y, z, 1, 0.1, 1, 0.1, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD.get()), x, y, z, 25, 0.1, 1, 0.1, 0.3);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, x, y, z, 5, 0.7, 1, 0.7, 0);
		immediatesourceentity.setNoGravity(true);
		CraftKaisenMod.queueServerWork(40, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:blood_damage"))),
							immediatesourceentity, entity), (float) ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.1, 1, 0.1, 0);
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
