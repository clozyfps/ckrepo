package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class BlockLavaParticleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.FLAME, x, y, z, 0, 0.5, 0);
		world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0, 0.5, 0);
		world.addParticle(ParticleTypes.LAVA, x, y, z, 0, 0.5, 0);
		world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 0, 0.1, 0);
	}
}
