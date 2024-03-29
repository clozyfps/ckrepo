package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RyomenSukunaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double move = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.STOP_ATTACKS.get()))) {
			if (entity.getPersistentData().getDouble("cooldown") >= 1) {
				entity.getPersistentData().putDouble("cooldown", (entity.getPersistentData().getDouble("cooldown") - 1));
			}
			if (entity.getPersistentData().getDouble("domainCooldown") >= 1) {
				entity.getPersistentData().putDouble("domainCooldown", (entity.getPersistentData().getDouble("domainCooldown") - 3));
			}
			if (entity.getPersistentData().getDouble("dashAttack") >= 1) {
				if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
						}
					}
				}
				entity.getPersistentData().putDouble("dashAttack", (entity.getPersistentData().getDouble("dashAttack") - 1));
				if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
					if (Math.random() < 0.7) {
						entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 3),
								(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 3), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 3)));
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 0.1, 0.1, 0.1, 1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.2, (entityiterator.getBbHeight()), 0.2, 0.1);
							world.levelEvent(2001, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), Block.getId(Blocks.RED_CONCRETE.defaultBlockState()));
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("dismantleSphere") == true) {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
				entity.getPersistentData().putDouble("sphereSize", (entity.getPersistentData().getDouble("sphereSize") + 1));
				{
					// Get the radius of the sphere
					double radius = (entity.getPersistentData().getDouble("sphereSize") / 10); // 3 blocks
					// Set the tolerance for how close to the surface a point must be to create a particle
					double tolerance = 0.005; // 0.1 blocks
					for (double xx = -radius; xx <= radius; xx += 0.1) {
						for (double yy = -radius; yy <= radius; yy += 0.1) {
							for (double zz = -radius; zz <= radius; zz += 0.1) {
								if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
									// Calculate the position of the particle
									double posX = x + xx;
									double posY = y + yy;
									double posZ = z + zz;
									if (true) {
										if (world instanceof ServerLevel)
											((ServerLevel) world).sendParticles(ParticleTypes.SWEEP_ATTACK, posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
									} else {
										world.addParticle(ParticleTypes.SWEEP_ATTACK, posX, posY, posZ, 0, 0, 0);
									}
								}
							}
						}
					}
				}
				int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("sphereSize") / 10) - 1;
				int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("sphereSize") / 30) - 1;
				int yIterationsSphere = verticalRadiusSphere;
				for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
					for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
						for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
							double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
									+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
							if (distanceSq <= 1.0) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x + xi, y + i, z + zi, 3, 0.1, 0.1, 0.1, 1);
								world.destroyBlock(BlockPos.containing(x + xi, y + i, z + zi), false);
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("sphereSize") / 10) / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.setDeltaMovement(new Vec3(((entityiterator.getX() - entity.getX()) / 12), ((entityiterator.getY() - entity.getY()) / 12), ((entityiterator.getZ() - entity.getZ()) / 12)));
						}
					}
				}
				if (entity.getPersistentData().getDouble("sphereSize") >= 60) {
					entity.getPersistentData().putBoolean("dismantleSphere", false);
				}
			}
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				if (entity.getPersistentData().getDouble("cooldown") == 0) {
					move = Mth.nextInt(RandomSource.create(), 1, 6);
					if (move == 1) {
						entity.getPersistentData().putString("currentmoveactive", "Dismantle");
						DismantleProcedureSukunaProcedure.execute(world, entity);
						entity.getPersistentData().putDouble("cooldown", 40);
					} else if (move == 2) {
						entity.getPersistentData().putBoolean("dismantleSphere", true);
						entity.getPersistentData().putString("currentmoveactive", "OutwardDismantle");
						entity.getPersistentData().putDouble("sphereSize", 0);
						entity.getPersistentData().putDouble("cooldown", 100);
					} else if (move == 3) {
						entity.getPersistentData().putString("currentmoveactive", "Dismantle");
						DismantleProcedureSukunaProcedure.execute(world, entity);
						CraftKaisenMod.queueServerWork(20, () -> {
							DismantleProcedureSukunaProcedure.execute(world, entity);
							entity.getPersistentData().putString("currentmoveactive", "Dismantle");
							CraftKaisenMod.queueServerWork(20, () -> {
								DismantleProcedureSukunaProcedure.execute(world, entity);
								entity.getPersistentData().putString("currentmoveactive", "Dismantle");
							});
						});
						entity.getPersistentData().putDouble("cooldown", 80);
					} else if (move == 4) {
						entity.getPersistentData().putDouble("dashAttack", 60);
						entity.getPersistentData().putDouble("cooldown", 80);
					} else if (move == 5) {
						if (Math.random() < 0.07) {
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.PRE_FIRE_ARROW.get(), 60, 1, false, false));
						}
						CraftKaisenMod.queueServerWork(50, () -> {
							entity.getPersistentData().putString("currentmoveactive", "Fire Arrow");
						});
						entity.getPersistentData().putDouble("cooldown", 80);
					} else if (move == 6) {
						entity.getPersistentData().putDouble("cooldown", 80);
					}
				}
				if (Math.random() < 0.1) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 250) {
						if (!entity.getPersistentData().getBoolean("useddomain")) {
							entity.getPersistentData().putBoolean("useddomain", true);
							entity.getPersistentData().putString("currentmoveactive", "Malevolent Shrine");
							MalevolentShrineSukunaProcedure.execute(world, x, y, z, entity);
						}
					}
				}
				if (Math.random() < 0.001) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 15, 4, false, false));
				}
				if (Math.random() < 0.003) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.THROUGH_BLOCKS.get(), 15, 4, false, false));
				}
				if (Math.random() < 0.009) {
					DismantleProcedureSukunaProcedure.execute(world, entity);
				}
				if (Math.random() < 0.008) {
					{
						final Vec3 _center = new Vec3(
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(9)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(9)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(9)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.CLEAVE.get(), 15, 0, false, false));
							}
						}
					}
				}
			}
		}
	}
}
