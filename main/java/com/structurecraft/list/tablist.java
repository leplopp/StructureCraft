package com.structurecraft.list;

import com.structurecraft.structurecraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = structurecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class tablist {

	public static final CreativeModeTab SCTAB_MAIN = new CreativeModeTab("scmaintab") {
		public ItemStack makeIcon() {return new ItemStack(Blocks.ACACIA_BUTTON);}};
}
