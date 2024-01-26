package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JujutsuHistoryBookHasItemGlowingEffectProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("bookRead")) {
			return true;
		}
		return false;
	}
}
