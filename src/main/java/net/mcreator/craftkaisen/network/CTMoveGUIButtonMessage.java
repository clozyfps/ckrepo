
package net.mcreator.craftkaisen.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CTMoveGUIButtonMessage {

	private final int buttonID, x, y, z;

	public CTMoveGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CTMoveGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CTMoveGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CTMoveGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;

			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = CTMoveGUIMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			SetAbility1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			SetAbility2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			SetAbility3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			SetAbility4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			SetAbility5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			SetAbility6Procedure.execute(entity);
		}
		if (buttonID == 6) {

			ForwardPageProcedure.execute(entity);
		}
		if (buttonID == 7) {

			BackPageProcedure.execute(entity);
		}
		if (buttonID == 8) {

			ForwardbuttonProcedure.execute(entity);
		}
		if (buttonID == 9) {

			BackButtonProcedure.execute(entity);
		}
		if (buttonID == 10) {

			UnlockButtonProcedure.execute(entity);
		}
		if (buttonID == 17) {

			MenuOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 18) {

			OpenSelfVowGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(CTMoveGUIButtonMessage.class, CTMoveGUIButtonMessage::buffer, CTMoveGUIButtonMessage::new, CTMoveGUIButtonMessage::handler);
	}

}
