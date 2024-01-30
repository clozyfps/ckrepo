
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CraftKaisenModBlocks.TALISMAN_BLOCK.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(CraftKaisenModItems.SLEEP_RANGED.get());
			tabData.accept(CraftKaisenModItems.NAIL_PROJECTILE.get());
			tabData.accept(CraftKaisenModItems.DISASTER_FLAME_RANGED.get());
			tabData.accept(CraftKaisenModItems.FLOWER_PROJECTILE.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("craft_kaisen", "ck_mobs"),
				builder -> builder.title(Component.translatable("item_group.craft_kaisen.ck_mobs")).icon(() -> new ItemStack(CraftKaisenModItems.SATORU_GOJO_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CraftKaisenModItems.SATORU_GOJO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.TOJI_FUSHIGURO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.YUJI_ITADORI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.YUTA_OKKOTSU_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.RIKA_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.CHOSO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.NANAMI_KENTO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.RESURRECTED_TOJI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.NOBARA_KUGISAKI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.OLD_LADY_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.RIKO_AMANAI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.AWAKENED_MAKI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.SUGURU_GETO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.PANDA_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.FLYING_CURSED_SPIRIT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.HAJIME_KASHIMO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.MERGED_BEAST_AGITO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.MEGUMI_FUSHIGURO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.TOGE_INUMAKI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.TAKADA_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.AOI_TODO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.URAUME_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.JINICHI_ZENIN_SPAWN_EGG.get());
				}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("craft_kaisen", "ck_weapons"),
				builder -> builder.title(Component.translatable("item_group.craft_kaisen.ck_weapons")).icon(() -> new ItemStack(CraftKaisenModItems.PLAYFUL_CLOUD.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CraftKaisenModItems.INVERTED_SPEAR.get());
					tabData.accept(CraftKaisenModItems.SPLIT_SOUL_KATANA.get());
					tabData.accept(CraftKaisenModItems.NAGINATA.get());
					tabData.accept(CraftKaisenModItems.YUTA_KATANA.get());
					tabData.accept(CraftKaisenModItems.MIWA_KATANA.get());
					tabData.accept(CraftKaisenModItems.PLAYFUL_CLOUD.get());
					tabData.accept(CraftKaisenModItems.NANAMI_KNIFE.get());
					tabData.accept(CraftKaisenModItems.BLOOD_BLADE.get());
					tabData.accept(CraftKaisenModItems.BLOOD_SPEAR.get());
					tabData.accept(CraftKaisenModItems.BLOOD_AXE.get());
					tabData.accept(CraftKaisenModItems.HAMMER.get());
					tabData.accept(CraftKaisenModItems.DRAGON_BONE.get());
					tabData.accept(CraftKaisenModItems.NYOI_STAFF.get());
					tabData.accept(CraftKaisenModItems.HITEN.get());
					tabData.accept(CraftKaisenModItems.KAMUTOKE.get());
				}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("craft_kaisen", "ck_armor"),
				builder -> builder.title(Component.translatable("item_group.craft_kaisen.ck_armor")).icon(() -> new ItemStack(CraftKaisenModItems.BANDAGE_BLIND_FOLD_HELMET.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CraftKaisenModItems.BLACK_BLIND_FOLD_HELMET.get());
					tabData.accept(CraftKaisenModItems.BANDAGE_BLIND_FOLD_HELMET.get());
					tabData.accept(CraftKaisenModItems.JUJUTSU_SORCERER_UNIFORM_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.JUJUTSU_SORCERER_UNIFORM_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.TOJI_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.TOJI_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.SUKUNA_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.SUKUNA_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.CHOSO_ARMOR_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.CHOSO_ARMOR_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.GETO_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.GETO_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.GETO_OUTFIT_BOOTS.get());
					tabData.accept(CraftKaisenModItems.YUTA_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.YUTA_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.NOBARA_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.NOBARA_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.MAHORAGA_WHEEL_HELMET.get());
					tabData.accept(CraftKaisenModItems.ITADORI_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.ITADORI_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.SKI_MASK_HELMET.get());
					tabData.accept(CraftKaisenModItems.KASHIMO_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.KASHIMO_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.MAHITO_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.MAHITO_OUTFIT_LEGGINGS.get());
					tabData.accept(CraftKaisenModItems.NANAMI_OUTFIT_CHESTPLATE.get());
					tabData.accept(CraftKaisenModItems.NANAMI_OUTFIT_LEGGINGS.get());
				}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("craft_kaisen", "ck_curses"),
				builder -> builder.title(Component.translatable("item_group.craft_kaisen.ck_curses")).icon(() -> new ItemStack(CraftKaisenModItems.HEIAN_ERA_SUKUNA_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CraftKaisenModItems.RYOMEN_SUKUNA_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.ROPPONGI_CURSED_SPIRIT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.GREAT_SERPENT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.RUGBY_FIELD_CURSED_SPIRIT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.KO_GUY_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.HEIAN_ERA_SUKUNA_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.TOAD_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.NUE_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.MOUTH_CURSED_SPIRIT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.MAHITO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.HANAMI_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.JOGO_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.ROUND_DEER_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.MAXIMUM_ELEPHANT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.BLACK_DIVINE_DOG_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.WHITE_DIVINE_DOG_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.TEN_SHADOW_RABBIT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.EMBER_INSECT_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.INVENTORY_CURSE_MOB_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.FINGER_BEARER_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.RAINBOW_DRAGON_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.SMALL_POX_DEITY_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.FLY_HEAD_SPAWN_EGG.get());
					tabData.accept(CraftKaisenModItems.MEGUNA_SPAWN_EGG.get());
				}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("craft_kaisen", "ck_items"),
				builder -> builder.title(Component.translatable("item_group.craft_kaisen.ck_items")).icon(() -> new ItemStack(CraftKaisenModItems.NAIL.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CraftKaisenModItems.NAIL.get());
					tabData.accept(CraftKaisenModItems.SUKUNA_FINGER.get());
					tabData.accept(CraftKaisenModItems.CURSED_SPIRIT_ORB.get());
					tabData.accept(CraftKaisenModItems.CURSED_RING.get());
					tabData.accept(CraftKaisenModItems.CURSED_WOMB_DEATH_PAINTING.get());
					tabData.accept(CraftKaisenModItems.PHONE.get());
					tabData.accept(CraftKaisenModItems.MEDICINE.get());
					tabData.accept(CraftKaisenModItems.CURSED_TEDDY_BEAR.get());
					tabData.accept(CraftKaisenModItems.CLAN_INVITE_PAPER.get());
					tabData.accept(CraftKaisenModItems.CURSED_DOLL.get());
					tabData.accept(CraftKaisenModItems.CURSED_NECKLACE.get());
					tabData.accept(CraftKaisenModItems.CURSED_GLASSES.get());
					tabData.accept(CraftKaisenModItems.CURSED_MASK.get());
					tabData.accept(CraftKaisenModItems.CURSED_TOTEM.get());
					tabData.accept(CraftKaisenModItems.REROLL_CT.get());
				}).withSearchBar());
		event.registerCreativeModeTab(new ResourceLocation("craft_kaisen", "ck_blocks"),
				builder -> builder.title(Component.translatable("item_group.craft_kaisen.ck_blocks")).icon(() -> new ItemStack(CraftKaisenModBlocks.BARRIER_BLOCK.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CraftKaisenModBlocks.SPRINKLER.get().asItem());
					tabData.accept(CraftKaisenModBlocks.QUEST_BOARD.get().asItem());
				}).withSearchBar());
	}
}
