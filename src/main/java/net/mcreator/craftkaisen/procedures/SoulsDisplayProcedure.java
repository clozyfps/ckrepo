package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SoulsDisplayProcedure {
	public static String execute() {
		return "Souls: " + new java.text.DecimalFormat("#").format();
	}
}
