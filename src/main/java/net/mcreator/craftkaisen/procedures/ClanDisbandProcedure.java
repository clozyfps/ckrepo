package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ClanDisbandProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (!().isEmpty()) {if (().equals()) {for (Entity entityiterator : new ArrayList<>(world.players())) {
if (().equals()) {if (!(entity == entityiterator)) {if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("Your clan was disbanded by "+entity.getDisplayName().getString())), false);}}
}}}
}
}
