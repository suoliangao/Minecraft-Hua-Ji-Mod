package net.suoliangao.huaJiMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.suoliangao.huaJiMod.main;

public class myBlock extends Block{

	public String blockID;
	
	public myBlock (Material materialIn, String blockID, CreativeTabs tab) {
		super(materialIn);
		this.blockID=blockID;
		
		setUnlocalizedName(main.MODID+"."+blockID);
        setRegistryName(main.MODID, blockID);
        setCreativeTab(tab);
	}
	/**
	 * Set to the Building Blocks and Material is Rock (Default)
	 * @param blockID : set blockID
	 * */
	public myBlock(String blockID) {
		super(Material.ROCK);
		// TODO Auto-generated constructor stub
		this.blockID = blockID;
		
		setUnlocalizedName(main.MODID+"."+blockID);
        setRegistryName(main.MODID, blockID);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	/**
	 * Basic setting of the block
	 * @param hardness : hardness of the block (dirt: 0.5, stone:1.5, ores: 3)
	 * @param resistance : exploding resistance (stone: 10)
	 * @param lightLevel : the light level of the block (0~1.0f[15])
	 * @return :  the block has been set
	 */
	
	public myBlock withSettings(float hardness, float resistance, float lightLevel){
		this.setHardness(1.0f);
        this.setResistance(10.0f);
        this.setLightLevel(0.0f);
        
        return this;
	}

}
