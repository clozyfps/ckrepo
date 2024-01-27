package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

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
		if (entity instanceof RyomenSukunaEntity || entity instanceof MegunaEntity || entity instanceof FlyHeadEntity) {
			entity.getPersistentData().putDouble("ce", 90000);
		}
		if (entity instanceof SatoruGojoEntity) {
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
		if (entity instanceof RoppongiCursedSpiritEntity || entity instanceof RugbyFieldCursedSpiritEntity || entity instanceof FlyingCursedSpiritEntity || entity instanceof MouthCursedSpiritEntity || entity instanceof PandaEntity) {
			entity.getPersistentData().putDouble("ce", 3000);
		}
		if (entity instanceof BlackDivineDogEntity || entity instanceof WhiteDivineDogEntity || entity instanceof GreatSerpentEntity || entity instanceof ToadEntity || entity instanceof MaximumElephantEntity || entity instanceof RoundDeerEntity
				|| entity instanceof TenShadowRabbitEntity) {
			entity.getPersistentData().putDouble("ce", 2500);
		}
		if (entity instanceof EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity || entity instanceof MergedBeastAgitoEntity) {
			entity.getPersistentData().putDouble("ce", 50000);
		}
	}
}
