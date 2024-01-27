package net.mcreator.craftkaisen.client.gui;

public class CTMoveGUIScreen extends AbstractContainerScreen<CTMoveGUIMenu> {

	private final static HashMap<String, Object> guistate = CTMoveGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_set_ability_1;
	Button button_set_ability_2;
	Button button_set_ability_3;
	Button button_set_ability_4;
	Button button_set_ability_5;
	Button button_set_ability_6;
	Button button_set_ability_41;
	Button button_set_ability_31;
	Button button_set_ability_32;
	Button button_set_ability_33;
	Button button_set_ability_42;
	Button button_set_ability_7;
	Button button_set_ability_8;
	Button button_set_ability_9;
	Button button_set_ability_11;
	Button button_set_ability_12;
	Button button_set_ability_13;

	ImageButton imagebutton_click;
	ImageButton imagebutton_click1;

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

		if (

		ReturnPlayerProcedure.execute(entity)

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + -60, this.topPos + 94, 40, 0f + (float) Math.atan((this.leftPos + -60 - mouseX) / 40.0), (float) Math.atan((this.topPos + 45 - mouseY) / 40.0), livingEntity);
		}

		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/mainmenu.png"));
		this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pageoneclosed.png"));
		this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagetwoclosed.png"));
		this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);

		if (

		DisplayGradeFourProcedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/fourthgrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}
		if (

		DisplayGradeThreeProcedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/thirdgrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}
		if (

		DisplaySemiGrade2Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/stwograde.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}
		if (

		DisplayGrade2Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/twograde.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}
		if (

		DisplaySemiGrade1Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/sonegrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}
		if (

		DisplayGrade1Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/onegrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}
		if (

		DisplaySpecialGradeProcedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/spgrade.png"));
			this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagethreeopen.png"));
		this.blit(ms, this.leftPos + -126, this.topPos + -37, 0, 0, 427, 240, 427, 240);

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

				ReturnTechniqueProcedure.execute(entity), -27, 18, -12829636);
		this.font.draw(poseStack,

				ReturnMoveDisplayProcedure.execute(entity), 163, 2, -12829636);
		this.font.draw(poseStack,

				ReturnMoveCostProcedure.execute(entity), 163, 26, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.ct_move_gui.label_page"), -27, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_set_ability_1 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_1"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(0, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + 46, 92, 20).build();

		guistate.put("button:button_set_ability_1", button_set_ability_1);
		this.addRenderableWidget(button_set_ability_1);

		button_set_ability_2 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_2"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(1, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + 69, 92, 20).build();

		guistate.put("button:button_set_ability_2", button_set_ability_2);
		this.addRenderableWidget(button_set_ability_2);

		button_set_ability_3 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_3"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(2, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + 91, 92, 20).build();

		guistate.put("button:button_set_ability_3", button_set_ability_3);
		this.addRenderableWidget(button_set_ability_3);

		button_set_ability_4 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_4"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(3, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + 113, 92, 20).build();

		guistate.put("button:button_set_ability_4", button_set_ability_4);
		this.addRenderableWidget(button_set_ability_4);

		button_set_ability_5 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_5"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(4, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -30, this.topPos + 135, 92, 20).build();

		guistate.put("button:button_set_ability_5", button_set_ability_5);
		this.addRenderableWidget(button_set_ability_5);

		button_set_ability_6 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_6"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(5, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 69, 92, 20).build();

		guistate.put("button:button_set_ability_6", button_set_ability_6);
		this.addRenderableWidget(button_set_ability_6);

		button_set_ability_41 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_41"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(6, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + -2, 92, 20).build();

		guistate.put("button:button_set_ability_41", button_set_ability_41);
		this.addRenderableWidget(button_set_ability_41);

		button_set_ability_31 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_31"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(7, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 22, 92, 20).build();

		guistate.put("button:button_set_ability_31", button_set_ability_31);
		this.addRenderableWidget(button_set_ability_31);

		button_set_ability_32 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_32"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(8, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 166, this.topPos + 46, 92, 20).build();

		guistate.put("button:button_set_ability_32", button_set_ability_32);
		this.addRenderableWidget(button_set_ability_32);

		button_set_ability_33 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_33"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(9, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 46, 92, 20).build();

		guistate.put("button:button_set_ability_33", button_set_ability_33);
		this.addRenderableWidget(button_set_ability_33);

		button_set_ability_42 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_42"), e -> {
			if (

			ShowUnlockProcedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(10, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 166, this.topPos + 69, 92, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				ShowUnlockProcedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		});

		guistate.put("button:button_set_ability_42", button_set_ability_42);
		this.addRenderableWidget(button_set_ability_42);

		button_set_ability_7 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_7"), e -> {
		}).bounds(this.leftPos + 68, this.topPos + 91, 92, 20).build();

		guistate.put("button:button_set_ability_7", button_set_ability_7);
		this.addRenderableWidget(button_set_ability_7);

		button_set_ability_8 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_8"), e -> {
		}).bounds(this.leftPos + 68, this.topPos + 113, 92, 20).build();

		guistate.put("button:button_set_ability_8", button_set_ability_8);
		this.addRenderableWidget(button_set_ability_8);

		button_set_ability_9 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_9"), e -> {
		}).bounds(this.leftPos + 68, this.topPos + 135, 92, 20).build();

		guistate.put("button:button_set_ability_9", button_set_ability_9);
		this.addRenderableWidget(button_set_ability_9);

		button_set_ability_11 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_11"), e -> {
		}).bounds(this.leftPos + 166, this.topPos + 91, 92, 20).build();

		guistate.put("button:button_set_ability_11", button_set_ability_11);
		this.addRenderableWidget(button_set_ability_11);

		button_set_ability_12 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_12"), e -> {
		}).bounds(this.leftPos + 166, this.topPos + 113, 92, 20).build();

		guistate.put("button:button_set_ability_12", button_set_ability_12);
		this.addRenderableWidget(button_set_ability_12);

		button_set_ability_13 = Button.builder(Component.translatable("gui.craft_kaisen.ct_move_gui.button_set_ability_13"), e -> {
		}).bounds(this.leftPos + 166, this.topPos + 135, 92, 20).build();

		guistate.put("button:button_set_ability_13", button_set_ability_13);
		this.addRenderableWidget(button_set_ability_13);

		imagebutton_click = new ImageButton(this.leftPos + -102, this.topPos + -3, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(17, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});

		guistate.put("button:imagebutton_click", imagebutton_click);
		this.addRenderableWidget(imagebutton_click);

		imagebutton_click1 = new ImageButton(this.leftPos + -102, this.topPos + 18, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click1.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new CTMoveGUIButtonMessage(18, x, y, z));
				CTMoveGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});

		guistate.put("button:imagebutton_click1", imagebutton_click1);
		this.addRenderableWidget(imagebutton_click1);

	}

}
