package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class TakadaOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(60, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
