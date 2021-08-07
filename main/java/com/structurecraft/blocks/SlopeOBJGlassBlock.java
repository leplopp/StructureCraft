package com.structurecraft.blocks;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.Tags.Fluids;
import net.minecraftforge.fluids.FluidAttributes.Water;

public class SlopeOBJGlassBlock extends StairBlock {
	
	   private final Block base;
	   private final BlockState baseState;

	
	public SlopeOBJGlassBlock(BlockState state, Properties prob) {
		super(state, prob);
		
	      this.base = state.getBlock();
	      this.baseState = state;
	      this.stateSupplier = () -> state;
	}

	   public boolean useShapeForLightOcclusion(BlockState p_56967_) {
		      return true;
		   }
		   
		   private final java.util.function.Supplier<BlockState> stateSupplier;
		   private Block getModelBlock() {
		       return getModelState().getBlock();
		   }
		   private BlockState getModelState() {
		       return stateSupplier.get();
		   }
		   
		 @Override
		public boolean isScaffolding(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
			return false;
		} 
		 
		   public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
			      return  super.skipRendering(state, adjacentBlockState, side) && state != adjacentBlockState;			   
		
			   }		   
  @Override
public BlockState getStateAtViewpoint(BlockState state, BlockGetter world, BlockPos pos, Vec3 viewpoint) {
	return super.getStateAtViewpoint(state, world, pos, viewpoint);
	
}
  
		   public VoxelShape getVisualShape(BlockState p_48735_, BlockGetter p_48736_, BlockPos p_48737_, CollisionContext p_48738_) {
			      return Shapes.empty();
			   }

			   public float getShadeBrightness(BlockState p_48731_, BlockGetter p_48732_, BlockPos p_48733_) {
			      return 1.0F;
			   }

			   public boolean propagatesSkylightDown(BlockState p_48740_, BlockGetter p_48741_, BlockPos p_48742_) {
			      return true;
			   }
			   
		
@Override
public boolean hasDynamicShape() {
	return true;
}
}


