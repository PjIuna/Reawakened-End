package net.mcreator.shadow_s_end.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.shadow_s_end.ShadowsAndPjlunasEndMod;

public class SpaceClockEveryTickWhileUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ShadowsAndPjlunasEndMod.queueServerWork(25, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("shadows_and_pjlunas_end:clock_ticking")), SoundSource.PLAYERS, 1, (float) 0.6);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("shadows_and_pjlunas_end:clock_ticking")), SoundSource.PLAYERS, 1, (float) 0.6, false);
				}
			}
		});
	}
}