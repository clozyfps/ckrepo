package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class KaichiWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0.82 0.94 0.15 2 ^0 ^0 ^0 0.3 0.4 0.3 0 55");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 1, 0.1, 1, 0.1, 0.7);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, x, y, z, 5, 0.1, 1, 0.1, 0.7);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 1, 0.1, 1, 0.1, 0);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator) && !(immediatesourceentity == entityiterator)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))),
							immediatesourceentity, entity), (float) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 7));
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2,
									0.1);
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2, 0.1);
					}
				}
			}
		}
		immediatesourceentity.setNoGravity(true);
		CraftKaisenMod.queueServerWork(100, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}
