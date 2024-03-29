package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftkaisen.entity.UraumeEntity;
import net.mcreator.craftkaisen.entity.SmallPoxDeityEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.InventoryCurseMobEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.FlyingCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FameGainMobProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MahitoEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 20000, 50000)));
		}
		if (entity instanceof HanamiEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 9000, 13000)));
		}
		if (entity instanceof JogoEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 20000, 60000)));
		}
		if (entity instanceof RyomenSukunaEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 60000, 90000)));
		}
		if (entity instanceof HeianEraSukunaEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 90000, 150000)));
		}
		if (entity instanceof InventoryCurseMobEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 10, 25)));
		}
		if (entity instanceof RoppongiCursedSpiritEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 200, 300)));
		}
		if (entity instanceof RugbyFieldCursedSpiritEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 500, 600)));
		}
		if (entity instanceof FingerBearerEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 5000, 9000)));
		}
		if (entity instanceof MouthCursedSpiritEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 200, 300)));
		}
		if (entity instanceof KoGuyEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 1000, 5000)));
		}
		if (entity instanceof SmallPoxDeityEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 700, 900)));
		}
		if (entity instanceof FlyingCursedSpiritEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 300, 500)));
		}
		if (entity instanceof MegunaEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 80000, 100000)));
		}
		if (entity instanceof UraumeEntity) {
			entity.getPersistentData().putDouble("famegain", (Mth.nextInt(RandomSource.create(), 60000, 69000)));
		}
	}
}
