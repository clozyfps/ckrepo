package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerAdaptionTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Adaption")
				|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftKaisenModItems.MAHORAGA_WHEEL_HELMET.get()) {
			if (entity.getPersistentData().getDouble("DamageAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("DamageAdaptationTimer", (entity.getPersistentData().getDouble("DamageAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("DamageAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("DamageAdapted") == false) {
				entity.getPersistentData().putBoolean("DamageAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Generic Damage."), true);
			}
			if (entity.getPersistentData().getDouble("PlayerAttackAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("PlayerAttackAdaptationTimer", (entity.getPersistentData().getDouble("PlayerAttackAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("PlayerAttackAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("PlayerAttackAdapted") == false) {
				entity.getPersistentData().putBoolean("PlayerAttackAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Player Hits."), true);
			}
			if (entity.getPersistentData().getDouble("MobAttackAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("MobAttackAdaptationTimer", (entity.getPersistentData().getDouble("MobAttackAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("MobAttackAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("MobAttackAdapted") == false) {
				entity.getPersistentData().putBoolean("MobAttackAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Mob Hits."), true);
			}
			if (entity.getPersistentData().getDouble("BurningAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("BurningAdaptationTimer", (entity.getPersistentData().getDouble("BurningAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("BurningAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("BurningAdapted") == false) {
				entity.getPersistentData().putBoolean("BurningAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Burning."), true);
			}
			if (entity.getPersistentData().getDouble("ExplosionAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("ExplosionAdaptationTimer", (entity.getPersistentData().getDouble("ExplosionAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("ExplosionAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("ExplosionAdapted") == false) {
				entity.getPersistentData().putBoolean("ExplosionAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Explosions."), true);
			}
			if (entity.getPersistentData().getDouble("FallDamageAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("FallDamageAdaptationTimer", (entity.getPersistentData().getDouble("FallDamageAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("FallDamageAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("FallDamageAdapted") == false) {
				entity.getPersistentData().putBoolean("FallDamageAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Fall Damage."), true);
			}
			if (entity.getPersistentData().getDouble("SuffocationAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("SuffocationAdaptationTimer", (entity.getPersistentData().getDouble("SuffocationAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("SuffocationAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("SuffocationAdapted") == false) {
				entity.getPersistentData().putBoolean("SuffocationAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Suffocation."), true);
			}
			if (entity.getPersistentData().getDouble("DamageBlockAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("DamageBlockAdaptationTimer", (entity.getPersistentData().getDouble("DamageBlockAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("DamageBlockAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("DamageBlockAdapted") == false) {
				entity.getPersistentData().putBoolean("DamageBlockAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Damaging Blocks."), true);
			}
			if (entity.getPersistentData().getDouble("ProjectileAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("ProjectileAdaptationTimer", (entity.getPersistentData().getDouble("ProjectileAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("ProjectileAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("ProjectileAdapted") == false) {
				entity.getPersistentData().putBoolean("ProjectileAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Projectiles."), true);
			}
			if (entity.getPersistentData().getDouble("WitherAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("WitherAdaptationTimer", (entity.getPersistentData().getDouble("WitherAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("WitherAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("WitherAdapted") == false) {
				entity.getPersistentData().putBoolean("WitherAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Withering."), true);
			}
			if (entity.getPersistentData().getDouble("MagicAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("MagicAdaptationTimer", (entity.getPersistentData().getDouble("MagicAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("MagicAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("MagicAdapted") == false) {
				entity.getPersistentData().putBoolean("MagicAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Magic Attacks."), true);
			}
			if (entity.getPersistentData().getDouble("StarvingAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("StarvingAdaptationTimer", (entity.getPersistentData().getDouble("StarvingAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("StarvingAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("StarvingAdapted") == false) {
				entity.getPersistentData().putBoolean("StarvingAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Starving."), true);
			}
			if (entity.getPersistentData().getDouble("FrameAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("FrameAdaptationTimer", (entity.getPersistentData().getDouble("FrameAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("FrameAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("FrameAdapted") == false) {
				entity.getPersistentData().putBoolean("FrameAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Projection Sorcery."), true);
			}
			if (entity.getPersistentData().getDouble("RatioAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("RatioAdaptationTimer", (entity.getPersistentData().getDouble("RatioAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("RatioAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("RatioAdapted") == false) {
				entity.getPersistentData().putBoolean("RatioAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Ratio."), true);
			}
			if (entity.getPersistentData().getDouble("FreezingAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("FreezingAdaptationTimer", (entity.getPersistentData().getDouble("FreezingAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("FreezingAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("FreezingAdapted") == false) {
				entity.getPersistentData().putBoolean("FreezingAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Freezing."), true);
			}
			if (entity.getPersistentData().getDouble("BloodAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("BloodAdaptationTimer", (entity.getPersistentData().getDouble("BloodAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("BloodAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("BloodAdapted") == false) {
				entity.getPersistentData().putBoolean("BloodAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Blood Attacks."), true);
			}
			if (entity.getPersistentData().getDouble("SlashesAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("SlashesAdaptationTimer", (entity.getPersistentData().getDouble("SlashesAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("SlashesAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("SlashesAdapted") == false) {
				entity.getPersistentData().putBoolean("SlashesAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Slashing Attacks."), true);
			}
			if (entity.getPersistentData().getDouble("RepulsionAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("RepulsionAdaptationTimer", (entity.getPersistentData().getDouble("RepulsionAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("RepulsionAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("RepulsionAdapted") == false) {
				entity.getPersistentData().putBoolean("RepulsionAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Repelling Attacks."), true);
			}
			if (entity.getPersistentData().getDouble("CrushingAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("CrushingAdaptationTimer", (entity.getPersistentData().getDouble("CrushingAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("CrushingAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("CrushingAdapted") == false) {
				entity.getPersistentData().putBoolean("CrushingAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Crushing Attacks."), true);
			}
			if (entity.getPersistentData().getDouble("ElectrictyAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("ElectrictyAdaptationTimer", (entity.getPersistentData().getDouble("ElectrictyAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("ElectrictyAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("ElectrictyAdapted") == false) {
				entity.getPersistentData().putBoolean("ElectrictyAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Electricty."), true);
			}
			if (entity.getPersistentData().getDouble("CursedEnergyAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("CursedEnergyAdaptationTimer", (entity.getPersistentData().getDouble("CursedEnergyAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("CursedEnergyAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("CursedEnergyAdapted") == false) {
				entity.getPersistentData().putBoolean("CursedEnergyAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Basic Cursed Energy."), true);
			}
			if (entity.getPersistentData().getDouble("SoulDamageAdaptationTimer") > 1) {
				entity.getPersistentData().putDouble("SoulDamageAdaptationTimer", (entity.getPersistentData().getDouble("SoulDamageAdaptationTimer") - 1));
			} else if (entity.getPersistentData().getDouble("SoulDamageAdaptationTimer") == 1 && entity.getPersistentData().getBoolean("SoulDamageAdapted") == false) {
				entity.getPersistentData().putBoolean("SoulDamageAdapted", true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Successfully Adapted to Soul Attacks."), true);
			}
		}
	}
}
