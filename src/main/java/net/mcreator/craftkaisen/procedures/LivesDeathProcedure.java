package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LivesDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity sourceentity) {
		execute(null, world, sourceentity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity sourceentity
) {
if(
sourceentity == null
) return ;
if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.DELETED_MOD_ELEMENT)==true) {if (sourceentity instanceof Player||sourceentity instanceof ServerPlayer) {if (>0) {}else if (==0) {}}}
}
}
