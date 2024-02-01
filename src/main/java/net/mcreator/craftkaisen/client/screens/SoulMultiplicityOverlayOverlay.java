
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.SoulMultiplicityOverlayDisplayOverlayIngameProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SoulMultiplicityOverlayOverlay {
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
		if (SoulMultiplicityOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.soul_multiplicity_overlay.label_ctrl_body_repel"), w / 2 + -34, 5, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.soul_multiplicity_overlay.label_alt_soul_isomer"), w / 2 + -34, 18, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.soul_multiplicity_overlay.label_shift_soul_summon"), w / 2 + -34, 31, -1);
		}
	}
}
