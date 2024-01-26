
package net.mcreator.craftkaisen.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class BodyShapeOverlayOverlay {

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

		BodyShapeOverlayDisplayOverlayIngameProcedure.execute(entity)

		) {

			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.body_shape_overlay.label_ctrl_rope"), w / 2 + -34, 5, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.body_shape_overlay.label_alt"), w / 2 + -34, 18, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.body_shape_overlay.label_shift_slicing"), w / 2 + -34, h / 2 + -89, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.body_shape_overlay.label_ctrl_alt_shape_shift"), w / 2 + -34, h / 2 + -76, -1);

		}

	}

}
