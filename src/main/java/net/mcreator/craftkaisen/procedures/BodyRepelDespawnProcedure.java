package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.BodyRepel3Entity;
import net.mcreator.craftkaisen.entity.BodyRepel2Entity;
import net.mcreator.craftkaisen.entity.BodyRepel1Entity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BodyRepelDespawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BodyRepel1Entity || entity instanceof BodyRepel2Entity || entity instanceof BodyRepel3Entity) {
			CraftKaisenMod.queueServerWork(100, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		}
	}
}
