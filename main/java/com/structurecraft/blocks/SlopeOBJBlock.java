package com.structurecraft.blocks;

import net.minecraftforge.api.distmarker.Dist;
import java.util.Random;
import java.util.function.Supplier;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.CubeVoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SlopeOBJBlock extends StairBlock {
	
	   private final Block base;
	   private final BlockState baseState;

	
	public SlopeOBJBlock(BlockState state, Properties prob) {
		super(state, prob);
		
	      this.base = state.getBlock();
	      this.baseState = state;
	      this.stateSupplier = () -> state;
	}
		   
		   private final java.util.function.Supplier<BlockState> stateSupplier;
		   private Block getModelBlock() {
		       return getModelState().getBlock();
		   }
		   private BlockState getModelState() {
		       return stateSupplier.get();
		   }
		  

}


