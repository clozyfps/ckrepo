
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class UnlimitedVoidSplash1Particle extends TextureSheetParticle {
	public static UnlimitedVoidSplash1ParticleProvider provider(SpriteSet spriteSet) {
		return new UnlimitedVoidSplash1ParticleProvider(spriteSet);
	}

	public static class UnlimitedVoidSplash1ParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public UnlimitedVoidSplash1ParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new UnlimitedVoidSplash1Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected UnlimitedVoidSplash1Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 15f;
		this.lifetime = 12;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
	}
}