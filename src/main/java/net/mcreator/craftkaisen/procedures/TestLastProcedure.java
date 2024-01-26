package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class TestLastProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String blocktext = "";
		BlockState blockanother = Blocks.AIR.defaultBlockState();
		int horizontalRadiusHemiTop = (int) 9 - 1;
		int verticalRadiusHemiTop = (int) 9;
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
						if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.BLACKSTONE) {
							{
								BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
								BlockState _bs = Blocks.AIR.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
	}
}
