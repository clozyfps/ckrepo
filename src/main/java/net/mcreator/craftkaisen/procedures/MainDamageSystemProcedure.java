package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MainDamageSystemProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity, double amount) {
		execute(null, damagesource, entity, amount);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity, double amount) {
		if (entity == null)
			return;
		double random = 0;
		if (entity instanceof Player || entity instanceof ServerPlayer) {
			if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:slashing_damage")))) {
				random = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random == 1) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftLegDamage + amount / 2;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.leftLegDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 2) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftArmDamage + amount / 2;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.leftArmDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 3) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightArmDamage + amount / 2;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.rightArmDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 4) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightLegDamage + amount / 2;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.rightLegDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:crushing_damage")))) {
				random = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random == 1) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftLegDamage + amount / 3;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.leftLegDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 2) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftArmDamage + amount / 3;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.leftArmDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 3) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightArmDamage + amount / 3;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.rightArmDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 4) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightLegDamage + amount / 3;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.rightLegDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				random = Mth.nextInt(RandomSource.create(), 1, 4);
				if (random == 1) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftLegDamage + amount / 4;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.leftLegDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 2) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftArmDamage + amount / 4;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.leftArmDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 3) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightArmDamage + amount / 4;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.rightArmDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (random == 4) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightLegDamage + amount / 4;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.rightLegDamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
