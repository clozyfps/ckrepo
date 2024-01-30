package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SpeedDisableProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("speeddisable")) {
			entity.getPersistentData().putBoolean("speeddisable", true);
		} else if (entity.getPersistentData().getBoolean("speeddisable")) {
			entity.getPersistentData().putBoolean("speeddisable", false);
		}
	}
}
