package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ResistanceSorcerersProcedure {
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
		if (entity instanceof AoiTodoEntity || entity instanceof UraumeEntity || entity instanceof JogoEntity || entity instanceof YujiItadoriEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 99999, 2, false, false));
		}
		if (entity instanceof YutaOkkotsuEntity || entity instanceof MahitoEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 3, false, false));
		}
		if (entity instanceof SatoruGojoEntity || entity instanceof ShinjukuGojoEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 4, false, false));
		}
		if (entity instanceof RyomenSukunaEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 4, false, false));
		}
		if (entity instanceof JogoEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 3, false, false));
		}
		if (entity instanceof TojiFushiguroEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 2, false, false));
		}
		if (entity instanceof ResurrectedTojiEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 3, false, false));
		}
		if (entity instanceof SatoruGojoEntity || entity instanceof ShinjukuGojoEntity || entity instanceof ResurrectedTojiEntity) {
			CraftKaisenMod.queueServerWork(10000, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
