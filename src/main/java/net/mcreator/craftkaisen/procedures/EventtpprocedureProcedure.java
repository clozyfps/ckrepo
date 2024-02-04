package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EventtpprocedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer <= 200) {
			{
				Entity _ent = entity;
				_ent.teleportTo(CraftKaisenModVariables.MapVariables.get(world).nearx, CraftKaisenModVariables.MapVariables.get(world).neary, CraftKaisenModVariables.MapVariables.get(world).nearz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(CraftKaisenModVariables.MapVariables.get(world).nearx, CraftKaisenModVariables.MapVariables.get(world).neary, CraftKaisenModVariables.MapVariables.get(world).nearz, _ent.getYRot(),
							_ent.getXRot());
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("No World Event Happening Right Now."), false);
		}
	}
}
