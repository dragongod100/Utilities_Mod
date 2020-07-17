package com.snedhlep.utilitiesmod.blocks;

import com.snedhlep.utilitiesmod.RegistryHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BasicBlock
{
    private BlockItem.Properties BasicBlockItemProp = new BlockItem.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS);
    private Block.Properties BasicBlockProp = AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f);

    private String name;
    public BasicBlock(String name)
    {
        this.name = name;

    }
    public BasicBlock SetBlockProperties(Block.Properties new_properties)
    {
        this.BasicBlockProp = new_properties;
        return this;
    }
    public BasicBlock SetBlockItemProperties(BlockItem.Properties new_properties)
    {
        this.BasicBlockItemProp = new_properties;
        return this;
    }

    public BasicBlock CreateBlock()
    {
        RegistryHelper.CreateBlockAndItem(name, BasicBlockProp, BasicBlockItemProp);
        return this;
    }
}
