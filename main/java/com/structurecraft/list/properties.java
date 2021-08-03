package com.structurecraft.list;

import javax.swing.text.html.BlockView;

import org.antlr.v4.parse.ANTLRParser.blockSet_return;

import com.structurecraft.register.blockgen;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.StatePredicate;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class properties {

	public static net.minecraft.world.level.block.state.BlockBehaviour.Properties Propertiestone() {

		  return  BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NONE).harvestLevel(1)
				.harvestTool(ToolType.PICKAXE).strength(3f, 5).sound(SoundType.STONE).requiresCorrectToolForDrops();
	}
	
	public static final net.minecraft.world.level.block.state.BlockBehaviour.Properties Propertieglass() {

		  return  BlockBehaviour.Properties.of(Material.GLASS).harvestLevel(1)
				.strength(0.3f, 1).sound(SoundType.GLASS).requiresCorrectToolForDrops().noOcclusion().isValidSpawn(properties::never)
				.isRedstoneConductor(properties::never).isSuffocating(properties::never).isViewBlocking(properties::never);
	
	}
	
	 private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
	      return (boolean)false;
	   }
	 
	   private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
		      return false;
		   }
}
