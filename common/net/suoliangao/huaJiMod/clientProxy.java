package net.suoliangao.huaJiMod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.suoliangao.huaJiMod.registry.*;

public class clientProxy extends commonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
    {
		super.preInit(event);
		itemRegister.myRegisterClient();
		blockRegister.myRegisterClient();
    }
		
		
	
	@Override
    public void init(FMLInitializationEvent event)
    {
		super.init(event);
    }
	
	@Override
    public void postInit(FMLPostInitializationEvent event)
    {
		super.postInit(event);
    }
}
