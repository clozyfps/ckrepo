package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class KenjakuUserdisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Do you want to steal " + entity.getPersistentData().getString("playeruser") + "'s body?";
	}
}
