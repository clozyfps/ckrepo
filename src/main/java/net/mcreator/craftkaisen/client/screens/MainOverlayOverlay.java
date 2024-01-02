
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.ReturnTargetTwoProcedure;
import net.mcreator.craftkaisen.procedures.ReturnTargetOneProcedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput9Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput8Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput7Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput6Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput5Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput4Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayOutput10Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBoogieWoogieTargetsProcedure;
import net.mcreator.craftkaisen.procedures.DisplayBarEmptyProcedure;
import net.mcreator.craftkaisen.procedures.DisplayBar9Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar8Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar7Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar6Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar5Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar4Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar12Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar11Procedure;
import net.mcreator.craftkaisen.procedures.DisplayBar10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (DisplayBarEmptyProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer12.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer11.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer10.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer9.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer8.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebarlayer1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBar12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/cebar.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/hotbarv.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);

			if (DisplayOutput1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output8.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output9.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayOutput10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/output10.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, h / 2 + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayBoogieWoogieTargetsProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						ReturnTargetOneProcedure.execute(entity), w / 2 + -189, h / 2 + 86, -1);
			if (DisplayBoogieWoogieTargetsProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						ReturnTargetTwoProcedure.execute(entity), w / 2 + -189, h / 2 + 95, -1);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
