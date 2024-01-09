package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class HealthOverlayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Health: " + (new java.text.DecimalFormat("#").format((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 2));
	}
}
