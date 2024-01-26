package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RegainerProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

private static void execute(
@Nullable Event event,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (sourceentity instanceof Player||sourceentity instanceof ServerPlayer) {if (().equals("Regainer")) {if (!(entity instanceof Player||entity instanceof ServerPlayer)) {if (sourceentity instanceof LivingEntity _entity) _entity.setHealth((float)((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth():-1)+6));}}}
}
}
