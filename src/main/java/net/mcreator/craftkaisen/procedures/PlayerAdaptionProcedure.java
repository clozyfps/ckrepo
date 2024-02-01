package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerAdaptionProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
		execute(null, world, x, y, z, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Adaption")) {
				if (damagesource.is(DamageTypes.GENERIC)) {
					if (entity.getPersistentData().getBoolean("DamageAdapted") == false) {
						if (entity.getPersistentData().getDouble("DamageAdaptation") < 500) {
							entity.getPersistentData().putDouble("DamageAdaptation", (entity.getPersistentData().getDouble("DamageAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("DamageAdaptation") == 500) {
							entity.getPersistentData().putDouble("DamageAdaptation", (entity.getPersistentData().getDouble("DamageAdaptation") + 1));
							entity.getPersistentData().putDouble("DamageAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Generic Damage has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("DamageAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.PLAYER_ATTACK)) {
					if (entity.getPersistentData().getBoolean("PlayerAttackAdapted") == false) {
						if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") < 500) {
							entity.getPersistentData().putDouble("PlayerAttackAdaptation", (entity.getPersistentData().getDouble("PlayerAttackAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") == 500) {
							entity.getPersistentData().putDouble("PlayerAttackAdaptation", (entity.getPersistentData().getDouble("PlayerAttackAdaptation") + 1));
							entity.getPersistentData().putDouble("PlayerAttackAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Player Hits has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("PlayerAttackAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.MOB_ATTACK) || damagesource.is(DamageTypes.MOB_ATTACK_NO_AGGRO) || damagesource.is(DamageTypes.STING)) {
					if (entity.getPersistentData().getBoolean("MobAttackAdapted") == false) {
						if (entity.getPersistentData().getDouble("MobAttackAdaptation") < 500) {
							entity.getPersistentData().putDouble("MobAttackAdaptation", (entity.getPersistentData().getDouble("MobAttackAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("MobAttackAdaptation") == 500) {
							entity.getPersistentData().putDouble("MobAttackAdaptation", (entity.getPersistentData().getDouble("MobAttackAdaptation") + 1));
							entity.getPersistentData().putDouble("MobAttackAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Mob Hits has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("MobAttackAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.IN_FIRE) || damagesource.is(DamageTypes.ON_FIRE) || damagesource.is(DamageTypes.LAVA) || damagesource.is(DamageTypes.HOT_FLOOR) || damagesource.is(DamageTypes.LIGHTNING_BOLT)) {
					if (entity.getPersistentData().getBoolean("BurningAdapted") == false) {
						if (entity.getPersistentData().getDouble("BurningAdaptation") < 300) {
							entity.getPersistentData().putDouble("BurningAdaptation", (entity.getPersistentData().getDouble("BurningAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("BurningAdaptation") == 300) {
							entity.getPersistentData().putDouble("BurningAdaptation", (entity.getPersistentData().getDouble("BurningAdaptation") + 1));
							entity.getPersistentData().putDouble("BurningAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Burning has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("BurningAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION) || damagesource.is(DamageTypes.BAD_RESPAWN_POINT) || damagesource.is(DamageTypes.FIREBALL)
						|| damagesource.is(DamageTypes.UNATTRIBUTED_FIREBALL)) {
					if (entity.getPersistentData().getBoolean("ExplosionAdapted") == false) {
						if (entity.getPersistentData().getDouble("ExplosionAdaptation") < 300) {
							entity.getPersistentData().putDouble("ExplosionAdaptation", (entity.getPersistentData().getDouble("ExplosionAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ExplosionAdaptation") == 300) {
							entity.getPersistentData().putDouble("ExplosionAdaptation", (entity.getPersistentData().getDouble("ExplosionAdaptation") + 1));
							entity.getPersistentData().putDouble("ExplosionAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Explosions has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("ExplosionAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.FALL) || damagesource.is(DamageTypes.FLY_INTO_WALL)) {
					if (entity.getPersistentData().getBoolean("FallDamageAdapted") == false) {
						if (entity.getPersistentData().getDouble("FallDamageAdaptation") < 250) {
							entity.getPersistentData().putDouble("FallDamageAdaptation", (entity.getPersistentData().getDouble("FallDamageAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FallDamageAdaptation") == 250) {
							entity.getPersistentData().putDouble("FallDamageAdaptation", (entity.getPersistentData().getDouble("FallDamageAdaptation") + 1));
							entity.getPersistentData().putDouble("FallDamageAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Fall Damage has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("FallDamageAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.FALLING_BLOCK) || damagesource.is(DamageTypes.FALLING_STALACTITE) || damagesource.is(DamageTypes.FALLING_ANVIL)) {
					if (entity.getPersistentData().getBoolean("FallingBlockAdapted") == false) {
						if (entity.getPersistentData().getDouble("FallingBlockAdaptation") < 100) {
							entity.getPersistentData().putDouble("FallingBlockAdaptation", (entity.getPersistentData().getDouble("FallingBlockAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FallingBlockAdaptation") == 100) {
							entity.getPersistentData().putDouble("FallingBlockAdaptation", (entity.getPersistentData().getDouble("FallingBlockAdaptation") + 1));
							entity.getPersistentData().putDouble("FallingBlockAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Falling Blocks has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("FallingBlockAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.DROWN) || damagesource.is(DamageTypes.DRY_OUT) || damagesource.is(DamageTypes.IN_WALL)) {
					if (entity.getPersistentData().getBoolean("SuffocationAdapted") == false) {
						if (entity.getPersistentData().getDouble("SuffocationAdaptation") < 150) {
							entity.getPersistentData().putDouble("SuffocationAdaptation", (entity.getPersistentData().getDouble("SuffocationAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("SuffocationAdaptation") == 150) {
							entity.getPersistentData().putDouble("SuffocationAdaptation", (entity.getPersistentData().getDouble("SuffocationAdaptation") + 1));
							entity.getPersistentData().putDouble("SuffocationAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Suffocation has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("SuffocationAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.STALAGMITE) || damagesource.is(DamageTypes.CACTUS) || damagesource.is(DamageTypes.SWEET_BERRY_BUSH)) {
					if (entity.getPersistentData().getBoolean("DamageBlockAdapted") == false) {
						if (entity.getPersistentData().getDouble("DamageBlockAdaptation") < 100) {
							entity.getPersistentData().putDouble("DamageBlockAdaptation", (entity.getPersistentData().getDouble("DamageBlockAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("DamageBlockAdaptation") == 100) {
							entity.getPersistentData().putDouble("DamageBlockAdaptation", (entity.getPersistentData().getDouble("DamageBlockAdaptation") + 1));
							entity.getPersistentData().putDouble("DamageBlockAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Damaging Blocks has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("DamageBlockAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.ARROW) || damagesource.is(DamageTypes.FIREWORKS) || damagesource.is(DamageTypes.MOB_PROJECTILE) || damagesource.is(DamageTypes.TRIDENT)) {
					if (entity.getPersistentData().getBoolean("ProjectileAdapted") == false) {
						if (entity.getPersistentData().getDouble("ProjectileAdaptation") < 250) {
							entity.getPersistentData().putDouble("ProjectileAdaptation", (entity.getPersistentData().getDouble("ProjectileAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ProjectileAdaptation") == 250) {
							entity.getPersistentData().putDouble("ProjectileAdaptation", (entity.getPersistentData().getDouble("ProjectileAdaptation") + 1));
							entity.getPersistentData().putDouble("ProjectileAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Projectiles has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("ProjectileAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL)) {
					if (entity.getPersistentData().getBoolean("WitherAdapted") == false) {
						if (entity.getPersistentData().getDouble("WitherAdaptation") < 150) {
							entity.getPersistentData().putDouble("WitherAdaptation", (entity.getPersistentData().getDouble("WitherAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("WitherAdaptation") == 150) {
							entity.getPersistentData().putDouble("WitherAdaptation", (entity.getPersistentData().getDouble("WitherAdaptation") + 1));
							entity.getPersistentData().putDouble("WitherAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Withering has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("WitherAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.INDIRECT_MAGIC) || damagesource.is(DamageTypes.MAGIC) || damagesource.is(DamageTypes.THORNS)) {
					if (entity.getPersistentData().getBoolean("MagicAdapted") == false) {
						if (entity.getPersistentData().getDouble("MagicAdaptation") < 150) {
							entity.getPersistentData().putDouble("MagicAdaptation", (entity.getPersistentData().getDouble("MagicAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("MagicAdaptation") == 150) {
							entity.getPersistentData().putDouble("MagicAdaptation", (entity.getPersistentData().getDouble("MagicAdaptation") + 1));
							entity.getPersistentData().putDouble("MagicAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Magic Attacks has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("MagicAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.STARVE)) {
					if (entity.getPersistentData().getBoolean("StarvingAdapted") == false) {
						if (entity.getPersistentData().getDouble("StarvingAdaptation") < 100) {
							entity.getPersistentData().putDouble("StarvingAdaptation", (entity.getPersistentData().getDouble("StarvingAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("StarvingAdaptation") == 100) {
							entity.getPersistentData().putDouble("StarvingAdaptation", (entity.getPersistentData().getDouble("StarvingAdaptation") + 1));
							entity.getPersistentData().putDouble("StarvingAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Starving has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("StarvingAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.DRAGON_BREATH) || damagesource.is(DamageTypes.CRAMMING) || damagesource.is(DamageTypes.SONIC_BOOM)) {
					if (entity.getPersistentData().getBoolean("MiscAdapted") == false) {
						if (entity.getPersistentData().getDouble("MiscAdaptation") < 100) {
							entity.getPersistentData().putDouble("MiscAdaptation", (entity.getPersistentData().getDouble("MiscAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("MiscAdaptation") == 100) {
							entity.getPersistentData().putDouble("MiscAdaptation", (entity.getPersistentData().getDouble("MiscAdaptation") + 1));
							entity.getPersistentData().putDouble("MiscAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Miscellaneous Damage has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("MiscAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:blood_damage")))) {
					if (entity.getPersistentData().getBoolean("BloodAdapted") == false) {
						if (entity.getPersistentData().getDouble("BloodAdaptation") < 200) {
							entity.getPersistentData().putDouble("BloodAdaptation", (entity.getPersistentData().getDouble("BloodAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("BloodAdaptation") == 200) {
							entity.getPersistentData().putDouble("BloodAdaptation", (entity.getPersistentData().getDouble("BloodAdaptation") + 1));
							entity.getPersistentData().putDouble("BloodAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Blood Attacks has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("BloodAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:dismantle_damage")))) {
					if (entity.getPersistentData().getBoolean("DismantleAdapted") == false) {
						if (entity.getPersistentData().getDouble("DismantleAdaptation") < 200) {
							entity.getPersistentData().putDouble("DismantleAdaptation", (entity.getPersistentData().getDouble("DismantleAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("DismantleAdaptation") == 200) {
							entity.getPersistentData().putDouble("DismantleAdaptation", (entity.getPersistentData().getDouble("DismantleAdaptation") + 1));
							entity.getPersistentData().putDouble("DismantleAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Dismantle has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("DismantleAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:malevolent_shrine_damage")))) {
					if (entity.getPersistentData().getBoolean("ShrineAdapted") == false) {
						if (entity.getPersistentData().getDouble("ShrineAdaptation") < 350) {
							entity.getPersistentData().putDouble("ShrineAdaptation", (entity.getPersistentData().getDouble("ShrineAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ShrineAdaptation") == 350) {
							entity.getPersistentData().putDouble("ShrineAdaptation", (entity.getPersistentData().getDouble("ShrineAdaptation") + 1));
							entity.getPersistentData().putDouble("ShrineAdaptationTimer", 7000);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Malevolent Shrine has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("ShrineAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:ratio_damage")))) {
					if (entity.getPersistentData().getBoolean("RatioAdapted") == false) {
						if (entity.getPersistentData().getDouble("RatioAdaptation") < 200) {
							entity.getPersistentData().putDouble("RatioAdaptation", (entity.getPersistentData().getDouble("RatioAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("RatioAdaptation") == 200) {
							entity.getPersistentData().putDouble("RatioAdaptation", (entity.getPersistentData().getDouble("RatioAdaptation") + 1));
							entity.getPersistentData().putDouble("RatioAdaptationTimer", 2500);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Ratio has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("RatioAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:frame_attack")))) {
					if (entity.getPersistentData().getBoolean("FrameAdapted") == false) {
						if (entity.getPersistentData().getDouble("FrameAdaptation") < 200) {
							entity.getPersistentData().putDouble("FrameAdaptation", (entity.getPersistentData().getDouble("FrameAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FrameAdaptation") == 200) {
							entity.getPersistentData().putDouble("FrameAdaptation", (entity.getPersistentData().getDouble("FrameAdaptation") + 1));
							entity.getPersistentData().putDouble("FrameAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Projection Sorcery has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("FrameAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:reversal_red_damage")))) {
					if (entity.getPersistentData().getBoolean("ReversalRedAdapted") == false) {
						if (entity.getPersistentData().getDouble("ReversalRedAdaptation") < 200) {
							entity.getPersistentData().putDouble("ReversalRedAdaptation", (entity.getPersistentData().getDouble("ReversalRedAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ReversalRedAdaptation") == 200) {
							entity.getPersistentData().putDouble("ReversalRedAdaptation", (entity.getPersistentData().getDouble("ReversalRedAdaptation") + 1));
							entity.getPersistentData().putDouble("ReversalRedAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Reversal Red has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("ReversalRedAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:frost_calm_damage"))) || damagesource.is(DamageTypes.FREEZE)) {
					if (entity.getPersistentData().getBoolean("FreezingAdapted") == false) {
						if (entity.getPersistentData().getDouble("FreezingAdaptation") < 200) {
							entity.getPersistentData().putDouble("FreezingAdaptation", (entity.getPersistentData().getDouble("FreezingAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FreezingAdaptation") == 200) {
							entity.getPersistentData().putDouble("FreezingAdaptation", (entity.getPersistentData().getDouble("FreezingAdaptation") + 1));
							entity.getPersistentData().putDouble("FreezingAdaptationTimer", 1200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Adaptation to Freezing has begun."), true);
						}
					} else if (entity.getPersistentData().getBoolean("FreezingAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}
}
