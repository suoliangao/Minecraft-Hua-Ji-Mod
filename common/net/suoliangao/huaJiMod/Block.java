package net.suoliangao.huaJiMod;

import net.suoliangao.huaJiMod.block.myBlock;

public class Block {
	
	public static myBlock huaJiBlock = new myBlock("hua_ji_block").withSettings(1.0f, 10.0f, 0.0f);
	public static myBlock huaJiIngotBlock = new myBlock("hua_ji_ingot_block").withSettings(2.0f, 20.0f, 0.0f);
	public static myBlock huaJiOre = new myBlock("hua_ji_ore").withSettings(3.0f, 15.0f, 0.0f);
	public static myBlock huaJiOreNether = new myBlock("hua_ji_ore_nether").withSettings(2.5f, 10.0f, 0.0f);
}
