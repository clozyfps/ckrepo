package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.entity.MahitoEntity;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class MahitoDistortedTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double move = 0;
		if (entity instanceof MahitoEntity && entity.getPersistentData().getBoolean("distortedbody")) {
			if (entity.getPersistentData().getDouble("distortedbodytick") < 2500) {
				entity.getPersistentData().putDouble("distortedbodytick", (entity.getPersistentData().getDouble("distortedbodytick") + 1));
			} else if (entity.getPersistentData().getDouble("distortedbodytick") >= 2500) {
				entity.getPersistentData().putDouble("distortedbodytick", 0);
				entity.getPersistentData().putBoolean("distortedbody", false);
			}
			if (entity.getPersistentData().getDouble("cooldown") >= 1) {
				entity.getPersistentData().putDouble("cooldown", (entity.getPersistentData().getDouble("cooldown") - 1));
			}
			if (entity.getPersistentData().getDouble("domainCooldown") >= 1) {
				entity.getPersistentData().putDouble("domainCooldown", (entity.getPersistentData().getDouble("domainCooldown") - 3));
			}
			if (entity.getPersistentData().getDouble("dashAttack") >= 1) {
				if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands()
									.performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
						}
					}
				}
				entity.getPersistentData().putDouble("dashAttack", (entity.getPersistentData().getDouble("dashAttack") - 1));
				entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 3),
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 3), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 3)));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PUNCH_IMPACT.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 0.1, 2, 0.1, 1);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.2, (entityiterator.getBbHeight()), 0.2, 0.1);
						}
					}
				}
			}
			if (entity.getPersistentData().getBoolean("punchbarrage") == true) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				entity.getPersistentData().putDouble("barragetimer", (entity.getPersistentData().getDouble("barragetimer") + 1));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PUNCH_IMPACT.get()), x, y, z, 1, 3, 2, 3, 0);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
						}
					}
				}
				if (entity.getPersistentData().getDouble("barragetimer") >= 35) {
					entity.getPersistentData().putBoolean("punchbarrage", false);
				}
			}
		}
	}
}
