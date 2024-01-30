package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class AcceptKenjakuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		{
			String _setval = entity.getPersistentData().getString("playertechnique");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.technique = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = entity.getPersistentData().getString("playerspecial");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.special = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putString("playertechnique", "");
		entity.getPersistentData().putString("playerspecial", "");
	}
}
