package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class InventoryCurseMobEntityDiesProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(CraftKaisenModItems.TOJI_CURSE_ARMOR_CHESTPLATE.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
