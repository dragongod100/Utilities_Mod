package com.snedhlep.utilitiesmod;

import com.snedhlep.utilitiesmod.blocks.BasicBlock;
import com.snedhlep.utilitiesmod.entities.BasicZombieEntity;
import com.snedhlep.utilitiesmod.items.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.stream.Collectors;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("utilitiesmod")
public class UtilitiesMod
{

    public static final String MODID = "utilitiesmod";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final BasicItem myItem = new BasicItem("prideful_diamond");
    public static final BasicBlock MyBlock = new BasicBlock("my_block");
    public static BasicItem[] ColoredFrogs = new BasicItem[Colors.COLOR_ARR.length];
    public static BasicItem[] ColoredIngots = new BasicItem[Colors.COLOR_ARR.length];
    public static BasicArmor[] ColoredArmor = new BasicArmor[Colors.COLOR_ARR.length];
    public static BasicBlock[] WoolBlocks = new BasicBlock[Colors.COLOR_ARR.length];
    public static BasicFood[] MyColoredBread = new BasicFood[Colors.COLOR_ARR.length];
    public static ModArmorMaterial[] ModArmorMat = new ModArmorMaterial[Colors.COLOR_ARR.length];
    public static RegistryObject<EntityType<BasicZombieEntity>> MyZombie;
    public static Map<EntityType<? extends LivingEntity>, AttributeModifierMap> ENTITY_MAP;
    public UtilitiesMod()
    {
        MyZombie = RegistryHelper.CreateZombie("basic_zombie");
        //ENTITY_MAP.put(MyZombie.get(), BasicZombieEntity.func_234342_eQ_().func_233813_a_());

        for(int i = 0; i < Colors.COLOR_ARR.length; i++)
        {
            ColoredFrogs[i] = new BasicItem(Colors.COLOR_ARR[i] + "_frog");
            ColoredFrogs[i].CreateItem();
        }
        for(int i = 0; i < Colors.COLOR_ARR.length; i++)
        {
            MyColoredBread[i] = new BasicFood(
                    new Food.Builder().hunger(3).saturation(3.0f).setAlwaysEdible(),
                    new Item.Properties().group(ItemGroup.FOOD), Colors.COLOR_ARR[i] + "_bread");
            MyColoredBread[i].CreateFood();
        }

        for(int i = 0; i < Colors.COLOR_ARR.length; i++)
        {
            WoolBlocks[i] = new BasicBlock(Colors.COLOR_ARR[i] + "_wool");
            WoolBlocks[i].CreateBlock();
        }
        for(int i = 0; i < Colors.COLOR_ARR.length; i++)
        {
            ColoredIngots[i] = new BasicItem(Colors.COLOR_ARR[i] + "_ingot").SetProperties(new Item.Properties().group(ItemGroup.MATERIALS));
            ColoredIngots[i].CreateItem();
        }
        ModArmorMat = new ModArmorMaterial[]{ModArmorMaterial.MAROON, ModArmorMaterial.DARK_RED, ModArmorMaterial.BROWN, ModArmorMaterial.FIREBRICK, ModArmorMaterial.CRIMSON, ModArmorMaterial.RED, ModArmorMaterial.TOMATO, ModArmorMaterial.CORAL, ModArmorMaterial.INDIAN_RED, ModArmorMaterial.LIGHT_CORAL, ModArmorMaterial.DARK_SALMON, ModArmorMaterial.SALMON, ModArmorMaterial.LIGHT_SALMON, ModArmorMaterial.ORANGE_RED, ModArmorMaterial.DARK_ORANGE, ModArmorMaterial.ORANGE, ModArmorMaterial.GOLD, ModArmorMaterial.DARK_GOLDEN_ROD, ModArmorMaterial.GOLDEN_ROD, ModArmorMaterial.PALE_GOLDEN_ROD, ModArmorMaterial.DARK_KHAKI, ModArmorMaterial.KHAKI, ModArmorMaterial.OLIVE, ModArmorMaterial.YELLOW, ModArmorMaterial.YELLOW_GREEN, ModArmorMaterial.DARK_OLIVE_GREEN, ModArmorMaterial.OLIVE_DRAB, ModArmorMaterial.LAWN_GREEN, ModArmorMaterial.CHART_REUSE, ModArmorMaterial.GREEN_YELLOW, ModArmorMaterial.DARK_GREEN, ModArmorMaterial.GREEN, ModArmorMaterial.FOREST_GREEN, ModArmorMaterial.LIME, ModArmorMaterial.LIME_GREEN, ModArmorMaterial.LIGHT_GREEN, ModArmorMaterial.PALE_GREEN, ModArmorMaterial.DARK_SEA_GREEN, ModArmorMaterial.MEDIUM_SPRING_GREEN, ModArmorMaterial.SPRING_GREEN, ModArmorMaterial.SEA_GREEN, ModArmorMaterial.MEDIUM_AQUA_MARINE, ModArmorMaterial.MEDIUM_SEA_GREEN, ModArmorMaterial.LIGHT_SEA_GREEN, ModArmorMaterial.DARK_SLATE_GREY, ModArmorMaterial.TEAL, ModArmorMaterial.DARK_CYAN, ModArmorMaterial.AQUA, ModArmorMaterial.CYAN, ModArmorMaterial.LIGHT_CYAN, ModArmorMaterial.DARK_TURQUOISE, ModArmorMaterial.TURQUOISE, ModArmorMaterial.MEDIUM_TURQUOISE, ModArmorMaterial.PALE_TURQUOISE, ModArmorMaterial.AQUA_MARINE, ModArmorMaterial.POWDER_BLUE, ModArmorMaterial.CADET_BLUE, ModArmorMaterial.STEEL_BLUE, ModArmorMaterial.CORN_FLOWER_BLUE, ModArmorMaterial.DEEP_SKY_BLUE, ModArmorMaterial.DODGER_BLUE, ModArmorMaterial.LIGHT_BLUE, ModArmorMaterial.SKY_BLUE, ModArmorMaterial.LIGHT_SKY_BLUE, ModArmorMaterial.MIDNIGHT_BLUE, ModArmorMaterial.NAVY, ModArmorMaterial.DARK_BLUE, ModArmorMaterial.MEDIUM_BLUE, ModArmorMaterial.BLUE, ModArmorMaterial.ROYAL_BLUE, ModArmorMaterial.BLUE_VIOLET, ModArmorMaterial.INDIGO, ModArmorMaterial.DARK_SLATE_BLUE, ModArmorMaterial.SLATE_BLUE, ModArmorMaterial.MEDIUM_SLATE_BLUE, ModArmorMaterial.MEDIUM_PURPLE, ModArmorMaterial.DARK_MAGENTA, ModArmorMaterial.DARK_VIOLET, ModArmorMaterial.DARK_ORCHID, ModArmorMaterial.MEDIUM_ORCHID, ModArmorMaterial.PURPLE, ModArmorMaterial.THISTLE, ModArmorMaterial.PLUM, ModArmorMaterial.VIOLET, ModArmorMaterial.MAGENTA, ModArmorMaterial.ORCHID, ModArmorMaterial.MEDIUM_VIOLET_RED, ModArmorMaterial.PALE_VIOLET_RED, ModArmorMaterial.DEEP_PINK, ModArmorMaterial.HOT_PINK, ModArmorMaterial.LIGHT_PINK, ModArmorMaterial.PINK, ModArmorMaterial.ANTIQUE_WHITE, ModArmorMaterial.BEIGE, ModArmorMaterial.BISQUE, ModArmorMaterial.BLANCHED_ALMOND, ModArmorMaterial.WHEAT, ModArmorMaterial.CORN_SILK, ModArmorMaterial.LEMON_CHIFFON, ModArmorMaterial.LIGHT_GOLDEN_ROD_YELLOW, ModArmorMaterial.LIGHT_YELLOW, ModArmorMaterial.SADDLE_BROWN, ModArmorMaterial.SIENNA, ModArmorMaterial.CHOCOLATE, ModArmorMaterial.PERU, ModArmorMaterial.SANDY_BROWN, ModArmorMaterial.BURLY_WOOD, ModArmorMaterial.TAN, ModArmorMaterial.ROSY_BROWN, ModArmorMaterial.MOCCASIN, ModArmorMaterial.NAVAJO_WHITE, ModArmorMaterial.PEACH_PUFF, ModArmorMaterial.MISTY_ROSE, ModArmorMaterial.LAVENDER_BLUSH, ModArmorMaterial.LINEN, ModArmorMaterial.OLD_LACE, ModArmorMaterial.PAPAYA_WHIP, ModArmorMaterial.SEA_SHELL, ModArmorMaterial.MINT_CREAM, ModArmorMaterial.SLATE_GREY, ModArmorMaterial.LIGHT_SLATE_GREY, ModArmorMaterial.LIGHT_STEEL_BLUE, ModArmorMaterial.LAVENDER, ModArmorMaterial.FLORAL_WHITE, ModArmorMaterial.ALICE_BLUE, ModArmorMaterial.GHOST_WHITE, ModArmorMaterial.HONEYDEW, ModArmorMaterial.IVORY, ModArmorMaterial.AZURE, ModArmorMaterial.SNOW, ModArmorMaterial.BLACK, ModArmorMaterial.DIM_GREY, ModArmorMaterial.GREY, ModArmorMaterial.DARK_GREY, ModArmorMaterial.SILVER, ModArmorMaterial.LIGHT_GREY, ModArmorMaterial.GAINSBORO, ModArmorMaterial.WHITE_SMOKE, ModArmorMaterial.WHITE};
        for(int i = 0; i < Colors.COLOR_ARR.length; i++)
        {
            ColoredArmor[i] = new BasicArmor(Colors.COLOR_ARR[i]).SetMaterial(ModArmorMat[i]);
            ColoredArmor[i].CreateArmorSet();
        }

        MyBlock.CreateBlock();
        myItem.CreateItem();
        RegistryHelper.RegisterAll();
        // Register the setup method
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("utilitiesmod", "helloworld", () ->
        {
            LOGGER.info("Hello world from the MDK"); return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event)
    {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
