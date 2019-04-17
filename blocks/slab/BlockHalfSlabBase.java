package com.test.main.objects.blocks.slab;

import net.minecraft.block.material.*;

public class BlockHalfSlabBase extends BlockSlabBase {
	
	public BlockHalfSlabBase(String name, Material material) {
		super(name, material);
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}
}
