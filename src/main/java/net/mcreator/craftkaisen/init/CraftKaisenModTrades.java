
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CraftKaisenModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.DIAMOND),

					new ItemStack(CraftKaisenModItems.JUJUTSU_HISTORY_BOOK.get()), 10, 5, 0.15f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CraftKaisenModItems.CURSED_MASK.get()),

					new ItemStack(CraftKaisenModItems.NAGINATA.get()), 10, 5, 0.05f));
		}
	}
}
