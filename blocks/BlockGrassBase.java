package com.test.main.objects.blocks;

import com.test.main.*;
import com.test.main.init.*;
import com.test.main.util.interfaces.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;

public class BlockGrassBase extends BlockGrass implements IHasModel {
	
	public BlockGrassBase(String name, Material material) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.testTab);
		
		TestBlocks.BLOCKS.add(this);
		TestItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
