package moonee.ee.network;

import cpw.mods.fml.client.registry.ClientRegistry;
import moonee.ee.EEBlock;
import moonee.ee.blocks.ItemAlchChestRender;
import moonee.ee.blocks.ItemCondenserRender;
import moonee.ee.blocks.ItemDMFurnaceRender;
import moonee.ee.blocks.ItemRMFurnaceRender;
import moonee.ee.blocks.TileEntityAlchChest;
import moonee.ee.blocks.TileEntityAlchChestRender;
import moonee.ee.blocks.TileEntityCondenser;
import moonee.ee.blocks.TileEntityCondenserRender;
import moonee.ee.blocks.TileEntityRMFurnace;
import net.minecraftforge.client.MinecraftForgeClient;

public class EEClientProxy extends EEServerProxy {

	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/moonee/ee/art/sprites/eqexterra.png");
		MinecraftForgeClient.preloadTexture("/moonee/ee/art/sprites/eqexsheet.png");
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCondenser.class, new TileEntityCondenserRender());
		MinecraftForgeClient.registerItemRenderer(EEBlock.Condenser.blockID, new ItemCondenserRender());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlchChest.class, new TileEntityAlchChestRender());
		MinecraftForgeClient.registerItemRenderer(EEBlock.alchChest.blockID, new ItemAlchChestRender());
		
	}
}
