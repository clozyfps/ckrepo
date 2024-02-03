package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class IceTickingWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (!(entity instanceof UraumeEntity)) {
			CraftKaisenMod.queueServerWork(100, () -> {
				if (!immediatesourceentity.level.isClientSide())
					immediatesourceentity.discard();
			});
			immediatesourceentity.setNoGravity(true);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, 90, 3, 3, 3, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.SNOWFLAKE.get()), x, y, z, 15, 3, 3, 3, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 60, 3, 3, 3, 0.3);
			if (entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel && _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:potentional"))).isDone()) {
				if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput < 100) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								if (!(immediatesourceentity == entityiterator)) {
									world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() + 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE), immediatesourceentity, entity),
											(float) (8 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 5));
								}
							}
						}
					}
				} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput >= 100) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								if (!(immediatesourceentity == entityiterator)) {
									world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() + 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE), immediatesourceentity, entity),
											(float) (6 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 4));
								}
							}
						}
					}
					int horizontalRadiusSphere = (int) 10 - 1;
					int verticalRadiusSphere = (int) 10 - 1;
					int yIterationsSphere = verticalRadiusSphere;
					for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
						for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
							for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
								double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
										+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
								if (distanceSq <= 1.0) {
									if (!((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.ICE.defaultBlockState(), 3);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.POOF, x + xi, y + i, z + zi, 5, 0.1, 2, 0.1, 1);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.EXPLOSION, x + xi, y + i, z + zi, 1, 0.1, 2, 0.1, 0);
									}
								}
							}
						}
					}
				}
			} else {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							if (!(immediatesourceentity == entityiterator)) {
								world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() + 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE), immediatesourceentity, entity),
										(float) (8 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 5));
							}
						}
					}
				}
			}
		} else {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!(immediatesourceentity == entityiterator)) {
							world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() + 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()), Blocks.ICE.defaultBlockState(), 3);
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FREEZE), immediatesourceentity, entity), 16);
						}
					}
				}
			}
		}
	}
}
