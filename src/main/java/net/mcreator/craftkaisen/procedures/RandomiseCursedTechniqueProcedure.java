package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class RandomiseCursedTechniqueProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double techniqueNumber = 0;
		double restrictionNumber = 0;
		double specialNumber = 0;
		techniqueNumber = Mth.nextInt(RandomSource.create(), 1, 14);
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_technique"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		if (techniqueNumber == 1) {
			{
				String _setval = "Disaster Flames";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 2) {
			{
				String _setval = "Disaster Plants";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 3) {
			{
				String _setval = "Ten Shadows";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 4) {
			{
				String _setval = "Cursed Speech";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 5) {
			{
				String _setval = "Boogie Woogie";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 6) {
			{
				String _setval = "Ratio";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 7) {
			{
				String _setval = "Missile Fists";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 8) {
			{
				String _setval = "Projection Sorcery";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 9) {
			{
				String _setval = "Auspicious Beasts Summon";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftKaisenModItems.SKI_MASK_HELMET.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (techniqueNumber == 10) {
			{
				String _setval = "Copy";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 11) {
			{
				String _setval = "Blood Manipulation";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 12) {
			{
				String _setval = "Ice Formation";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 13) {
			{
				String _setval = "Black Bird Manipulation";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 14) {
			{
				String _setval = "Limitless";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Math.random() < 0.05) {
			restrictionNumber = Mth.nextInt(RandomSource.create(), 1, 2);
			if (restrictionNumber == 1) {
				{
					String _setval = "Fragile Body";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.special = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (restrictionNumber == 2) {
				{
					String _setval = "Physically Gifted";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.special = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(
					Component.literal(("You were born with the " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique + " cursed technique")), false);
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Fragile Body")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You were born with an incredibly fragile body (Capped at -5 strength, speed and health stats) (granted 100 cursed energy and energy control stats)"), false);
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Physically Gifted")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You were born with no cursed energy but with increased physical stats"), false);
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("No Energy")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						Component.literal("You were born with absolutely no cursed energy but an incredibly physically gifted body (Capped at 0 cursed energy and energy control stats) (granted 50 strength and health stats + 25 speed stat)"), false);
		}
	}
}
