package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExpMobsProcedure {
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
		if (entity instanceof RyomenSukunaEntity || entity instanceof MegunaEntity || entity instanceof HeianEraSukunaEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.currentExp = _setval;
																		capability.syncPlayerVariables(sourceentity);
																	});
																}
																CraftKaisenMod.queueServerWork(1, () -> {
																	{
																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																			capability.currentExp = _setval;
																			capability.syncPlayerVariables(sourceentity);
																		});
																	}
																	CraftKaisenMod.queueServerWork(1, () -> {
																		{
																			double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																					+ 100;
																			sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																				capability.currentExp = _setval;
																				capability.syncPlayerVariables(sourceentity);
																			});
																		}
																		CraftKaisenMod.queueServerWork(1, () -> {
																			{
																				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																						+ 100;
																				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																					capability.currentExp = _setval;
																					capability.syncPlayerVariables(sourceentity);
																				});
																			}
																			CraftKaisenMod.queueServerWork(1, () -> {
																				{
																					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																						capability.currentExp = _setval;
																						capability.syncPlayerVariables(sourceentity);
																					});
																				}
																				CraftKaisenMod.queueServerWork(1, () -> {
																					{
																						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																							capability.currentExp = _setval;
																							capability.syncPlayerVariables(sourceentity);
																						});
																					}
																					CraftKaisenMod.queueServerWork(1, () -> {
																						{
																							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																									.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																								capability.currentExp = _setval;
																								capability.syncPlayerVariables(sourceentity);
																							});
																						}
																						CraftKaisenMod.queueServerWork(1, () -> {
																							{
																								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																										.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																									capability.currentExp = _setval;
																									capability.syncPlayerVariables(sourceentity);
																								});
																							}
																							CraftKaisenMod.queueServerWork(1, () -> {
																								{
																									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																											.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																										capability.currentExp = _setval;
																										capability.syncPlayerVariables(sourceentity);
																									});
																								}
																								CraftKaisenMod.queueServerWork(1, () -> {
																									{
																										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																											capability.currentExp = _setval;
																											capability.syncPlayerVariables(sourceentity);
																										});
																									}
																									CraftKaisenMod.queueServerWork(1, () -> {
																										{
																											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																													.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																												capability.currentExp = _setval;
																												capability.syncPlayerVariables(sourceentity);
																											});
																										}
																										CraftKaisenMod.queueServerWork(1, () -> {
																											{
																												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																													capability.currentExp = _setval;
																													capability.syncPlayerVariables(sourceentity);
																												});
																											}
																											CraftKaisenMod.queueServerWork(1, () -> {
																												{
																													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																															.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																														capability.currentExp = _setval;
																														capability.syncPlayerVariables(sourceentity);
																													});
																												}
																												CraftKaisenMod.queueServerWork(1, () -> {
																													{
																														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																															capability.currentExp = _setval;
																															capability.syncPlayerVariables(sourceentity);
																														});
																													}
																													CraftKaisenMod.queueServerWork(1, () -> {
																														{
																															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																	.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																capability.currentExp = _setval;
																																capability.syncPlayerVariables(sourceentity);
																															});
																														}
																														CraftKaisenMod.queueServerWork(1, () -> {
																															CraftKaisenMod.queueServerWork(1, () -> {
																																{
																																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																			.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																		capability.currentExp = _setval;
																																		capability.syncPlayerVariables(sourceentity);
																																	});
																																}
																																CraftKaisenMod.queueServerWork(1, () -> {
																																	{
																																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																			capability.currentExp = _setval;
																																			capability.syncPlayerVariables(sourceentity);
																																		});
																																	}
																																	CraftKaisenMod.queueServerWork(1, () -> {
																																		{
																																			double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																			sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.ifPresent(capability -> {
																																						capability.currentExp = _setval;
																																						capability.syncPlayerVariables(sourceentity);
																																					});
																																		}
																																		CraftKaisenMod.queueServerWork(1, () -> {
																																			{
																																				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																								.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																									.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																										.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																											.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																												.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																										sourceentity
																																												.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																												.ifPresent(capability -> {
																																													capability.currentExp = _setval;
																																													capability.syncPlayerVariables(sourceentity);
																																												});
																																									}
																																									CraftKaisenMod.queueServerWork(1, () -> {
																																										{
																																											double _setval = (sourceentity
																																													.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																													.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																													+ 100;
																																											sourceentity
																																													.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																													.ifPresent(capability -> {
																																														capability.currentExp = _setval;
																																														capability.syncPlayerVariables(sourceentity);
																																													});
																																										}
																																										CraftKaisenMod.queueServerWork(1, () -> {
																																											{
																																												double _setval = (sourceentity
																																														.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																														+ 100;
																																												sourceentity
																																														.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.ifPresent(capability -> {
																																															capability.currentExp = _setval;
																																															capability.syncPlayerVariables(sourceentity);
																																														});
																																											}
																																											CraftKaisenMod.queueServerWork(1, () -> {
																																												{
																																													double _setval = (sourceentity.getCapability(
																																															CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																															.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																															+ 100;
																																													sourceentity.getCapability(
																																															CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																															.ifPresent(capability -> {
																																																capability.currentExp = _setval;
																																																capability.syncPlayerVariables(sourceentity);
																																															});
																																												}
																																												CraftKaisenMod.queueServerWork(1, () -> {
																																													{
																																														double _setval = (sourceentity.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																																.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																+ 100;
																																														sourceentity.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																																.ifPresent(capability -> {
																																																	capability.currentExp = _setval;
																																																	capability.syncPlayerVariables(sourceentity);
																																																});
																																													}
																																													CraftKaisenMod.queueServerWork(1, () -> {
																																														{
																																															double _setval = (sourceentity.getCapability(
																																																	CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null)
																																																	.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																	+ 100;
																																															sourceentity.getCapability(
																																																	CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null).ifPresent(capability -> {
																																																		capability.currentExp = _setval;
																																																		capability.syncPlayerVariables(sourceentity);
																																																	});
																																														}
																																														CraftKaisenMod.queueServerWork(1, () -> {
																																															{
																																																double _setval = (sourceentity.getCapability(
																																																		CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null)
																																																		.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																		+ 100;
																																																sourceentity.getCapability(
																																																		CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null).ifPresent(capability -> {
																																																			capability.currentExp = _setval;
																																																			capability.syncPlayerVariables(sourceentity);
																																																		});
																																															}
																																															CraftKaisenMod.queueServerWork(1, () -> {
																																																{
																																																	double _setval = (sourceentity.getCapability(
																																																			CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null)
																																																			.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																			+ 100;
																																																	sourceentity.getCapability(
																																																			CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null).ifPresent(capability -> {
																																																				capability.currentExp = _setval;
																																																				capability.syncPlayerVariables(
																																																						sourceentity);
																																																			});
																																																}
																																																CraftKaisenMod.queueServerWork(1, () -> {
																																																	{
																																																		double _setval = (sourceentity.getCapability(
																																																				CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																				null)
																																																				.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																				+ 100;
																																																		sourceentity.getCapability(
																																																				CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																				null).ifPresent(capability -> {
																																																					capability.currentExp = _setval;
																																																					capability.syncPlayerVariables(
																																																							sourceentity);
																																																				});
																																																	}
																																																	CraftKaisenMod.queueServerWork(1, () -> {
																																																		{
																																																			double _setval = (sourceentity.getCapability(
																																																					CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null)
																																																					.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																					+ 100;
																																																			sourceentity.getCapability(
																																																					CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null).ifPresent(capability -> {
																																																						capability.currentExp = _setval;
																																																						capability.syncPlayerVariables(
																																																								sourceentity);
																																																					});
																																																		}
																																																		CraftKaisenMod.queueServerWork(1, () -> {
																																																			{
																																																				double _setval = (sourceentity
																																																						.getCapability(
																																																								CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																								null)
																																																						.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																						+ 100;
																																																				sourceentity.getCapability(
																																																						CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																						null).ifPresent(capability -> {
																																																							capability.currentExp = _setval;
																																																							capability
																																																									.syncPlayerVariables(
																																																											sourceentity);
																																																						});
																																																			}
																																																			CraftKaisenMod.queueServerWork(1, () -> {
																																																				{
																																																					double _setval = (sourceentity
																																																							.getCapability(
																																																									CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																									null)
																																																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																							+ 100;
																																																					sourceentity.getCapability(
																																																							CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																							null)
																																																							.ifPresent(capability -> {
																																																								capability.currentExp = _setval;
																																																								capability
																																																										.syncPlayerVariables(
																																																												sourceentity);
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
																															{
																																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																		.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof SatoruGojoEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.currentExp = _setval;
																		capability.syncPlayerVariables(sourceentity);
																	});
																}
																CraftKaisenMod.queueServerWork(1, () -> {
																	{
																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																			capability.currentExp = _setval;
																			capability.syncPlayerVariables(sourceentity);
																		});
																	}
																	CraftKaisenMod.queueServerWork(1, () -> {
																		{
																			double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																					+ 100;
																			sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																				capability.currentExp = _setval;
																				capability.syncPlayerVariables(sourceentity);
																			});
																		}
																		CraftKaisenMod.queueServerWork(1, () -> {
																			{
																				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																						+ 100;
																				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																					capability.currentExp = _setval;
																					capability.syncPlayerVariables(sourceentity);
																				});
																			}
																			CraftKaisenMod.queueServerWork(1, () -> {
																				{
																					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																						capability.currentExp = _setval;
																						capability.syncPlayerVariables(sourceentity);
																					});
																				}
																				CraftKaisenMod.queueServerWork(1, () -> {
																					{
																						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																							capability.currentExp = _setval;
																							capability.syncPlayerVariables(sourceentity);
																						});
																					}
																					CraftKaisenMod.queueServerWork(1, () -> {
																						{
																							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																									.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																								capability.currentExp = _setval;
																								capability.syncPlayerVariables(sourceentity);
																							});
																						}
																						CraftKaisenMod.queueServerWork(1, () -> {
																							{
																								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																										.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																									capability.currentExp = _setval;
																									capability.syncPlayerVariables(sourceentity);
																								});
																							}
																							CraftKaisenMod.queueServerWork(1, () -> {
																								{
																									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																											.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																										capability.currentExp = _setval;
																										capability.syncPlayerVariables(sourceentity);
																									});
																								}
																								CraftKaisenMod.queueServerWork(1, () -> {
																									{
																										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																											capability.currentExp = _setval;
																											capability.syncPlayerVariables(sourceentity);
																										});
																									}
																									CraftKaisenMod.queueServerWork(1, () -> {
																										{
																											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																													.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																												capability.currentExp = _setval;
																												capability.syncPlayerVariables(sourceentity);
																											});
																										}
																										CraftKaisenMod.queueServerWork(1, () -> {
																											{
																												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																													capability.currentExp = _setval;
																													capability.syncPlayerVariables(sourceentity);
																												});
																											}
																											CraftKaisenMod.queueServerWork(1, () -> {
																												{
																													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																															.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																														capability.currentExp = _setval;
																														capability.syncPlayerVariables(sourceentity);
																													});
																												}
																												CraftKaisenMod.queueServerWork(1, () -> {
																													{
																														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																															capability.currentExp = _setval;
																															capability.syncPlayerVariables(sourceentity);
																														});
																													}
																													CraftKaisenMod.queueServerWork(1, () -> {
																														{
																															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																	.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																capability.currentExp = _setval;
																																capability.syncPlayerVariables(sourceentity);
																															});
																														}
																														CraftKaisenMod.queueServerWork(1, () -> {
																															CraftKaisenMod.queueServerWork(1, () -> {
																																{
																																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																			.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																		capability.currentExp = _setval;
																																		capability.syncPlayerVariables(sourceentity);
																																	});
																																}
																																CraftKaisenMod.queueServerWork(1, () -> {
																																	{
																																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																				.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																																			capability.currentExp = _setval;
																																			capability.syncPlayerVariables(sourceentity);
																																		});
																																	}
																																	CraftKaisenMod.queueServerWork(1, () -> {
																																		{
																																			double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																			sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																					.ifPresent(capability -> {
																																						capability.currentExp = _setval;
																																						capability.syncPlayerVariables(sourceentity);
																																					});
																																		}
																																		CraftKaisenMod.queueServerWork(1, () -> {
																																			{
																																				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																						.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																								.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																									.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																										.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																											.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
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
																																												.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																										sourceentity
																																												.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																												.ifPresent(capability -> {
																																													capability.currentExp = _setval;
																																													capability.syncPlayerVariables(sourceentity);
																																												});
																																									}
																																									CraftKaisenMod.queueServerWork(1, () -> {
																																										{
																																											double _setval = (sourceentity
																																													.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																													.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																													+ 100;
																																											sourceentity
																																													.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																													.ifPresent(capability -> {
																																														capability.currentExp = _setval;
																																														capability.syncPlayerVariables(sourceentity);
																																													});
																																										}
																																										CraftKaisenMod.queueServerWork(1, () -> {
																																											{
																																												double _setval = (sourceentity
																																														.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																														+ 100;
																																												sourceentity
																																														.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																														.ifPresent(capability -> {
																																															capability.currentExp = _setval;
																																															capability.syncPlayerVariables(sourceentity);
																																														});
																																											}
																																											CraftKaisenMod.queueServerWork(1, () -> {
																																												{
																																													double _setval = (sourceentity.getCapability(
																																															CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																															.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																															+ 100;
																																													sourceentity.getCapability(
																																															CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																															.ifPresent(capability -> {
																																																capability.currentExp = _setval;
																																																capability.syncPlayerVariables(sourceentity);
																																															});
																																												}
																																												CraftKaisenMod.queueServerWork(1, () -> {
																																													{
																																														double _setval = (sourceentity.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																																.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																+ 100;
																																														sourceentity.getCapability(
																																																CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																																.ifPresent(capability -> {
																																																	capability.currentExp = _setval;
																																																	capability.syncPlayerVariables(sourceentity);
																																																});
																																													}
																																													CraftKaisenMod.queueServerWork(1, () -> {
																																														{
																																															double _setval = (sourceentity.getCapability(
																																																	CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null)
																																																	.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																	+ 100;
																																															sourceentity.getCapability(
																																																	CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null).ifPresent(capability -> {
																																																		capability.currentExp = _setval;
																																																		capability.syncPlayerVariables(sourceentity);
																																																	});
																																														}
																																														CraftKaisenMod.queueServerWork(1, () -> {
																																															{
																																																double _setval = (sourceentity.getCapability(
																																																		CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null)
																																																		.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																		+ 100;
																																																sourceentity.getCapability(
																																																		CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																		null).ifPresent(capability -> {
																																																			capability.currentExp = _setval;
																																																			capability.syncPlayerVariables(sourceentity);
																																																		});
																																															}
																																															CraftKaisenMod.queueServerWork(1, () -> {
																																																{
																																																	double _setval = (sourceentity.getCapability(
																																																			CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null)
																																																			.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																			+ 100;
																																																	sourceentity.getCapability(
																																																			CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null).ifPresent(capability -> {
																																																				capability.currentExp = _setval;
																																																				capability.syncPlayerVariables(
																																																						sourceentity);
																																																			});
																																																}
																																																CraftKaisenMod.queueServerWork(1, () -> {
																																																	{
																																																		double _setval = (sourceentity.getCapability(
																																																				CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																				null)
																																																				.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																				+ 100;
																																																		sourceentity.getCapability(
																																																				CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																				null).ifPresent(capability -> {
																																																					capability.currentExp = _setval;
																																																					capability.syncPlayerVariables(
																																																							sourceentity);
																																																				});
																																																	}
																																																	CraftKaisenMod.queueServerWork(1, () -> {
																																																		{
																																																			double _setval = (sourceentity.getCapability(
																																																					CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null)
																																																					.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																					+ 100;
																																																			sourceentity.getCapability(
																																																					CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null).ifPresent(capability -> {
																																																						capability.currentExp = _setval;
																																																						capability.syncPlayerVariables(
																																																								sourceentity);
																																																					});
																																																		}
																																																		CraftKaisenMod.queueServerWork(1, () -> {
																																																			{
																																																				double _setval = (sourceentity
																																																						.getCapability(
																																																								CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																								null)
																																																						.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																						+ 100;
																																																				sourceentity.getCapability(
																																																						CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																						null).ifPresent(capability -> {
																																																							capability.currentExp = _setval;
																																																							capability
																																																									.syncPlayerVariables(
																																																											sourceentity);
																																																						});
																																																			}
																																																			CraftKaisenMod.queueServerWork(1, () -> {
																																																				{
																																																					double _setval = (sourceentity
																																																							.getCapability(
																																																									CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																									null)
																																																							.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp
																																																							+ 100;
																																																					sourceentity.getCapability(
																																																							CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																							null)
																																																							.ifPresent(capability -> {
																																																								capability.currentExp = _setval;
																																																								capability
																																																										.syncPlayerVariables(
																																																												sourceentity);
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
																															{
																																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																																		.orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof YutaOkkotsuEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.currentExp = _setval;
																		capability.syncPlayerVariables(sourceentity);
																	});
																}
																CraftKaisenMod.queueServerWork(1, () -> {
																	{
																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof HajimeKashimoEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof YujiItadoriEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof FingerBearerEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						});
					});
				});
			});
		}
		if (entity instanceof ChosoEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof AoiTodoEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 60;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 60;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 60;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					});
				});
			});
		}
		if (entity instanceof AwakenedMakiEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						});
					});
				});
			});
		}
		if (entity instanceof JogoEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof HanamiEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof KoGuyEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			});
		}
		if (entity instanceof MegumiFushiguroEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					});
				});
			});
		}
		if (entity instanceof NanamiKentoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
						});
					});
				});
			});
		}
		if (entity instanceof NobaraKugisakiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof MahitoEntity) {
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.currentExp = _setval;
																		capability.syncPlayerVariables(sourceentity);
																	});
																}
																CraftKaisenMod.queueServerWork(1, () -> {
																	{
																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof TogeInumakiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 90;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof TojiFushiguroEntity || entity instanceof ResurrectedTojiEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.currentExp = _setval;
														capability.syncPlayerVariables(sourceentity);
													});
												}
												CraftKaisenMod.queueServerWork(1, () -> {
													{
														double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
														sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.currentExp = _setval;
															capability.syncPlayerVariables(sourceentity);
														});
													}
													CraftKaisenMod.queueServerWork(1, () -> {
														{
															double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
															sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																capability.currentExp = _setval;
																capability.syncPlayerVariables(sourceentity);
															});
														}
														CraftKaisenMod.queueServerWork(1, () -> {
															{
																double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																	capability.currentExp = _setval;
																	capability.syncPlayerVariables(sourceentity);
																});
															}
															CraftKaisenMod.queueServerWork(1, () -> {
																{
																	double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																	sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
																		capability.currentExp = _setval;
																		capability.syncPlayerVariables(sourceentity);
																	});
																}
																CraftKaisenMod.queueServerWork(1, () -> {
																	{
																		double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
																		sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
		if (entity instanceof RoppongiCursedSpiritEntity || entity instanceof RugbyFieldCursedSpiritEntity || entity instanceof FlyingCursedSpiritEntity || entity instanceof MouthCursedSpiritEntity || entity instanceof PandaEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 70;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 70;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 70;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				});
			});
		}
		if (entity instanceof BlackDivineDogEntity || entity instanceof WhiteDivineDogEntity || entity instanceof GreatSerpentEntity || entity instanceof ToadEntity || entity instanceof MaximumElephantEntity || entity instanceof RoundDeerEntity
				|| entity instanceof TenShadowRabbitEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 20;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (entity instanceof EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity || entity instanceof MergedBeastAgitoEntity) {
			{
				double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
				sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentExp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			CraftKaisenMod.queueServerWork(1, () -> {
				{
					double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
					sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentExp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				CraftKaisenMod.queueServerWork(1, () -> {
					{
						double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
						sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						{
							double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentExp = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						CraftKaisenMod.queueServerWork(1, () -> {
							{
								double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
								sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentExp = _setval;
									capability.syncPlayerVariables(sourceentity);
								});
							}
							CraftKaisenMod.queueServerWork(1, () -> {
								{
									double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
									sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.currentExp = _setval;
										capability.syncPlayerVariables(sourceentity);
									});
								}
								CraftKaisenMod.queueServerWork(1, () -> {
									{
										double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
										sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentExp = _setval;
											capability.syncPlayerVariables(sourceentity);
										});
									}
									CraftKaisenMod.queueServerWork(1, () -> {
										{
											double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
											sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.currentExp = _setval;
												capability.syncPlayerVariables(sourceentity);
											});
										}
										CraftKaisenMod.queueServerWork(1, () -> {
											{
												double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
												sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentExp = _setval;
													capability.syncPlayerVariables(sourceentity);
												});
											}
											CraftKaisenMod.queueServerWork(1, () -> {
												{
													double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 150;
													sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
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
		}
	}
}
