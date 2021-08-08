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
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_TINTED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_WHITE_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_BLACK_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_BLUE_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_BROWN_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_CYAN_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_GRAY_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_GREEN_STAINED_GLASS.get(), RenderType.translucent());	
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_LIGHT_BLUE_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_LIGHT_GRAY_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_LIME_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_MAGENTA_STAINED_GLASS.get(), RenderType.translucent());	
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_ORANGE_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_PINK_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_PURPLE_STAINED_GLASS.get(), RenderType.translucent());	
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_RED_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_YELLOW_STAINED_GLASS.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_ICE.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_SLIME_BLOCK.get(), RenderType.translucent());	
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_HONEY_BLOCK.get(), RenderType.translucent());	
		ItemBlockRenderTypes.setRenderLayer(blockgen.SLOPEOBJ_SLIME_BLOCK.get(), RenderType.translucent());	

	}
	
}
