
package net.mcreator.craftkaisen.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class HollowPurpleGojoEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public HollowPurpleGojoEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(CraftKaisenModEntities.HOLLOW_PURPLE_GOJO.get(), world);
	}

	public HollowPurpleGojoEntity(EntityType<? extends HollowPurpleGojoEntity> type, Level world) {
		super(type, world);
	}

	public HollowPurpleGojoEntity(EntityType<? extends HollowPurpleGojoEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public HollowPurpleGojoEntity(EntityType<? extends HollowPurpleGojoEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		HollowPurpleGojoWhileProjectileFlyingTickProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this.getOwner(), this);
		if (this.inGround)
			this.discard();
	}

	public static HollowPurpleGojoEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 2f, 5, 5);
	}

	public static HollowPurpleGojoEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		HollowPurpleGojoEntity entityarrow = new HollowPurpleGojoEntity(CraftKaisenModEntities.HOLLOW_PURPLE_GOJO.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static HollowPurpleGojoEntity shoot(LivingEntity entity, LivingEntity target) {
		HollowPurpleGojoEntity entityarrow = new HollowPurpleGojoEntity(CraftKaisenModEntities.HOLLOW_PURPLE_GOJO.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		return entityarrow;
	}
}
