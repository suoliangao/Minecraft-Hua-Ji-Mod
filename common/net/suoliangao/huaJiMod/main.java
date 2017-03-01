package net.suoliangao.huaJiMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid=main.MODID, name=main.MODNAME, version=main.VERSION)
public class main {
	
	public static final String MODID = "hua_ji_mod";
	public static final String MODNAME = "Hua Ji Mod";
	public static final String VERSION = "0.1.0";
	
    @SidedProxy(clientSide = "net.suoliangao.huaJiMod.clientProxy", serverSide = "net.suoliangao.huaJiMod.commonProxy")
    public static commonProxy proxy;
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event){
		proxy.preInit(event);
	}
	 
	@EventHandler
	public void load(FMLInitializationEvent event){
		proxy.init(event);
	}
	 
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
	
}
