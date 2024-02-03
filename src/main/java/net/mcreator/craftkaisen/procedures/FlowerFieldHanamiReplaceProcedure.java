package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FlowerFieldHanamiReplaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		int horizontalRadiusHemiTop = (int) 8 - 1;
		int verticalRadiusHemiTop = (int) 8;
		int yIterationsHemiTop = verticalRadiusHemiTop;
		for (int i = 0; i < yIterationsHemiTop; i++) {
			if (i == verticalRadiusHemiTop) {
				continue;
			}
			for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
				for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
							+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
					if (distanceSq <= 1.0) {
						if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("craft_kaisen:flowers_disaster")))) {
							world.destroyBlock(BlockPos.containing(x + xi, y + i, z + zi), false);
							{
								final Vec3 _center = new Vec3(x + xi, y + i, z + zi);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator) && !(entityiterator instanceof ItemEntity)) {
										entityiterator.hurt(new DamageSource(
												world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))), entity), 16);
									} else if (entityiterator instanceof ItemEntity) {
										if (!entityiterator.level.isClientSide())
											entityiterator.discard();
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
