package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.entity.WhiteDivineDogEntity;
import net.mcreator.craftkaisen.entity.UraumeEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.TogeInumakiEntity;
import net.mcreator.craftkaisen.entity.ToadEntity;
import net.mcreator.craftkaisen.entity.TenShadowRabbitEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoundDeerEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;
import net.mcreator.craftkaisen.entity.PandaEntity;
import net.mcreator.craftkaisen.entity.NobaraKugisakiEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MergedBeastAgitoEntity;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.MegumiFushiguroEntity;
import net.mcreator.craftkaisen.entity.MaximumElephantEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
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
public class ExpMobsProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof RyomenSukunaEntity || entity instanceof MegunaEntity || entity instanceof HeianEraSukunaEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 5000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof SatoruGojoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 5000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof YutaOkkotsuEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 1500;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof HajimeKashimoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 1000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof YujiItadoriEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 700;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof FingerBearerEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 400;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof ChosoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 1500;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof AoiTodoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof AwakenedMakiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 500;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof JogoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 2500;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof HanamiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 2000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof KoGuyEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof MegumiFushiguroEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 400;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof NanamiKentoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 500;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof NobaraKugisakiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof MahitoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 3000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof TogeInumakiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof TojiFushiguroEntity || entity instanceof ResurrectedTojiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 3000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof RoppongiCursedSpiritEntity || entity instanceof RugbyFieldCursedSpiritEntity || entity instanceof FlyingCursedSpiritEntity || entity instanceof MouthCursedSpiritEntity || entity instanceof PandaEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof BlackDivineDogEntity || entity instanceof WhiteDivineDogEntity || entity instanceof GreatSerpentEntity || entity instanceof ToadEntity || entity instanceof MaximumElephantEntity || entity instanceof RoundDeerEntity
				|| entity instanceof TenShadowRabbitEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 50;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity || entity instanceof MergedBeastAgitoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 1500;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof UraumeEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 1000;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
