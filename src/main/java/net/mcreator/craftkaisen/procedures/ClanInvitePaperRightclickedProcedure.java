package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ClanInvitePaperRightclickedProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getOrCreateTag().getBoolean("invitation")==false) {if (!().isEmpty()) {(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).setHoverName(Component.literal((+" Invitation")));(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getOrCreateTag().putString("clanitem", );(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getOrCreateTag().putBoolean("invitation", true);}}else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getOrCreateTag().getBoolean("invitation")==true) {if (().isEmpty()) {(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getOrCreateTag().putBoolean("invitation", false);(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).setHoverName(Component.literal(""));(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getOrCreateTag().putString("clanitem", "");(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).shrink(1);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("Joined "+)), true);}}
}
}
