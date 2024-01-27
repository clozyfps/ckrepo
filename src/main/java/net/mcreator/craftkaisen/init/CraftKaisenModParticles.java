
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.particle.SoundWaveParticle;
import net.mcreator.craftkaisen.client.particle.SnowflakeParticle;
import net.mcreator.craftkaisen.client.particle.ShrineSlice3Particle;
import net.mcreator.craftkaisen.client.particle.ShrineSlice2Particle;
import net.mcreator.craftkaisen.client.particle.ShrineSlice1Particle;
import net.mcreator.craftkaisen.client.particle.RedParticleParticle;
import net.mcreator.craftkaisen.client.particle.RedParticleBigParticle;
import net.mcreator.craftkaisen.client.particle.RatioParticleParticle;
import net.mcreator.craftkaisen.client.particle.PurplePulseParticle;
import net.mcreator.craftkaisen.client.particle.PurpleParticleParticle;
import net.mcreator.craftkaisen.client.particle.PurpleElectricityParticleParticle;
import net.mcreator.craftkaisen.client.particle.PurpleElectricityParticle;
import net.mcreator.craftkaisen.client.particle.PurpleBloodSlashParticle;
import net.mcreator.craftkaisen.client.particle.PunchImpactParticle;
import net.mcreator.craftkaisen.client.particle.NueElectricityParticle;
import net.mcreator.craftkaisen.client.particle.MistPurpleParticle;
import net.mcreator.craftkaisen.client.particle.LapseParticleParticle;
import net.mcreator.craftkaisen.client.particle.InfinityParticleParticle;
import net.mcreator.craftkaisen.client.particle.FireArrowParticleParticle;
import net.mcreator.craftkaisen.client.particle.EvadeParticleParticle;
import net.mcreator.craftkaisen.client.particle.DomainClashParticleParticle;
import net.mcreator.craftkaisen.client.particle.ClashParticleParticle;
import net.mcreator.craftkaisen.client.particle.BlueParticleParticle;
import net.mcreator.craftkaisen.client.particle.BloodSplashParticle;
import net.mcreator.craftkaisen.client.particle.BloodParticle;
import net.mcreator.craftkaisen.client.particle.BlackLightningParticle;
import net.mcreator.craftkaisen.client.particle.BlackFlashPulseParticle;
import net.mcreator.craftkaisen.client.particle.BlackFlashLightningParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftKaisenModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get(), PurpleElectricityParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.SNOWFLAKE.get(), SnowflakeParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.SOUND_WAVE.get(), SoundWaveParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.RED_PARTICLE.get(), RedParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.BLOOD.get(), BloodParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.BLUE_PARTICLE.get(), BlueParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.INFINITY_PARTICLE.get(), InfinityParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.FIRE_ARROW_PARTICLE.get(), FireArrowParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.NUE_ELECTRICITY.get(), NueElectricityParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.BLACK_FLASH_PULSE.get(), BlackFlashPulseParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.CLASH_PARTICLE.get(), ClashParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.PUNCH_IMPACT.get(), PunchImpactParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.BLOOD_SPLASH.get(), BloodSplashParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.MIST_PURPLE.get(), MistPurpleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.PURPLE_PULSE.get(), PurplePulseParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.EVADE_PARTICLE.get(), EvadeParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.LAPSE_PARTICLE.get(), LapseParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.PURPLE_PARTICLE.get(), PurpleParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.PURPLE_ELECTRICITY_PARTICLE.get(), PurpleElectricityParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.DOMAIN_CLASH_PARTICLE.get(), DomainClashParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.BLACK_FLASH_LIGHTNING.get(), BlackFlashLightningParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.RED_PARTICLE_BIG.get(), RedParticleBigParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.RATIO_PARTICLE.get(), RatioParticleParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.SHRINE_SLICE_1.get(), ShrineSlice1Particle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.SHRINE_SLICE_2.get(), ShrineSlice2Particle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.SHRINE_SLICE_3.get(), ShrineSlice3Particle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.PURPLE_BLOOD_SLASH.get(), PurpleBloodSlashParticle::provider);
		event.registerSpriteSet(CraftKaisenModParticleTypes.BLACK_LIGHTNING.get(), BlackLightningParticle::provider);
	}
}
