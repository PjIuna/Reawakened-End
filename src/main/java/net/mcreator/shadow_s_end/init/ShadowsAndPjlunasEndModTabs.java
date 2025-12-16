/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadow_s_end.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.shadow_s_end.ShadowsAndPjlunasEndMod;

@EventBusSubscriber
public class ShadowsAndPjlunasEndModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShadowsAndPjlunasEndMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ShadowsAndPjlunasEndModItems.ENDERSPIRE.get());
			tabData.accept(ShadowsAndPjlunasEndModItems.SPACE_CLOCK.get());
		}
	}
}