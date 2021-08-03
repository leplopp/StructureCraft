package com.structurecraft.setup;

import com.structurecraft.structurecraft;
import com.structurecraft.register.blockgen;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = structurecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class clientSetup {

	
	public static void init(final FMLClientSetupEvent event) { 
		
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_COBBLESTONE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_GLASS.get(), RenderType.cutoutMipped());
		
	}
	
}
