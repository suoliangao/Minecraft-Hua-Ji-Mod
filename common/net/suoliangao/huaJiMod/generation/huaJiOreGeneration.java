package net.suoliangao.huaJiMod.generation;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.suoliangao.huaJiMod.Block;
import net.suoliangao.huaJiMod.configLoader;
import net.minecraft.util.math.BlockPos;

public class huaJiOreGeneration implements IWorldGenerator {

	WorldGenerator genMain, genNether;
	
	public huaJiOreGeneration(){
		genMain = new WorldGenMinable(Block.huaJiOre.getDefaultState(), 8);
		genNether = new WorldGenMinable(Block.huaJiOreNether.getDefaultState(), 10);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		switch (world.provider.getDimension()) {
	    case 0: //OverWorld
	    	if(configLoader.enableGenOverWorld){
	    		runGenerator(genMain, world, random, chunkX, chunkZ, 10, 16, 64);
	    	}
	        break;
	    case -1: //Nether
	    	if(configLoader.enableGenNether){
	    		runGenerator(genNether, world, random, chunkX, chunkZ, 15, 8, 128);
	    	}
	        break;
	    case 1: //End

	        break;
	    default:
	    	runGenerator(genMain, world, random, chunkX, chunkZ, 10, 16, 64);
	    	break;
	    }
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
