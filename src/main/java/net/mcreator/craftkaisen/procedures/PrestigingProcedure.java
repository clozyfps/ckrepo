package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PrestigingProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
boolean gate = false;
if(entity instanceof Player _player) _player.closeContainer();gate = false;if (==0&&gate==false) {gate = true;}if (==1&&gate==false) {gate = true;}if (==2&&gate==false) {gate = true;}if (==3&&gate==false) {gate = true;}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.level = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentExp = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.maxExp = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 2;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.skillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentCursedEnergy = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.maxCursedEnergy = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.healthStat = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.strengthStat = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.speedStat = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.energyControl = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 10;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentOutput = _setval;
capability.syncPlayerVariables(entity);
});
}
{
double _setval = 10;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.maxOutput = _setval;
capability.syncPlayerVariables(entity);
});
}
}
}
