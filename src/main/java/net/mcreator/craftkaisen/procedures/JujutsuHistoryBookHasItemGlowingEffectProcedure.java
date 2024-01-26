package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.item.ItemStack;

public class JujutsuHistoryBookHasItemGlowingEffectProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("bookRead")) {
			return true;
		}
		return false;
	}
}
