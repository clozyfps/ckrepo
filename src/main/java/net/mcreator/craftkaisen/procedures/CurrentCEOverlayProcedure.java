package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CurrentCEOverlayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "CE: " + new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy);
	}
}
