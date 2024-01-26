package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.entity.RikoAmanaiEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class StarPlasmaVesselQuestProcedure {
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
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CurrentMission)
				.equals("Escort The Star Plasma Vessel To - " + "X: " + entity.getPersistentData().getDouble("vesselx") + " Z: " + entity.getPersistentData().getDouble("vesselz"))) {
			if (Math.round(entity.getX()) == Math.round(entity.getPersistentData().getDouble("vesselx")) && Math.round(entity.getZ()) == Math.round(entity.getPersistentData().getDouble("vesselz"))) {
				if (!world.getEntitiesOfClass(RikoAmanaiEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
					if (!((Entity) world.getEntitiesOfClass(RikoAmanaiEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
						((Entity) world.getEntitiesOfClass(RikoAmanaiEntity.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
				}
				{
					boolean _setval = false;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DoingMission = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CurrentMission = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame + 10000;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Fame = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
										entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
											entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
												entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
													entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
														entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(entity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 300;
															entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(entity);
															});
														}
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			}
		}
	}
}
