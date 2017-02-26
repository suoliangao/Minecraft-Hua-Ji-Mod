package net.suoliangao.huaJiMod.registry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.suoliangao.huaJiMod.main;
import net.suoliangao.huaJiMod.block.myFood;
import net.suoliangao.huaJiMod.item.*;
import net.minecraft.init.MobEffects;

public class itemRegister extends GameRegistry{
	
	public static myItem huaJi=new myItem("hua_ji");
	public static myItem huaJiIngot=new myItem("hua_ji_ingot");
	public static myFood huaJiApple=new myFood("hua_ji_apple", 4).setEffects(new Potion[]{MobEffects.HASTE, MobEffects.SPEED}, new int[]{400, 400}, new int[]{0, 0});
	
	public static void myRegister () {
		huaJiApple.setAlwaysEdible();
		register(huaJi);
		register(huaJiIngot);
		register(huaJiApple);
	}
	
	public static void myRegisterClient () {
		setAssets(huaJi);
		setAssets(huaJiIngot);
		setAssets(huaJiApple);
	}
	
	public static void setAssets (myItem itemIn) {
		ModelLoader.setCustomModelResourceLocation(itemIn, 0, new ModelResourceLocation(main.MODID+":"+itemIn.itemID, "inventory"));
	}
	
	public static void setAssets (myFood itemIn) {
		ModelLoader.setCustomModelResourceLocation(itemIn, 0, new ModelResourceLocation(main.MODID+":"+itemIn.itemID, "inventory"));
	}
	
	
	
}
