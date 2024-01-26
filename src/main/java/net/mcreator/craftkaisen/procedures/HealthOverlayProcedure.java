package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HealthOverlayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Health: " + (new java.text.DecimalFormat("#").format((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 2));
	}
}
