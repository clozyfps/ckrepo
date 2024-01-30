
package net.mcreator.craftkaisen.potion;

public class RikasLoveMobEffect extends MobEffect {
	public RikasLoveMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.rikas_love";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RikasLoveOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}