package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MahitoEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(MahitoCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).isEmpty()) {
			if (!((Entity) world.getEntitiesOfClass(MahitoCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
				((Entity) world.getEntitiesOfClass(MahitoCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
		}
	}
}
