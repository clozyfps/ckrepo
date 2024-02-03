package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;
import net.mcreator.craftkaisen.entity.ShinjukuGojoEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfinityBeforeHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getDirectEntity());
		}
	}

	public static void execute(Entity entity, Entity immediatesourceentity) {
		execute(null, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity.getPersistentData().getBoolean("infinity") || entity instanceof SatoruGojoEntity || entity instanceof ShinjukuGojoEntity) {
			if (!((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftKaisenModItems.INVERTED_SPEAR.get())
					&& !(immediatesourceentity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get()))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
