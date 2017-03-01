package net.suoliangao.huaJiMod.registry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.suoliangao.huaJiMod.generation.huaJiOreGeneration;

public class generationRegister extends GameRegistry{
	
	public static huaJiOreGeneration gen = new huaJiOreGeneration();
	
	public static void myRegister(){
		registerWorldGenerator(gen, 0);
	}
}
