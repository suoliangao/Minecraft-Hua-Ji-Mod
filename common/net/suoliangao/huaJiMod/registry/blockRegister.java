package net.suoliangao.huaJiMod.registry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.suoliangao.huaJiMod.main;
import net.suoliangao.huaJiMod.block.myBlock;
import net.suoliangao.huaJiMod.Block;

public class blockRegister extends GameRegistry{
	
	static void register(myBlock blockIn){
		GameRegistry.register(blockIn);
		GameRegistry.register(new ItemBlock(blockIn).setRegistryName(main.MODID, blockIn.blockID));
	}
	
	static void setAssets(myBlock blockIn){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockIn), 0, new ModelResourceLocation(main.MODID+":"+blockIn.blockID , "inventory"));
	}
	
	public static void myRegister(){
		Block.huaJiIngotBlock.setHarvestLevel("pickaxe", 1);
		Block.huaJiOre.setHarvestLevel("pickaxe", 1);
		Block.huaJiOreNether.setHarvestLevel("pickaxe", 1);
		register(Block.huaJiBlock);
		register(Block.huaJiIngotBlock);
		register(Block.huaJiOre);
		register(Block.huaJiOreNether);
	}
	
	public static void myRegisterClient(){
		//myRegister();
		setAssets(Block.huaJiBlock);
		setAssets(Block.huaJiIngotBlock);
		setAssets(Block.huaJiOre);
		setAssets(Block.huaJiOreNether);
	}
	
}
