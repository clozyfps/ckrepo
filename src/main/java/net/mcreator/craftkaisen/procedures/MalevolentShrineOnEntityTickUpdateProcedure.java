package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
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
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModGameRules;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MalevolentShrineOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (entity.getPersistentData().getDouble("shrineTick") < 1200) {
			entity.getPersistentData().putDouble("shrineTick", (entity.getPersistentData().getDouble("shrineTick") + 1));
		}
		if (entity.getPersistentData().getDouble("shrineTick") >= 1200) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.MALEVOLENT_SHRINE_BLOCK_DAMAGE) == true) {
			int horizontalRadiusHemiTop = (int) (entity.getPersistentData().getDouble("shrineTick") / 22) - 1;
			int verticalRadiusHemiTop = (int) (entity.getPersistentData().getDouble("shrineTick") / 22);
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
							if (!((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
								world.destroyBlock(BlockPos.containing(x + xi, y + i, z + zi), false);
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x + xi, y + i, z + zi, 1, 0.1, 1, 0.1, 0);
							}
						}
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator) && !(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
						&& !(entityiterator instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()))
						&& !(entity.getPersistentData().getString("tamer")).equals(entityiterator.getDisplayName().getString())) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2,
									0.1);
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 2, 0.2, (entityiterator.getBbHeight()), 0.2, 0.1);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")),
									SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL,
									(float) 0.1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, (float) 0.1, 1,
									false);
						}
					}
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:malevolent_shrine_damage"))),
							(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)), 65);
				} else if (entityiterator instanceof LivingEntity _livEnt53 && _livEnt53.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()) && !(entity == entityiterator)
						&& !(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
					if (Math.random() < 0.01) {
						entity.getPersistentData().putDouble("simpledomainlevel", (entity.getPersistentData().getDouble("simpledomainlevel") - 1));
					}
				}
			}
		}
		entity.getPersistentData().putDouble("slicerandom", (Mth.nextInt(RandomSource.create(), 1, 3)));
		if (entity.getPersistentData().getDouble("slicerandom") == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.SHRINE_SLICE_1.get()), x, y, z, 25, 50, 10, 50, 0.2);
		}
		if (entity.getPersistentData().getDouble("slicerandom") == 2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.SHRINE_SLICE_2.get()), x, y, z, 25, 50, 10, 50, 0.2);
		}
		if (entity.getPersistentData().getDouble("slicerandom") == 3) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.SHRINE_SLICE_3.get()), x, y, z, 25, 50, 10, 50, 0.2);
		}
	}
}
