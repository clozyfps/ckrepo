package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WaterDripParticleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.DRIPPING_DRIPSTONE_WATER, x, y, z, 0, 0, 0);
	}
}
