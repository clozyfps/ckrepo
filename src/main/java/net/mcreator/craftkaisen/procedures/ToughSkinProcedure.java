package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ToughSkinProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity,
Entity sourceentity,
double amount
) {
if(
entity == null ||
sourceentity == null
) return ;
if (entity instanceof Player||entity instanceof ServerPlayer) {if (().equals("Tough Skin")) {if(event != null && event.isCancelable()) {
event.setCanceled(true);
}entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), sourceentity), (float)(amount-5));}}
}
}
