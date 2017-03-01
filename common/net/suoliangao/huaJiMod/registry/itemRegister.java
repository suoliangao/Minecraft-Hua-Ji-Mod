package net.suoliangao.huaJiMod.registry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.suoliangao.huaJiMod.main;
import net.suoliangao.huaJiMod.item.*;
import net.suoliangao.huaJiMod.Item;

public class itemRegister extends GameRegistry{
	
	public static void myRegister () {
		Item.huaJiApple.setAlwaysEdible();
		register(Item.huaJi);
		register(Item.huaJiIngot);
		register(Item.huaJiApple);
		//register(Item.huaJiPickaxe);
		//register(Item.huaJiAxe);
	}
	
	public static void myRegisterClient () {
		setAssets(Item.huaJi);
		setAssets(Item.huaJiIngot);
		setAssets(Item.huaJiApple);
		//ModelLoader.setCustomModelResourceLocation(Item.huaJiPickaxe, 0, new ModelResourceLocation(main.MODID+":"+huaJiPickaxe.itemID, "inventory"));
		//Item.huaJiAxe.setAssets();
	}

	public static void setAssets (myItem itemIn) {
		ModelLoader.setCustomModelResourceLocation(itemIn, 0, new ModelResourceLocation(main.MODID+":"+itemIn.itemID, "inventory"));
	}
	
	public static void setAssets (myFood itemIn) {
		ModelLoader.setCustomModelResourceLocation(itemIn, 0, new ModelResourceLocation(main.MODID+":"+itemIn.itemID, "inventory"));
	}
	
}
