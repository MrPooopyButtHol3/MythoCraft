package com.mrpooopybutthol3.mythocraft.items;

import com.mrpooopybutthol3.mythocraft.Main;
import com.mrpooopybutthol3.mythocraft.init.ModItems;
import com.mrpooopybutthol3.mythocraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
