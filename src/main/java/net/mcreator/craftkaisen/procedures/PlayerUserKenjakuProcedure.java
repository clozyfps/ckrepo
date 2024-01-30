package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PlayerUserKenjakuProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("playeruser");
	}
}
