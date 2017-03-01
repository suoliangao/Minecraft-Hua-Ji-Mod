package net.suoliangao.huaJiMod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

public class configLoader {
	
	private static Configuration config;

    private static Logger logger;
    //Using Hua Ji as fuel
    public static int huaJiBurnTime;
    public static boolean enableBurnHuaJi;
    //World Gen
    public static boolean enableGenOverWorld;
    public static boolean enableGenNether;
    public static void setConfig(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }

    public static void load()
    {
        logger.info("Started loading config. ");
        
        burnHuaJi();
        oreGen();
        
        config.save();
        logger.info("Finished loading config. ");
    }

    public static Logger logger()
    {
        return logger;
    }
    
    private static void burnHuaJi(){
    	String comment;
    	
    	comment = "Whether enable using Hua Ji as a fuel in furnace.";
        enableBurnHuaJi = config.getBoolean("Enable Burn Hua Ji", Configuration.CATEGORY_GENERAL, true, comment);

        comment = "How many seconds can a Hua Ji burn in a furnace. (10 seconds/item)";
        huaJiBurnTime = (int)(config.get(Configuration.CATEGORY_GENERAL, "Hua Ji Burn Time", 120, comment).getDouble()*20);
        
    }
	
    private static void oreGen(){
    	String comment;
    	
    	comment = "Enable generate Hua Ji ore in OverWorld.";
        enableGenOverWorld = config.getBoolean("Enable Generate", "oreGen", true, comment);

        comment = "Enable generate Hua Ji ore in Nether.";
        enableGenNether = config.getBoolean("Enable Generate Nether", "oreGen", true, comment);
        
    }
    
}
