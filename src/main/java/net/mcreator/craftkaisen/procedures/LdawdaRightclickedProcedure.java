package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class LdawdaRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 50;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.currentCursedEnergy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (!world.getEntitiesOfClass(MahitoCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
			{
				Entity _ent = ((Entity) world.getEntitiesOfClass(MahitoCloneEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null));
				_ent.teleportTo(x, y, z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}
