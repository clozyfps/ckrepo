
package net.mcreator.craftkaisen.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import net.mcreator.craftkaisen.procedures.ClanLeaveProcedure;
import net.mcreator.craftkaisen.procedures.ClanDisbandProcedure;
import net.mcreator.craftkaisen.procedures.ClanCreateProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class ClanCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		if (event.getCommandSelection() == Commands.CommandSelection.DEDICATED)
			event.getDispatcher().register(Commands.literal("clan")

					.then(Commands.literal("Create").then(Commands.argument("clanname", StringArgumentType.word()).executes(arguments -> {
						Level world = arguments.getSource().getUnsidedLevel();
						double x = arguments.getSource().getPosition().x();
						double y = arguments.getSource().getPosition().y();
						double z = arguments.getSource().getPosition().z();
						Entity entity = arguments.getSource().getEntity();
						if (entity == null && world instanceof ServerLevel _servLevel)
							entity = FakePlayerFactory.getMinecraft(_servLevel);
						Direction direction = Direction.DOWN;
						if (entity != null)
							direction = entity.getDirection();

						ClanCreateProcedure.execute(arguments, entity);
						return 0;
					}))).then(Commands.literal("Leave").executes(arguments -> {
						Level world = arguments.getSource().getUnsidedLevel();
						double x = arguments.getSource().getPosition().x();
						double y = arguments.getSource().getPosition().y();
						double z = arguments.getSource().getPosition().z();
						Entity entity = arguments.getSource().getEntity();
						if (entity == null && world instanceof ServerLevel _servLevel)
							entity = FakePlayerFactory.getMinecraft(_servLevel);
						Direction direction = Direction.DOWN;
						if (entity != null)
							direction = entity.getDirection();

						ClanLeaveProcedure.execute(entity);
						return 0;
					})).then(Commands.literal("Disband").executes(arguments -> {
						Level world = arguments.getSource().getUnsidedLevel();
						double x = arguments.getSource().getPosition().x();
						double y = arguments.getSource().getPosition().y();
						double z = arguments.getSource().getPosition().z();
						Entity entity = arguments.getSource().getEntity();
						if (entity == null && world instanceof ServerLevel _servLevel)
							entity = FakePlayerFactory.getMinecraft(_servLevel);
						Direction direction = Direction.DOWN;
						if (entity != null)
							direction = entity.getDirection();

						ClanDisbandProcedure.execute(world, entity);
						return 0;
					})));
	}
}
