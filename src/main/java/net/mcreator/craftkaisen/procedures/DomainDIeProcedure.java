package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.entity.UnlimitedVoidMobEntity;
import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.entity.ChimeraShadowGardenMobEntity;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class DomainDIeProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		String block = "";
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (entity.getPersistentData().getBoolean("domain")) {
				if ((entity.getPersistentData().getString("domaintype")).equals("Malevolent Shrine")) {
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
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Coffin Of The Iron Mountain")) {
					RemoveCoffinProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
					entity.getPersistentData().putBoolean("domain", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Unlimited Void")) {
					entity.getPersistentData().putBoolean("domain", false);
					VoidRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof UnlimitedVoidMobEntity && ((entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
									|| (entityiterator.getPersistentData().getString("ownerdomain")).equals(entity.getDisplayName().getString()))) {
								if (!entityiterator.level.isClientSide())
									entityiterator.discard();
							}
						}
					}
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Chimera Shadow Garden")) {
					entity.getPersistentData().putBoolean("domain", false);
					if (!world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
						if (((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
							if (!world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
								if (!((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
									((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
							}
						}
					}
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Glacier")) {
					entity.getPersistentData().putBoolean("domain", false);
					IceDomainRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:reversefreezinwind")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:reversefreezinwind")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			}
		} else if (!(entity instanceof Player || entity instanceof ServerPlayer)) {
			if (entity.getPersistentData().getBoolean("domain") || entity.getPersistentData().getBoolean("useddomain")) {
				entity.getPersistentData().putBoolean("domain", false);
				entity.getPersistentData().putBoolean("useddomain", false);
				if ((entity.getPersistentData().getString("domaintype")).equals("Malevolent Shrine")) {
					entity.getPersistentData().putBoolean("domain", false);
					if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
						if ((((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("tamer")).equals(entity.getDisplayName().getString())) {
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
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Coffin Of The Iron Mountain")) {
					RemoveCoffinProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
					entity.getPersistentData().putBoolean("domain", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Unlimited Void")) {
					entity.getPersistentData().putBoolean("domain", false);
					VoidRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof UnlimitedVoidMobEntity && ((entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
									|| (entityiterator.getPersistentData().getString("ownerdomain")).equals(entity.getDisplayName().getString()))) {
								if (!entityiterator.level.isClientSide())
									entityiterator.discard();
							}
						}
					}
				}
				if ((entity.getPersistentData().getString("domaintype")).equals("Chimera Shadow Garden")) {
					entity.getPersistentData().putBoolean("domain", false);
					if (!world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
						if ((((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("ownerdomain")).equals(entity.getDisplayName().getString())) {
							if (!world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
								if (!((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
									((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
								((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("ownerdomain", "");
							}
						}
					}
				}
			}
		}
		if (!(sourceentity instanceof Player || sourceentity instanceof ServerPlayer)) {
			if (sourceentity.getPersistentData().getBoolean("domain") || sourceentity.getPersistentData().getBoolean("useddomain")) {
				sourceentity.getPersistentData().putBoolean("domain", false);
				sourceentity.getPersistentData().putBoolean("useddomain", false);
				if ((sourceentity.getPersistentData().getString("domaintype")).equals("Malevolent Shrine")) {
					sourceentity.getPersistentData().putBoolean("domain", false);
					if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
						if ((((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("tamer")).equals(sourceentity.getDisplayName().getString())) {
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
				}
				if ((sourceentity.getPersistentData().getString("domaintype")).equals("Coffin Of The Iron Mountain")) {
					RemoveCoffinProcedure.execute(world, (sourceentity.getPersistentData().getDouble("domainx")), (sourceentity.getPersistentData().getDouble("domainy")), (sourceentity.getPersistentData().getDouble("domainz")));
					sourceentity.getPersistentData().putBoolean("domain", false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				if ((sourceentity.getPersistentData().getString("domaintype")).equals("Unlimited Void")) {
					sourceentity.getPersistentData().putBoolean("domain", false);
					VoidRemoveProcedure.execute(world, (sourceentity.getPersistentData().getDouble("domainx")), (sourceentity.getPersistentData().getDouble("domainy")), (sourceentity.getPersistentData().getDouble("domainz")));
					{
						final Vec3 _center = new Vec3((sourceentity.getPersistentData().getDouble("domainx")), (sourceentity.getPersistentData().getDouble("domainy")), (sourceentity.getPersistentData().getDouble("domainz")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof UnlimitedVoidMobEntity && ((entityiterator instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
									|| (entityiterator.getPersistentData().getString("ownerdomain")).equals(sourceentity.getDisplayName().getString()))) {
								if (!entityiterator.level.isClientSide())
									entityiterator.discard();
							}
						}
					}
				}
				if ((sourceentity.getPersistentData().getString("domaintype")).equals("Chimera Shadow Garden")) {
					sourceentity.getPersistentData().putBoolean("domain", false);
					if (!world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
						if ((((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("ownerdomain")).equals(sourceentity.getDisplayName().getString())) {
							if (!world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
								if (!((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
									((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
								((Entity) world.getEntitiesOfClass(ChimeraShadowGardenMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("ownerdomain", "");
							}
						}
					}
				}
			}
		}
	}
}
