
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.StartScreenMenu;
import net.mcreator.craftkaisen.world.inventory.SelfVowGUIMenu;
import net.mcreator.craftkaisen.world.inventory.PhoneGUIMenu;
import net.mcreator.craftkaisen.world.inventory.PerkGuiMenu;
import net.mcreator.craftkaisen.world.inventory.MoveGuiMenu;
import net.mcreator.craftkaisen.world.inventory.MasteryGUIMenu;
import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.world.inventory.KenjakuGUIMenu;
import net.mcreator.craftkaisen.world.inventory.InventoryCurseGuiMenu;
import net.mcreator.craftkaisen.world.inventory.ImbueGUIMenu;
import net.mcreator.craftkaisen.world.inventory.DomainClashMenu;
import net.mcreator.craftkaisen.world.inventory.CTMoveGUIMenu;
import net.mcreator.craftkaisen.world.inventory.CSMGUIMenu;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<MenuType<MoveGuiMenu>> MOVE_GUI = REGISTRY.register("move_gui", () -> IForgeMenuType.create(MoveGuiMenu::new));
	public static final RegistryObject<MenuType<StartScreenMenu>> START_SCREEN = REGISTRY.register("start_screen", () -> IForgeMenuType.create(StartScreenMenu::new));
	public static final RegistryObject<MenuType<MainMenuMenu>> MAIN_MENU = REGISTRY.register("main_menu", () -> IForgeMenuType.create(MainMenuMenu::new));
	public static final RegistryObject<MenuType<InventoryCurseGuiMenu>> INVENTORY_CURSE_GUI = REGISTRY.register("inventory_curse_gui", () -> IForgeMenuType.create(InventoryCurseGuiMenu::new));
	public static final RegistryObject<MenuType<DomainClashMenu>> DOMAIN_CLASH = REGISTRY.register("domain_clash", () -> IForgeMenuType.create(DomainClashMenu::new));
	public static final RegistryObject<MenuType<CSMGUIMenu>> CSMGUI = REGISTRY.register("csmgui", () -> IForgeMenuType.create(CSMGUIMenu::new));
	public static final RegistryObject<MenuType<ImbueGUIMenu>> IMBUE_GUI = REGISTRY.register("imbue_gui", () -> IForgeMenuType.create(ImbueGUIMenu::new));
	public static final RegistryObject<MenuType<PhoneGUIMenu>> PHONE_GUI = REGISTRY.register("phone_gui", () -> IForgeMenuType.create(PhoneGUIMenu::new));
	public static final RegistryObject<MenuType<SelfVowGUIMenu>> SELF_VOW_GUI = REGISTRY.register("self_vow_gui", () -> IForgeMenuType.create(SelfVowGUIMenu::new));
	public static final RegistryObject<MenuType<PerkGuiMenu>> PERK_GUI = REGISTRY.register("perk_gui", () -> IForgeMenuType.create(PerkGuiMenu::new));
	public static final RegistryObject<MenuType<CTMoveGUIMenu>> CT_MOVE_GUI = REGISTRY.register("ct_move_gui", () -> IForgeMenuType.create(CTMoveGUIMenu::new));
	public static final RegistryObject<MenuType<KenjakuGUIMenu>> KENJAKU_GUI = REGISTRY.register("kenjaku_gui", () -> IForgeMenuType.create(KenjakuGUIMenu::new));
	public static final RegistryObject<MenuType<MasteryGUIMenu>> MASTERY_GUI = REGISTRY.register("mastery_gui", () -> IForgeMenuType.create(MasteryGUIMenu::new));
}
