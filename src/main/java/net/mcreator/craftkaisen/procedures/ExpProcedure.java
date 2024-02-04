package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExpProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomperk = 0;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp >= (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CraftKaisenModVariables.PlayerVariables())).maxExp) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 100
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 0
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 200
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 0
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 200
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 1
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 300
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 1
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 300
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 2
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 400
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 2
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 400
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 3
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 500
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 3
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 500
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 4
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 600
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 5
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Lives > 2) {
			{
				double _setval = 2;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lives = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
