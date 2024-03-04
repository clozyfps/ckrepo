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
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftLegDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "leftlegdetach"))));
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LeftLegGone = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RemoveLimbsProcedure.execute(world, x, y, z, entity);
			{
				double _setval = 99;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.leftLegDamage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftArmDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "leftarmdetach"))));
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LeftArmGone = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RemoveLimbsProcedure.execute(world, x, y, z, entity);
			{
				double _setval = 99;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.leftArmDamage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightArmDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "rightarmdetach"))));
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RightArmGone = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RemoveLimbsProcedure.execute(world, x, y, z, entity);
			{
				double _setval = 99;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.rightArmDamage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightLegDamage >= 100) {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "rightlegdetach"))));
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RightLegGone = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RemoveLimbsProcedure.execute(world, x, y, z, entity);
			{
				double _setval = 99;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.rightLegDamage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
