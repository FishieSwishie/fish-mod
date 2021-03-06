package com.matt.fishoverload.items;

import com.matt.fishoverload.Main;
import com.matt.fishoverload.init.ModItems;
import com.matt.fishoverload.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.tabMaterials);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
