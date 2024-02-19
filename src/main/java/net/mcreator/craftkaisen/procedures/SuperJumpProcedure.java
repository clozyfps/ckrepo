package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SuperJumpProcedure {
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
		if (entity.isShiftKeyDown()) {
			entity.getPersistentData().putDouble("chargeJump", (entity.getPersistentData().getDouble("chargeJump") + 1));
			if (entity.getPersistentData().getDouble("chargeJump") >= 20 && entity.getPersistentData().getDouble("chargeJump") < 50) {
				if (!entity.getPersistentData().getBoolean("tier1")) {
					entity.getPersistentData().putBoolean("tier1", true);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7lTIER 1"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 1 0.1 1 0 30");
			} else if (entity.getPersistentData().getDouble("chargeJump") >= 50 && entity.getPersistentData().getDouble("chargeJump") < 80) {
				entity.getPersistentData().putBoolean("tier1", false);
				if (!entity.getPersistentData().getBoolean("tier2")) {
					entity.getPersistentData().putBoolean("tier2", true);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7lTIER 2"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 1.5 0.1 1.5 0 30");
			} else if (entity.getPersistentData().getDouble("chargeJump") >= 80) {
				entity.getPersistentData().putBoolean("tier2", false);
				if (!entity.getPersistentData().getBoolean("tier3")) {
					entity.getPersistentData().putBoolean("tier3", true);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7lTIER 3"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 1 1 1 1 ^0 ^0 ^0 2 0.1 2 0 30");
			}
		} else if (!entity.isShiftKeyDown() && entity.getPersistentData().getDouble("chargeJump") >= 20) {
			entity.getPersistentData().putBoolean("tier1", false);
			entity.getPersistentData().putBoolean("tier2", false);
			entity.getPersistentData().putBoolean("tier3", false);
			if (entity.getPersistentData().getDouble("chargeJump") >= 20 && entity.getPersistentData().getDouble("chargeJump") < 50) {
				entity.setDeltaMovement(new Vec3((1 * entity.getLookAngle().x), (1 * entity.getLookAngle().y), (1 * entity.getLookAngle().z)));
			} else if (entity.getPersistentData().getDouble("chargeJump") >= 50 && entity.getPersistentData().getDouble("chargeJump") < 80) {
				entity.setDeltaMovement(new Vec3((1.7 * entity.getLookAngle().x), (1.7 * entity.getLookAngle().y), (1.7 * entity.getLookAngle().z)));
			} else if (entity.getPersistentData().getDouble("chargeJump") >= 80) {
				entity.setDeltaMovement(new Vec3((2.5 * entity.getLookAngle().x), (2.5 * entity.getLookAngle().y), (2.5 * entity.getLookAngle().z)));
			}
			entity.getPersistentData().putDouble("chargeJump", 0);
			CraftKaisenMod.queueServerWork(20, () -> {
				entity.fallDistance = 0;
			});
		}
	}
}
