package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class CheckLimbDamageProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftLegDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "leftlegdetach"))));
					}
				}
			}
			entity.getPersistentData().putBoolean("leftLegGone", true);
			RemoveLimbsProcedure.execute(world, entity);
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftArmDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "leftarmdetach"))));
					}
				}
			}
			entity.getPersistentData().putBoolean("leftArmGone", true);
			RemoveLimbsProcedure.execute(world, entity);
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightArmDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "rightarmdetach"))));
					}
				}
			}
			entity.getPersistentData().putBoolean("rightArmGone", true);
			RemoveLimbsProcedure.execute(world, entity);
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightLegDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "rightlegdetach"))));
					}
				}
			}
			entity.getPersistentData().putBoolean("rightLegGone", true);
			RemoveLimbsProcedure.execute(world, entity);
		}
	}
}
