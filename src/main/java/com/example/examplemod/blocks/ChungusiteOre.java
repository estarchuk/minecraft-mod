package com.example.examplemod.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class ChungusiteOre extends OreBlock {

    public ChungusiteOre(){
        super(AbstractBlock.Properties.create(Material.IRON)
        .hardnessAndResistance(17.0F, 17.0F)
        .sound(SoundType.STONE)
        .harvestLevel(7)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool()
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }


}
