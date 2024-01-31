package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleProjectileProjectileEntity;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class HollowPurpleTickProcedure {
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
		if (entity instanceof SatoruGojoEntity) {
			if (entity.getPersistentData().getDouble("hollowPurple") > 0) {
				entity.getPersistentData().putDouble("hollowPurple", (entity.getPersistentData().getDouble("hollowPurple") - 1));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get()), x, y, z, 1, 1.5, 1, 1.5, 1);
				if (entity.getPersistentData().getDouble("hollowPurple") >= 1) {
					if (entity.getPersistentData().getBoolean("initial") != true) {
						entity.getPersistentData().putDouble("hollowDistance", 4.5);
						entity.getPersistentData().putBoolean("initial", true);
					}
					{
						// Get the radius of the sphere
						double radius = 1; // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = Math.round(x - entity.getPersistentData().getDouble("hollowDistance") * Math.sin(Math.toRadians(entity.getYRot() - 90))) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = Math.round(z + entity.getPersistentData().getDouble("hollowDistance") * Math.cos(Math.toRadians(entity.getYRot() - 90))) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = 1; // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = Math.round(x - entity.getPersistentData().getDouble("hollowDistance") * Math.sin(Math.toRadians(entity.getYRot() + 90))) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = Math.round(z + entity.getPersistentData().getDouble("hollowDistance") * Math.cos(Math.toRadians(entity.getYRot() + 90))) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					entity.getPersistentData().putDouble("hollowDistance", (entity.getPersistentData().getDouble("hollowDistance") - 0.12857143));
				}
				if (entity.getPersistentData().getDouble("hollowPurple") == 1) {
					if (Math.sin(Math.toRadians(entity.getXRot())) < 0) {
						int horizontalRadiusHemiTop = (int) 10 - 1;
						int verticalRadiusHemiTop = (int) 10;
						int yIterationsHemiTop = verticalRadiusHemiTop;
						for (int i = 0; i < yIterationsHemiTop; i++) {
							if (i == verticalRadiusHemiTop) {
								continue;
							}
							for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
								for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
									double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
											+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
									if (distanceSq <= 1.0) {
										{
											BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
											BlockState _bs = Blocks.AIR.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								}
							}
						}
					} else {
						int horizontalRadiusSphere = (int) 10 - 1;
						int verticalRadiusSphere = (int) 10 - 1;
						int yIterationsSphere = verticalRadiusSphere;
						for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
							for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
								for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
									double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
											+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
									if (distanceSq <= 1.0) {
										{
											BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
											BlockState _bs = Blocks.AIR.defaultBlockState();
											BlockState _bso = world.getBlockState(_bp);
											for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
												Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
												if (_property != null && _bs.getValue(_property) != null)
													try {
														_bs = _bs.setValue(_property, (Comparable) entry.getValue());
													} catch (Exception e) {
													}
											}
											world.setBlock(_bp, _bs, 3);
										}
									}
								}
							}
						}
					}
					entity.getPersistentData().putDouble("purpleDistance", 0);
					entity.getPersistentData().putDouble("hollowPurple", 0);
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new HollowPurpleProjectileProjectileEntity(CraftKaisenModEntities.HOLLOW_PURPLE_PROJECTILE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 15, 5, (byte) 500);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					entity.getPersistentData().putBoolean("initial", false);
				}
			}
		}
	}
}
