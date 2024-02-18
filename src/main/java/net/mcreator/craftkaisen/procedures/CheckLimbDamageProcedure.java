package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckLimbDamageProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (>=100) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null && !animation.isActive()) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "leftlegdetach"))));
}
}
}entity.getPersistentData().putBoolean("leftLegGone", true);
RemoveLimbsProcedure.execute(world,entity)
;
}if (>=100) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null && !animation.isActive()) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "leftarmdetach"))));
}
}
}entity.getPersistentData().putBoolean("leftArmGone", true);
RemoveLimbsProcedure.execute(world,entity)
;
}if (>=100) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null && !animation.isActive()) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "rightarmdetach"))));
}
}
}entity.getPersistentData().putBoolean("rightArmGone", true);
RemoveLimbsProcedure.execute(world,entity)
;
}if (>=100) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null && !animation.isActive()) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "rightlegdetach"))));
}
}
}entity.getPersistentData().putBoolean("rightLegGone", true);
RemoveLimbsProcedure.execute(world,entity)
;
}
}
}
