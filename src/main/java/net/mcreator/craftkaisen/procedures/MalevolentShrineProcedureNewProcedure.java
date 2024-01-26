package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MalevolentShrineProcedureNewProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("domain")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 500) {
				{
					double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 500;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentCursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					entity.getPersistentData().putBoolean("domain", true);
				});
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:sukunadomain")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:sukunadomain")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 35, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 35, 250, false, false));
				CraftKaisenMod.queueServerWork(20, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:bell")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:bell")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					CraftKaisenMod.queueServerWork(25, () -> {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MalevolentShrineEntity(CraftKaisenModEntities.MALEVOLENT_SHRINE.get(), _level);
							entityToSpawn.moveTo((entity.getX() - 3), (entity.getY() - 1), (entity.getZ() - 3), 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						CraftKaisenMod.queueServerWork(10, () -> {
							if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty()) {
								if (((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
							}
						});
					});
				});
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("You need " + new java.text.DecimalFormat("##.##").format(500) + " cursed energy to use this move.")), true);
			}
		} else if (entity.getPersistentData().getBoolean("domain")) {
			CraftKaisenMod.queueServerWork(1, () -> {
				entity.getPersistentData().putBoolean("domain", false);
				if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
					if (((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
							if (!((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
								((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
						}
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 2500, 0, false, false));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Burnout"), true);
			});
		}
	}
}
