package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftkaisen.CraftKaisenMod;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class RemoveLimbsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(1, () -> {
			if (entity.getPersistentData().getBoolean("leftLegGone")) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "leftleggone"))));
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("leftArmGone")) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "leftarmgone"))));
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("rightArmGone")) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "rightarmgone"))));
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("rightLegGone")) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
						if (animation != null) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "rightleggone"))));
						}
					}
				}
			}
		});
	}
}
