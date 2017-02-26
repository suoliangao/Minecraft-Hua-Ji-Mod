package net.suoliangao.huaJiMod.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.suoliangao.huaJiMod.main;

public class myFood extends ItemFood{
	
	public String itemID;
	Potion[] effects;
	int[] timeInTick;
	int[] effectLevel;
	
	/**
	 * The constructor with basic settings.
	 * @param itemID
	 * @param tab : The creative tab the item will in
	 * @param amount : the amount of the food can recharges(half chicken leg)
	 * @param saturation : the amount of the saturation recharges(amount*saturation*2)
	 * @param isWolfFood : can wolf eat it?
	 */
	public myFood(String itemID, CreativeTabs tab, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		// TODO Auto-generated constructor stub
		
		this.itemID=itemID;
		
		setUnlocalizedName(main.MODID+"."+itemID);
        setRegistryName(main.MODID, itemID);
        setCreativeTab(tab);
	}
	
	/**
	 * not wolf food
	 * default tab FOOD
	 * default saturation 0.5
	 * @param itemID
	 * @param amount : the amount of the food can recharges(half chicken leg)
	 * @param saturation : the amount of the saturation recharges(amount*saturation*2)
	 * @param isWolfFood : can wolf eat it?
	 */
	
	public myFood(String itemID, int amount) {
		super(amount, 0.5f, false);
		// TODO Auto-generated constructor stub
		
		this.itemID=itemID;
		
		setUnlocalizedName(main.MODID+"."+itemID);
        setRegistryName(main.MODID, itemID);
        setCreativeTab(CreativeTabs.FOOD);
	}

	public myFood setEffects(Potion[] effects, int[] timeInTick, int[] effectLevel){
		this.effects = effects;
		this.timeInTick = timeInTick;
		this.effectLevel = effectLevel;
		
		return this;
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
	        if (!worldIn.isRemote){
	            for(int i=0; i<effects.length; i++){
	            	player.addPotionEffect(new PotionEffect(effects[i], timeInTick[i], effectLevel[i]));
	            }
	        }
	    }

}
