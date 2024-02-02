package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.HundredDemonsTickEntity;

import javax.annotation.Nullable;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class WorldEventsProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double v = 0;
		double vLevel = 0;
		double vType = 0;
		double vMob = 0;
		double vFaction = 0;
		double randomworldevent = 0;
		double worldeventx = 0;
		double worldeventz = 0;
		double nearx = 0;
		double nearz = 0;
		double neary = 0;
		double eventteleport = 0;
		if (CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer < 120000) {
			CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer = CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer + 1;
			CraftKaisenModVariables.MapVariables.get(world).syncData(world);
		} else if (CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer >= 120000) {
			CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer = 0;
			CraftKaisenModVariables.MapVariables.get(world).syncData(world);
			randomworldevent = Mth.nextInt(RandomSource.create(), 1, 2);
			if (randomworldevent == 1) {
				CraftKaisenModVariables.MapVariables.get(world).nearx = world.getLevelData().getXSpawn() + Mth.nextInt(RandomSource.create(), 100, 1500);
				CraftKaisenModVariables.MapVariables.get(world).syncData(world);
				CraftKaisenModVariables.MapVariables.get(world).nearz = world.getLevelData().getZSpawn() + Mth.nextInt(RandomSource.create(), 100, 1500);
				CraftKaisenModVariables.MapVariables.get(world).syncData(world);
				CraftKaisenModVariables.MapVariables.get(world).neary = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) CraftKaisenModVariables.MapVariables.get(world).nearx,
						(int) CraftKaisenModVariables.MapVariables.get(world).nearz);
				CraftKaisenModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")),
									SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1,
									false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A74Meguna has appeared at x: " + new java.text.DecimalFormat("#").format(Math.round(CraftKaisenModVariables.MapVariables.get(world).nearx)) + " z: "
							+ new java.text.DecimalFormat("#").format(Math.round(CraftKaisenModVariables.MapVariables.get(world).nearz)))), false);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MegunaEntity(CraftKaisenModEntities.MEGUNA.get(), _level);
					entityToSpawn.moveTo(CraftKaisenModVariables.MapVariables.get(world).nearx, CraftKaisenModVariables.MapVariables.get(world).neary, CraftKaisenModVariables.MapVariables.get(world).nearz, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74/eventtp to teleport"), false);
			}
			if (randomworldevent == 2) {
				CraftKaisenModVariables.MapVariables.get(world).nearx = world.getLevelData().getXSpawn() + Mth.nextInt(RandomSource.create(), 100, 1500);
				CraftKaisenModVariables.MapVariables.get(world).syncData(world);
				CraftKaisenModVariables.MapVariables.get(world).nearz = world.getLevelData().getZSpawn() + Mth.nextInt(RandomSource.create(), 100, 1500);
				CraftKaisenModVariables.MapVariables.get(world).syncData(world);
				CraftKaisenModVariables.MapVariables.get(world).neary = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) CraftKaisenModVariables.MapVariables.get(world).nearx,
						(int) CraftKaisenModVariables.MapVariables.get(world).nearz);
				CraftKaisenModVariables.MapVariables.get(world).syncData(world);
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")),
									SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 1, 1,
									false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal(("\u00A74 Night Parade of a Hundred Demons has started at x: " + new java.text.DecimalFormat("#").format(Math.round(CraftKaisenModVariables.MapVariables.get(world).nearx)) + " z: "
									+ new java.text.DecimalFormat("#").format(Math.round(CraftKaisenModVariables.MapVariables.get(world).nearz)))), false);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74/eventtp to teleport"), false);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new HundredDemonsTickEntity(CraftKaisenModEntities.HUNDRED_DEMONS_TICK.get(), _level);
					entityToSpawn.moveTo(CraftKaisenModVariables.MapVariables.get(world).nearx, CraftKaisenModVariables.MapVariables.get(world).neary, CraftKaisenModVariables.MapVariables.get(world).nearz, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
