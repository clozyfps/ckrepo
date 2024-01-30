package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class HundredDemonsTickOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("hdd", (entity.getPersistentData().getDouble("hdd") + 1));
		if (entity.getPersistentData().getDouble("hdd") >= 300) {
			entity.getPersistentData().putDouble("wavehdd", (entity.getPersistentData().getDouble("wavehdd") + 1));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A74Wave " + entity.getPersistentData().getDouble("wavehdd"))), false);
				}
			}
			entity.getPersistentData().putDouble("hdd", 0);
			for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("wavehdd") * 2); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RugbyFieldCursedSpiritEntity(CraftKaisenModEntities.RUGBY_FIELD_CURSED_SPIRIT.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (entity.getPersistentData().getDouble("wavehdd") == 5) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
