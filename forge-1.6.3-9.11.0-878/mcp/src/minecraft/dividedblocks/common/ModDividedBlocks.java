package dividedblocks.common;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import dividedblocks.proxy.ProxyCommon;

@Mod(modid = "DividedBlocks", name = "Divided Blocks", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ModDividedBlocks
{
	@SidedProxy(clientSide = "dividedblocks.proxy.ProxyClient", serverSide = "dividedblocks.proxy.ProxyCommon")
	public static ProxyCommon proxy;
	
	@Instance("ModDividedBlocks")
	public static ModDividedBlocks instance;
	
	// Items
	public static Item stoneHandsaw;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event)
	{
		// Declarations
			// Items
		stoneHandsaw = new ItemHandsaw(12000, EnumToolMaterial.STONE).setUnlocalizedName("StoneHandsaw").setTextureName("dividedblocks:StoneHandsaw");
		
		// Registry
			// Items
		GameRegistry.registerItem(stoneHandsaw, "StoneHandsaw", "DividedBlocks");
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event)
	{
		proxy.registerRender();
		
		// Recipes
			// Items
		((ItemHandsaw)stoneHandsaw).registerRecipes();
	}
	
	@EventHandler
	public void PostInit (FMLPostInitializationEvent event)
	{}
}
