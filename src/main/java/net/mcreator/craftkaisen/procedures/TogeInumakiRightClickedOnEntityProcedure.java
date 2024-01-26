package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class TogeInumakiRightClickedOnEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.getPersistentData().putDouble("togerandom", (Mth.nextInt(RandomSource.create(), 1, 8)));
		if (sourceentity.getPersistentData().getDouble("togerandom") == 1) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Bonito Flakes")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 2) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Tuna")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 3) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Caviar")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 4) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Salmon")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 5) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Salmon Roe")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 6) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Tuna Tuna")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 7) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Tuna Mayo")), false);
		} else if (sourceentity.getPersistentData().getDouble("togerandom") == 8) {
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("<Toge> " + "Kelp")), false);
		}
	}
}
