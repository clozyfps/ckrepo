package net.mcreator.craftkaisen.client.gui;

public class SelfVowGUIScreen extends AbstractContainerScreen<SelfVowGUIMenu> {

	private final static HashMap<String, Object> guistate = SelfVowGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_click;

	public SelfVowGUIScreen(SelfVowGUIMenu container, Inventory inventory, Component text) {
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/pagetwoopen.png"));
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

		imagebutton_click = new ImageButton(this.leftPos + -102, this.topPos + -3, 20, 20, 0, 0, 20, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_click.png"), 20, 40, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new SelfVowGUIButtonMessage(0, x, y, z));
				SelfVowGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:imagebutton_click", imagebutton_click);
		this.addRenderableWidget(imagebutton_click);

	}

}
