package com.test.main.objects.blocks.slab;

import com.test.main.*;
import com.test.main.init.*;
import com.test.main.util.*;
import com.test.main.util.interfaces.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class BlockSlabBase extends BlockSlab implements IHasModel {
	
	public BlockSlabBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
		setCreativeTab(Main.testTab);
		
		IBlockState state = this.blockState.getBaseState();
		
		if(!this.isDouble()) {
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		
		setDefaultState(state);
		
		TestBlocks.BLOCKS.add(this);
		TestItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}
	
	@Override
	public IProperty<?> getVariantProperty() {
		return HALF;
	}
	
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return EnumBlockHalf.BOTTOM;
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return this.isDouble();
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return this.isDouble();
	}
	
}