package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

public class CursedEnergySwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 2);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			if (entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Simple Domain");
				entity.getPersistentData().putDouble("moveCost", 20);
			} else {
				entity.getPersistentData().putString("moveDisplay", "Havent Learned Yet");
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			if (entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
					&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Domain Amplification");
				entity.getPersistentData().putDouble("moveCost", 35);
			} else {
				entity.getPersistentData().putString("moveDisplay", "Havent Learned Yet");
			}
		}
	}
}
