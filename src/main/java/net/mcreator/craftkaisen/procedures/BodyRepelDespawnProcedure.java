package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BodyRepelDespawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BodyRepel1Entity || entity instanceof BodyRepel2Entity || entity instanceof BodyRepel3Entity) {
			CraftKaisenMod.queueServerWork(100, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
