package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class AdaptionProgressCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Adaption")
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftKaisenModItems.MAHORAGA_WHEEL_HELMET.get()) {
			if (entity.getPersistentData().getDouble("DamageAdaptation") <= 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cGeneric Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("DamageAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("DamageAdaptation") > 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Generic Damage."), false);
			}
			if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") <= 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cPlayer Hits " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("PlayerAttackAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") > 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Player Hits."), false);
			}
			if (entity.getPersistentData().getDouble("MobAttackAdaptation") <= 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cMob Hits " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("MobAttackAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("MobAttackAdaptation") > 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Mob Hits."), false);
			}
			if (entity.getPersistentData().getDouble("BurningAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cBurning " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("BurningAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("BurningAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Burning."), false);
			}
			if (entity.getPersistentData().getDouble("ExplosionAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cExplosions " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ExplosionAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ExplosionAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Explosions."), false);
			}
			if (entity.getPersistentData().getDouble("FallDamageAdaptation") <= 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cFall Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("FallDamageAdaptation") / 250) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("FallDamageAdaptation") > 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Fall Damage."), false);
			}
			if (entity.getPersistentData().getDouble("ProjectileAdaptation") <= 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cProjectiles " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ProjectileAdaptation") / 250) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ProjectileAdaptation") > 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Projectiles."), false);
			}
			if (entity.getPersistentData().getDouble("SuffocationAdaptation") <= 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cSuffocation " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("SuffocationAdaptation") / 150) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("SuffocationAdaptation") > 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Suffocation."), false);
			}
			if (entity.getPersistentData().getDouble("WitherAdaptation") <= 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cWithering " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("WitherAdaptation") / 150) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("WitherAdaptation") > 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Withering."), false);
			}
			if (entity.getPersistentData().getDouble("MagicAdaptation") <= 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cMagic Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("MagicAdaptation") / 150) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("MagicAdaptation") > 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Magic Attacks."), false);
			}
			if (entity.getPersistentData().getDouble("DamageBlockAdaptation") <= 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cDamaging Blocks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("DamageBlockAdaptation") / 100) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("DamageBlockAdaptation") > 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Damaging Blocks."), false);
			}
			if (entity.getPersistentData().getDouble("StarvingAdaptation") <= 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cStarving " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("StarvingAdaptation") / 100) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("StarvingAdaptation") > 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Starving."), false);
			}
			if (entity.getPersistentData().getDouble("FreezingAdaption") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cFreezing " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("FreezingAdaption") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("FreezingAdaption") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Freezing."), false);
			}
			if (entity.getPersistentData().getDouble("ElectricityAdaptation") <= 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cElectricity " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ElectricityAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ElectricityAdaptation") > 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Electricity."), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You do not have the ability to Adapt!"), false);
		}
	}
}
