package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RightClickBoogieWoogieProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Boogie Woogie")) {
			if (sourceentity.isShiftKeyDown()) {
				if (!(sourceentity.getPersistentData().getString("boogiepartner")).equals(entity.getDisplayName().getString())) {
					CraftKaisenMod.queueServerWork(1, () -> {
						sourceentity.getPersistentData().putString("boogiepartner", (entity.getDisplayName().getString()));
					});
				} else if ((sourceentity.getPersistentData().getString("boogiepartner")).equals(entity.getDisplayName().getString())) {
					CraftKaisenMod.queueServerWork(1, () -> {
						sourceentity.getPersistentData().putString("boogiepartner", "");
					});
				}
			}
		}
	}
}
