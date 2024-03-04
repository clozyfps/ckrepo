package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.ThrowPlayerMobEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ThrowProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:domain_mobs")))) {
						if (!(entityiterator instanceof ThrowPlayerMobEntity)) {
							if (!(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
								entityiterator.getPersistentData().putBoolean("thrown", true);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new ThrowPlayerMobEntity(CraftKaisenModEntities.THROW_PLAYER_MOB.get(), _level);
									entityToSpawn.moveTo((entity.getLookAngle().x + 3), (entity.getLookAngle().y), (entity.getLookAngle().z + 3), world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								if (!(entityiterator instanceof Player || entityiterator instanceof ServerPlayer)) {
									entityiterator.setDeltaMovement(new Vec3((3 * entity.getLookAngle().x), (2 * entity.getLookAngle().y), (3 * entity.getLookAngle().z)));
								}
							}
						}
					}
				}
			}
		}
	}
}
