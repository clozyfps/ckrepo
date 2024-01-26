package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class YutaKatanaEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double number_pick = 0;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.SURGE.get()) && entity instanceof YutaOkkotsuEntity) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, 2);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 2, 2, false);
				}
			}
			number_pick = Mth.nextInt(RandomSource.create(), 1, 3);
			if (number_pick == 1) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craft_kaisen:slice_1"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craft_kaisen:pink_slice_1"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if (number_pick == 2) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craft_kaisen:slice_2"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craft_kaisen:pink_slice_2"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
			if (number_pick == 3) {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craft_kaisen:slice_3"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("craft_kaisen:pink_slice_3"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
			}
		}
	}
}
