package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class RctMasterySetProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:reversed_cursed_technique"))).isDone()) {
			{
				double _setval = DoubleArgumentType.getDouble(arguments, "number");
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RCTLevel = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
		} else if (!(entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
				&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:reversed_cursed_technique"))).isDone())) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u00A74You dont have RCT."), false);
		}
	}
}
