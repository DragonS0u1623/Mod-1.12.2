package com.test.main.objects.blocks;

import net.minecraft.block.*;
import net.minecraft.block.state.*;

public class GlowstoneStairs extends BlockStairsBase {

	public GlowstoneStairs(String name, IBlockState modelState) {
		super(name, modelState);
		this.setSoundType(SoundType.GLASS);
		this.setLightLevel(15f);
	}

}
