package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DismantlePrProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("dismantlerandom", (Mth.nextInt(RandomSource.create(), 1, 2)));
		if (entity.getPersistentData().getDouble("dismantlerandom") == 1) {
			if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("craft_kaisen:domain_blocks")))) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				world.destroyBlock(BlockPos.containing(x + 1, y + 1, z), false);
				world.destroyBlock(BlockPos.containing(x + 2, y + 2, z), false);
				world.destroyBlock(BlockPos.containing(x + 3, y + 3, z), false);
				world.destroyBlock(BlockPos.containing(x + 4, y + 4, z), false);
				world.destroyBlock(BlockPos.containing(x + 5, y + 5, z), false);
				world.destroyBlock(BlockPos.containing(x, y + -1, z + 1), false);
				world.destroyBlock(BlockPos.containing(x, y + -2, z + 2), false);
				world.destroyBlock(BlockPos.containing(x, y + -3, z + 3), false);
				world.destroyBlock(BlockPos.containing(x, y + -4, z + 4), false);
				world.destroyBlock(BlockPos.containing(x, y + -5, z + 5), false);
				world.destroyBlock(BlockPos.containing(x, y + -5, z + 6), false);
				world.destroyBlock(BlockPos.containing(x, y + -5, z + -5), false);
				world.destroyBlock(BlockPos.containing(x, y + -5, z + -1), false);
				world.destroyBlock(BlockPos.containing(x, y + -5, z + -2), false);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 10, 2, 1, 2, 0.1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, (float) 0.1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("dismantlerandom") == 2) {
			if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("craft_kaisen:domain_blocks")))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 10, 2, 1, 2, 0.1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, (float) 0.1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
					}
				}
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				world.destroyBlock(BlockPos.containing(x + 1, y + -1, z), false);
				world.destroyBlock(BlockPos.containing(x + 2, y + -2, z), false);
				world.destroyBlock(BlockPos.containing(x + 3, y + -3, z), false);
				world.destroyBlock(BlockPos.containing(x + 4, y + -4, z), false);
				world.destroyBlock(BlockPos.containing(x + 5, y + -5, z), false);
				world.destroyBlock(BlockPos.containing(x, y + 1, z + 1), false);
				world.destroyBlock(BlockPos.containing(x, y + 2, z + 2), false);
				world.destroyBlock(BlockPos.containing(x, y + 3, z + 3), false);
				world.destroyBlock(BlockPos.containing(x, y + 4, z + 4), false);
				world.destroyBlock(BlockPos.containing(x, y + 5, z + 5), false);
			}
		}
	}
}
