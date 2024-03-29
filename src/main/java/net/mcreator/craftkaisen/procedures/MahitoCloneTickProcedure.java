package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.entity.MahitoEntity;

import java.util.Comparator;

public class MahitoCloneTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 50) {
			if (entity.getPersistentData().getBoolean("freemahito") == false) {
				if (!world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
					if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("split")) {
						if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
						if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entity instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
						entity.getPersistentData().putBoolean("freemahito", true);
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("freemahito") == true) {
			if (!world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("split")) {
					if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 50, 3, false, true));
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
		if (!world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
			if (entity instanceof Mob _entity && (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
		}
	}
}
