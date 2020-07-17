package com.snedhlep.utilitiesmod;

import com.snedhlep.utilitiesmod.entities.BasicZombieEntity;
import com.snedhlep.utilitiesmod.items.ModArmorMaterial;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHelper
{
    //public static final Item.Properties prop = new Item.Properties().addToolType(ToolType.SHOVEL, 3).group(ItemGroup.MISC).maxDamage(4);

    private static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UtilitiesMod.MODID);
    private static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UtilitiesMod.MODID);
    private static final DeferredRegister<EntityType<?>> ENTITY_REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, UtilitiesMod.MODID);

    public static DeferredRegister<EntityType<?>> GetEntityRegistry()
    {
        return ENTITY_REGISTRY;
    }
    private static RegistryObject<Block> CreateBlock(String name, Block.Properties block_prop)
    {
        return BLOCK_REGISTRY.register(name, () -> new Block(block_prop));
    }

    private static RegistryObject<BlockItem> CreateItemFromBlock(String name, RegistryObject<Block> block, BlockItem.Properties block_item_prop)
    {
        return ITEM_REGISTRY.register(name, () -> new BlockItem(block.get(), block_item_prop));
    }
    public static RegistryObject<Item> CreateItem(String name, Item.Properties item_prop)
    {
        return ITEM_REGISTRY.register(name, () -> new Item(item_prop));
    }
    public static RegistryObject<Item> CreateFood(String name, Item.Properties item_prop)
    {
        return ITEM_REGISTRY.register(name, () -> new Item(item_prop));
    }
    public static RegistryObject<EntityType<BasicZombieEntity>> CreateZombie(String name)
    {
        return ENTITY_REGISTRY.register(name, () ->
                EntityType.Builder.create(BasicZombieEntity::new, EntityClassification.MONSTER).build(name));
    }
    public static RegistryObject<ArmorItem> CreateArmorItem(String name, ArmorMaterial mat, EquipmentSlotType slot, ArmorItem.Properties item_prop)
    {
        return ITEM_REGISTRY.register(name, () -> new ArmorItem(mat, slot, item_prop));
    }
    public static void CreateArmorSet(String name, ModArmorMaterial mat, ArmorItem.Properties item_prop)
    {
        ITEM_REGISTRY.register(name + "_helmet", () -> new ArmorItem(mat, EquipmentSlotType.HEAD, item_prop));
        ITEM_REGISTRY.register(name + "_chestplate", () -> new ArmorItem(mat, EquipmentSlotType.CHEST, item_prop));
        ITEM_REGISTRY.register(name + "_leggings", () -> new ArmorItem(mat, EquipmentSlotType.LEGS, item_prop));
        ITEM_REGISTRY.register(name + "_boots", () -> new ArmorItem(mat, EquipmentSlotType.FEET, item_prop));
    }
    /**
     * Creates a block and item for the block.
     * @param name The Name (a-z,.-_) only.
     * @param block_prop The Properties of the Block in-world.
     * @param block_item_prop The Properties of the blocks Item, in the inventory.
     */
    public static void CreateBlockAndItem(String name, Block.Properties block_prop, BlockItem.Properties block_item_prop)
    {
        CreateItemFromBlock(name, CreateBlock(name, block_prop), block_item_prop);
    }
    /**
     * Simplifies the registration of all blocks and items from this mod.
     */
    public static void RegisterAll()
    {
        BLOCK_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEM_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
