package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class DomainSpawnNbtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("domain", true);
	}
}
