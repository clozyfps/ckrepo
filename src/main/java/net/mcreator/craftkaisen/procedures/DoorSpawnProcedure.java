package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.RedOpenDoorEntity;
import net.mcreator.craftkaisen.entity.RedClosedDoorEntity;
import net.mcreator.craftkaisen.entity.RainbowOpenDoorEntity;
import net.mcreator.craftkaisen.entity.RainbowClosedDoorEntity;
import net.mcreator.craftkaisen.entity.GreenOpenDoorEntity;
import net.mcreator.craftkaisen.entity.GreenClosedDoorEntity;
import net.mcreator.craftkaisen.entity.GoldOpenDoorEntity;
import net.mcreator.craftkaisen.entity.GoldClosedDoorEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class DoorSpawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GreenOpenDoorEntity) {
			CraftKaisenMod.queueServerWork(15, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new GreenClosedDoorEntity(CraftKaisenModEntities.GREEN_CLOSED_DOOR.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage")))),
									6);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 3, 0.1, 2, 0.1, 1);
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()),
											0.2, 0.1);
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2,
											0.1);
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 0.1, 2, 0.1, 0);
						}
					}
				}
			});
		}
		if (entity instanceof RedOpenDoorEntity) {
			CraftKaisenMod.queueServerWork(15, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RedClosedDoorEntity(CraftKaisenModEntities.RED_CLOSED_DOOR.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage")))),
									6);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 3, 0.1, 2, 0.1, 1);
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()),
											0.2, 0.1);
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2,
											0.1);
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 0.1, 2, 0.1, 0);
						}
					}
				}
			});
		}
		if (entity instanceof GoldOpenDoorEntity) {
			CraftKaisenMod.queueServerWork(15, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new GoldClosedDoorEntity(CraftKaisenModEntities.GOLD_CLOSED_DOOR.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage")))),
									6);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 3, 0.1, 2, 0.1, 1);
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()),
											0.2, 0.1);
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2,
											0.1);
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 0.1, 2, 0.1, 0);
						}
					}
				}
			});
		}
		if (entity instanceof RainbowOpenDoorEntity) {
			CraftKaisenMod.queueServerWork(15, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RainbowClosedDoorEntity(CraftKaisenModEntities.RAINBOW_CLOSED_DOOR.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage")))),
									6);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1);
								} else {
									_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 3, 0.1, 2, 0.1, 1);
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()),
											0.2, 0.1);
							} else {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2,
											0.1);
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 0.1, 2, 0.1, 0);
						}
					}
				}
			});
		}
		if (entity instanceof GoldClosedDoorEntity || entity instanceof GreenClosedDoorEntity || entity instanceof RedClosedDoorEntity || entity instanceof RainbowClosedDoorEntity) {
			CraftKaisenMod.queueServerWork(10, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
