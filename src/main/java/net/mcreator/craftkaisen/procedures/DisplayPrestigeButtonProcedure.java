package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplayPrestigeButtonProcedure {
public static boolean execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return false;
if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING)==false) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=100&&==0) {return
true;}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=200&&==1) {return
true;}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=300&&==2) {return
true;}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=400&&==3) {return
true;}}if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING)==true) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=100&&==0&&!(entity.getDisplayName().getString()).equals("vin_jo")&&!(entity.getDisplayName().getString()).equals("Void_Asriel")||(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=200&&==0&&((entity.getDisplayName().getString()).equals("vin_jo")||(entity.getDisplayName().getString()).equals("Void_Asriel"))) {return
true;}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=200&&==1&&!(entity.getDisplayName().getString()).equals("vin_jo")&&!(entity.getDisplayName().getString()).equals("Void_Asriel")||(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=300&&==1&&((entity.getDisplayName().getString()).equals("vin_jo")||(entity.getDisplayName().getString()).equals("Void_Asriel"))) {return
true;}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=300&&==2&&!(entity.getDisplayName().getString()).equals("vin_jo")&&!(entity.getDisplayName().getString()).equals("Void_Asriel")||(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=400&&==2&&((entity.getDisplayName().getString()).equals("vin_jo")||(entity.getDisplayName().getString()).equals("Void_Asriel"))) {return
true;}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=400&&==3&&!(entity.getDisplayName().getString()).equals("vin_jo")&&!(entity.getDisplayName().getString()).equals("Void_Asriel")||(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).level>=500&&==3&&((entity.getDisplayName().getString()).equals("vin_jo")||(entity.getDisplayName().getString()).equals("Void_Asriel"))) {return
true;}}return
false;
}
}
