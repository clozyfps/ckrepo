
package net.mcreator.craftkaisen.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.craftkaisen.procedures.YujiItadoriOnEntityTickUpdateProcedure;
import net.mcreator.craftkaisen.procedures.YujiItadoriEntityDiesProcedure;
import net.mcreator.craftkaisen.init.CraftKaisenModItems;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;

public class YujiItadoriEntity extends Monster {
	public YujiItadoriEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftKaisenModEntities.YUJI_ITADORI.get(), world);
	}

	public YujiItadoriEntity(EntityType<YujiItadoriEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 6;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftKaisenModItems.ITADORI_OUTFIT_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CraftKaisenModItems.ITADORI_OUTFIT_LEGGINGS.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		YujiItadoriEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		YujiItadoriOnEntityTickUpdateProcedure.execute();
	}

	public static void init() {
		SpawnPlacements.register(CraftKaisenModEntities.YUJI_ITADORI.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 490);
		builder = builder.add(Attributes.ARMOR, 0.4);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 41);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 3);
		return builder;
	}
}
