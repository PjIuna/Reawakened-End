package net.mcreator.shadow_s_end.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EnderspireItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 650, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("shadows_and_pjlunas_end:enderspire_repair_items")));

	public EnderspireItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 0.5f, -3.3f));
	}
}