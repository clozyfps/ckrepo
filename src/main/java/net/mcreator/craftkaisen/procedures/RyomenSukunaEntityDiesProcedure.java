package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;

import java.util.Comparator;

public class RyomenSukunaEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity tamer = null;
		if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()) {
			if ((((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("tamer")).equals(entity.getDisplayName().getString())) {
				if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()) {
					if (!((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
						((Entity) world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
			}
		}
	}
}
