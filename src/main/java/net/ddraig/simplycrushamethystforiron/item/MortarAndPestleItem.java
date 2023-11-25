
package net.ddraig.simplycrushamethystforiron.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MortarAndPestleItem extends Item {
	public MortarAndPestleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
