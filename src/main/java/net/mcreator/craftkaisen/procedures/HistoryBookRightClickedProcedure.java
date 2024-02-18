package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HistoryBookRightClickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((itemstack.getOrCreateTag().getString("HistoryType")).equals("Simple Domain")) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			itemstack.getOrCreateTag().putDouble("itemhealth", (itemstack.getOrCreateTag().getDouble("itemhealth") - 5));
		} else if ((itemstack.getOrCreateTag().getString("HistoryType")).equals("Domain Amplification")) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
			itemstack.getOrCreateTag().putDouble("itemhealth", (itemstack.getOrCreateTag().getDouble("itemhealth") - 5));
		}
	}
}
