package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import net.mcreator.craftkaisen.world.inventory.CTMoveGUIMenu;
import net.mcreator.craftkaisen.procedures.ShowUnlockProcedure;
import net.mcreator.craftkaisen.procedures.ReturnTechniqueProcedure;
import net.mcreator.craftkaisen.procedures.ReturnPlayerProcedure;
import net.mcreator.craftkaisen.procedures.ReturnMoveDisplayProcedure;
import net.mcreator.craftkaisen.procedures.ReturnMoveCostProcedure;
import net.mcreator.craftkaisen.procedures.DisplaySpecialGradeProcedure;
import net.mcreator.craftkaisen.procedures.DisplaySemiGrade2Procedure;
import net.mcreator.craftkaisen.procedures.DisplaySemiGrade1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayGradeThreeProcedure;
import net.mcreator.craftkaisen.procedures.DisplayGradeFourProcedure;
import net.mcreator.craftkaisen.procedures.DisplayGrade2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayGrade1Procedure;
import net.mcreator.craftkaisen.network.CTMoveGUIButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CTMoveGUIScreen extends AbstractContainerScreen<CTMoveGUIMenu> {
	private final static HashMap<String, Object> guistate = CTMoveGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_set_ability_41;
	Button button_set_ability_31;
	Button button_set_ability_32;
	Button button_set_ability_33;
	Button button_set_ability_42;
	ImageButton imagebutton_click;
	ImageButton imagebutton_click1;
	ImageButton imagebutton_ab_slot_1;
	ImageButton imagebutton_ab_slot_2;
	ImageButton imagebutton_ab_slot_3;
	ImageButton imagebutton_ab_slot_4;
	ImageButton imagebutton_ab_slot_5;
	ImageButton imagebutton_ab_slot_6;

	public CTMoveGUIScreen(CTMoveGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		if (ReturnPlayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + -60, this.topPos + 94, 40, 0f + (float) Math.atan((this.leftPos + -60 - mouseX) / 40.0), (float) Math.atan((this.topPos + 45 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/mainmenu_empty.png"));
		this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pageoneclosed.png"));
		this.blit(ms, this.leftPos + -130, this.topPos + -37, 0, 0, 427, 240, 427, 240);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagetwoclosed.png"));
		this.blit(ms, this.leftPos + -130, this.topPos + -37, 0, 0, 427, 240, 427, 240);

		if (DisplayGradeFourProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/fourthgrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}
		if (DisplayGradeThreeProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/thirdgrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}
		if (DisplaySemiGrade2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/stwograde.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}
		if (DisplayGrade2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/twograde.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}
		if (DisplaySemiGrade1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/sonegrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}
		if (DisplayGrade1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/onegrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}
		if (DisplaySpecialGradeProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/spgrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -32, 0, 0, 427, 240, 427, 240);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagethreeopen.png"));
		this.blit(ms, this.leftPos + -130, this.topPos + -37, 0, 0, 427, 240, 427, 240);

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

				ReturnTechniqueProcedure.execute(entity), -25, 15, -1);
		this.font.draw(poseStack,

				ReturnMoveDisplayProcedure.execute(entity), -25, 54, -1);
		this.font.draw(poseStack,

				ReturnMoveCostProcedure.execute(entity), -25, 71, -1);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.ct_move_gui.label_page"), -25, 1, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_set_ability_41 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_41"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(0, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 29, 92, 20).build();
		guistate.put("button:button_set_ability_41", button_set_ability_41);
		this.addRenderableWidget(button_set_ability_41);
		button_set_ability_31 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_31"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(1, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -26, this.topPos + 29, 92, 20).build();
		guistate.put("button:button_set_ability_31", button_set_ability_31);
		this.addRenderableWidget(button_set_ability_31);
		button_set_ability_32 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_32"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(2, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 85, 92, 20).build();
		guistate.put("button:button_set_ability_32", button_set_ability_32);
		this.addRenderableWidget(button_set_ability_32);
		button_set_ability_33 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_33"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(3, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -26, this.topPos + 85, 92, 20).build();
		guistate.put("button:button_set_ability_33", button_set_ability_33);
		this.addRenderableWidget(button_set_ability_33);
		button_set_ability_42 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_42"), e -> {
			if (ShowUnlockProcedure.execute(entity)) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(4, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 164, this.topPos + 85, 92, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowUnlockProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_set_ability_42", button_set_ability_42);
		this.addRenderableWidget(button_set_ability_42);
		imagebutton_click = new ImageButton(this.leftPos + -106, this.topPos + -3, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(5, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_click", imagebutton_click);
		this.addRenderableWidget(imagebutton_click);
		imagebutton_click1 = new ImageButton(this.leftPos + -106, this.topPos + 18, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click1.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(6, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_click1", imagebutton_click1);
		this.addRenderableWidget(imagebutton_click1);
		imagebutton_ab_slot_1 = new ImageButton(this.leftPos + -24, this.topPos + 130, 34, 34, 0, 0, 34, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_ab_slot_1.png"), 34, 68, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(7, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ab_slot_1", imagebutton_ab_slot_1);
		this.addRenderableWidget(imagebutton_ab_slot_1);
		imagebutton_ab_slot_2 = new ImageButton(this.leftPos + 25, this.topPos + 130, 34, 34, 0, 0, 34, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_ab_slot_2.png"), 34, 68, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(8, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ab_slot_2", imagebutton_ab_slot_2);
		this.addRenderableWidget(imagebutton_ab_slot_2);
		imagebutton_ab_slot_3 = new ImageButton(this.leftPos + 73, this.topPos + 130, 34, 34, 0, 0, 34, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_ab_slot_3.png"), 34, 68, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(9, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ab_slot_3", imagebutton_ab_slot_3);
		this.addRenderableWidget(imagebutton_ab_slot_3);
		imagebutton_ab_slot_4 = new ImageButton(this.leftPos + 122, this.topPos + 130, 34, 34, 0, 0, 34, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_ab_slot_4.png"), 34, 68, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(10, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ab_slot_4", imagebutton_ab_slot_4);
		this.addRenderableWidget(imagebutton_ab_slot_4);
		imagebutton_ab_slot_5 = new ImageButton(this.leftPos + 171, this.topPos + 130, 34, 34, 0, 0, 34, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_ab_slot_5.png"), 34, 68, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(11, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ab_slot_5", imagebutton_ab_slot_5);
		this.addRenderableWidget(imagebutton_ab_slot_5);
		imagebutton_ab_slot_6 = new ImageButton(this.leftPos + 220, this.topPos + 130, 34, 34, 0, 0, 34, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_ab_slot_6.png"), 34, 68, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(12, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_ab_slot_6", imagebutton_ab_slot_6);
		this.addRenderableWidget(imagebutton_ab_slot_6);
	}
}
