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

import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.procedures.ReturnStrengthProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSpeedProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSpecialProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSkillpointsProcedure;
import net.mcreator.craftkaisen.procedures.ReturnRepProcedure;
import net.mcreator.craftkaisen.procedures.ReturnPlayerProcedure;
import net.mcreator.craftkaisen.procedures.ReturnPerkProcedure;
import net.mcreator.craftkaisen.procedures.ReturnLevelProcedure;
import net.mcreator.craftkaisen.procedures.ReturnHumanProcedure;
import net.mcreator.craftkaisen.procedures.ReturnHealthProcedure;
import net.mcreator.craftkaisen.procedures.ReturnExpDisplayProcedure;
import net.mcreator.craftkaisen.procedures.ReturnEnergyControlProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCursedSpiritProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCursedEnergyProcedure;
import net.mcreator.craftkaisen.procedures.ReturnAffiliationProcedure;
import net.mcreator.craftkaisen.procedures.DisplayYenProcedure;
import net.mcreator.craftkaisen.procedures.DisplayTechniqueProcedure;
import net.mcreator.craftkaisen.procedures.DisplaySpecialGradeProcedure;
import net.mcreator.craftkaisen.procedures.DisplaySemiGrade2Procedure;
import net.mcreator.craftkaisen.procedures.DisplaySemiGrade1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayGradeThreeProcedure;
import net.mcreator.craftkaisen.procedures.DisplayGradeFourProcedure;
import net.mcreator.craftkaisen.procedures.DisplayGrade2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayGrade1Procedure;
import net.mcreator.craftkaisen.network.MainMenuButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainMenuScreen extends AbstractContainerScreen<MainMenuMenu> {
	private final static HashMap<String, Object> guistate = MainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_mastery;
	ImageButton imagebutton_smallbutton1png;
	ImageButton imagebutton_smallbutton1png1;
	ImageButton imagebutton_smallbutton1png3;
	ImageButton imagebutton_smallbutton1png2;
	ImageButton imagebutton_smallbutton1png4;
	ImageButton imagebutton_click;
	ImageButton imagebutton_click1;

	public MainMenuScreen(MainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/main_menu.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		if (ReturnPlayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + -148, this.topPos + 11, 40, 0f + (float) Math.atan((this.leftPos + -148 - mouseX) / 40.0), (float) Math.atan((this.topPos + -38 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 116 && mouseX < leftPos + 135 && mouseY > topPos + -76 && mouseY < topPos + -67)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increases_attack_damage"), mouseX, mouseY);
		if (mouseX > leftPos + 116 && mouseX < leftPos + 136 && mouseY > topPos + -58 && mouseY < topPos + -49)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_max_health"), mouseX, mouseY);
		if (mouseX > leftPos + 116 && mouseX < leftPos + 135 && mouseY > topPos + -22 && mouseY < topPos + -12)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_max_cursed_energy"), mouseX, mouseY);
		if (mouseX > leftPos + 116 && mouseX < leftPos + 135 && mouseY > topPos + -40 && mouseY < topPos + -31)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_energy_regen_rate_and_m"), mouseX, mouseY);
		if (mouseX > leftPos + 116 && mouseX < leftPos + 136 && mouseY > topPos + -4 && mouseY < topPos + 5)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_movement_speed"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/mainmenu.png"));
		this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (DisplayGradeFourProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/fourthgrade.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (DisplayGradeThreeProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/thirdgrade.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (DisplaySemiGrade2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/stwograde.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (DisplayGrade2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/twograde.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (DisplaySemiGrade1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/sonegrade.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (DisplayGrade1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/onegrade.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}
		if (DisplaySpecialGradeProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/spgrade.png"));
			this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pageoneopen.png"));
		this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagethreeclosed.png"));
		this.blit(ms, this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagetwoclosed.png"));
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
		if (ReturnHumanProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_race_human"), -118, -85, -11112336);
		this.font.draw(poseStack,

				ReturnSkillpointsProcedure.execute(entity), -118, -76, -12829636);
		if (ReturnCursedSpiritProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_curse"), -118, -85, -11005165);
		this.font.draw(poseStack,

				ReturnExpDisplayProcedure.execute(entity), -118, -58, -12829636);
		this.font.draw(poseStack,

				ReturnRepProcedure.execute(entity), -118, -40, -12829636);
		this.font.draw(poseStack,

				ReturnAffiliationProcedure.execute(entity), -118, -22, -12829636);
		this.font.draw(poseStack,

				ReturnLevelProcedure.execute(entity), -118, -4, -12829636);
		this.font.draw(poseStack,

				ReturnSpecialProcedure.execute(entity), -118, 14, -12829636);
		this.font.draw(poseStack,

				ReturnStrengthProcedure.execute(entity), -1, -76, -12829636);
		this.font.draw(poseStack,

				ReturnHealthProcedure.execute(entity), -1, -58, -12829636);
		this.font.draw(poseStack,

				ReturnCursedEnergyProcedure.execute(entity), -1, -22, -12829636);
		this.font.draw(poseStack,

				ReturnEnergyControlProcedure.execute(entity), -1, -40, -12829636);
		this.font.draw(poseStack,

				ReturnSpeedProcedure.execute(entity), -1, -4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty2"), 125, -76, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty3"), 125, -58, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty4"), 125, -4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty5"), 125, -40, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty6"), 125, -22, -12829636);
		this.font.draw(poseStack,

				ReturnPerkProcedure.execute(entity), -118, 32, -12829636);
		this.font.draw(poseStack,

				DisplayYenProcedure.execute(entity), -118, 50, -12829636);
		this.font.draw(poseStack,

				DisplayTechniqueProcedure.execute(entity), -118, 68, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_mastery = Button.builder(Component.translatable("gui.craft_kaisen.main_menu.button_mastery"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(0, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 108, this.topPos + 64, 61, 20).build();
		guistate.put("button:button_mastery", button_mastery);
		this.addRenderableWidget(button_mastery);
		imagebutton_smallbutton1png = new ImageButton(this.leftPos + 116, this.topPos + -76, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(1, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png", imagebutton_smallbutton1png);
		this.addRenderableWidget(imagebutton_smallbutton1png);
		imagebutton_smallbutton1png1 = new ImageButton(this.leftPos + 116, this.topPos + -58, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png1.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(2, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png1", imagebutton_smallbutton1png1);
		this.addRenderableWidget(imagebutton_smallbutton1png1);
		imagebutton_smallbutton1png3 = new ImageButton(this.leftPos + 116, this.topPos + -40, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png3.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(3, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png3", imagebutton_smallbutton1png3);
		this.addRenderableWidget(imagebutton_smallbutton1png3);
		imagebutton_smallbutton1png2 = new ImageButton(this.leftPos + 116, this.topPos + -22, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png2.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(4, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png2", imagebutton_smallbutton1png2);
		this.addRenderableWidget(imagebutton_smallbutton1png2);
		imagebutton_smallbutton1png4 = new ImageButton(this.leftPos + 116, this.topPos + -4, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png4.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(5, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png4", imagebutton_smallbutton1png4);
		this.addRenderableWidget(imagebutton_smallbutton1png4);
		imagebutton_click = new ImageButton(this.leftPos + -190, this.topPos + -65, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(6, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_click", imagebutton_click);
		this.addRenderableWidget(imagebutton_click);
		imagebutton_click1 = new ImageButton(this.leftPos + -190, this.topPos + -44, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click1.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(7, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_click1", imagebutton_click1);
		this.addRenderableWidget(imagebutton_click1);
	}
}
