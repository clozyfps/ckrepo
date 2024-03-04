package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.FireArrowStormEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.Comparator;

public class FireArrowMobProjectileProjectileHitsBlock2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(FireArrowStormEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new FireArrowStormEntity(CraftKaisenModEntities.FIRE_ARROW_STORM.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, (float) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 3), Level.ExplosionInteraction.BLOCK);
			CraftKaisenMod.queueServerWork(5, () -> {
				if (!world.getEntitiesOfClass(FireArrowStormEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
					if (((Entity) world.getEntitiesOfClass(FireArrowStormEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
						_toTame.tame(_owner);
				}
			});
		}
	}
}
