package com.snedhlep.utilitiesmod.items;

import com.snedhlep.utilitiesmod.UtilitiesMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;


public enum ModArmorMaterial implements IArmorMaterial
{
    MAROON(UtilitiesMod.MODID + ":maroon", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[0].GetItem());
    }),
    DARK_RED(UtilitiesMod.MODID + ":dark_red", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[1].GetItem());
    }),
    BROWN(UtilitiesMod.MODID + ":brown", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[2].GetItem());
    }),
    FIREBRICK(UtilitiesMod.MODID + ":firebrick", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[3].GetItem());
    }),
    CRIMSON(UtilitiesMod.MODID + ":crimson", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[4].GetItem());
    }),
    RED(UtilitiesMod.MODID + ":red", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[5].GetItem());
    }),
    TOMATO(UtilitiesMod.MODID + ":tomato", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[6].GetItem());
    }),
    CORAL(UtilitiesMod.MODID + ":coral", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[7].GetItem());
    }),
    INDIAN_RED(UtilitiesMod.MODID + ":indian_red", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[8].GetItem());
    }),
    LIGHT_CORAL(UtilitiesMod.MODID + ":light_coral", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[9].GetItem());
    }),
    DARK_SALMON(UtilitiesMod.MODID + ":dark_salmon", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[10].GetItem());
    }),
    SALMON(UtilitiesMod.MODID + ":salmon", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[11].GetItem());
    }),
    LIGHT_SALMON(UtilitiesMod.MODID + ":light_salmon", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[12].GetItem());
    }),
    ORANGE_RED(UtilitiesMod.MODID + ":orange_red", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[13].GetItem());
    }),
    DARK_ORANGE(UtilitiesMod.MODID + ":dark_orange", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[14].GetItem());
    }),
    ORANGE(UtilitiesMod.MODID + ":orange", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[15].GetItem());
    }),
    GOLD(UtilitiesMod.MODID + ":gold", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[16].GetItem());
    }),
    DARK_GOLDEN_ROD(UtilitiesMod.MODID + ":dark_golden_rod", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[17].GetItem());
    }),
    GOLDEN_ROD(UtilitiesMod.MODID + ":golden_rod", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[18].GetItem());
    }),
    PALE_GOLDEN_ROD(UtilitiesMod.MODID + ":pale_golden_rod", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[19].GetItem());
    }),
    DARK_KHAKI(UtilitiesMod.MODID + ":dark_khaki", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[20].GetItem());
    }),
    KHAKI(UtilitiesMod.MODID + ":khaki", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[21].GetItem());
    }),
    OLIVE(UtilitiesMod.MODID + ":olive", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[22].GetItem());
    }),
    YELLOW(UtilitiesMod.MODID + ":yellow", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[23].GetItem());
    }),
    YELLOW_GREEN(UtilitiesMod.MODID + ":yellow_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[24].GetItem());
    }),
    DARK_OLIVE_GREEN(UtilitiesMod.MODID + ":dark_olive_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[25].GetItem());
    }),
    OLIVE_DRAB(UtilitiesMod.MODID + ":olive_drab", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[26].GetItem());
    }),
    LAWN_GREEN(UtilitiesMod.MODID + ":lawn_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[27].GetItem());
    }),
    CHART_REUSE(UtilitiesMod.MODID + ":chart_reuse", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[28].GetItem());
    }),
    GREEN_YELLOW(UtilitiesMod.MODID + ":green_yellow", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[29].GetItem());
    }),
    DARK_GREEN(UtilitiesMod.MODID + ":dark_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[30].GetItem());
    }),
    GREEN(UtilitiesMod.MODID + ":green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[31].GetItem());
    }),
    FOREST_GREEN(UtilitiesMod.MODID + ":forest_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[32].GetItem());
    }),
    LIME(UtilitiesMod.MODID + ":lime", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[33].GetItem());
    }),
    LIME_GREEN(UtilitiesMod.MODID + ":lime_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[34].GetItem());
    }),
    LIGHT_GREEN(UtilitiesMod.MODID + ":light_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[35].GetItem());
    }),
    PALE_GREEN(UtilitiesMod.MODID + ":pale_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[36].GetItem());
    }),
    DARK_SEA_GREEN(UtilitiesMod.MODID + ":dark_sea_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[37].GetItem());
    }),
    MEDIUM_SPRING_GREEN(UtilitiesMod.MODID + ":medium_spring_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[38].GetItem());
    }),
    SPRING_GREEN(UtilitiesMod.MODID + ":spring_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[39].GetItem());
    }),
    SEA_GREEN(UtilitiesMod.MODID + ":sea_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[40].GetItem());
    }),
    MEDIUM_AQUA_MARINE(UtilitiesMod.MODID + ":medium_aqua_marine", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[41].GetItem());
    }),
    MEDIUM_SEA_GREEN(UtilitiesMod.MODID + ":medium_sea_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[42].GetItem());
    }),
    LIGHT_SEA_GREEN(UtilitiesMod.MODID + ":light_sea_green", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[43].GetItem());
    }),
    DARK_SLATE_GREY(UtilitiesMod.MODID + ":dark_slate_grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[44].GetItem());
    }),
    TEAL(UtilitiesMod.MODID + ":teal", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[45].GetItem());
    }),
    DARK_CYAN(UtilitiesMod.MODID + ":dark_cyan", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[46].GetItem());
    }),
    AQUA(UtilitiesMod.MODID + ":aqua", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[47].GetItem());
    }),
    CYAN(UtilitiesMod.MODID + ":cyan", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[48].GetItem());
    }),
    LIGHT_CYAN(UtilitiesMod.MODID + ":light_cyan", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[49].GetItem());
    }),
    DARK_TURQUOISE(UtilitiesMod.MODID + ":dark_turquoise", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[50].GetItem());
    }),
    TURQUOISE(UtilitiesMod.MODID + ":turquoise", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[51].GetItem());
    }),
    MEDIUM_TURQUOISE(UtilitiesMod.MODID + ":medium_turquoise", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[52].GetItem());
    }),
    PALE_TURQUOISE(UtilitiesMod.MODID + ":pale_turquoise", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[53].GetItem());
    }),
    AQUA_MARINE(UtilitiesMod.MODID + ":aqua_marine", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[54].GetItem());
    }),
    POWDER_BLUE(UtilitiesMod.MODID + ":powder_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[55].GetItem());
    }),
    CADET_BLUE(UtilitiesMod.MODID + ":cadet_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[56].GetItem());
    }),
    STEEL_BLUE(UtilitiesMod.MODID + ":steel_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[57].GetItem());
    }),
    CORN_FLOWER_BLUE(UtilitiesMod.MODID + ":corn_flower_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[58].GetItem());
    }),
    DEEP_SKY_BLUE(UtilitiesMod.MODID + ":deep_sky_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[59].GetItem());
    }),
    DODGER_BLUE(UtilitiesMod.MODID + ":dodger_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[60].GetItem());
    }),
    LIGHT_BLUE(UtilitiesMod.MODID + ":light_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[61].GetItem());
    }),
    SKY_BLUE(UtilitiesMod.MODID + ":sky_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[62].GetItem());
    }),
    LIGHT_SKY_BLUE(UtilitiesMod.MODID + ":light_sky_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[63].GetItem());
    }),
    MIDNIGHT_BLUE(UtilitiesMod.MODID + ":midnight_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[64].GetItem());
    }),
    NAVY(UtilitiesMod.MODID + ":navy", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[65].GetItem());
    }),
    DARK_BLUE(UtilitiesMod.MODID + ":dark_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[66].GetItem());
    }),
    MEDIUM_BLUE(UtilitiesMod.MODID + ":medium_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[67].GetItem());
    }),
    BLUE(UtilitiesMod.MODID + ":blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[68].GetItem());
    }),
    ROYAL_BLUE(UtilitiesMod.MODID + ":royal_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[69].GetItem());
    }),
    BLUE_VIOLET(UtilitiesMod.MODID + ":blue_violet", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[70].GetItem());
    }),
    INDIGO(UtilitiesMod.MODID + ":indigo", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[71].GetItem());
    }),
    DARK_SLATE_BLUE(UtilitiesMod.MODID + ":dark_slate_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[72].GetItem());
    }),
    SLATE_BLUE(UtilitiesMod.MODID + ":slate_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[73].GetItem());
    }),
    MEDIUM_SLATE_BLUE(UtilitiesMod.MODID + ":medium_slate_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[74].GetItem());
    }),
    MEDIUM_PURPLE(UtilitiesMod.MODID + ":medium_purple", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[75].GetItem());
    }),
    DARK_MAGENTA(UtilitiesMod.MODID + ":dark_magenta", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[76].GetItem());
    }),
    DARK_VIOLET(UtilitiesMod.MODID + ":dark_violet", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[77].GetItem());
    }),
    DARK_ORCHID(UtilitiesMod.MODID + ":dark_orchid", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[78].GetItem());
    }),
    MEDIUM_ORCHID(UtilitiesMod.MODID + ":medium_orchid", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[79].GetItem());
    }),
    PURPLE(UtilitiesMod.MODID + ":purple", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[80].GetItem());
    }),
    THISTLE(UtilitiesMod.MODID + ":thistle", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[81].GetItem());
    }),
    PLUM(UtilitiesMod.MODID + ":plum", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[82].GetItem());
    }),
    VIOLET(UtilitiesMod.MODID + ":violet", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[83].GetItem());
    }),
    MAGENTA(UtilitiesMod.MODID + ":magenta", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[84].GetItem());
    }),
    ORCHID(UtilitiesMod.MODID + ":orchid", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[85].GetItem());
    }),
    MEDIUM_VIOLET_RED(UtilitiesMod.MODID + ":medium_violet_red", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[86].GetItem());
    }),
    PALE_VIOLET_RED(UtilitiesMod.MODID + ":pale_violet_red", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[87].GetItem());
    }),
    DEEP_PINK(UtilitiesMod.MODID + ":deep_pink", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[88].GetItem());
    }),
    HOT_PINK(UtilitiesMod.MODID + ":hot_pink", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[89].GetItem());
    }),
    LIGHT_PINK(UtilitiesMod.MODID + ":light_pink", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[90].GetItem());
    }),
    PINK(UtilitiesMod.MODID + ":pink", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[91].GetItem());
    }),
    ANTIQUE_WHITE(UtilitiesMod.MODID + ":antique_white", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[92].GetItem());
    }),
    BEIGE(UtilitiesMod.MODID + ":beige", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[93].GetItem());
    }),
    BISQUE(UtilitiesMod.MODID + ":bisque", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[94].GetItem());
    }),
    BLANCHED_ALMOND(UtilitiesMod.MODID + ":blanched_almond", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[95].GetItem());
    }),
    WHEAT(UtilitiesMod.MODID + ":wheat", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[96].GetItem());
    }),
    CORN_SILK(UtilitiesMod.MODID + ":corn_silk", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[97].GetItem());
    }),
    LEMON_CHIFFON(UtilitiesMod.MODID + ":lemon_chiffon", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[98].GetItem());
    }),
    LIGHT_GOLDEN_ROD_YELLOW(UtilitiesMod.MODID + ":light_golden_rod_yellow", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[99].GetItem());
    }),
    LIGHT_YELLOW(UtilitiesMod.MODID + ":light_yellow", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[100].GetItem());
    }),
    SADDLE_BROWN(UtilitiesMod.MODID + ":saddle_brown", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[101].GetItem());
    }),
    SIENNA(UtilitiesMod.MODID + ":sienna", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[102].GetItem());
    }),
    CHOCOLATE(UtilitiesMod.MODID + ":chocolate", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[103].GetItem());
    }),
    PERU(UtilitiesMod.MODID + ":peru", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[104].GetItem());
    }),
    SANDY_BROWN(UtilitiesMod.MODID + ":sandy_brown", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[105].GetItem());
    }),
    BURLY_WOOD(UtilitiesMod.MODID + ":burly_wood", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[106].GetItem());
    }),
    TAN(UtilitiesMod.MODID + ":tan", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[107].GetItem());
    }),
    ROSY_BROWN(UtilitiesMod.MODID + ":rosy_brown", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[108].GetItem());
    }),
    MOCCASIN(UtilitiesMod.MODID + ":moccasin", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[109].GetItem());
    }),
    NAVAJO_WHITE(UtilitiesMod.MODID + ":navajo_white", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[110].GetItem());
    }),
    PEACH_PUFF(UtilitiesMod.MODID + ":peach_puff", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[111].GetItem());
    }),
    MISTY_ROSE(UtilitiesMod.MODID + ":misty_rose", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[112].GetItem());
    }),
    LAVENDER_BLUSH(UtilitiesMod.MODID + ":lavender_blush", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[113].GetItem());
    }),
    LINEN(UtilitiesMod.MODID + ":linen", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[114].GetItem());
    }),
    OLD_LACE(UtilitiesMod.MODID + ":old_lace", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[115].GetItem());
    }),
    PAPAYA_WHIP(UtilitiesMod.MODID + ":papaya_whip", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[116].GetItem());
    }),
    SEA_SHELL(UtilitiesMod.MODID + ":sea_shell", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[117].GetItem());
    }),
    MINT_CREAM(UtilitiesMod.MODID + ":mint_cream", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[118].GetItem());
    }),
    SLATE_GREY(UtilitiesMod.MODID + ":slate_grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[119].GetItem());
    }),
    LIGHT_SLATE_GREY(UtilitiesMod.MODID + ":light_slate_grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[120].GetItem());
    }),
    LIGHT_STEEL_BLUE(UtilitiesMod.MODID + ":light_steel_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[121].GetItem());
    }),
    LAVENDER(UtilitiesMod.MODID + ":lavender", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[122].GetItem());
    }),
    FLORAL_WHITE(UtilitiesMod.MODID + ":floral_white", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[123].GetItem());
    }),
    ALICE_BLUE(UtilitiesMod.MODID + ":alice_blue", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[124].GetItem());
    }),
    GHOST_WHITE(UtilitiesMod.MODID + ":ghost_white", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[125].GetItem());
    }),
    HONEYDEW(UtilitiesMod.MODID + ":honeydew", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[126].GetItem());
    }),
    IVORY(UtilitiesMod.MODID + ":ivory", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[127].GetItem());
    }),
    AZURE(UtilitiesMod.MODID + ":azure", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[128].GetItem());
    }),
    SNOW(UtilitiesMod.MODID + ":snow", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[129].GetItem());
    }),
    BLACK(UtilitiesMod.MODID + ":black", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[130].GetItem());
    }),
    DIM_GREY(UtilitiesMod.MODID + ":dim_grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[131].GetItem());
    }),
    GREY(UtilitiesMod.MODID + ":grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[132].GetItem());
    }),
    DARK_GREY(UtilitiesMod.MODID + ":dark_grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[133].GetItem());
    }),
    SILVER(UtilitiesMod.MODID + ":silver", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[134].GetItem());
    }),
    LIGHT_GREY(UtilitiesMod.MODID + ":light_grey", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[135].GetItem());
    }),
    GAINSBORO(UtilitiesMod.MODID + ":gainsboro", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[136].GetItem());
    }),
    WHITE_SMOKE(UtilitiesMod.MODID + ":white_smoke", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[137].GetItem());
    }),
    WHITE(UtilitiesMod.MODID + ":white", 5, new int[]{3, 6, 8, 3}, 15, 2.0F, () ->
    {
        return Ingredient.fromItems(UtilitiesMod.ColoredIngots[138].GetItem());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent = SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    private final float toughness;
    private final float field_234660_o_ = 0.0F;
    private final LazyValue<Ingredient> repairMaterial;

    ModArmorMaterial(String material_name, int damage_factor, int[] damage_reduction, int enchant, float tough, Supplier<Ingredient> p_i231593_10_)
    {
        this.name = material_name;
        this.maxDamageFactor = damage_factor;
        this.damageReductionAmountArray = damage_reduction;
        this.enchantability = enchant;
        this.toughness = tough;
        this.repairMaterial = new LazyValue(p_i231593_10_);
    }

    public int getDurability(EquipmentSlotType p_200896_1_) {
        return MAX_DAMAGE_ARRAY[p_200896_1_.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType p_200902_1_) {
        return this.damageReductionAmountArray[p_200902_1_.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return (Ingredient)this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float func_230304_f_() {
        return this.field_234660_o_;
    }

}