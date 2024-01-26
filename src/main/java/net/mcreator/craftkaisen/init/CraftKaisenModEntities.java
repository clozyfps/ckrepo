
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.entity.WoodenBoxEntity;
import net.mcreator.craftkaisen.entity.WhiteDivineDogEntity;
import net.mcreator.craftkaisen.entity.WaterMaximumElephantProjectileEntity;
import net.mcreator.craftkaisen.entity.VolcanicEruptionProjectileEntity;
import net.mcreator.craftkaisen.entity.UnlimitedVoidMobEntity;
import net.mcreator.craftkaisen.entity.TwistRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.ToadEntity;
import net.mcreator.craftkaisen.entity.TenShadowRabbitEntity;
import net.mcreator.craftkaisen.entity.SuguruGetoEntity;
import net.mcreator.craftkaisen.entity.StronghitProjectileEntity;
import net.mcreator.craftkaisen.entity.SmallPoxDomainSpawnerEntity;
import net.mcreator.craftkaisen.entity.SmallPoxDeityEntity;
import net.mcreator.craftkaisen.entity.SlicingExcorismProjectileEntity;
import net.mcreator.craftkaisen.entity.SleepRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.ShadowFrogEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RunAwayRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoundDeerEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RopeMobEntity;
import net.mcreator.craftkaisen.entity.RootProjectileProjectileEntity;
import net.mcreator.craftkaisen.entity.RikoAmanaiEntity;
import net.mcreator.craftkaisen.entity.RikaEntity;
import net.mcreator.craftkaisen.entity.ReversalRedProjectileProjectileEntity;
import net.mcreator.craftkaisen.entity.ReversalRedProjectile1Entity;
import net.mcreator.craftkaisen.entity.ReversalRedEntityEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;
import net.mcreator.craftkaisen.entity.RainbowDragonEntity;
import net.mcreator.craftkaisen.entity.PureLoveBeamRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.PoxDeityDomainEntity;
import net.mcreator.craftkaisen.entity.PandaEntity;
import net.mcreator.craftkaisen.entity.OldLadyEntity;
import net.mcreator.craftkaisen.entity.NueEntity;
import net.mcreator.craftkaisen.entity.NobaraKugisakiEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.NailProjectileProjectileEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.MaximumElephantEntity;
import net.mcreator.craftkaisen.entity.MaxMeteorEntity;
import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.MahitoCloneEntity;
import net.mcreator.craftkaisen.entity.LapseBlueRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.InventoryCurseMobEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleProjectileProjectileEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleGojoEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.HajimeKashimoEntity;
import net.mcreator.craftkaisen.entity.GreatSerpentEntity;
import net.mcreator.craftkaisen.entity.FlyingCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.FlyHeadEntity;
import net.mcreator.craftkaisen.entity.FlowerProjectileProjectileEntity;
import net.mcreator.craftkaisen.entity.FireArrowProjectileEntity;
import net.mcreator.craftkaisen.entity.FireArrowMobProjectileEntity;
import net.mcreator.craftkaisen.entity.FingerBearerProjectileEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.entity.FindBlueLocationProjectileEntity;
import net.mcreator.craftkaisen.entity.ExplodeRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.EmberInsectProjectileProjectileEntity;
import net.mcreator.craftkaisen.entity.EmberInsectEntity;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;
import net.mcreator.craftkaisen.entity.DontMoveRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.DismantleProjectileEntity;
import net.mcreator.craftkaisen.entity.DisasterFlameRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.CrushedRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.CrumbleAwayRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.CoffinMountainEntity;
import net.mcreator.craftkaisen.entity.ChosoEntity;
import net.mcreator.craftkaisen.entity.ChimeraShadowGardenMobEntity;
import net.mcreator.craftkaisen.entity.BodyRepel3Entity;
import net.mcreator.craftkaisen.entity.BodyRepel2Entity;
import net.mcreator.craftkaisen.entity.BodyRepel1Entity;
import net.mcreator.craftkaisen.entity.BlueEntityEntity;
import net.mcreator.craftkaisen.entity.BloodMeteoriteProjectileEntity;
import net.mcreator.craftkaisen.entity.BlastAwayRangedProjectileEntity;
import net.mcreator.craftkaisen.entity.BlackMucusProjectileEntity;
import net.mcreator.craftkaisen.entity.BlackDivineDogEntity;
import net.mcreator.craftkaisen.entity.AwakenedMakiEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<EntityType<ReversalRedEntityEntity>> REVERSAL_RED_ENTITY = register("reversal_red_entity", EntityType.Builder.<ReversalRedEntityEntity>of(ReversalRedEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReversalRedEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SatoruGojoEntity>> SATORU_GOJO = register("satoru_gojo",
			EntityType.Builder.<SatoruGojoEntity>of(SatoruGojoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SatoruGojoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TojiFushiguroEntity>> TOJI_FUSHIGURO = register("toji_fushiguro",
			EntityType.Builder.<TojiFushiguroEntity>of(TojiFushiguroEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TojiFushiguroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YujiItadoriEntity>> YUJI_ITADORI = register("yuji_itadori",
			EntityType.Builder.<YujiItadoriEntity>of(YujiItadoriEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YujiItadoriEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RyomenSukunaEntity>> RYOMEN_SUKUNA = register("ryomen_sukuna",
			EntityType.Builder.<RyomenSukunaEntity>of(RyomenSukunaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RyomenSukunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoppongiCursedSpiritEntity>> ROPPONGI_CURSED_SPIRIT = register("roppongi_cursed_spirit",
			EntityType.Builder.<RoppongiCursedSpiritEntity>of(RoppongiCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RoppongiCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YutaOkkotsuEntity>> YUTA_OKKOTSU = register("yuta_okkotsu",
			EntityType.Builder.<YutaOkkotsuEntity>of(YutaOkkotsuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YutaOkkotsuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RikaEntity>> RIKA = register("rika",
			EntityType.Builder.<RikaEntity>of(RikaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RikaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreatSerpentEntity>> GREAT_SERPENT = register("great_serpent",
			EntityType.Builder.<GreatSerpentEntity>of(GreatSerpentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreatSerpentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RugbyFieldCursedSpiritEntity>> RUGBY_FIELD_CURSED_SPIRIT = register("rugby_field_cursed_spirit",
			EntityType.Builder.<RugbyFieldCursedSpiritEntity>of(RugbyFieldCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RugbyFieldCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoGuyEntity>> KO_GUY = register("ko_guy",
			EntityType.Builder.<KoGuyEntity>of(KoGuyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeianEraSukunaEntity>> HEIAN_ERA_SUKUNA = register("heian_era_sukuna",
			EntityType.Builder.<HeianEraSukunaEntity>of(HeianEraSukunaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeianEraSukunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadEntity>> TOAD = register("toad",
			EntityType.Builder.<ToadEntity>of(ToadEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnlimitedVoidMobEntity>> UNLIMITED_VOID_MOB = register("unlimited_void_mob", EntityType.Builder.<UnlimitedVoidMobEntity>of(UnlimitedVoidMobEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnlimitedVoidMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NueEntity>> NUE = register("nue",
			EntityType.Builder.<NueEntity>of(NueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChosoEntity>> CHOSO = register("choso",
			EntityType.Builder.<ChosoEntity>of(ChosoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChosoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MouthCursedSpiritEntity>> MOUTH_CURSED_SPIRIT = register("mouth_cursed_spirit",
			EntityType.Builder.<MouthCursedSpiritEntity>of(MouthCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MouthCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MahitoEntity>> MAHITO = register("mahito",
			EntityType.Builder.<MahitoEntity>of(MahitoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MahitoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NanamiKentoEntity>> NANAMI_KENTO = register("nanami_kento",
			EntityType.Builder.<NanamiKentoEntity>of(NanamiKentoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NanamiKentoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MalevolentShrineEntity>> MALEVOLENT_SHRINE = register("malevolent_shrine", EntityType.Builder.<MalevolentShrineEntity>of(MalevolentShrineEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(500).setUpdateInterval(3).setCustomClientFactory(MalevolentShrineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HanamiEntity>> HANAMI = register("hanami",
			EntityType.Builder.<HanamiEntity>of(HanamiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HanamiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JogoEntity>> JOGO = register("jogo",
			EntityType.Builder.<JogoEntity>of(JogoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JogoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoundDeerEntity>> ROUND_DEER = register("round_deer",
			EntityType.Builder.<RoundDeerEntity>of(RoundDeerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoundDeerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ResurrectedTojiEntity>> RESURRECTED_TOJI = register("resurrected_toji",
			EntityType.Builder.<ResurrectedTojiEntity>of(ResurrectedTojiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ResurrectedTojiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MaximumElephantEntity>> MAXIMUM_ELEPHANT = register("maximum_elephant",
			EntityType.Builder.<MaximumElephantEntity>of(MaximumElephantEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MaximumElephantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackDivineDogEntity>> BLACK_DIVINE_DOG = register("black_divine_dog",
			EntityType.Builder.<BlackDivineDogEntity>of(BlackDivineDogEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackDivineDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteDivineDogEntity>> WHITE_DIVINE_DOG = register("white_divine_dog",
			EntityType.Builder.<WhiteDivineDogEntity>of(WhiteDivineDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteDivineDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TenShadowRabbitEntity>> TEN_SHADOW_RABBIT = register("ten_shadow_rabbit",
			EntityType.Builder.<TenShadowRabbitEntity>of(TenShadowRabbitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TenShadowRabbitEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowFrogEntity>> SHADOW_FROG = register("shadow_frog", EntityType.Builder.<ShadowFrogEntity>of(ShadowFrogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ShadowFrogEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChimeraShadowGardenMobEntity>> CHIMERA_SHADOW_GARDEN_MOB = register("chimera_shadow_garden_mob",
			EntityType.Builder.<ChimeraShadowGardenMobEntity>of(ChimeraShadowGardenMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ChimeraShadowGardenMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NobaraKugisakiEntity>> NOBARA_KUGISAKI = register("nobara_kugisaki",
			EntityType.Builder.<NobaraKugisakiEntity>of(NobaraKugisakiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NobaraKugisakiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EmberInsectEntity>> EMBER_INSECT = register("ember_insect",
			EntityType.Builder.<EmberInsectEntity>of(EmberInsectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmberInsectEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MaxMeteorEntity>> MAX_METEOR = register("max_meteor",
			EntityType.Builder.<MaxMeteorEntity>of(MaxMeteorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MaxMeteorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CoffinMountainEntity>> COFFIN_MOUNTAIN = register("coffin_mountain", EntityType.Builder.<CoffinMountainEntity>of(CoffinMountainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoffinMountainEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InventoryCurseMobEntity>> INVENTORY_CURSE_MOB = register("inventory_curse_mob",
			EntityType.Builder.<InventoryCurseMobEntity>of(InventoryCurseMobEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InventoryCurseMobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FingerBearerEntity>> FINGER_BEARER = register("finger_bearer",
			EntityType.Builder.<FingerBearerEntity>of(FingerBearerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FingerBearerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity>> EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA = register("eight_handled_sword_divergent_sila_divine_general_mahoraga",
			EntityType.Builder.<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity>of(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RainbowDragonEntity>> RAINBOW_DRAGON = register("rainbow_dragon",
			EntityType.Builder.<RainbowDragonEntity>of(RainbowDragonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RainbowDragonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmallPoxDeityEntity>> SMALL_POX_DEITY = register("small_pox_deity",
			EntityType.Builder.<SmallPoxDeityEntity>of(SmallPoxDeityEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmallPoxDeityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WoodenBoxEntity>> WOODEN_BOX = register("wooden_box",
			EntityType.Builder.<WoodenBoxEntity>of(WoodenBoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WoodenBoxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmallPoxDomainSpawnerEntity>> SMALL_POX_DOMAIN_SPAWNER = register("small_pox_domain_spawner",
			EntityType.Builder.<SmallPoxDomainSpawnerEntity>of(SmallPoxDomainSpawnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SmallPoxDomainSpawnerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PoxDeityDomainEntity>> POX_DEITY_DOMAIN = register("pox_deity_domain",
			EntityType.Builder.<PoxDeityDomainEntity>of(PoxDeityDomainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoxDeityDomainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MahitoCloneEntity>> MAHITO_CLONE = register("mahito_clone",
			EntityType.Builder.<MahitoCloneEntity>of(MahitoCloneEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MahitoCloneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlyHeadEntity>> FLY_HEAD = register("fly_head",
			EntityType.Builder.<FlyHeadEntity>of(FlyHeadEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyHeadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OldLadyEntity>> OLD_LADY = register("old_lady",
			EntityType.Builder.<OldLadyEntity>of(OldLadyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OldLadyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RikoAmanaiEntity>> RIKO_AMANAI = register("riko_amanai",
			EntityType.Builder.<RikoAmanaiEntity>of(RikoAmanaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RikoAmanaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueEntityEntity>> BLUE_ENTITY = register("blue_entity", EntityType.Builder.<BlueEntityEntity>of(BlueEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(BlueEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplodeRangedProjectileEntity>> EXPLODE_RANGED_PROJECTILE = register("projectile_explode_ranged_projectile",
			EntityType.Builder.<ExplodeRangedProjectileEntity>of(ExplodeRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ExplodeRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ReversalRedProjectileProjectileEntity>> REVERSAL_RED_PROJECTILE_PROJECTILE = register("projectile_reversal_red_projectile_projectile",
			EntityType.Builder.<ReversalRedProjectileProjectileEntity>of(ReversalRedProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ReversalRedProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DontMoveRangedProjectileEntity>> DONT_MOVE_RANGED_PROJECTILE = register("projectile_dont_move_ranged_projectile",
			EntityType.Builder.<DontMoveRangedProjectileEntity>of(DontMoveRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DontMoveRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlastAwayRangedProjectileEntity>> BLAST_AWAY_RANGED_PROJECTILE = register("projectile_blast_away_ranged_projectile",
			EntityType.Builder.<BlastAwayRangedProjectileEntity>of(BlastAwayRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BlastAwayRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrumbleAwayRangedProjectileEntity>> CRUMBLE_AWAY_RANGED_PROJECTILE = register("projectile_crumble_away_ranged_projectile",
			EntityType.Builder.<CrumbleAwayRangedProjectileEntity>of(CrumbleAwayRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CrumbleAwayRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrushedRangedProjectileEntity>> CRUSHED_RANGED_PROJECTILE = register("projectile_crushed_ranged_projectile",
			EntityType.Builder.<CrushedRangedProjectileEntity>of(CrushedRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CrushedRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SleepRangedProjectileEntity>> SLEEP_RANGED_PROJECTILE = register("projectile_sleep_ranged_projectile",
			EntityType.Builder.<SleepRangedProjectileEntity>of(SleepRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SleepRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RunAwayRangedProjectileEntity>> RUN_AWAY_RANGED_PROJECTILE = register("projectile_run_away_ranged_projectile",
			EntityType.Builder.<RunAwayRangedProjectileEntity>of(RunAwayRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RunAwayRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwistRangedProjectileEntity>> TWIST_RANGED_PROJECTILE = register("projectile_twist_ranged_projectile",
			EntityType.Builder.<TwistRangedProjectileEntity>of(TwistRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TwistRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireArrowProjectileEntity>> FIRE_ARROW_PROJECTILE = register("projectile_fire_arrow_projectile", EntityType.Builder.<FireArrowProjectileEntity>of(FireArrowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FireArrowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireArrowMobProjectileEntity>> FIRE_ARROW_MOB_PROJECTILE = register("projectile_fire_arrow_mob_projectile",
			EntityType.Builder.<FireArrowMobProjectileEntity>of(FireArrowMobProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FireArrowMobProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackMucusProjectileEntity>> BLACK_MUCUS_PROJECTILE = register("projectile_black_mucus_projectile", EntityType.Builder.<BlackMucusProjectileEntity>of(BlackMucusProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlackMucusProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DismantleProjectileEntity>> DISMANTLE_PROJECTILE = register("projectile_dismantle_projectile", EntityType.Builder.<DismantleProjectileEntity>of(DismantleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DismantleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FindBlueLocationProjectileEntity>> FIND_BLUE_LOCATION_PROJECTILE = register("projectile_find_blue_location_projectile",
			EntityType.Builder.<FindBlueLocationProjectileEntity>of(FindBlueLocationProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FindBlueLocationProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BloodMeteoriteProjectileEntity>> BLOOD_METEORITE_PROJECTILE = register("projectile_blood_meteorite_projectile",
			EntityType.Builder.<BloodMeteoriteProjectileEntity>of(BloodMeteoriteProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BloodMeteoriteProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SlicingExcorismProjectileEntity>> SLICING_EXCORISM_PROJECTILE = register("projectile_slicing_excorism_projectile",
			EntityType.Builder.<SlicingExcorismProjectileEntity>of(SlicingExcorismProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SlicingExcorismProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ReversalRedProjectile1Entity>> REVERSAL_RED_PROJECTILE_1 = register("projectile_reversal_red_projectile_1",
			EntityType.Builder.<ReversalRedProjectile1Entity>of(ReversalRedProjectile1Entity::new, MobCategory.MISC).setCustomClientFactory(ReversalRedProjectile1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterMaximumElephantProjectileEntity>> WATER_MAXIMUM_ELEPHANT_PROJECTILE = register("projectile_water_maximum_elephant_projectile",
			EntityType.Builder.<WaterMaximumElephantProjectileEntity>of(WaterMaximumElephantProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WaterMaximumElephantProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NailProjectileProjectileEntity>> NAIL_PROJECTILE_PROJECTILE = register("projectile_nail_projectile_projectile",
			EntityType.Builder.<NailProjectileProjectileEntity>of(NailProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NailProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DisasterFlameRangedProjectileEntity>> DISASTER_FLAME_RANGED_PROJECTILE = register("projectile_disaster_flame_ranged_projectile",
			EntityType.Builder.<DisasterFlameRangedProjectileEntity>of(DisasterFlameRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DisasterFlameRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VolcanicEruptionProjectileEntity>> VOLCANIC_ERUPTION_PROJECTILE = register("projectile_volcanic_eruption_projectile",
			EntityType.Builder.<VolcanicEruptionProjectileEntity>of(VolcanicEruptionProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(VolcanicEruptionProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlowerProjectileProjectileEntity>> FLOWER_PROJECTILE_PROJECTILE = register("projectile_flower_projectile_projectile",
			EntityType.Builder.<FlowerProjectileProjectileEntity>of(FlowerProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FlowerProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HollowPurpleProjectileProjectileEntity>> HOLLOW_PURPLE_PROJECTILE_PROJECTILE = register("projectile_hollow_purple_projectile_projectile",
			EntityType.Builder.<HollowPurpleProjectileProjectileEntity>of(HollowPurpleProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(HollowPurpleProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmberInsectProjectileProjectileEntity>> EMBER_INSECT_PROJECTILE_PROJECTILE = register("projectile_ember_insect_projectile_projectile",
			EntityType.Builder.<EmberInsectProjectileProjectileEntity>of(EmberInsectProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EmberInsectProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PureLoveBeamRangedProjectileEntity>> PURE_LOVE_BEAM_RANGED_PROJECTILE = register("projectile_pure_love_beam_ranged_projectile",
			EntityType.Builder.<PureLoveBeamRangedProjectileEntity>of(PureLoveBeamRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(PureLoveBeamRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RootProjectileProjectileEntity>> ROOT_PROJECTILE_PROJECTILE = register("projectile_root_projectile_projectile",
			EntityType.Builder.<RootProjectileProjectileEntity>of(RootProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RootProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StronghitProjectileEntity>> STRONGHIT_PROJECTILE = register("projectile_stronghit_projectile", EntityType.Builder.<StronghitProjectileEntity>of(StronghitProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StronghitProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LapseBlueRangedProjectileEntity>> LAPSE_BLUE_RANGED_PROJECTILE = register("projectile_lapse_blue_ranged_projectile",
			EntityType.Builder.<LapseBlueRangedProjectileEntity>of(LapseBlueRangedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(LapseBlueRangedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AwakenedMakiEntity>> AWAKENED_MAKI = register("awakened_maki",
			EntityType.Builder.<AwakenedMakiEntity>of(AwakenedMakiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AwakenedMakiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BodyRepel1Entity>> BODY_REPEL_1 = register("body_repel_1", EntityType.Builder.<BodyRepel1Entity>of(BodyRepel1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BodyRepel1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BodyRepel2Entity>> BODY_REPEL_2 = register("body_repel_2", EntityType.Builder.<BodyRepel2Entity>of(BodyRepel2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BodyRepel2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BodyRepel3Entity>> BODY_REPEL_3 = register("body_repel_3", EntityType.Builder.<BodyRepel3Entity>of(BodyRepel3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BodyRepel3Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RopeMobEntity>> ROPE_MOB = register("rope_mob",
			EntityType.Builder.<RopeMobEntity>of(RopeMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RopeMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuguruGetoEntity>> SUGURU_GETO = register("suguru_geto",
			EntityType.Builder.<SuguruGetoEntity>of(SuguruGetoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuguruGetoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PandaEntity>> PANDA = register("panda",
			EntityType.Builder.<PandaEntity>of(PandaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PandaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlyingCursedSpiritEntity>> FLYING_CURSED_SPIRIT = register("flying_cursed_spirit",
			EntityType.Builder.<FlyingCursedSpiritEntity>of(FlyingCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlyingCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MegunaEntity>> MEGUNA = register("meguna",
			EntityType.Builder.<MegunaEntity>of(MegunaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HollowPurpleGojoEntity>> HOLLOW_PURPLE_GOJO = register("projectile_hollow_purple_gojo", EntityType.Builder.<HollowPurpleGojoEntity>of(HollowPurpleGojoEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HollowPurpleGojoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HajimeKashimoEntity>> HAJIME_KASHIMO = register("hajime_kashimo",
			EntityType.Builder.<HajimeKashimoEntity>of(HajimeKashimoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HajimeKashimoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FingerBearerProjectileEntity>> FINGER_BEARER_PROJECTILE = register("projectile_finger_bearer_projectile",
			EntityType.Builder.<FingerBearerProjectileEntity>of(FingerBearerProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FingerBearerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ReversalRedEntityEntity.init();
			SatoruGojoEntity.init();
			TojiFushiguroEntity.init();
			YujiItadoriEntity.init();
			RyomenSukunaEntity.init();
			RoppongiCursedSpiritEntity.init();
			YutaOkkotsuEntity.init();
			RikaEntity.init();
			GreatSerpentEntity.init();
			RugbyFieldCursedSpiritEntity.init();
			KoGuyEntity.init();
			HeianEraSukunaEntity.init();
			ToadEntity.init();
			UnlimitedVoidMobEntity.init();
			NueEntity.init();
			ChosoEntity.init();
			MouthCursedSpiritEntity.init();
			MahitoEntity.init();
			NanamiKentoEntity.init();
			MalevolentShrineEntity.init();
			HanamiEntity.init();
			JogoEntity.init();
			RoundDeerEntity.init();
			ResurrectedTojiEntity.init();
			MaximumElephantEntity.init();
			BlackDivineDogEntity.init();
			WhiteDivineDogEntity.init();
			TenShadowRabbitEntity.init();
			ShadowFrogEntity.init();
			ChimeraShadowGardenMobEntity.init();
			NobaraKugisakiEntity.init();
			EmberInsectEntity.init();
			MaxMeteorEntity.init();
			CoffinMountainEntity.init();
			InventoryCurseMobEntity.init();
			FingerBearerEntity.init();
			EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.init();
			RainbowDragonEntity.init();
			SmallPoxDeityEntity.init();
			WoodenBoxEntity.init();
			SmallPoxDomainSpawnerEntity.init();
			PoxDeityDomainEntity.init();
			MahitoCloneEntity.init();
			FlyHeadEntity.init();
			OldLadyEntity.init();
			RikoAmanaiEntity.init();
			BlueEntityEntity.init();
			AwakenedMakiEntity.init();
			BodyRepel1Entity.init();
			BodyRepel2Entity.init();
			BodyRepel3Entity.init();
			RopeMobEntity.init();
			SuguruGetoEntity.init();
			PandaEntity.init();
			FlyingCursedSpiritEntity.init();
			MegunaEntity.init();
			HajimeKashimoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REVERSAL_RED_ENTITY.get(), ReversalRedEntityEntity.createAttributes().build());
		event.put(SATORU_GOJO.get(), SatoruGojoEntity.createAttributes().build());
		event.put(TOJI_FUSHIGURO.get(), TojiFushiguroEntity.createAttributes().build());
		event.put(YUJI_ITADORI.get(), YujiItadoriEntity.createAttributes().build());
		event.put(RYOMEN_SUKUNA.get(), RyomenSukunaEntity.createAttributes().build());
		event.put(ROPPONGI_CURSED_SPIRIT.get(), RoppongiCursedSpiritEntity.createAttributes().build());
		event.put(YUTA_OKKOTSU.get(), YutaOkkotsuEntity.createAttributes().build());
		event.put(RIKA.get(), RikaEntity.createAttributes().build());
		event.put(GREAT_SERPENT.get(), GreatSerpentEntity.createAttributes().build());
		event.put(RUGBY_FIELD_CURSED_SPIRIT.get(), RugbyFieldCursedSpiritEntity.createAttributes().build());
		event.put(KO_GUY.get(), KoGuyEntity.createAttributes().build());
		event.put(HEIAN_ERA_SUKUNA.get(), HeianEraSukunaEntity.createAttributes().build());
		event.put(TOAD.get(), ToadEntity.createAttributes().build());
		event.put(UNLIMITED_VOID_MOB.get(), UnlimitedVoidMobEntity.createAttributes().build());
		event.put(NUE.get(), NueEntity.createAttributes().build());
		event.put(CHOSO.get(), ChosoEntity.createAttributes().build());
		event.put(MOUTH_CURSED_SPIRIT.get(), MouthCursedSpiritEntity.createAttributes().build());
		event.put(MAHITO.get(), MahitoEntity.createAttributes().build());
		event.put(NANAMI_KENTO.get(), NanamiKentoEntity.createAttributes().build());
		event.put(MALEVOLENT_SHRINE.get(), MalevolentShrineEntity.createAttributes().build());
		event.put(HANAMI.get(), HanamiEntity.createAttributes().build());
		event.put(JOGO.get(), JogoEntity.createAttributes().build());
		event.put(ROUND_DEER.get(), RoundDeerEntity.createAttributes().build());
		event.put(RESURRECTED_TOJI.get(), ResurrectedTojiEntity.createAttributes().build());
		event.put(MAXIMUM_ELEPHANT.get(), MaximumElephantEntity.createAttributes().build());
		event.put(BLACK_DIVINE_DOG.get(), BlackDivineDogEntity.createAttributes().build());
		event.put(WHITE_DIVINE_DOG.get(), WhiteDivineDogEntity.createAttributes().build());
		event.put(TEN_SHADOW_RABBIT.get(), TenShadowRabbitEntity.createAttributes().build());
		event.put(SHADOW_FROG.get(), ShadowFrogEntity.createAttributes().build());
		event.put(CHIMERA_SHADOW_GARDEN_MOB.get(), ChimeraShadowGardenMobEntity.createAttributes().build());
		event.put(NOBARA_KUGISAKI.get(), NobaraKugisakiEntity.createAttributes().build());
		event.put(EMBER_INSECT.get(), EmberInsectEntity.createAttributes().build());
		event.put(MAX_METEOR.get(), MaxMeteorEntity.createAttributes().build());
		event.put(COFFIN_MOUNTAIN.get(), CoffinMountainEntity.createAttributes().build());
		event.put(INVENTORY_CURSE_MOB.get(), InventoryCurseMobEntity.createAttributes().build());
		event.put(FINGER_BEARER.get(), FingerBearerEntity.createAttributes().build());
		event.put(EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA.get(), EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.createAttributes().build());
		event.put(RAINBOW_DRAGON.get(), RainbowDragonEntity.createAttributes().build());
		event.put(SMALL_POX_DEITY.get(), SmallPoxDeityEntity.createAttributes().build());
		event.put(WOODEN_BOX.get(), WoodenBoxEntity.createAttributes().build());
		event.put(SMALL_POX_DOMAIN_SPAWNER.get(), SmallPoxDomainSpawnerEntity.createAttributes().build());
		event.put(POX_DEITY_DOMAIN.get(), PoxDeityDomainEntity.createAttributes().build());
		event.put(MAHITO_CLONE.get(), MahitoCloneEntity.createAttributes().build());
		event.put(FLY_HEAD.get(), FlyHeadEntity.createAttributes().build());
		event.put(OLD_LADY.get(), OldLadyEntity.createAttributes().build());
		event.put(RIKO_AMANAI.get(), RikoAmanaiEntity.createAttributes().build());
		event.put(BLUE_ENTITY.get(), BlueEntityEntity.createAttributes().build());
		event.put(AWAKENED_MAKI.get(), AwakenedMakiEntity.createAttributes().build());
		event.put(BODY_REPEL_1.get(), BodyRepel1Entity.createAttributes().build());
		event.put(BODY_REPEL_2.get(), BodyRepel2Entity.createAttributes().build());
		event.put(BODY_REPEL_3.get(), BodyRepel3Entity.createAttributes().build());
		event.put(ROPE_MOB.get(), RopeMobEntity.createAttributes().build());
		event.put(SUGURU_GETO.get(), SuguruGetoEntity.createAttributes().build());
		event.put(PANDA.get(), PandaEntity.createAttributes().build());
		event.put(FLYING_CURSED_SPIRIT.get(), FlyingCursedSpiritEntity.createAttributes().build());
		event.put(MEGUNA.get(), MegunaEntity.createAttributes().build());
		event.put(HAJIME_KASHIMO.get(), HajimeKashimoEntity.createAttributes().build());
	}
}
