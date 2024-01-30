package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
