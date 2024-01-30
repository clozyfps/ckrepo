package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class KenjakuUserdisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Do you want to steal " + entity.getPersistentData().getString("playeruser") + "'s body?";
	}
}
