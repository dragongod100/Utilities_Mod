package com.snedhlep.utilitiesmod.items;

import com.snedhlep.utilitiesmod.RegistryHelper;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BasicFood
{
    private Food.Builder foodItem;
    private Item.Properties prop;
    private String name;
    public BasicFood(Food.Builder builder, Item.Properties item_prop, String name)
    {
        this.name = name;
        this.prop = item_prop;
        this.foodItem = builder;
    }
    public BasicFood SetFoodProperties(Food.Builder new_prop)
    {
        this.foodItem = new_prop;
        return this;
    }
    public BasicFood setItemProperties(Item.Properties new_prop)
    {
        prop = new_prop.food(foodItem.build());
        return this;
    }
    public BasicFood CreateFood()
    {
        prop.food(foodItem.build());
        RegistryHelper.CreateFood(name, prop);
        return this;
    }
}
