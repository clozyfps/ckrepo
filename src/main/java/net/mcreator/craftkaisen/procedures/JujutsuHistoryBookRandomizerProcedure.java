package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JujutsuHistoryBookRandomizerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double type = 0;
		double ct = 0;
		double barrier = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftKaisenModItems.DELETED_MOD_ELEMENT.get()
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("HistoryType")).isEmpty()) {
			type = Mth.nextInt(RandomSource.create(), 1, 4);
			if (type == 1) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("HistoryType", "CT");
				ct = Mth.nextInt(RandomSource.create(), 1, 3);
				if (ct == 1) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("CTType", "Limitless");
				} else if (ct == 2) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("CTType", "Ten Shadows");
				} else if (ct == 3) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("CTType", "Blood Manipulation");
				}
			} else if (type == 2) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("HistoryType", "Barriers");
				barrier = Mth.nextInt(RandomSource.create(), 1, 30);
				if (barrier >= 1 && barrier < 7) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("BarrierType", "Simple Barrier");
				} else if (barrier >= 7 && barrier < 15) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("BarrierType", "Hollow Wicker Basket");
				} else if (barrier >= 15 && barrier < 21) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("BarrierType", "Simple Domain");
				} else if (barrier >= 21 && barrier < 26) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("BarrierType", "Domain Expansion");
				} else if (barrier >= 26) {
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("BarrierType", "Domain Amplification");
				}
			} else {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("HistoryType", "Scribbles");
			}
		}
	}
}
