package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.craftkaisen.world.inventory.CSMGUIMenu;
import net.mcreator.craftkaisen.network.CSMGUIButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CSMGUIScreen extends AbstractContainerScreen<CSMGUIMenu> {
	private final static HashMap<String, Object> guistate = CSMGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;

	public CSMGUIScreen(CSMGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/csmgui.png");

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_1 = Button.builder(Component.translatable("gui.craft_kaisen.csmgui.button_1"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CSMGUIButtonMessage(0, x, y, z));
				CSMGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -136, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.craft_kaisen.csmgui.button_2"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CSMGUIButtonMessage(1, x, y, z));
				CSMGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -55, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.craft_kaisen.csmgui.button_3"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CSMGUIButtonMessage(2, x, y, z));
				CSMGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 26, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_4 = Button.builder(Component.translatable("gui.craft_kaisen.csmgui.button_4"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CSMGUIButtonMessage(3, x, y, z));
				CSMGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 107, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);
	}
}
