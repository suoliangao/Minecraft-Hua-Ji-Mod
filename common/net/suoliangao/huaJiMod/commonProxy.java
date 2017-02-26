package net.suoliangao.huaJiMod;

import net.minecraftforge.fml.common.event.*;
import net.suoliangao.huaJiMod.registry.*;

public class commonProxy {
	
	public void preInit(FMLPreInitializationEvent event)
    {
		itemRegister.myRegister();
		blockRegister.myRegister();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
    
}
