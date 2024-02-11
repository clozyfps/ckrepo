
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.craftkaisen.block.entity.MagmaDomainWallBlockEntity;
import net.mcreator.craftkaisen.block.entity.MagmaDomainFloorBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainStarBlockBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainSmoothBasaltBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainPackedIceBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainMiniVolcanoBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainMagmaBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainLavaBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainIceStalagmiteTallBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainIceStalagmiteBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainIceBlockBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainDripstoneBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBlueIceBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBlockBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBlackstoneStalagmiteTallBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBlackstoneStalagmiteBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBlackstoneBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBasaltBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainAirBlockBlockEntity;
import net.mcreator.craftkaisen.block.entity.BarrierBlockBlockEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BLOCK = register("domain_block", CraftKaisenModBlocks.DOMAIN_BLOCK, DomainBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BARRIER_BLOCK = register("barrier_block", CraftKaisenModBlocks.BARRIER_BLOCK, BarrierBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_AIR_BLOCK = register("domain_air_block", CraftKaisenModBlocks.DOMAIN_AIR_BLOCK, DomainAirBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGMA_DOMAIN_WALL = register("magma_domain_wall", CraftKaisenModBlocks.MAGMA_DOMAIN_WALL, MagmaDomainWallBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGMA_DOMAIN_FLOOR = register("magma_domain_floor", CraftKaisenModBlocks.MAGMA_DOMAIN_FLOOR, MagmaDomainFloorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BLUE_ICE = register("domain_blue_ice", CraftKaisenModBlocks.DOMAIN_BLUE_ICE, DomainBlueIceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_PACKED_ICE = register("domain_packed_ice", CraftKaisenModBlocks.DOMAIN_PACKED_ICE, DomainPackedIceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_STAR_BLOCK = register("domain_star_block", CraftKaisenModBlocks.DOMAIN_STAR_BLOCK, DomainStarBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_ICE_BLOCK = register("domain_ice_block", CraftKaisenModBlocks.DOMAIN_ICE_BLOCK, DomainIceBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BLACKSTONE_STALAGMITE = register("domain_blackstone_stalagmite", CraftKaisenModBlocks.DOMAIN_BLACKSTONE_STALAGMITE, DomainBlackstoneStalagmiteBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BLACKSTONE_STALAGMITE_TALL = register("domain_blackstone_stalagmite_tall", CraftKaisenModBlocks.DOMAIN_BLACKSTONE_STALAGMITE_TALL, DomainBlackstoneStalagmiteTallBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BLACKSTONE = register("domain_blackstone", CraftKaisenModBlocks.DOMAIN_BLACKSTONE, DomainBlackstoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BASALT = register("domain_basalt", CraftKaisenModBlocks.DOMAIN_BASALT, DomainBasaltBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_DRIPSTONE = register("domain_dripstone", CraftKaisenModBlocks.DOMAIN_DRIPSTONE, DomainDripstoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_SMOOTH_BASALT = register("domain_smooth_basalt", CraftKaisenModBlocks.DOMAIN_SMOOTH_BASALT, DomainSmoothBasaltBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_MAGMA = register("domain_magma", CraftKaisenModBlocks.DOMAIN_MAGMA, DomainMagmaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_MINI_VOLCANO = register("domain_mini_volcano", CraftKaisenModBlocks.DOMAIN_MINI_VOLCANO, DomainMiniVolcanoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_LAVA = register("domain_lava", CraftKaisenModBlocks.DOMAIN_LAVA, DomainLavaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_ICE_STALAGMITE = register("domain_ice_stalagmite", CraftKaisenModBlocks.DOMAIN_ICE_STALAGMITE, DomainIceStalagmiteBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_ICE_STALAGMITE_TALL = register("domain_ice_stalagmite_tall", CraftKaisenModBlocks.DOMAIN_ICE_STALAGMITE_TALL, DomainIceStalagmiteTallBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
