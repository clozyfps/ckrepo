package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class BackButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("moveNumber") <= 1) {
			entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("maxMoves")));
		} else if (entity.getPersistentData().getDouble("moveNumber") > 1) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy") && entity.getPersistentData().getDouble("moveNumber") == 4
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).SimpleDomainUnlocked) {
				entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") - 1));
			} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy")) {
				entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") - 1));
			} else if (!(entity.getPersistentData().getDouble("moveNumber") == 4)) {
				entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") - 1));
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy") && entity.getPersistentData().getDouble("moveNumber") == 4
					&& !(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).SimpleDomainUnlocked) {
				entity.getPersistentData().putDouble("moveNumber", 2);
			}
		}
	}
}
