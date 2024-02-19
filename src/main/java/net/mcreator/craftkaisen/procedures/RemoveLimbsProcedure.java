package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RemoveLimbsProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
CraftKaisenMod.queueServerWork(1, () -> {
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")),
SoundSource.NEUTRAL, (float)0.5, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")),
SoundSource.NEUTRAL, (float)0.5, 1, false);
}
}
world.levelEvent(2001, BlockPos.containing(x,y,z), Block.getId(Blocks.RED_CONCRETE.defaultBlockState()));if () {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "leftleggone"))));
}
}
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You lost your left leg."), false);}if () {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "leftarmgone"))));
}
}
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You lost your left arm."), false);}if () {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "rightarmgone"))));
}
}
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You lost your right arm."), false);}if () {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "rightleggone"))));
}
}
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You lost your right leg."), false);}
});
}
}
