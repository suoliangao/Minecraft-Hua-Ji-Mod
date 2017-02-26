package net.suoliangao.huaJiMod.registry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.suoliangao.huaJiMod.main;
import net.suoliangao.huaJiMod.block.myBlock;

public class blockRegister extends GameRegistry{
	
	public static myBlock huaJiBlock = new myBlock("hua_ji_block").withSettings(1.0f, 10.0f, 0.0f);
	public static myBlock huaJiIngotBlock = new myBlock("hua_ji_ingot_block").withSettings(2.0f, 20.0f, 0.0f);
	
	static void register(myBlock blockIn){
		GameRegistry.register(blockIn);
		GameRegistry.register(new ItemBlock(blockIn).setRegistryName(main.MODID, blockIn.blockID));
	}
	
	static void setAssets(myBlock blockIn){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockIn), 0, new ModelResourceLocation(main.MODID+":"+blockIn.blockID , "inventory"));
	}
	
	public static void myRegister(){
		huaJiIngotBlock.setHarvestLevel("pickaxe", 1);
		register(huaJiBlock);
		register(huaJiIngotBlock);
	}
	
	public static void myRegisterClient(){
		//myRegister();
		setAssets(huaJiBlock);
		setAssets(huaJiIngotBlock);
	}
	
}
