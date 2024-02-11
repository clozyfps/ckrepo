
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.craftkaisen.block.entity.IceDomainWallBlockEntity;
import net.mcreator.craftkaisen.block.entity.IceDomainFloorBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainBlockBlockEntity;
import net.mcreator.craftkaisen.block.entity.DomainAirBlockBlockEntity;
import net.mcreator.craftkaisen.block.entity.BarrierBlockBlockEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_BLOCK = register("domain_block", CraftKaisenModBlocks.DOMAIN_BLOCK, DomainBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BARRIER_BLOCK = register("barrier_block", CraftKaisenModBlocks.BARRIER_BLOCK, BarrierBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOMAIN_AIR_BLOCK = register("domain_air_block", CraftKaisenModBlocks.DOMAIN_AIR_BLOCK, DomainAirBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_DOMAIN_FLOOR = register("ice_domain_floor", CraftKaisenModBlocks.ICE_DOMAIN_FLOOR, IceDomainFloorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ICE_DOMAIN_WALL = register("ice_domain_wall", CraftKaisenModBlocks.ICE_DOMAIN_WALL, IceDomainWallBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
