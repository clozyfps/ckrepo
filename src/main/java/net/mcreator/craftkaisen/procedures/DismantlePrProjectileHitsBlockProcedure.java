package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class DismantlePrProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("dismantlerandom", (Mth.nextInt(RandomSource.create(), 1, 2)));
		if (entity.getPersistentData().getDouble("dismantlerandom") == 1) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			world.destroyBlock(BlockPos.containing(x + 1, y + 1, z), false);
			world.destroyBlock(BlockPos.containing(x + 2, y + 2, z), false);
			world.destroyBlock(BlockPos.containing(x + 3, y + 3, z), false);
			world.destroyBlock(BlockPos.containing(x + 4, y + 4, z), false);
			world.destroyBlock(BlockPos.containing(x + 5, y + 5, z), false);
			world.destroyBlock(BlockPos.containing(x, y + -1, z + 1), false);
			world.destroyBlock(BlockPos.containing(x, y + -2, z + 2), false);
			world.destroyBlock(BlockPos.containing(x, y + -3, z + 3), false);
			world.destroyBlock(BlockPos.containing(x, y + -4, z + 4), false);
			world.destroyBlock(BlockPos.containing(x, y + -5, z + 5), false);
			world.destroyBlock(BlockPos.containing(x, y + -5, z + 6), false);
			world.destroyBlock(BlockPos.containing(x, y + -5, z + -5), false);
			world.destroyBlock(BlockPos.containing(x, y + -5, z + -1), false);
			world.destroyBlock(BlockPos.containing(x, y + -5, z + -2), false);
		} else if (entity.getPersistentData().getDouble("dismantlerandom") == 2) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			world.destroyBlock(BlockPos.containing(x + 1, y + -1, z), false);
			world.destroyBlock(BlockPos.containing(x + 2, y + -2, z), false);
			world.destroyBlock(BlockPos.containing(x + 3, y + -3, z), false);
			world.destroyBlock(BlockPos.containing(x + 4, y + -4, z), false);
			world.destroyBlock(BlockPos.containing(x + 5, y + -5, z), false);
			world.destroyBlock(BlockPos.containing(x, y + 1, z + 1), false);
			world.destroyBlock(BlockPos.containing(x, y + 2, z + 2), false);
			world.destroyBlock(BlockPos.containing(x, y + 3, z + 3), false);
			world.destroyBlock(BlockPos.containing(x, y + 4, z + 4), false);
			world.destroyBlock(BlockPos.containing(x, y + 5, z + 5), false);
		}
	}
}
