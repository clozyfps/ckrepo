package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class DisplayPerkProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Perk: " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PerkPage;
	}
}
