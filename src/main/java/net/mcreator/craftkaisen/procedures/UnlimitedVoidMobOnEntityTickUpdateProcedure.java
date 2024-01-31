package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UnlimitedVoidMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 5, 6, 5, 6, 0);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
					if (!(entity == entityiterator)) {
						if ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getBlock() == CraftKaisenModBlocks.DOMAIN_BLOCK.get()) {
							entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ENCHANT, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 7, 1, 3, 1, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EFFECT, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 1, 3, 1, 0);
						}
					}
				}
			}
		}
	}
}
