package com.structurecraft.register;

import com.structurecraft.structurecraft;
import com.structurecraft.blocks.SlopeOBJBlock;
import com.structurecraft.list.namelist;
import com.structurecraft.list.properties;
import com.structurecraft.list.tablist;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = structurecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class blockgen {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, structurecraft.MODID);
	
	
	public static final RegistryObject<Block> SLOPEOBJ_MAIN = BLOCKS.register(namelist.SLOPEOBJ_MAIN, () -> new SlopeOBJBlock(Blocks.COBBLESTONE.defaultBlockState(), properties.Propertiestone(), 0));
	
	public static final RegistryObject<Block> CORNEROUT_MAIN = BLOCKS.register("corneroutobj_main", () -> new Block(properties.Propertiestone()));

	public static final RegistryObject<Block> CORNERIN_MAIN = BLOCKS.register("cornerinobj_main", () -> new Block(properties.Propertiestone()));
	
	
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		blockgen.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(
					new BlockItem(block, new Item.Properties().tab(tablist.SCTAB_MAIN)).setRegistryName(block.getRegistryName()));
		});	}
	
}
