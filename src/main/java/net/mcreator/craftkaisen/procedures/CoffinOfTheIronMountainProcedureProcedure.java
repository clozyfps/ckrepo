package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CoffinOfTheIronMountainProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String block = "";
		boolean gate = false;
		if (!entity.getPersistentData().getBoolean("domain")) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 250, false, false));
			entity.getPersistentData().putDouble("domainx", (entity.getX()));
			entity.getPersistentData().putDouble("domainy", (entity.getY()));
			entity.getPersistentData().putDouble("domainz", (entity.getZ()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:flame ^ ^ ^ 20 1 20 0.1 300 force @a");
			int horizontalRadiusSphere = (int) 20 - 1;
			int verticalRadiusSphere = (int) 20 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							block = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
							if (y + i < entity.getY()) {
								if (Math.random() >= 0.5) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BASALT.get().defaultBlockState(), 3);
								} else {
									if (Math.random() >= 0.5) {
										if (Math.random() >= 0.75) {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_LAVA.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_MAGMA.get().defaultBlockState(), 3);
										}
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_DRIPSTONE.get().defaultBlockState(), 3);
									}
								}
							}
							if (y + i == entity.getY()) {
								if (Math.random() >= 0.9) {
									if (Math.random() >= 0.5) {
										if (Math.random() >= 0.5) {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLACKSTONE_STALAGMITE_TALL.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_MINI_VOLCANO.get().defaultBlockState(), 3);
										}
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLACKSTONE_STALAGMITE.get().defaultBlockState(), 3);
									}
								} else {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
								}
							}
							if (y + i > entity.getY()) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
							}
							if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 16 && Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) < 18) {
								if (Math.random() >= 0.5) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_SMOOTH_BASALT.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLACKSTONE.get().defaultBlockState(), 3);
								}
							}
							if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putString("old_block", block);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && !(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COT_MEFFECT.get(), 150, 0, false, false));
					}
				}
			}
			CraftKaisenMod.queueServerWork(1190, () -> {
				if (entity.getPersistentData().getBoolean("domain") == true) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain_end")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					entity.getPersistentData().putBoolean("domain", false);
				}
			});
			entity.getPersistentData().putBoolean("domain", true);
		} else if (entity.getPersistentData().getBoolean("domain")) {
			RemoveCoffinProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
			entity.getPersistentData().putBoolean("domain", false);
		}
	}
}
