package dividedblocks.common;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDivision extends Block
{
	public BlockDivision (int id, Block parent, int xDivision, int yDivision, int zDivision)
	{
		super(id, parent.blockMaterial);
		
		blockHardness   = parent.blockHardness;
		blockResistance = parent.blockResistance; 
	}
}
