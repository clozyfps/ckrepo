package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BodyShapeActiveOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		double WebPower = 0;
		double T = 0;
		double Zo = 0;
		double Yo = 0;
		double Za = 0;
		double Xo = 0;
		double Ya = 0;
		double Xa = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()))) {
			if (Screen.hasControlDown()) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				raytrace_distance = 10;
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 100, 0));
				for (int index0 = 0; index0 < 14; index0++) {
					if (!world.getBlockState(new BlockPos(
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getX(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getY(),
							entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getZ()))
							.canOcclude() || raytrace_distance < 14) {
						raytrace_distance = raytrace_distance + 1;
						world.addParticle(ParticleTypes.CRIT, x, (y + 1), z, ((Math.sin(Math.toRadians(entity.getYRot() + 180)) * raytrace_distance) / 2), ((Math.sin(Math.toRadians(0 - entity.getXRot())) * raytrace_distance) / 2),
								((Math.cos(Math.toRadians(entity.getYRot())) * raytrace_distance) / 2));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						{
							final Vec3 _center = new Vec3(
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getX()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getY()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
											.getBlockPos().getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entityiterator == entity) && entityiterator instanceof LivingEntity && !((entity.getVehicle()) == entityiterator) && !((entityiterator.getVehicle()) == entity)) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), entity), 4);
									entityiterator.getPersistentData().putBoolean("roped", true);
									CraftKaisenMod.queueServerWork(30, () -> {
										entityiterator.getPersistentData().putBoolean("roped", false);
									});
									entityiterator.setDeltaMovement(new Vec3(((entity.getX() - entityiterator.getX()) / 4), ((entity.getY() - entityiterator.getY()) / 4), ((entity.getZ() - entityiterator.getZ()) / 4)));
									entityiterator.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 1), (entity.getDeltaMovement().z())));
								}
							}
						}
					}
				}
			}
			if (Screen.hasShiftDown()) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 100, 0));
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(50 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getPersistentData().getBoolean("roped")) {
						if (!(entity == entityiterator)) {
							Xo = entity.getX() - entityiterator.getX();
							Yo = entity.getY() - entityiterator.getY();
							Zo = entity.getZ() - entityiterator.getZ();
							if (Math.floor(entity.getX()) <= Math.floor(entityiterator.getX())) {
								if (Math.floor(entity.getX()) == Math.floor(entityiterator.getX())) {
									if (Math.floor(entity.getY()) == Math.floor(entityiterator.getY())) {
										if (Math.floor(entity.getZ()) <= Math.floor(entityiterator.getZ())) {
											Za = Math.floor(entity.getZ()) + 0.2;
											while (Za <= Math.floor(entityiterator.getZ())) {
												T = (Za - entity.getZ()) / Zo;
												Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
												Xa = entity.getX() + Xo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CRIT, Xa, Ya, Za, 1, 0, 0, 0, 0);
												Za = 0.2 + Za;
											}
										} else {
											Za = Math.floor(entityiterator.getZ()) + 0.2;
											while (Za <= Math.floor(entity.getZ())) {
												T = (Za - entity.getZ()) / Zo;
												Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
												Xa = entity.getX() + Xo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CRIT, Xa, Ya, Za, 1, 0, 0, 0, 0);
												Za = 0.2 + Za;
											}
										}
									} else {
										if (Math.floor(entity.getY()) <= Math.floor(entityiterator.getY())) {
											Ya = Math.floor(entity.getY()) + 0.2;
											while (Ya <= Math.floor(entityiterator.getY())) {
												T = (Ya - entity.getY()) / Yo;
												Xa = entity.getX() + Xo * T;
												Za = entity.getZ() + Zo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CRIT, Xa, Ya, Za, 1, 0, 0, 0, 0);
												Ya = 0.2 + Ya;
											}
										} else {
											Ya = Math.floor(entityiterator.getY()) + 0.2;
											while (Ya <= Math.floor(entity.getY())) {
												T = (Ya - entity.getY()) / Yo;
												Xa = entity.getX() + Xo * T;
												Za = entity.getZ() + Zo * T;
												if (world instanceof ServerLevel _level)
													_level.sendParticles(ParticleTypes.CRIT, Xa, Ya, Za, 1, 0, 0, 0, 0);
												Ya = 0.2 + Ya;
											}
										}
									}
								} else {
									Xa = Math.floor(entity.getX()) + 0.2;
									while (Xa <= Math.floor(entityiterator.getX())) {
										T = (Xa - entity.getX()) / Xo;
										Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
										Za = entity.getZ() + Zo * T;
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CRIT, Xa, Ya, Za, 1, 0, 0, 0, 0);
										Xa = 0.2 + Xa;
									}
								}
							} else {
								Xa = entityiterator.getX() + 0.2;
								while (Xa < Math.floor(entity.getX())) {
									T = (Xa - entity.getX()) / Xo;
									Ya = entity.getBbHeight() / 2 + entity.getY() + Yo * T;
									Za = entity.getZ() + Zo * T;
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.CRIT, Xa, Ya, Za, 1, 0, 0, 0, 0);
									Xa = 0.2 + Xa;
								}
							}
						}
					}
				}
			}
		}
	}
}
