package com.snedhlep.utilitiesmod.items;

import com.snedhlep.utilitiesmod.RegistryHelper;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;

public class BasicArmor
{
    private ArmorItem.Properties ArmorProp = new ArmorItem.Properties().group(ItemGroup.COMBAT);
    private ModArmorMaterial ArmorMat = ModArmorMaterial.ALICE_BLUE;

    private String name;


    public BasicArmor(String name)
    {
        this.name = name;
    }
    public BasicArmor SetProperties(ArmorItem.Properties new_properties)
    {
        this.ArmorProp = new_properties;
        return this;
    }

    public BasicArmor SetMaterial(ModArmorMaterial new_mat)
    {
        this.ArmorMat = new_mat;
        return this;
    }

    public void CreateArmorSet()
    {
        RegistryHelper.CreateArmorSet(name, ArmorMat, ArmorProp);
    }
}
