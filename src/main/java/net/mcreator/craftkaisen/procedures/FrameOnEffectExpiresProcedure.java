package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.entity.FrozenFrameEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FrameOnEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof FrozenFrameEntity) {
					if (!entityiterator.level.isClientSide())
						entityiterator.discard();
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.GLASS.defaultBlockState()));
				}
			}
		}
	}
}
