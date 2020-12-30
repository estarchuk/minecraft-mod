package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.ChungusiteOre;
import net.minecraft.block.Block;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> CHUNGUSITE_ORE = BLOCKS.register("chungusite_ore", ChungusiteOre::new);

}
