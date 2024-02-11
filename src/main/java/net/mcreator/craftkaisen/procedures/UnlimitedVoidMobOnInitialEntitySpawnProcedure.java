package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
