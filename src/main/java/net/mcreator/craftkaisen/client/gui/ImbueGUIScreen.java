package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.mcreator.craftkaisen.world.inventory.ImbueGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ImbueGUIScreen extends AbstractContainerScreen<ImbueGUIMenu> {
	private final static HashMap<String, Object> guistate = ImbueGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox ImbueValue;
	Button button_imbue;

	public ImbueGUIScreen(ImbueGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/imbue_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		ImbueValue.render(ms, mouseX, mouseY, partialTicks);
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
		if (ImbueValue.isFocused())
			return ImbueValue.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		ImbueValue.tick();
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
		ImbueValue = new EditBox(this.font, this.leftPos + -63, this.topPos + 71, 118, 18, Component.translatable("gui.craft_kaisen.imbue_gui.ImbueValue")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_kaisen.imbue_gui.ImbueValue").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_kaisen.imbue_gui.ImbueValue").getString());
				else
					setSuggestion(null);
			}
		};
		ImbueValue.setSuggestion(Component.translatable("gui.craft_kaisen.imbue_gui.ImbueValue").getString());
		ImbueValue.setMaxLength(32767);
		guistate.put("text:ImbueValue", ImbueValue);
		this.addWidget(this.ImbueValue);
		button_imbue = Button.builder(Component.translatable("gui.craft_kaisen.imbue_gui.button_imbue"), e -> {
		}).bounds(this.leftPos + -28, this.topPos + 97, 51, 20).build();
		guistate.put("button:button_imbue", button_imbue);
		this.addRenderableWidget(button_imbue);
	}
}
