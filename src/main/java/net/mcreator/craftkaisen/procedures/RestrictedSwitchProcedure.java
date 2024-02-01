package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class RestrictedSwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 2);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			entity.getPersistentData().putString("moveDisplay", "Blitz");
			entity.getPersistentData().putDouble("moveCost", 10);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			entity.getPersistentData().putString("moveDisplay", "Behind You");
			entity.getPersistentData().putDouble("moveCost", 15);
		}
	}
}
