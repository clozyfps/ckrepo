package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

public class CursedEnergySwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 3);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			if (!(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone())) {
				entity.getPersistentData().putString("moveDisplay", "Simple Domain");
				entity.getPersistentData().putDouble("moveCost", 20);
			} else if (entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
					&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Havent Learned Yet");
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			if (entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
					&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Domain Amplification");
				entity.getPersistentData().putDouble("moveCost", 35);
			} else if (!(entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
					&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone())) {
				entity.getPersistentData().putString("moveDisplay", "Havent Learned Yet");
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			if (entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel
					&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_energy_flow"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Flow");
				entity.getPersistentData().putDouble("moveCost", 0);
			} else if (!(entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
					&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_energy_flow"))).isDone())) {
				entity.getPersistentData().putString("moveDisplay", "Havent Learned Yet");
			}
		}
	}
}
