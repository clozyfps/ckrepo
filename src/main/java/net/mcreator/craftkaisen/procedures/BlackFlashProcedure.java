package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlackFlashProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getDirectEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity, double amount) {
		execute(null, world, entity, immediatesourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity immediatesourceentity, double amount) {
		if (entity == null || immediatesourceentity == null)
			return;
		double v = 0;
		double vanim = 0;
		if (immediatesourceentity instanceof Player) {
			immediatesourceentity.getPersistentData().putDouble("bf", (Mth.nextInt(RandomSource.create(), 1, 5000)));
			if (!(immediatesourceentity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(CraftKaisenModMobEffects.ZONE.get()))) {
				vanim = Mth.nextInt(RandomSource.create(), 1, 10000);
			} else if (immediatesourceentity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(CraftKaisenModMobEffects.ZONE.get())) {
				vanim = Mth.nextInt(RandomSource.create(), 1, 2000);
			}
			if ((immediatesourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy > 0) {
				if (immediatesourceentity.getPersistentData().getDouble("bf") > (immediatesourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).BlackFlashRarity) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0 0 0 3 ^0 ^0 ^0 2.2 1.5 2.2 0 20");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 1 0 0 3 ^0 ^0 ^0 2.2 1.5 2.2 0 30");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLACK_FLASH_LIGHTNING.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 15, 1, 0.5, 1, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 3, 0.5, 2, 0.5, 0.5);
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), immediatesourceentity), (float) (amount * 2.5));
					if (immediatesourceentity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:black_flash_advancement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.ZONE.get(), 1000, 0));
				}
			}
		}
	}
}
