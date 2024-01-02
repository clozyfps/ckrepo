package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RatioMasteryDisplayProcedure {
	public static String execute() {
		return "Ratio Mastery: " + new java.text.DecimalFormat("#").format();
	}
}
