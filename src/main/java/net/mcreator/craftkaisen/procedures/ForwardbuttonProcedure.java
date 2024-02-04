package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class ForwardbuttonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("moveNumber") < entity.getPersistentData().getDouble("maxMoves")) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy") && entity.getPersistentData().getDouble("moveNumber") == 2
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).SimpleDomainUnlocked) {
				entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") + 1));
			} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy")) {
				entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") + 1));
			} else if (!(entity.getPersistentData().getDouble("moveNumber") == 2)) {
				entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") + 1));
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy") && entity.getPersistentData().getDouble("moveNumber") == 2
					&& !(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).SimpleDomainUnlocked) {
				entity.getPersistentData().putDouble("moveNumber", 4);
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") >= entity.getPersistentData().getDouble("maxMoves")) {
			entity.getPersistentData().putDouble("moveNumber", 1);
		}
	}
}
