package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.entity.UnlimitedVoidAccelerateEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UnlimitedVoidMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		if (entity.getPersistentData().getDouble("spawnhole") > 0) {
			entity.getPersistentData().putDouble("spawnhole", (entity.getPersistentData().getDouble("spawnhole") - 1));
		}
		if (entity.getPersistentData().getDouble("spawnhole") == 0) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle craft_kaisen:unlimited_blackhole ^ ^1.5 ^ 0.01 0.01 0.01 0.01 1 force @a");
			entity.getPersistentData().putDouble("spawnhole", 100);
		}
		if (entity.getPersistentData().getDouble("spawnparticles") > 0) {
			entity.getPersistentData().putDouble("spawnparticles", (entity.getPersistentData().getDouble("spawnparticles") - 1));
		}
		if (entity.getPersistentData().getDouble("spawnparticles") == 0) {
			rand = Mth.nextInt(RandomSource.create(), 1, 3);
			if (rand == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.UNLIMITED_VOID_SPLASH_1.get()), x, y, z, 1, 8, 5, 8, 0);
			}
			if (rand == 2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.UNLIMITED_VOID_SPLASH_2.get()), x, y, z, 1, 8, 5, 8, 0);
			}
			if (rand == 3) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.UNLIMITED_VOID_SPLASH_3.get()), x, y, z, 1, 8, 5, 8, 0);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 10, 8, 5, 8, 0);
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						if (!(entityiterator instanceof ItemEntity)) {
							if (!(entityiterator instanceof UnlimitedVoidAccelerateEntity)) {
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
	}
}
