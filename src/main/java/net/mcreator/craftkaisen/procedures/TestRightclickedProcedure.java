package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class TestRightclickedProcedure {
	public static void execute(LevelAccessor world) {
		CraftKaisenModVariables.MapVariables.get(world).WorldEventTimer = 35000;
		CraftKaisenModVariables.MapVariables.get(world).syncData(world);
	}
}
