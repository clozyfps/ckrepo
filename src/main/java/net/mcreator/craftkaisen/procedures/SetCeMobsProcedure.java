package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.entity.WhiteDivineDogEntity;
import net.mcreator.craftkaisen.entity.UraumeEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.TogeInumakiEntity;
import net.mcreator.craftkaisen.entity.ToadEntity;
import net.mcreator.craftkaisen.entity.TenShadowRabbitEntity;
import net.mcreator.craftkaisen.entity.ShinjukuGojoEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoundDeerEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;
import net.mcreator.craftkaisen.entity.NobaraKugisakiEntity;
import net.mcreator.craftkaisen.entity.NaobitoEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MergedBeastAgitoEntity;
import net.mcreator.craftkaisen.entity.MeiMeiEntity;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.MegumiFushiguroEntity;
import net.mcreator.craftkaisen.entity.MaximumElephantEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.KenjakuEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.JinichiZeninEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.HajimeKashimoEntity;
import net.mcreator.craftkaisen.entity.GreatSerpentEntity;
import net.mcreator.craftkaisen.entity.FlyingCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;
import net.mcreator.craftkaisen.entity.ChosoEntity;
import net.mcreator.craftkaisen.entity.BlackDivineDogEntity;
import net.mcreator.craftkaisen.entity.AwakenedMakiEntity;
import net.mcreator.craftkaisen.entity.AoiTodoEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetCeMobsProcedure {
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
		if (entity instanceof RyomenSukunaEntity || entity instanceof MegunaEntity || entity instanceof HeianEraSukunaEntity) {
			entity.getPersistentData().putDouble("ce", 90000);
		}
		if (entity instanceof SatoruGojoEntity || entity instanceof ShinjukuGojoEntity) {
			entity.getPersistentData().putDouble("ce", 100000);
		}
		if (entity instanceof YutaOkkotsuEntity) {
			entity.getPersistentData().putDouble("ce", 120000);
		}
		if (entity instanceof HajimeKashimoEntity) {
			entity.getPersistentData().putDouble("ce", 20000);
		}
		if (entity instanceof YujiItadoriEntity) {
			entity.getPersistentData().putDouble("ce", 1500);
		}
		if (entity instanceof FingerBearerEntity) {
			entity.getPersistentData().putDouble("ce", 15000);
		}
		if (entity instanceof ChosoEntity) {
			entity.getPersistentData().putDouble("ce", 9000);
		}
		if (entity instanceof AoiTodoEntity) {
			entity.getPersistentData().putDouble("ce", 13000);
		}
		if (entity instanceof AwakenedMakiEntity) {
			entity.getPersistentData().putDouble("ce", 10);
		}
		if (entity instanceof JogoEntity) {
			entity.getPersistentData().putDouble("ce", 80000);
		}
		if (entity instanceof HanamiEntity) {
			entity.getPersistentData().putDouble("ce", 30000);
		}
		if (entity instanceof KoGuyEntity) {
			entity.getPersistentData().putDouble("ce", 1000);
		}
		if (entity instanceof MegumiFushiguroEntity) {
			entity.getPersistentData().putDouble("ce", 7000);
		}
		if (entity instanceof NanamiKentoEntity) {
			entity.getPersistentData().putDouble("ce", 14000);
		}
		if (entity instanceof NobaraKugisakiEntity) {
			entity.getPersistentData().putDouble("ce", 11000);
		}
		if (entity instanceof MahitoEntity) {
			entity.getPersistentData().putDouble("ce", 68000);
		}
		if (entity instanceof TogeInumakiEntity) {
			entity.getPersistentData().putDouble("ce", 7000);
		}
		if (entity instanceof TojiFushiguroEntity || entity instanceof ResurrectedTojiEntity) {
			entity.getPersistentData().putDouble("ce", 0);
		}
		if (entity instanceof RoppongiCursedSpiritEntity || entity instanceof RugbyFieldCursedSpiritEntity || entity instanceof FlyingCursedSpiritEntity || entity instanceof MouthCursedSpiritEntity) {
			entity.getPersistentData().putDouble("ce", 3000);
		}
		if (entity instanceof BlackDivineDogEntity || entity instanceof WhiteDivineDogEntity || entity instanceof GreatSerpentEntity || entity instanceof ToadEntity || entity instanceof MaximumElephantEntity || entity instanceof RoundDeerEntity
				|| entity instanceof TenShadowRabbitEntity) {
			entity.getPersistentData().putDouble("ce", 2500);
		}
		if (entity instanceof EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity || entity instanceof MergedBeastAgitoEntity) {
			entity.getPersistentData().putDouble("ce", 50000);
		}
		if (entity instanceof JinichiZeninEntity) {
			entity.getPersistentData().putDouble("ce", 20000);
		}
		if (entity instanceof MeiMeiEntity) {
			entity.getPersistentData().putDouble("ce", 15000);
		}
		if (entity instanceof NaobitoEntity) {
			entity.getPersistentData().putDouble("ce", 24000);
		}
		if (entity instanceof KenjakuEntity) {
			entity.getPersistentData().putDouble("ce", 85000);
		}
		if (entity instanceof UraumeEntity) {
			entity.getPersistentData().putDouble("ce", 40000);
		}
	}
}
