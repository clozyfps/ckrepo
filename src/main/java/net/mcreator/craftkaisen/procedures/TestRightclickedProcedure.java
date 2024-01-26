package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TestRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String blocktext = "";
		BlockState blockanother = Blocks.AIR.defaultBlockState();
		double myx = 0;
		double myy = 0;
		double myz = 0;
		if (!entity.getPersistentData().getBoolean("block")) {
			entity.getPersistentData().putBoolean("block", true);
			myx = entity.getX();
			myy = entity.getY();
			myz = entity.getZ();
			int horizontalRadiusHemiTop = (int) 10 - 1;
			int verticalRadiusHemiTop = (int) 10;
			int yIterationsHemiTop = verticalRadiusHemiTop;
			for (int i = 0; i < yIterationsHemiTop; i++) {
				if (i == verticalRadiusHemiTop) {
					continue;
				}
				for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
					for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
								+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
						if (distanceSq <= 1.0) {
							blocktext = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putString("oldblock", blocktext);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("block")) {
			TestExtraProcedure.execute(world, myx, myy, myz);
		}
	}
}
