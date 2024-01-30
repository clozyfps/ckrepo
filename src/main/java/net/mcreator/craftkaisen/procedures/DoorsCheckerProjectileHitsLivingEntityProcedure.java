package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.RedOpenDoorEntity;
import net.mcreator.craftkaisen.entity.RainbowOpenDoorEntity;
import net.mcreator.craftkaisen.entity.GreenOpenDoorEntity;
import net.mcreator.craftkaisen.entity.GoldOpenDoorEntity;

public class DoorsCheckerProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double doorchance = 0;
		if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Private Pure Love Train")) {
			if (sourceentity.getPersistentData().getBoolean("domain")) {
				doorchance = Mth.nextInt(RandomSource.create(), 1, 100);
				if (doorchance >= 1 && doorchance >= 70) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 6, false, false));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GreenOpenDoorEntity(CraftKaisenModEntities.GREEN_OPEN_DOOR.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("jackpotchance", (entity.getPersistentData().getDouble("jackpotchance") + 8));
				}
				if (doorchance >= 71 && doorchance >= 89) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 6, false, false));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RedOpenDoorEntity(CraftKaisenModEntities.RED_OPEN_DOOR.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("jackpotchance", (entity.getPersistentData().getDouble("jackpotchance") + 12));
				}
				if (doorchance >= 90 && doorchance >= 99) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 6, false, false));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GoldOpenDoorEntity(CraftKaisenModEntities.GOLD_OPEN_DOOR.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("jackpotchance", (entity.getPersistentData().getDouble("jackpotchance") + 20));
				}
				if (doorchance == 100) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 6, false, false));
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RainbowOpenDoorEntity(CraftKaisenModEntities.RAINBOW_OPEN_DOOR.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("jackpotchance", (entity.getPersistentData().getDouble("jackpotchance") + 100));
				}
			} else if (!sourceentity.getPersistentData().getBoolean("domain")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new GreenOpenDoorEntity(CraftKaisenModEntities.GREEN_OPEN_DOOR.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
