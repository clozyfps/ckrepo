package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RikaAttacksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("releaserika")) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (Math.random() < 0.004) {
					if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
						entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 4),
								(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 4), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 4)));
						CraftKaisenMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, (entity.getX()), (entity.getY()), (entity.getZ()), 10, 3, 3, 3, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 4, 3, 4, 0);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entityiterator)) {
										entityiterator.hurt(
												new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)),
												17);
										world.levelEvent(2001, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Block.getId(Blocks.RED_CONCRETE.defaultBlockState()));
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")),
														SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")), SoundSource.NEUTRAL, 1,
														1, false);
											}
										}
									}
								}
							}
						});
					}
				}
			}
		}
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("release")
					|| (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("releaserika")) {
				if (entity.getY() >= (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.7) {
					entity.setDeltaMovement(new Vec3((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() - entity.getX()) / 4),
							(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() - entity.getY()) / 4),
							(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() - entity.getZ()) / 4)));
					{
						Entity _ent = entity;
						_ent.teleportTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		}
	}
}
