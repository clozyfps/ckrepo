
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.ReturnTargetTwoProcedure;
import net.mcreator.craftkaisen.procedures.ReturnTargetOneProcedure;
import net.mcreator.craftkaisen.procedures.ReturnOutputProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCEOverlayProcedure;
import net.mcreator.craftkaisen.procedures.DisplayBoogieWoogieTargetsProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MainOverlayOverlay {
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
		if (true) {
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnCEOverlayProcedure.execute(entity), w / 2 + 96, h / 2 + 98, -16737895);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnOutputProcedure.execute(entity), w / 2 + 96, h / 2 + 89, -1);
			if (DisplayBoogieWoogieTargetsProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						ReturnTargetOneProcedure.execute(entity), w / 2 + -189, h / 2 + 86, -1);
			if (DisplayBoogieWoogieTargetsProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						ReturnTargetTwoProcedure.execute(entity), w / 2 + -189, h / 2 + 95, -1);
		}
	}
}
