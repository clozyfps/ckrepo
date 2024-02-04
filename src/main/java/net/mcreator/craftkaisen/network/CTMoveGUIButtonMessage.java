
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.CTMoveGUIMenu;
import net.mcreator.craftkaisen.procedures.UnlockButtonProcedure;
import net.mcreator.craftkaisen.procedures.SetAbility6Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility5Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility4Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility3Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility2Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility1Procedure;
import net.mcreator.craftkaisen.procedures.OpenSelfVowGUIProcedure;
import net.mcreator.craftkaisen.procedures.MenuOnKeyPressedProcedure;
import net.mcreator.craftkaisen.procedures.ForwardbuttonProcedure;
import net.mcreator.craftkaisen.procedures.ForwardPageProcedure;
import net.mcreator.craftkaisen.procedures.BackPageProcedure;
import net.mcreator.craftkaisen.procedures.BackButtonProcedure;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

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

			ForwardPageProcedure.execute(entity);
		}
		if (buttonID == 1) {

			BackPageProcedure.execute(entity);
		}
		if (buttonID == 2) {

			ForwardbuttonProcedure.execute(entity);
		}
		if (buttonID == 3) {

			BackButtonProcedure.execute(entity);
		}
		if (buttonID == 4) {

			UnlockButtonProcedure.execute(entity);
		}
		if (buttonID == 5) {

			MenuOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenSelfVowGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			SetAbility1Procedure.execute(entity);
		}
		if (buttonID == 8) {

			SetAbility2Procedure.execute(entity);
		}
		if (buttonID == 9) {

			SetAbility3Procedure.execute(entity);
		}
		if (buttonID == 10) {

			SetAbility4Procedure.execute(entity);
		}
		if (buttonID == 11) {

			SetAbility5Procedure.execute(entity);
		}
		if (buttonID == 12) {

			SetAbility6Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(CTMoveGUIButtonMessage.class, CTMoveGUIButtonMessage::buffer, CTMoveGUIButtonMessage::new, CTMoveGUIButtonMessage::handler);
	}
}
