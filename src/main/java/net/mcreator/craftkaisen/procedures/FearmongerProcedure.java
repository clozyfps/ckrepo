package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FearmongerProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
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
if (sourceentity instanceof Player||sourceentity instanceof ServerPlayer) {if (().equals("Fearmonger")) {if (entity instanceof Player||entity instanceof ServerPlayer) {if (Math.random()<0.1) {if(sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS,20,0, false, false));if(sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,20,1, false, false));}}}}
}
}
