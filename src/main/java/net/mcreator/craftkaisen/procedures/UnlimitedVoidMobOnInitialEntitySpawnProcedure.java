package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class UnlimitedVoidMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(3000, () -> {
			VoidRemoveProcedure.execute(world, (entity.getX()), (entity.getY()), (entity.getZ()));
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
