package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RemovedLimbsTickProcedure {
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
if (==true) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "leftleggone"))));
}
}
}if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,5,1, false, false));}if (==true) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "rightleggone"))));
}
}
}if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,5,1, false, false));}if (==true) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "rightarmgone"))));
}
}
}if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,5,1, false, false));}if (==true) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "leftarmgone"))));
}
}
}if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,5,1, false, false));}
}
}
