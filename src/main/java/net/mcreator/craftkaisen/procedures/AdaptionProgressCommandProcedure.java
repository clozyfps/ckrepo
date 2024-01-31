package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class AdaptionProgressCommandProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Adaption")) {
			if (entity.getPersistentData().getDouble("DamageAdaptation") < 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cGeneric Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("DamageAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("DamageAdaptation") == 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Generic Damage."), false);
			}
			if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") < 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cPlayer Hits " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("PlayerAttackAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") == 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Player Hits."), false);
			}
			if (entity.getPersistentData().getDouble("MobAttackAdaptation") < 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cMob Hits " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("MobAttackAdaptation") / 500) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("MobAttackAdaptation") == 500) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Mob Hits."), false);
			}
			if (entity.getPersistentData().getDouble("BurningAdaptation") < 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cBurning " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("BurningAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("BurningAdaptation") == 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Burning."), false);
			}
			if (entity.getPersistentData().getDouble("ExplosionAdaptation") < 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cExplosions " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ExplosionAdaptation") / 300) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ExplosionAdaptation") == 300) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Explosions."), false);
			}
			if (entity.getPersistentData().getDouble("FallDamageAdaptation") < 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cFall Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("FallDamageAdaptation") / 250) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("FallDamageAdaptation") == 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Fall Damage."), false);
			}
			if (entity.getPersistentData().getDouble("ProjectileAdaptation") < 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cProjectiles " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ProjectileAdaptation") / 250) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ProjectileAdaptation") == 250) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Projectiles."), false);
			}
			if (entity.getPersistentData().getDouble("SuffocationAdaptation") < 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cSuffocation " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("SuffocationAdaptation") / 150) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("SuffocationAdaptation") == 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Suffocation."), false);
			}
			if (entity.getPersistentData().getDouble("WitherAdaptation") < 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cWithering " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("WitherAdaptation") / 150) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("WitherAdaptation") == 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Withering."), false);
			}
			if (entity.getPersistentData().getDouble("MagicAdaptation") < 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cMagic Attacks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("MagicAdaptation") / 150) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("MagicAdaptation") == 150) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Magic Attacks."), false);
			}
			if (entity.getPersistentData().getDouble("DamageBlockAdaptation") < 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cDamaging Blocks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("DamageBlockAdaptation") / 100) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("DamageBlockAdaptation") == 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Damaging Blocks."), false);
			}
			if (entity.getPersistentData().getDouble("FallingBlockAdaptation") < 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cFalling Blocks " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("FallingBlockAdaptation") / 100) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("FallingBlockAdaptation") == 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Falling Blocks."), false);
			}
			if (entity.getPersistentData().getDouble("StarvingAdaptation") < 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cStarving " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("StarvingAdaptation") / 100) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("StarvingAdaptation") == 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Starving."), false);
			}
			if (entity.getPersistentData().getDouble("MiscAdaptation") < 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cMiscellaneous Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("MiscAdaptation") / 100) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("MiscAdaptation") == 100) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Miscellaneous Damage."), false);
			}
			if (entity.getPersistentData().getDouble("BloodAdaptation") < 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cBlood Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("BloodAdaptation") / 200) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("BloodAdaptation") == 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Blood Damage."), false);
			}
			if (entity.getPersistentData().getDouble("DismantleAdaptation") < 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cDismantle Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("DismantleAdaptation") / 200) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("DismantleAdaptation") == 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Dismantle Damage."), false);
			}
			if (entity.getPersistentData().getDouble("ReversalRedAdaptation") < 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cReversal Red Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ReversalRedAdaptation") / 200) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ReversalRedAdaptation") == 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Reversal Red Damage."), false);
			}
			if (entity.getPersistentData().getDouble("FrameAdaptation") < 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cFrame Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("FrameAdaptation") / 200) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("FrameAdaptation") == 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Frame Damage."), false);
			}
			if (entity.getPersistentData().getDouble("RatioAdaptation") < 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cRatio Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("RatioAdaptation") / 200) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("RatioAdaptation") == 200) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Ratio Damage."), false);
			}
			if (entity.getPersistentData().getDouble("ShrineAdaptation") < 350) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7cMalevolent Shrine Damage " + new java.text.DecimalFormat("##").format((entity.getPersistentData().getDouble("ShrineAdaptation") / 350) * 100) + "% Adapted")), false);
			} else if (entity.getPersistentData().getDouble("ShrineAdaptation") == 350) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7aFully Adapted to Malevolent Shrine Damage."), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You do not have the Adaption cursed technique!"), false);
		}
	}
}
