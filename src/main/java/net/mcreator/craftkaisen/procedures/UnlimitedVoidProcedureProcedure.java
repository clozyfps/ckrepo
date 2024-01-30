package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.entity.UnlimitedVoidMobEntity;

public class UnlimitedVoidProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState blockrevert = Blocks.AIR.defaultBlockState();
		String block = "";
		if (!entity.getPersistentData().getBoolean("domain")) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 250, false, false));
			entity.getPersistentData().putDouble("domainx", (entity.getX()));
			entity.getPersistentData().putDouble("domainy", (entity.getY()));
			entity.getPersistentData().putDouble("domainz", (entity.getZ()));
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new UnlimitedVoidMobEntity(CraftKaisenModEntities.UNLIMITED_VOID_MOB.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			int horizontalRadiusSphere = (int) 20 - 1;
			int verticalRadiusSphere = (int) 20 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							block = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
							if (y + i >= entity.getY()) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							}
							if (y + i < entity.getY()) {
								world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
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
			entity.getPersistentData().putBoolean("domain", true);
		} else if (entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putBoolean("domain", false);
			VoidRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
		}
	}
}
