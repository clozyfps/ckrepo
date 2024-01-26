
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class ShrineSlice3Particle extends TextureSheetParticle {
	public static ShrineSlice3ParticleProvider provider(SpriteSet spriteSet) {
		return new ShrineSlice3ParticleProvider(spriteSet);
	}

	public static class ShrineSlice3ParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public ShrineSlice3ParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new ShrineSlice3Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected ShrineSlice3Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 45f;
		this.lifetime = 3;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
	}
}