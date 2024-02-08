
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftkaisen.block.TalismanBlockBlock;
import net.mcreator.craftkaisen.block.SprinklerOnBlock;
import net.mcreator.craftkaisen.block.SprinklerBlock;
import net.mcreator.craftkaisen.block.ShibuyaGatesBlock;
import net.mcreator.craftkaisen.block.QuestBoardBlock;
import net.mcreator.craftkaisen.block.MagmaDomainWallBlock;
import net.mcreator.craftkaisen.block.MagmaDomainFloorBlock;
import net.mcreator.craftkaisen.block.DomainStarBlockBlock;
import net.mcreator.craftkaisen.block.DomainSmoothBasaltBlock;
import net.mcreator.craftkaisen.block.DomainPackedIceBlock;
import net.mcreator.craftkaisen.block.DomainMiniVolcanoBlock;
import net.mcreator.craftkaisen.block.DomainMagmaBlock;
import net.mcreator.craftkaisen.block.DomainLavaBlock;
import net.mcreator.craftkaisen.block.DomainIceStalagmiteTallBlock;
import net.mcreator.craftkaisen.block.DomainIceStalagmiteBlock;
import net.mcreator.craftkaisen.block.DomainIceBlockBlock;
import net.mcreator.craftkaisen.block.DomainDripstoneBlock;
import net.mcreator.craftkaisen.block.DomainBlueIceBlock;
import net.mcreator.craftkaisen.block.DomainBlockBlock;
import net.mcreator.craftkaisen.block.DomainBlackstoneStalagmiteTallBlock;
import net.mcreator.craftkaisen.block.DomainBlackstoneStalagmiteBlock;
import net.mcreator.craftkaisen.block.DomainBlackstoneBlock;
import net.mcreator.craftkaisen.block.DomainBasaltBlock;
import net.mcreator.craftkaisen.block.DomainAirBlockBlock;
import net.mcreator.craftkaisen.block.BarrierBlockBlock;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftKaisenMod.MODID);
	public static final RegistryObject<Block> DOMAIN_BLOCK = REGISTRY.register("domain_block", () -> new DomainBlockBlock());
	public static final RegistryObject<Block> TALISMAN_BLOCK = REGISTRY.register("talisman_block", () -> new TalismanBlockBlock());
	public static final RegistryObject<Block> SHIBUYA_GATES = REGISTRY.register("shibuya_gates", () -> new ShibuyaGatesBlock());
	public static final RegistryObject<Block> SPRINKLER = REGISTRY.register("sprinkler", () -> new SprinklerBlock());
	public static final RegistryObject<Block> SPRINKLER_ON = REGISTRY.register("sprinkler_on", () -> new SprinklerOnBlock());
	public static final RegistryObject<Block> BARRIER_BLOCK = REGISTRY.register("barrier_block", () -> new BarrierBlockBlock());
	public static final RegistryObject<Block> QUEST_BOARD = REGISTRY.register("quest_board", () -> new QuestBoardBlock());
	public static final RegistryObject<Block> DOMAIN_AIR_BLOCK = REGISTRY.register("domain_air_block", () -> new DomainAirBlockBlock());
	public static final RegistryObject<Block> MAGMA_DOMAIN_WALL = REGISTRY.register("magma_domain_wall", () -> new MagmaDomainWallBlock());
	public static final RegistryObject<Block> MAGMA_DOMAIN_FLOOR = REGISTRY.register("magma_domain_floor", () -> new MagmaDomainFloorBlock());
	public static final RegistryObject<Block> DOMAIN_BLUE_ICE = REGISTRY.register("domain_blue_ice", () -> new DomainBlueIceBlock());
	public static final RegistryObject<Block> DOMAIN_PACKED_ICE = REGISTRY.register("domain_packed_ice", () -> new DomainPackedIceBlock());
	public static final RegistryObject<Block> DOMAIN_STAR_BLOCK = REGISTRY.register("domain_star_block", () -> new DomainStarBlockBlock());
	public static final RegistryObject<Block> DOMAIN_ICE_BLOCK = REGISTRY.register("domain_ice_block", () -> new DomainIceBlockBlock());
	public static final RegistryObject<Block> DOMAIN_BLACKSTONE_STALAGMITE = REGISTRY.register("domain_blackstone_stalagmite", () -> new DomainBlackstoneStalagmiteBlock());
	public static final RegistryObject<Block> DOMAIN_BLACKSTONE_STALAGMITE_TALL = REGISTRY.register("domain_blackstone_stalagmite_tall", () -> new DomainBlackstoneStalagmiteTallBlock());
	public static final RegistryObject<Block> DOMAIN_BLACKSTONE = REGISTRY.register("domain_blackstone", () -> new DomainBlackstoneBlock());
	public static final RegistryObject<Block> DOMAIN_BASALT = REGISTRY.register("domain_basalt", () -> new DomainBasaltBlock());
	public static final RegistryObject<Block> DOMAIN_DRIPSTONE = REGISTRY.register("domain_dripstone", () -> new DomainDripstoneBlock());
	public static final RegistryObject<Block> DOMAIN_SMOOTH_BASALT = REGISTRY.register("domain_smooth_basalt", () -> new DomainSmoothBasaltBlock());
	public static final RegistryObject<Block> DOMAIN_MAGMA = REGISTRY.register("domain_magma", () -> new DomainMagmaBlock());
	public static final RegistryObject<Block> DOMAIN_MINI_VOLCANO = REGISTRY.register("domain_mini_volcano", () -> new DomainMiniVolcanoBlock());
	public static final RegistryObject<Block> DOMAIN_LAVA = REGISTRY.register("domain_lava", () -> new DomainLavaBlock());
	public static final RegistryObject<Block> DOMAIN_ICE_STALAGMITE = REGISTRY.register("domain_ice_stalagmite", () -> new DomainIceStalagmiteBlock());
	public static final RegistryObject<Block> DOMAIN_ICE_STALAGMITE_TALL = REGISTRY.register("domain_ice_stalagmite_tall", () -> new DomainIceStalagmiteTallBlock());
}
