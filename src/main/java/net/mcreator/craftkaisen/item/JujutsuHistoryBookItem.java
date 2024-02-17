
package net.mcreator.craftkaisen.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.procedures.JujutsuHistoryBookPlayerFinishesUsingItemProcedure;
import net.mcreator.craftkaisen.procedures.JujutsuHistoryBookHasItemGlowingEffectProcedure;
import net.mcreator.craftkaisen.procedures.HistoryBookRightClickedProcedure;

import java.util.List;

public class JujutsuHistoryBookItem extends Item {
	public JujutsuHistoryBookItem() {
		super(new Item.Properties().durability(50).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return JujutsuHistoryBookHasItemGlowingEffectProcedure.execute(itemstack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7l\u00A75A book that could contain secrets lost to the modern ages."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		HistoryBookRightClickedProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		JujutsuHistoryBookPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
