
package net.mcreator.craftkaisen.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SixEyesOverlayOverlay {

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

		SixEyesOverlayDisplayOverlayIngameProcedure.execute(entity)

		) {

			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.six_eyes_overlay.label_empty"), w / 2 + 35, h / 2 + -40, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnCEOverlayProcedure.execute(entity), w / 2 + -36, h / 2 + 38, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnHealthProcedure.execute(entity), w / 2 + -36, h / 2 + 52, -1);

		}

	}

}
