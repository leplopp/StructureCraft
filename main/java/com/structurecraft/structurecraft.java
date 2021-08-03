package com.structurecraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.structurecraft.register.blockgen;
import com.structurecraft.setup.clientSetup;
import java.util.Locale;
import java.util.stream.Collectors;

@Mod("structurecraft")
@Mod.EventBusSubscriber(modid = structurecraft.MODID, bus = Bus.MOD)
public class structurecraft
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "structurecraft";

    public structurecraft() {
    	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		
		blockgen.BLOCKS.register(bus);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(clientSetup::init);

    }
        public static ResourceLocation prefix(String name){return new ResourceLocation(MODID.toLowerCase(Locale.ROOT), name);}   
}
