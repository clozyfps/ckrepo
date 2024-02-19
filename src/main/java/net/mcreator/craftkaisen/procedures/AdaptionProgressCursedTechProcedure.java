package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class AdaptionProgressCursedTechProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Adaption")
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftKaisenModItems.MAHORAGA_WHEEL_HELMET.get()) {
			if (entity.getPersistentData().getDouble("CursedEnergyAdaptation") <= 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cBasic Cursed Energy " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("CursedEnergyAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("CursedEnergyAdaptation") > 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Basic Cursed Energy."), false);
			}
			if (entity.getPersistentData().getDouble("FrameAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cProjection Sorcery " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("FrameAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("FrameAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Projection Sorcery."), false);
			}
			if (entity.getPersistentData().getDouble("BloodAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cBlood Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("BloodAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("BloodAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Blood Attacks."), false);
			}
			if (entity.getPersistentData().getDouble("RatioAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cRatio " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("RatioAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("RatioAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Ratio."), false);
			}
			if (entity.getPersistentData().getDouble("SoulDamageAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cSoul Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("SoulDamageAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("SoulDamageAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Soul Attacks."), false);
			}
			if (entity.getPersistentData().getDouble("SlashesAdaptation") <= 700) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cSlashing Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("DismantleAdaptation") / 700) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("SlashesAdaptation") > 700) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Slashing Attacks."), false);
			}
			if (entity.getPersistentData().getDouble("RepulsionAdaptation") <= 400) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cRepelling Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("RepulsionAdaptation") / 400) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("RepulsionAdaptation") > 400) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Repelling Attacks."), false);
			}
			if (entity.getPersistentData().getDouble("CrushingAdaptation") <= 400) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7Crushing Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("CrushingAdaptation") / 400) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("CrushingAdaptation") > 400) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Crushing Attacks."), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You do not have the Adaption cursed technique!"), false);
		}
	}
}
