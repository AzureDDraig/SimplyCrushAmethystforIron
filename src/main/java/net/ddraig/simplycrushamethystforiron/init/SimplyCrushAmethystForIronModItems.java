
package net.ddraig.simplycrushamethystforiron.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.ddraig.simplycrushamethystforiron.item.SmallAmethystPileItem;
import net.ddraig.simplycrushamethystforiron.item.MortarAndPestleItem;
import net.ddraig.simplycrushamethystforiron.item.LargeAmethystPileItem;
import net.ddraig.simplycrushamethystforiron.SimplyCrushAmethystForIronMod;

public class SimplyCrushAmethystForIronModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SimplyCrushAmethystForIronMod.MODID);
	public static final RegistryObject<Item> MORTAR_AND_PESTLE = REGISTRY.register("mortar_and_pestle", () -> new MortarAndPestleItem());
	public static final RegistryObject<Item> SMALL_AMETHYST_PILE = REGISTRY.register("small_amethyst_pile", () -> new SmallAmethystPileItem());
	public static final RegistryObject<Item> LARGE_AMETHYST_PILE = REGISTRY.register("large_amethyst_pile", () -> new LargeAmethystPileItem());
}
