package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.RikoAmanaiEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.Comparator;

public class QuestBoardOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		double grade3 = 0;
		double grade2 = 0;
		double grade1 = 0;
		double specialgrade = 0;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DoingMission == false) {
				{
					boolean _setval = true;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DoingMission = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 4")) {
					random = Mth.nextInt(RandomSource.create(), 1, 3);
					if (random == 1) {
						{
							String _setval = "Exorcise 5 Cursed Spirits " + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("exorcise5spirits")) + "/5";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 2) {
						{
							String _setval = "Exorcise 2 Cursed Spirits " + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("exorcise2spirits")) + "/2";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 3) {
						{
							String _setval = "Exorcise a Cursed Spirit without taking damage";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 3")) {
					random = Mth.nextInt(RandomSource.create(), 1, 4);
					if (random == 1) {
						{
							String _setval = "Execute 5 Evil Mobs " + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("execute5mobs")) + "/5";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 2) {
						{
							String _setval = "Exorcise a Finger Bearer";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 3) {
						{
							String _setval = "Deliver the medicine to the old lady";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftKaisenModItems.MEDICINE.get()));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (random == 4) {
						{
							String _setval = "Find a Cursed Tool";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 1")
						|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Semi Grade 1")
						|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Semi Grade 2")
						|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 2")) {
					random = Mth.nextInt(RandomSource.create(), 1, 5);
					if (random == 1) {
						{
							String _setval = "Escort The Star Plasma Vessel To - " + "X: " + entity.getPersistentData().getDouble("starvesselx") + " Z: " + entity.getPersistentData().getDouble("starvesselz");
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new RikoAmanaiEntity(CraftKaisenModEntities.RIKO_AMANAI.get(), _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							_level.addFreshEntity(entityToSpawn);
						}
						CraftKaisenMod.queueServerWork(10, () -> {
							if (!world.getEntitiesOfClass(RikoAmanaiEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
								if (((Entity) world.getEntitiesOfClass(RikoAmanaiEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
							}
						});
					} else if (random == 2) {
						{
							String _setval = "Deliver the medicine to the old lady";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftKaisenModItems.MEDICINE.get()));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (random == 3) {
						{
							String _setval = "Exorcise a Finger Bearer";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 4) {
						{
							String _setval = "Find a Cursed Tool";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 5) {
						{
							String _setval = "Excorcise 20 Cursed Spirits";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Special Grade")) {
					random = Mth.nextInt(RandomSource.create(), 1, 4);
					if (random == 1) {
						{
							String _setval = "Kill Mahito";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 2) {
						{
							String _setval = "Kill Toji Fushiguro";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 3) {
						{
							String _setval = "Kill Jogo";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random == 4) {
						{
							String _setval = "Kill Sukuna";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
