package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RyomenSukunaOnInitialEntitySpawn2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.08) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
