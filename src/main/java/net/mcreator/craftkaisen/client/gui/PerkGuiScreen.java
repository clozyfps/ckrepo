package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.craftkaisen.world.inventory.PerkGuiMenu;
import net.mcreator.craftkaisen.procedures.DisplayPerkProcedure;
import net.mcreator.craftkaisen.procedures.DisplayPerkDescriptionProcedure;
import net.mcreator.craftkaisen.network.PerkGuiButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PerkGuiScreen extends AbstractContainerScreen<PerkGuiMenu> {
	private final static HashMap<String, Object> guistate = PerkGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_accept;
	Button button_decline;

	public PerkGuiScreen(PerkGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 100;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/perk_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				DisplayPerkProcedure.execute(entity), 9, 7, -16777216);
		this.font.draw(poseStack,

				DisplayPerkDescriptionProcedure.execute(entity), 9, 27, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_accept = Button.builder(Component.translatable("gui.craft_kaisen.perk_gui.button_accept"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new PerkGuiButtonMessage(0, x, y, z));
				PerkGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 69, 56, 20).build();
		guistate.put("button:button_accept", button_accept);
		this.addRenderableWidget(button_accept);
		button_decline = Button.builder(Component.translatable("gui.craft_kaisen.perk_gui.button_decline"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new PerkGuiButtonMessage(1, x, y, z));
				PerkGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 163, this.topPos + 69, 61, 20).build();
		guistate.put("button:button_decline", button_decline);
		this.addRenderableWidget(button_decline);
	}
}
