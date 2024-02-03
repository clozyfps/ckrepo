
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.ZoneMobEffect;
import net.mcreator.craftkaisen.potion.WintryIcicleMobEffect;
import net.mcreator.craftkaisen.potion.VesselPotionEffectMobEffect;
import net.mcreator.craftkaisen.potion.UnlimitedVoidEffectMobEffect;
import net.mcreator.craftkaisen.potion.TwistingMobEffect;
import net.mcreator.craftkaisen.potion.TojiCooldownMobEffect;
import net.mcreator.craftkaisen.potion.ThroughBlocksMobEffect;
import net.mcreator.craftkaisen.potion.SurgeMobEffect;
import net.mcreator.craftkaisen.potion.SukunaMobEffect;
import net.mcreator.craftkaisen.potion.SukunaItadoriMobEffect;
import net.mcreator.craftkaisen.potion.StopAttacksMobEffect;
import net.mcreator.craftkaisen.potion.SoulMultiplicityActiveMobEffect;
import net.mcreator.craftkaisen.potion.SmallPoxDeityCooldownMobEffect;
import net.mcreator.craftkaisen.potion.SlicingMahitoMobEffect;
import net.mcreator.craftkaisen.potion.SimpleDomainMobEffect;
import net.mcreator.craftkaisen.potion.SimpleDomainCooldownMobEffect;
import net.mcreator.craftkaisen.potion.RikasLoveMobEffect;
import net.mcreator.craftkaisen.potion.RikaStatusMobEffect;
import net.mcreator.craftkaisen.potion.ReikiMobEffect;
import net.mcreator.craftkaisen.potion.RCTMobEffect;
import net.mcreator.craftkaisen.potion.PureLovePreMobEffect;
import net.mcreator.craftkaisen.potion.PureLoveActiveMobEffect;
import net.mcreator.craftkaisen.potion.PunchBarragePotionMobEffect;
import net.mcreator.craftkaisen.potion.PreRedMobEffect;
import net.mcreator.craftkaisen.potion.PreFireArrowMobEffect;
import net.mcreator.craftkaisen.potion.PiercingBloodMobEffect;
import net.mcreator.craftkaisen.potion.NueElectricityEffectMobEffect;
import net.mcreator.craftkaisen.potion.LapseBlueControlMobEffect;
import net.mcreator.craftkaisen.potion.HeianSlicesMobEffect;
import net.mcreator.craftkaisen.potion.FrozenSolidMobEffect;
import net.mcreator.craftkaisen.potion.FrameOnMobEffect;
import net.mcreator.craftkaisen.potion.FrameEnableMobEffect;
import net.mcreator.craftkaisen.potion.FlowMobEffect;
import net.mcreator.craftkaisen.potion.EvadeCooldownMobEffect;
import net.mcreator.craftkaisen.potion.DomainExpansionMobEffect;
import net.mcreator.craftkaisen.potion.DomainAmplificationMobEffect;
import net.mcreator.craftkaisen.potion.DivergentFistPotionMobEffect;
import net.mcreator.craftkaisen.potion.DistortedBodyKillingMobEffect;
import net.mcreator.craftkaisen.potion.CooldownMobEffect;
import net.mcreator.craftkaisen.potion.ConstantSliceMobEffect;
import net.mcreator.craftkaisen.potion.CleaveMobEffect;
import net.mcreator.craftkaisen.potion.BurnCooldownMobEffect;
import net.mcreator.craftkaisen.potion.BodyShapeCooldownMobEffect;
import net.mcreator.craftkaisen.potion.BodyShapeActiveMobEffect;
import net.mcreator.craftkaisen.potion.BodyCrushingMobEffect;
import net.mcreator.craftkaisen.potion.BloodWaveMobEffect;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftKaisenMod.MODID);
	public static final RegistryObject<MobEffect> LAPSE_BLUE_CONTROL = REGISTRY.register("lapse_blue_control", () -> new LapseBlueControlMobEffect());
	public static final RegistryObject<MobEffect> TWISTING = REGISTRY.register("twisting", () -> new TwistingMobEffect());
	public static final RegistryObject<MobEffect> BODY_CRUSHING = REGISTRY.register("body_crushing", () -> new BodyCrushingMobEffect());
	public static final RegistryObject<MobEffect> VESSEL_POTION_EFFECT = REGISTRY.register("vessel_potion_effect", () -> new VesselPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> PRE_FIRE_ARROW = REGISTRY.register("pre_fire_arrow", () -> new PreFireArrowMobEffect());
	public static final RegistryObject<MobEffect> NUE_ELECTRICITY_EFFECT = REGISTRY.register("nue_electricity_effect", () -> new NueElectricityEffectMobEffect());
	public static final RegistryObject<MobEffect> UNLIMITED_VOID_EFFECT = REGISTRY.register("unlimited_void_effect", () -> new UnlimitedVoidEffectMobEffect());
	public static final RegistryObject<MobEffect> DOMAIN_EXPANSION = REGISTRY.register("domain_expansion", () -> new DomainExpansionMobEffect());
	public static final RegistryObject<MobEffect> CONSTANT_SLICE = REGISTRY.register("constant_slice", () -> new ConstantSliceMobEffect());
	public static final RegistryObject<MobEffect> PUNCH_BARRAGE_POTION = REGISTRY.register("punch_barrage_potion", () -> new PunchBarragePotionMobEffect());
	public static final RegistryObject<MobEffect> TOJI_COOLDOWN = REGISTRY.register("toji_cooldown", () -> new TojiCooldownMobEffect());
	public static final RegistryObject<MobEffect> PIERCING_BLOOD = REGISTRY.register("piercing_blood", () -> new PiercingBloodMobEffect());
	public static final RegistryObject<MobEffect> BURN_COOLDOWN = REGISTRY.register("burn_cooldown", () -> new BurnCooldownMobEffect());
	public static final RegistryObject<MobEffect> DIVERGENT_FIST_POTION = REGISTRY.register("divergent_fist_potion", () -> new DivergentFistPotionMobEffect());
	public static final RegistryObject<MobEffect> SIMPLE_DOMAIN = REGISTRY.register("simple_domain", () -> new SimpleDomainMobEffect());
	public static final RegistryObject<MobEffect> EVADE_COOLDOWN = REGISTRY.register("evade_cooldown", () -> new EvadeCooldownMobEffect());
	public static final RegistryObject<MobEffect> PRE_RED = REGISTRY.register("pre_red", () -> new PreRedMobEffect());
	public static final RegistryObject<MobEffect> PURE_LOVE_ACTIVE = REGISTRY.register("pure_love_active", () -> new PureLoveActiveMobEffect());
	public static final RegistryObject<MobEffect> PURE_LOVE_PRE = REGISTRY.register("pure_love_pre", () -> new PureLovePreMobEffect());
	public static final RegistryObject<MobEffect> SUKUNA = REGISTRY.register("sukuna", () -> new SukunaMobEffect());
	public static final RegistryObject<MobEffect> SMALL_POX_DEITY_COOLDOWN = REGISTRY.register("small_pox_deity_cooldown", () -> new SmallPoxDeityCooldownMobEffect());
	public static final RegistryObject<MobEffect> ZONE = REGISTRY.register("zone", () -> new ZoneMobEffect());
	public static final RegistryObject<MobEffect> DOMAIN_AMPLIFICATION = REGISTRY.register("domain_amplification", () -> new DomainAmplificationMobEffect());
	public static final RegistryObject<MobEffect> SIMPLE_DOMAIN_COOLDOWN = REGISTRY.register("simple_domain_cooldown", () -> new SimpleDomainCooldownMobEffect());
	public static final RegistryObject<MobEffect> RCT = REGISTRY.register("rct", () -> new RCTMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> BODY_SHAPE_ACTIVE = REGISTRY.register("body_shape_active", () -> new BodyShapeActiveMobEffect());
	public static final RegistryObject<MobEffect> BODY_SHAPE_COOLDOWN = REGISTRY.register("body_shape_cooldown", () -> new BodyShapeCooldownMobEffect());
	public static final RegistryObject<MobEffect> SLICING_MAHITO = REGISTRY.register("slicing_mahito", () -> new SlicingMahitoMobEffect());
	public static final RegistryObject<MobEffect> SOUL_MULTIPLICITY_ACTIVE = REGISTRY.register("soul_multiplicity_active", () -> new SoulMultiplicityActiveMobEffect());
	public static final RegistryObject<MobEffect> DISTORTED_BODY_KILLING = REGISTRY.register("distorted_body_killing", () -> new DistortedBodyKillingMobEffect());
	public static final RegistryObject<MobEffect> BLOOD_WAVE = REGISTRY.register("blood_wave", () -> new BloodWaveMobEffect());
	public static final RegistryObject<MobEffect> SUKUNA_ITADORI = REGISTRY.register("sukuna_itadori", () -> new SukunaItadoriMobEffect());
	public static final RegistryObject<MobEffect> SURGE = REGISTRY.register("surge", () -> new SurgeMobEffect());
	public static final RegistryObject<MobEffect> HEIAN_SLICES = REGISTRY.register("heian_slices", () -> new HeianSlicesMobEffect());
	public static final RegistryObject<MobEffect> THROUGH_BLOCKS = REGISTRY.register("through_blocks", () -> new ThroughBlocksMobEffect());
	public static final RegistryObject<MobEffect> CLEAVE = REGISTRY.register("cleave", () -> new CleaveMobEffect());
	public static final RegistryObject<MobEffect> REIKI = REGISTRY.register("reiki", () -> new ReikiMobEffect());
	public static final RegistryObject<MobEffect> STOP_ATTACKS = REGISTRY.register("stop_attacks", () -> new StopAttacksMobEffect());
	public static final RegistryObject<MobEffect> RIKA_STATUS = REGISTRY.register("rika_status", () -> new RikaStatusMobEffect());
	public static final RegistryObject<MobEffect> RIKAS_LOVE = REGISTRY.register("rikas_love", () -> new RikasLoveMobEffect());
	public static final RegistryObject<MobEffect> WINTRY_ICICLE = REGISTRY.register("wintry_icicle", () -> new WintryIcicleMobEffect());
	public static final RegistryObject<MobEffect> FLOW = REGISTRY.register("flow", () -> new FlowMobEffect());
	public static final RegistryObject<MobEffect> FRAME_ENABLE = REGISTRY.register("frame_enable", () -> new FrameEnableMobEffect());
	public static final RegistryObject<MobEffect> FRAME_ON = REGISTRY.register("frame_on", () -> new FrameOnMobEffect());
	public static final RegistryObject<MobEffect> FROZEN_SOLID = REGISTRY.register("frozen_solid", () -> new FrozenSolidMobEffect());
}
