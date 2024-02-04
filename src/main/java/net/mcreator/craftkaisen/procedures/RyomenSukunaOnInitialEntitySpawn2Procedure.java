package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class RyomenSukunaOnInitialEntitySpawn2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.2) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
