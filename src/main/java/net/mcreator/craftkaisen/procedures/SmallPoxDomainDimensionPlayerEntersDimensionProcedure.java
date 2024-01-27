package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.SmallPoxDeityEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class SmallPoxDomainDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double v = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo((world.getLevelData().getXSpawn()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, world.getLevelData().getXSpawn(), world.getLevelData().getZSpawn())), (world.getLevelData().getZSpawn()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((world.getLevelData().getXSpawn()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, world.getLevelData().getXSpawn(), world.getLevelData().getZSpawn())),
						(world.getLevelData().getZSpawn()), _ent.getYRot(), _ent.getXRot());
		}
		CraftKaisenMod.queueServerWork(10, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new SmallPoxDeityEntity(CraftKaisenModEntities.SMALL_POX_DEITY.get(), _level);
				entityToSpawn.moveTo((world.getLevelData().getXSpawn()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, world.getLevelData().getXSpawn(), world.getLevelData().getZSpawn())), (world.getLevelData().getZSpawn()),
						world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		});
	}
}
