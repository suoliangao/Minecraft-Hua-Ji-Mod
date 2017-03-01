package net.suoliangao.huaJiMod;

import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.suoliangao.huaJiMod.item.*;

public class Item {
	
	public static myItem huaJi=new myItem("hua_ji");
	public static myItem huaJiIngot=new myItem("hua_ji_ingot");
	public static myFood huaJiApple=new myFood("hua_ji_apple", 4).setEffects(new Potion[]{MobEffects.HASTE, MobEffects.SPEED}, new int[]{400, 400}, new int[]{0, 0});
	
	//public static huaJiPickaxe huaJiPickaxe=new huaJiPickaxe();
	//public static huaJiAxe huaJiAxe=new huaJiAxe();

}
