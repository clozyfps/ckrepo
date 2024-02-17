
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class UnlimitedBlackholeParticle extends TextureSheetParticle {
	public static UnlimitedBlackholeParticleProvider provider(SpriteSet spriteSet) {
		return new UnlimitedBlackholeParticleProvider(spriteSet);
	}

	public static class UnlimitedBlackholeParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public UnlimitedBlackholeParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new UnlimitedBlackholeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected UnlimitedBlackholeParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(2f, 2f);
		this.quadSize *= 25f;
		this.lifetime = 100;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();
	}
}