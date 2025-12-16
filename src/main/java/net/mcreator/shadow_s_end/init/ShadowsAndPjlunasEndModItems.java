/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shadow_s_end.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.shadow_s_end.item.SpaceClockItem;
import net.mcreator.shadow_s_end.item.EnderspireItem;
import net.mcreator.shadow_s_end.ShadowsAndPjlunasEndMod;

import java.util.function.Function;

public class ShadowsAndPjlunasEndModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ShadowsAndPjlunasEndMod.MODID);
	public static final DeferredItem<Item> ENDERSPIRE;
	public static final DeferredItem<Item> SPACE_CLOCK;
	static {
		ENDERSPIRE = register("enderspire", EnderspireItem::new);
		SPACE_CLOCK = register("space_clock", SpaceClockItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}