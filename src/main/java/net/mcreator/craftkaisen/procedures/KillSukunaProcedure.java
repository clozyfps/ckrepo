package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KillSukunaProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CurrentMission).contains("Kill Sukuna")
				&& (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DoingMission == true) {
			if (entity instanceof RyomenSukunaEntity) {
				{
					boolean _setval = false;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DoingMission = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					String _setval = "";
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CurrentMission = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame + 90000;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Fame = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.currentExp = _setval;
																		capability.syncPlayerVariables(sourceentity);
																	});
																}
																CraftKaisenMod.queueServerWork(1, () -> {
																	{
																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																			capability.currentExp = _setval;
																			capability.syncPlayerVariables(sourceentity);
																		});
																	}
																	CraftKaisenMod.queueServerWork(1, () -> {
																		{
																			double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																					+ 250;
																			sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																				capability.currentExp = _setval;
																				capability.syncPlayerVariables(sourceentity);
																			});
																		}
																		CraftKaisenMod.queueServerWork(1, () -> {
																			{
																				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																						+ 250;
																				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																					capability.currentExp = _setval;
																					capability.syncPlayerVariables(sourceentity);
																				});
																			}
																			CraftKaisenMod.queueServerWork(1, () -> {
																				{
																					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																						capability.currentExp = _setval;
																						capability.syncPlayerVariables(sourceentity);
																					});
																				}
																				CraftKaisenMod.queueServerWork(1, () -> {
																					{
																						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																							capability.currentExp = _setval;
																							capability.syncPlayerVariables(sourceentity);
																						});
																					}
																					CraftKaisenMod.queueServerWork(1, () -> {
																						{
																							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																									.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																								capability.currentExp = _setval;
																								capability.syncPlayerVariables(sourceentity);
																							});
																						}
																						CraftKaisenMod.queueServerWork(1, () -> {
																							{
																								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																										.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																									capability.currentExp = _setval;
																									capability.syncPlayerVariables(sourceentity);
																								});
																							}
																							CraftKaisenMod.queueServerWork(1, () -> {
																								{
																									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																											.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																										capability.currentExp = _setval;
																										capability.syncPlayerVariables(sourceentity);
																									});
																								}
																								CraftKaisenMod.queueServerWork(1, () -> {
																									{
																										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																											capability.currentExp = _setval;
																											capability.syncPlayerVariables(sourceentity);
																										});
																									}
																									CraftKaisenMod.queueServerWork(1, () -> {
																										{
																											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																													.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																												capability.currentExp = _setval;
																												capability.syncPlayerVariables(sourceentity);
																											});
																										}
																										CraftKaisenMod.queueServerWork(1, () -> {
																											{
																												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																													capability.currentExp = _setval;
																													capability.syncPlayerVariables(sourceentity);
																												});
																											}
																											CraftKaisenMod.queueServerWork(1, () -> {
																												{
																													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																															.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																														capability.currentExp = _setval;
																														capability.syncPlayerVariables(sourceentity);
																													});
																												}
																												CraftKaisenMod.queueServerWork(1, () -> {
																													{
																														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																															capability.currentExp = _setval;
																															capability.syncPlayerVariables(sourceentity);
																														});
																													}
																													CraftKaisenMod.queueServerWork(1, () -> {
																														{
																															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																	.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																capability.currentExp = _setval;
																																capability.syncPlayerVariables(sourceentity);
																															});
																														}
																														CraftKaisenMod.queueServerWork(1, () -> {
																															{
																																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																		.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																	capability.currentExp = _setval;
																																	capability.syncPlayerVariables(sourceentity);
																																});
																															}
																															CraftKaisenMod.queueServerWork(1, () -> {
																																{
																																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																			.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																		capability.currentExp = _setval;
																																		capability.syncPlayerVariables(sourceentity);
																																	});
																																}
																																CraftKaisenMod.queueServerWork(1, () -> {
																																	{
																																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																			capability.currentExp = _setval;
																																			capability.syncPlayerVariables(sourceentity);
																																		});
																																	}
																																	CraftKaisenMod.queueServerWork(1, () -> {
																																		{
																																			double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																																			sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.ifPresent(capability -> {
																																						capability.currentExp = _setval;
																																						capability.syncPlayerVariables(sourceentity);
																																					});
																																		}
																																		CraftKaisenMod.queueServerWork(1, () -> {
																																			{
																																				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																																				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.ifPresent(capability -> {
																																							capability.currentExp = _setval;
																																							capability.syncPlayerVariables(sourceentity);
																																						});
																																			}
																																			CraftKaisenMod.queueServerWork(1, () -> {
																																				{
																																					double _setval = (sourceentity
																																							.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 250;
																																					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																							.ifPresent(capability -> {
																																								capability.currentExp = _setval;
																																								capability.syncPlayerVariables(sourceentity);
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
					});
				});
			}
		}
	}
}
