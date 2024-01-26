package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class YujiItadoriEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("sukuna", false);
		if (Math.random() < 0.8) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftKaisenModItems.ITADORI_OUTFIT_CHESTPLATE.get()));
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(CraftKaisenModItems.ITADORI_OUTFIT_LEGGINGS.get()));
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
