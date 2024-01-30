package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class IceNeedleProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.PACKED_ICE.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.RED_CONCRETE.defaultBlockState()));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false));
	}
}
