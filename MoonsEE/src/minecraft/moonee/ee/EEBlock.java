package moonee.ee;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import moonee.mod_EE;
import moonee.ee.blocks.BlockAlchChest;
import moonee.ee.blocks.BlockCollector1;
import moonee.ee.blocks.BlockCollector2;
import moonee.ee.blocks.BlockCollector3;
import moonee.ee.blocks.BlockCondenser;
import moonee.ee.blocks.BlockDM;
import moonee.ee.blocks.BlockDMFurnace;
import moonee.ee.blocks.BlockITorch;
import moonee.ee.blocks.BlockNCatm;
import moonee.ee.blocks.BlockNCatt;
import moonee.ee.blocks.BlockRM;
import moonee.ee.blocks.BlockRMFurnace;
import moonee.ee.blocks.BlockRelay1;
import moonee.ee.blocks.BlockRelay2;
import moonee.ee.blocks.BlockRelay3;
import moonee.ee.blocks.TileEntityAlchChest;
import moonee.ee.blocks.TileEntityCondenser;
import moonee.ee.blocks.TileEntityDMFurnace;
import moonee.ee.blocks.TileEntityRMFurnace;
import moonee.ee.util.EEConfig;
import net.minecraft.block.Block;

public class EEBlock {

	public static Block alchChest;
	public static Block rmBlock;
	public static Block dmBlock;
	public static Block iTorch;
	public static Block nCatt;
	public static Block nCatm;
	public static Block Relay1;
	public static Block Relay2;
	public static Block Relay3;
	public static Block Collector1;
	public static Block Collector2;
	public static Block Collector3;
	public static Block Condenser;
	public static Block rmFurnace;
	public static Block dmFurnace;

	public static void init() {
		
		System.out.println("==== Moon's EE: Loading Blocks and Chests! ====");
		//Blocks
		rmBlock = (new BlockRM(2001, 15)).setBlockName("RedMatter").setCreativeTab(mod_EE.EEtab);
		dmBlock = new BlockDM(2002, 13).setBlockName("DarkMatter").setCreativeTab(mod_EE.EEtab);
		iTorch = new BlockITorch(2003, 16).setLightValue(2.0F).setBlockName("ITorch").setCreativeTab(mod_EE.EEtab);
		nCatt = new BlockNCatt(2004, 17).setBlockName("NovaCatt").setCreativeTab(mod_EE.EEtab);
		nCatm = new BlockNCatm(2005, 18).setBlockName("NovaCatm").setCreativeTab(mod_EE.EEtab);
		Relay1 = new BlockRelay1(2006, 6).setBlockName("AntiRelay1").setCreativeTab(mod_EE.EEtab);
		Relay2 = new BlockRelay2(2007, 6).setBlockName("AntiRelay2").setCreativeTab(mod_EE.EEtab);
		Relay3 = new BlockRelay3(2008, 6).setBlockName("AntiRelay3").setCreativeTab(mod_EE.EEtab);
		Collector1 = new BlockCollector1(2009, 9).setBlockName("Collector1").setCreativeTab(mod_EE.EEtab);
		Collector2 = new BlockCollector2(2010, 9).setBlockName("Collector2").setCreativeTab(mod_EE.EEtab);
		Collector3 = new BlockCollector3(2011, 9).setBlockName("Collector3").setCreativeTab(mod_EE.EEtab);
		
		
		GameRegistry.registerBlock(Collector3, "EE.Block10");
		GameRegistry.registerBlock(Collector2, "EE.Block9");
		GameRegistry.registerBlock(Collector1, "EE.Block8");
		GameRegistry.registerBlock(Relay3, "EE.Block7");
		GameRegistry.registerBlock(Relay2, "EE.Block6");
		GameRegistry.registerBlock(Relay1, "EE.Block5");
		GameRegistry.registerBlock(nCatm, "EE.Block4");
		GameRegistry.registerBlock(nCatt, "EE.Block3");
		GameRegistry.registerBlock(iTorch, "EE.Block2");
		GameRegistry.registerBlock(dmBlock, "EE.Block1");
		GameRegistry.registerBlock(rmBlock, "EE.Block");
		
		LanguageRegistry.addName(Collector3, "Energy Collector Mk3");
		LanguageRegistry.addName(Collector2, "Energy Collector Mk2");
		LanguageRegistry.addName(Collector1, "Energy Collector Mk1");
		LanguageRegistry.addName(Relay3, "Antimatter Relay Mk3");
		LanguageRegistry.addName(Relay2, "Antimatter Relay Mk2");
		LanguageRegistry.addName(Relay1, "Antimatter Relay Mk1");
		LanguageRegistry.addName(nCatm, "Nova Cataclysm");
		LanguageRegistry.addName(nCatt, "Nova Catalyst");
		LanguageRegistry.addName(iTorch, "Interdiction Torch");
		LanguageRegistry.addName(dmBlock, "Dark Matter Block");
		LanguageRegistry.addName(rmBlock, "Red Matter Block");
		
		
		// Chests
		alchChest =new BlockAlchChest(2012, 0).setBlockName("AlchChest").setCreativeTab(mod_EE.EEtab);
		Condenser =new BlockCondenser(2000, 0).setBlockName("Condenser").setCreativeTab(mod_EE.EEtab);
		
		GameRegistry.registerBlock(Condenser, "EE.Chest1");
		GameRegistry.registerBlock(alchChest, "EE.Chest");
		
		GameRegistry.registerTileEntity(TileEntityCondenser.class,"tileentitycondenser");
		GameRegistry.registerTileEntity(TileEntityAlchChest.class,"tileentityalchchest");
		
		LanguageRegistry.addName(Condenser, "Energy Condenser");
        LanguageRegistry.addName(alchChest, "Alchemical Chest");
        
        
        //Furnaces
        rmFurnace = new BlockRMFurnace(2026, false).setBlockName("rmFurnace").setCreativeTab(mod_EE.EEtab);
		dmFurnace = new BlockDMFurnace(2027, false).setBlockName("dmFurnace").setCreativeTab(mod_EE.EEtab);
		
		GameRegistry.registerBlock(rmFurnace, "EE.Block12");
		GameRegistry.registerBlock(dmFurnace, "EE.Block11");
		
		GameRegistry.registerTileEntity(TileEntityRMFurnace.class,"tileentityrmfurnace");
		GameRegistry.registerTileEntity(TileEntityDMFurnace.class,"tileentitydmfurnace");
		
		LanguageRegistry.addName(rmFurnace, "Red Matter Furnace");
		LanguageRegistry.addName(dmFurnace, "Dark Matter Furnace");
        
	}

}
