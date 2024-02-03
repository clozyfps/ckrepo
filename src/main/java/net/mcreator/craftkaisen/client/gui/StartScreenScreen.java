package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.craftkaisen.world.inventory.StartScreenMenu;
import net.mcreator.craftkaisen.procedures.ReturnHumanProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCursedSpiritProcedure;
import net.mcreator.craftkaisen.network.StartScreenButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StartScreenScreen extends AbstractContainerScreen<StartScreenMenu> {
	private final static HashMap<String, Object> guistate = StartScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow_right;
	ImageButton imagebutton_save_button;

	public StartScreenScreen(StartScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/start_screen.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/race_menu.png"));
		this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnHumanProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/race_sorcerer.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (ReturnCursedSpiritProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/race_curse.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
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
		if (ReturnHumanProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_human"), -19, 23, -13547705);
		if (ReturnCursedSpiritProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_cursed_spirit"), -19, 23, -12380907);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + 23, this.topPos + 58, 13, 19, 0, 0, 19, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new StartScreenButtonMessage(0, x, y, z));
				StartScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow_right = new ImageButton(this.leftPos + -38, this.topPos + 58, 13, 19, 0, 0, 19, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_guiarrow_right.png"), 13, 38, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new StartScreenButtonMessage(1, x, y, z));
				StartScreenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_right", imagebutton_guiarrow_right);
		this.addRenderableWidget(imagebutton_guiarrow_right);
		imagebutton_save_button = new ImageButton(this.leftPos + -21, this.topPos + 59, 40, 17, 0, 0, 17, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_save_button.png"), 40, 34, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new StartScreenButtonMessage(2, x, y, z));
				StartScreenButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_save_button", imagebutton_save_button);
		this.addRenderableWidget(imagebutton_save_button);
	}
}
