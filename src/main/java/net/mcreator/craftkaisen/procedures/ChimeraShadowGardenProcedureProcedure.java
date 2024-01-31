package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.entity.ChimeraShadowGardenMobEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ChimeraShadowGardenProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putBoolean("predomain", true);
			CraftKaisenMod.queueServerWork(19, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							if (!entityiterator.getPersistentData().getBoolean("predomain")) {
								entity.getPersistentData().putBoolean("domain", true);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 1, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 35, 250, false, false));
								CraftKaisenMod.queueServerWork(20, () -> {
									entity.getPersistentData().putBoolean("chimeradomain", true);
									CraftKaisenMod.queueServerWork(5, () -> {
										CraftKaisenMod.queueServerWork(5, () -> {
											if (((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
												_toTame.tame(_owner);
											CraftKaisenMod.queueServerWork(1000, () -> {
												entity.getPersistentData().putBoolean("chimeradomain", false);
											});
										});
									});
								});
							} else if (entityiterator.getPersistentData().getBoolean("predomain")) {
								entityiterator.getPersistentData().putBoolean("domainclash", true);
								entity.getPersistentData().putBoolean("domainclash", true);
							}
						}
					}
				}
			});
		} else if (entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putBoolean("domain", false);
		}
	}
}
