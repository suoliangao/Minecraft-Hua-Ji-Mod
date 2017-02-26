package net.suoliangao.huaJiMod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.suoliangao.huaJiMod.main;

public class myItem extends Item{
	
	public String itemID;
	
	public myItem (String itemID, CreativeTabs tab) {
		this.itemID=itemID;
		
		setUnlocalizedName(main.MODID+"."+itemID);
        setRegistryName(main.MODID, itemID);
        setCreativeTab(tab);
	}
	/**
	 * Set to the Material (Default)
	 * @param itemID
	 * */
	public myItem (String itemID) {
		this.itemID=itemID;
		
		setUnlocalizedName(main.MODID+"."+itemID);
        setRegistryName(main.MODID, itemID);
        setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	public Item setMaxStackSize (int number){
		this.maxStackSize = number;
		return this;
	}
	
}
