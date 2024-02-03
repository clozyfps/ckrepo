package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MobDodgeProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:dashable")))) {
			if (Math.random() < 0.08) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.setDeltaMovement(new Vec3(((-1) * entity.getLookAngle().x), (0 * entity.getLookAngle().y), ((-1) * entity.getLookAngle().z)));
			}
		}
		if (entity instanceof SatoruGojoEntity) {
			if (Math.random() < 0.2) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.setDeltaMovement(new Vec3(((-1) * entity.getLookAngle().x), (0 * entity.getLookAngle().y), ((-1) * entity.getLookAngle().z)));
			}
		}
		if (entity instanceof ResurrectedTojiEntity) {
			if (Math.random() < 0.4) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.setDeltaMovement(new Vec3(((-1) * entity.getLookAngle().x), (0 * entity.getLookAngle().y), ((-1) * entity.getLookAngle().z)));
			}
		}
	}
}
