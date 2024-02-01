package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class DragonBoneRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("cebuildup") < 50) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 1) {
				{
					double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 1;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentCursedEnergy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				itemstack.getOrCreateTag().putDouble("cebuildup", (itemstack.getOrCreateTag().getDouble("cebuildup") + 1));
				if (itemstack.getOrCreateTag().getDouble("cebuildup") < 50) {
					itemstack.setHoverName(Component.literal(("\u00A7bBuilt up CE: " + itemstack.getOrCreateTag().getDouble("cebuildup"))));
				} else if (itemstack.getOrCreateTag().getDouble("cebuildup") == 50) {
					itemstack.setHoverName(Component.literal(("\u00A7bBuilt up CE: " + "\u00A7bMAX")));
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 1) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Not Enough Cursed Energy."), true);
			}
		}
	}
}
