
package net.mcreator.craftkaisen.potion;

public class FrozenSolidMobEffect extends MobEffect {
	public FrozenSolidMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10040065);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.frozen_solid";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrozenSolidOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}