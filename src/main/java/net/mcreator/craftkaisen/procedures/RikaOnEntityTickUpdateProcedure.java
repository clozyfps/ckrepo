package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;

import java.util.ArrayList;

public class RikaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double player_yaw = 0;
		double entity_yaw = 0;
		double rotation_step = 0;
		double difference = 0;
		double max_rotation_step = 0;
		double rotation_direction = 0;
		double rotation_speed = 0;
		entity.getPersistentData().putDouble("rikatimer", (entity.getPersistentData().getDouble("rikatimer") + 1));
		if (entity.getPersistentData().getDouble("rikatimer") >= 100) {
			if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
				if (!(!world.getEntitiesOfClass(YutaOkkotsuEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty())) {
					if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty())) {
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
			entity.getPersistentData().putDouble("rikatimer", 0);
		}
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
				if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entityiterator) {
					if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(CraftKaisenModMobEffects.RIKA_STATUS.get())) {
						if (!(!world.getEntitiesOfClass(YutaOkkotsuEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty())) {
							if (!entity.level.isClientSide())
								entity.discard();
						}
					}
					if (!((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("releaserika"))) {
						{
							Entity _ent = entity;
							_ent.setYRot((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot());
							_ent.setXRot((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getXRot());
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						{
							Entity _ent = entity;
							_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() - 1), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY()),
									((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() - 1));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() - 1), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY()),
										((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() - 1), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		}
	}
}
