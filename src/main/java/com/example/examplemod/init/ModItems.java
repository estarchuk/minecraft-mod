package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.items.LanceItem;
import com.example.examplemod.util.enums.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<LanceItem> DIAMOND_LANCE = ITEMS.register("diamond_lance", () -> new LanceItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> CHUNGUSITE_ORE = ITEMS.register("chungusite_ore", () -> new BlockItem(ModBlocks.CHUNGUSITE_ORE.get(), new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<Item> CHUNGUS = ITEMS.register("chungus", () -> new Item(new Item.Properties().group(ExampleMod.TAB)));

    public static final RegistryObject<SwordItem> CHUNGUS_SWORD = ITEMS.register("chungus_sword", () -> new SwordItem(ModItemTier.CHUNGUS, 8, -3.0F, new Item.Properties().group(ItemGroup.COMBAT)));
}


