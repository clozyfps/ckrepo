package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MainDamageSystemProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:slashing_damage")))) {
				random = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random == 1) {
				} else if (random == 2) {
				} else if (random == 3) {
				} else if (random == 4) {
				}
			} else if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:crushing_damage")))) {
				random = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random == 1) {
				} else if (random == 2) {
				} else if (random == 3) {
				} else if (random == 4) {
				}
			} else {
				random = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random == 1) {
				} else if (random == 2) {
				} else if (random == 3) {
				} else if (random == 4) {
				}
			}
		}
	}
}
