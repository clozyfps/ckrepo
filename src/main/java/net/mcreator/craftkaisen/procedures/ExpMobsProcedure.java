package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.entity.WhiteDivineDogEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.TogeInumakiEntity;
import net.mcreator.craftkaisen.entity.ToadEntity;
import net.mcreator.craftkaisen.entity.TenShadowRabbitEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoundDeerEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;
import net.mcreator.craftkaisen.entity.PandaEntity;
import net.mcreator.craftkaisen.entity.NobaraKugisakiEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MergedBeastAgitoEntity;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.MegumiFushiguroEntity;
import net.mcreator.craftkaisen.entity.MaximumElephantEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.HajimeKashimoEntity;
import net.mcreator.craftkaisen.entity.GreatSerpentEntity;
import net.mcreator.craftkaisen.entity.FlyingCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;
import net.mcreator.craftkaisen.entity.ChosoEntity;
import net.mcreator.craftkaisen.entity.BlackDivineDogEntity;
import net.mcreator.craftkaisen.entity.AwakenedMakiEntity;
import net.mcreator.craftkaisen.entity.AoiTodoEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

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
