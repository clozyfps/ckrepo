package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class UnlimitedVoidMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(1200, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
		entity.getPersistentData().putDouble("spawnhole", 100);
		entity.getPersistentData().putDouble("spawnparticles", 100);
	}
}
