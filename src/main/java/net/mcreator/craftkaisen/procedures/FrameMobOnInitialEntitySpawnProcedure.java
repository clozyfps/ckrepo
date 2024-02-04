package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class FrameMobOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(24, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState()));
		});
	}
}
