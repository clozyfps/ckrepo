package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BecomeSorcererProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))
				&& (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation > 0) {
			{
				String _setval = "Sorcerer";
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.affiliation = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (sourceentity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:jujutsu_sorcerer"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			{
				String _setval = "Grade 4";
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Grade = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
