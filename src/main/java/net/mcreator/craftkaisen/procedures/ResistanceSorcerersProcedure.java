package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ResistanceSorcerersProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof AoiTodoEntity || entity instanceof UraumeEntity || entity instanceof JogoEntity || entity instanceof YujiItadoriEntity || entity instanceof YutaOkkotsuEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 99999, 1, false, false));
		}
		if (entity instanceof SatoruGojoEntity || entity instanceof YutaOkkotsuEntity || entity instanceof MahitoEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 2, false, false));
		}
	}
}
