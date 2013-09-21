package dividedblocks.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemHandsaw extends ItemTool
{
	public static final Block[] blocksEffectiveAgainst = new Block[] {
		Block.stone
	};
	public EnumToolMaterial material;
	
	public ItemHandsaw (int id, EnumToolMaterial mat)
	{	
		super(id, 3.0F, mat, blocksEffectiveAgainst);
		
		material = mat;
	}

	public void registerRecipes () {
		GameRegistry.addRecipe(new ItemStack(this, 1), new Object[] {
			" S ",
			"S S",
			"MMM",
			'S', Item.stick,
			'M', Block.blocksList[material.getToolCraftingMaterial()]
		});	
	}
}
