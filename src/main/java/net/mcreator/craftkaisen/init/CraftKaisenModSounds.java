
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftKaisenMod.MODID);
	public static final RegistryObject<SoundEvent> GUTS = REGISTRY.register("guts", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "guts")));
	public static final RegistryObject<SoundEvent> SLICE = REGISTRY.register("slice", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "slice")));
	public static final RegistryObject<SoundEvent> HEARTBEAT = REGISTRY.register("heartbeat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "heartbeat")));
	public static final RegistryObject<SoundEvent> DOMAIN = REGISTRY.register("domain", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "domain")));
	public static final RegistryObject<SoundEvent> ELECTRIC = REGISTRY.register("electric", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "electric")));
	public static final RegistryObject<SoundEvent> HIT = REGISTRY.register("hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "hit")));
	public static final RegistryObject<SoundEvent> CLANK = REGISTRY.register("clank", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "clank")));
	public static final RegistryObject<SoundEvent> SPLASH = REGISTRY.register("splash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "splash")));
	public static final RegistryObject<SoundEvent> BELL = REGISTRY.register("bell", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "bell")));
	public static final RegistryObject<SoundEvent> SUKUNA = REGISTRY.register("sukuna", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "sukuna")));
	public static final RegistryObject<SoundEvent> SUKUNADOMAIN = REGISTRY.register("sukunadomain", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "sukunadomain")));
	public static final RegistryObject<SoundEvent> TELEPORT = REGISTRY.register("teleport", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "teleport")));
	public static final RegistryObject<SoundEvent> CRIT = REGISTRY.register("crit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "crit")));
	public static final RegistryObject<SoundEvent> CLAP = REGISTRY.register("clap", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "clap")));
	public static final RegistryObject<SoundEvent> ICEDOMAIN = REGISTRY.register("icedomain", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "icedomain")));
	public static final RegistryObject<SoundEvent> FREEZINGWIND = REGISTRY.register("freezingwind", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "freezingwind")));
	public static final RegistryObject<SoundEvent> REVERSEFREEZINWIND = REGISTRY.register("reversefreezinwind", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "reversefreezinwind")));
	public static final RegistryObject<SoundEvent> COFFINDOMAIN_END = REGISTRY.register("coffindomain_end", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "coffindomain_end")));
	public static final RegistryObject<SoundEvent> COFFINDOMAIN = REGISTRY.register("coffindomain", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "coffindomain")));
	public static final RegistryObject<SoundEvent> VOIDSPLASH = REGISTRY.register("voidsplash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "voidsplash")));
	public static final RegistryObject<SoundEvent> VOID = REGISTRY.register("void", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("craft_kaisen", "void")));
}
