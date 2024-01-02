
package net.mcreator.craftkaisen.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class RatioOverlayOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		if (

		RatioOverlayDisplayOverlayIngameProcedure.execute()

		) {

			Minecraft.getInstance().font.draw(event.getPoseStack(),

					RatioMasteryDisplayProcedure.execute(), 10, 8, -1);

		}

	}

}
