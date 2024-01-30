
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class DisableSpeedCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("disablespeed")

		);
	}

}
