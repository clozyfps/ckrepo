package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NaobitoOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (!(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftKaisenModMobEffects.STOP_ATTACKS.get()))) {
				if (Math.random() < 0.01) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.FRAME_ENABLE.get(), Mth.nextInt(RandomSource.create(), 20, 50), 0, false, true));
					entity.getPersistentData().putString("currentmoveactive", "Frame");
				}
			}
		}
	}
}
