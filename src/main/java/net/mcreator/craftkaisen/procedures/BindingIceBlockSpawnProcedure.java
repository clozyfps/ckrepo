package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class BindingIceBlockSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("DespawnTimer", 150);
	}
}
