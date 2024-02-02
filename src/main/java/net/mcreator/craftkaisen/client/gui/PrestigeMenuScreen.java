package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.craftkaisen.world.inventory.PrestigeMenuMenu;
import net.mcreator.craftkaisen.network.PrestigeMenuButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PrestigeMenuScreen extends AbstractContainerScreen<PrestigeMenuMenu> {
	private final static HashMap<String, Object> guistate = PrestigeMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_check;
	ImageButton imagebutton_cross;

	public PrestigeMenuScreen(PrestigeMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/prestige_menu.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 79 && mouseX < leftPos + 94 && mouseY > topPos + 36 && mouseY < topPos + 50)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.prestige_menu.tooltip_confirm"), mouseX, mouseY);
		if (mouseX > leftPos + 62 && mouseX < leftPos + 76 && mouseY > topPos + 36 && mouseY < topPos + 50)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.prestige_menu.tooltip_decline"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/prestigemenu.png"));
		this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

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
		imagebutton_check = new ImageButton(this.leftPos + 78, this.topPos + 34, 18, 18, 0, 0, 18, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_check.png"), 18, 36, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new PrestigeMenuButtonMessage(0, x, y, z));
				PrestigeMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_check", imagebutton_check);
		this.addRenderableWidget(imagebutton_check);
		imagebutton_cross = new ImageButton(this.leftPos + 60, this.topPos + 34, 18, 18, 0, 0, 18, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_cross.png"), 18, 36, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new PrestigeMenuButtonMessage(1, x, y, z));
				PrestigeMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_cross", imagebutton_cross);
		this.addRenderableWidget(imagebutton_cross);
	}
}
