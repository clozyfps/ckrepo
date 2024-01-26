package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HistoryBookRightClickedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
ItemStack itemstack
) {
if(
entity == null
) return ;
if (>=7) {if (!itemstack.getOrCreateTag().getBoolean("firstHalfRead")) {if (!=25) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("There is still more to learn.."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
SoundSource.PLAYERS, 1, 1, false);
}
}
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}else if (!=25&&!) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("There is still more to learn.."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}else if (!=25&&!) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("There is still more to learn.."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}else if (!=25&&!) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("There is still more to learn.."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}else if (!=25&&&&&&) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Your knowledge of the world has reached it's peak."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}itemstack.getOrCreateTag().putBoolean("firstHalfRead", true);if ((itemstack.getOrCreateTag().getString("HistoryType")).equals("Scribbles")) {itemstack.setHoverName(Component.literal(("Jujutsu Histoy Book"+" "+"("+"Scribbles"+")")));}else if ((itemstack.getOrCreateTag().getString("HistoryType")).equals("CT")) {itemstack.setHoverName(Component.literal(("Jujutsu Histoy Book"+" "+"("+itemstack.getOrCreateTag().getString("CTType")+" "+"Technique"+")")));}else if ((itemstack.getOrCreateTag().getString("HistoryType")).equals("Barriers")) {itemstack.setHoverName(Component.literal(("Jujutsu Histoy Book"+" "+"("+itemstack.getOrCreateTag().getString("BarrierType")+")")));}}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("The book seems too advanced for your current knowledge."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")),
SoundSource.PLAYERS, 1, 1, false);
}
}
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}
}
}
