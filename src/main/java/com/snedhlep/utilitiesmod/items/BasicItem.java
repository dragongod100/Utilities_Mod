package com.snedhlep.utilitiesmod.items;

import com.snedhlep.utilitiesmod.RegistryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.rmi.registry.Registry;

public class BasicItem
{
    private Item.Properties BasicItemProp = new Item.Properties().group(ItemGroup.MISC);
    private String name;
    private RegistryObject<Item> item;
    public BasicItem(String name)
    {
        this.name = name;

    }
    public BasicItem SetProperties(Item.Properties new_properties)
    {
        this.BasicItemProp = new_properties;
        return this;
    }
    public Item.Properties GetProperties()
    {
        return this.BasicItemProp;
    }
    public Item GetItem()
    {
        return item.get();
    }
    public BasicItem CreateItem()
    {
        item = RegistryHelper.CreateItem(name, BasicItemProp);
        return this;
    }
}
