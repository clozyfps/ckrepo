package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ThrowPlayerMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (entityiterator.getPersistentData().getBoolean("thrown")) {
						entityiterator.setDeltaMovement(new Vec3(((entity.getX() - entityiterator.getX()) / 4), ((entity.getY() - entityiterator.getY()) / 4), ((entity.getZ() - entityiterator.getZ()) / 4)));
					}
				}
			}
		}
	}
}
