package com.test.main.objects.blocks;

import com.test.main.*;
import com.test.main.init.*;
import com.test.main.util.*;
import com.test.main.util.interfaces.*;

import net.minecraft.block.*;
import net.minecraft.block.state.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class BlockStairsBase extends BlockStairs implements IHasModel {
	
	public BlockStairsBase(String name, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setCreativeTab(Main.testTab);
		
		TestBlocks.BLOCKS.add(this);
		TestItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return true;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
}
