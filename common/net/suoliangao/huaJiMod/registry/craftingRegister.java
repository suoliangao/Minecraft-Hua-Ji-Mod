package net.suoliangao.huaJiMod.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.suoliangao.huaJiMod.Item;
import net.suoliangao.huaJiMod.configLoader;
import net.suoliangao.huaJiMod.Block;
import net.minecraft.init.*;

public class craftingRegister extends GameRegistry{
	
	public static void addCrafting(){
		
		addRecipe(new ItemStack(Item.huaJiApple, 1), new Object[]{" # ", "#*#", " # ", '*', Items.APPLE, '#', Item.huaJi});
		addRecipe(new ItemStack(Block.huaJiBlock, 1), new Object[]{"###", "###", "###", '#', Item.huaJi});
		addRecipe(new ItemStack(Block.huaJiIngotBlock, 1), new Object[]{"###", "###", "###", '#', Item.huaJiIngot});

		addShapelessRecipe(new ItemStack(Item.huaJiIngot, 1), new Object[] {Items.IRON_INGOT, Item.huaJi});
	}
	
	public static void addSmelting(){
		
		addSmelting(Block.huaJiOre, new ItemStack(Item.huaJi), 0.2f);
		addSmelting(Block.huaJiOreNether, new ItemStack(Item.huaJi), 0.3f);
	}
	
	public static void addFuel(){
		
		if(configLoader.enableBurnHuaJi)
			GameRegistry.registerFuelHandler(new IFuelHandler() {
			@Override
			public int getBurnTime(ItemStack fuel) {
				// TODO Auto-generated method stub
				return Item.huaJi != fuel.getItem() ? 0 : configLoader.huaJiBurnTime;
			}
		});
		
	}
	
}
