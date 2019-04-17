package com.test.main.objects.blocks.item;

import com.test.main.util.interfaces.*;

import net.minecraft.block.*;
import net.minecraft.item.*;

public class ItemBlockVariants extends ItemBlock {
	
	public ItemBlockVariants(Block block) {
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}

}
