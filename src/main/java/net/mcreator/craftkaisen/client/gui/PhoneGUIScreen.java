package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.mcreator.craftkaisen.world.inventory.PhoneGUIMenu;
import net.mcreator.craftkaisen.network.PhoneGUIButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PhoneGUIScreen extends AbstractContainerScreen<PhoneGUIMenu> {
	private final static HashMap<String, Object> guistate = PhoneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox PlayerBounty;
	EditBox BountyPlayer;
	Button button_place;

	public PhoneGUIScreen(PhoneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/phone_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		PlayerBounty.render(ms, mouseX, mouseY, partialTicks);
		BountyPlayer.render(ms, mouseX, mouseY, partialTicks);
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
		if (PlayerBounty.isFocused())
			return PlayerBounty.keyPressed(key, b, c);
		if (BountyPlayer.isFocused())
			return BountyPlayer.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PlayerBounty.tick();
		BountyPlayer.tick();
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
		PlayerBounty = new EditBox(this.font, this.leftPos + -59, this.topPos + 48, 118, 18, Component.translatable("gui.craft_kaisen.phone_gui.PlayerBounty")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_kaisen.phone_gui.PlayerBounty").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_kaisen.phone_gui.PlayerBounty").getString());
				else
					setSuggestion(null);
			}
		};
		PlayerBounty.setSuggestion(Component.translatable("gui.craft_kaisen.phone_gui.PlayerBounty").getString());
		PlayerBounty.setMaxLength(32767);
		guistate.put("text:PlayerBounty", PlayerBounty);
		this.addWidget(this.PlayerBounty);
		BountyPlayer = new EditBox(this.font, this.leftPos + -59, this.topPos + 76, 118, 18, Component.translatable("gui.craft_kaisen.phone_gui.BountyPlayer")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_kaisen.phone_gui.BountyPlayer").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.craft_kaisen.phone_gui.BountyPlayer").getString());
				else
					setSuggestion(null);
			}
		};
		BountyPlayer.setSuggestion(Component.translatable("gui.craft_kaisen.phone_gui.BountyPlayer").getString());
		BountyPlayer.setMaxLength(32767);
		guistate.put("text:BountyPlayer", BountyPlayer);
		this.addWidget(this.BountyPlayer);
		button_place = Button.builder(Component.translatable("gui.craft_kaisen.phone_gui.button_place"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new PhoneGUIButtonMessage(0, x, y, z));
				PhoneGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -25, this.topPos + 104, 51, 20).build();
		guistate.put("button:button_place", button_place);
		this.addRenderableWidget(button_place);
	}
}
