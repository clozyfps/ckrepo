
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class ClanCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		if (event.getCommandSelection() == Commands.CommandSelection.DEDICATED)
			event.getDispatcher().register(Commands.literal("clan").requires(s -> s.hasPermission(1)).then(Commands.literal("Create").then(Commands.argument("clanname", StringArgumentType.word()).executes(arguments -> {
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

				ClanCreateProcedure.execute(entity);
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
