package com.test.main.objects.blocks.slab;

import net.minecraft.block.material.*;

public class BlockDoubleSlabBase extends BlockSlabBase {
	
	public BlockDoubleSlabBase(String name, Material material) {
		super(name, material);
	}
	
	public boolean isDouble() {
		return true;
	}
}
