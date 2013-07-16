package moonee;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import moonee.ee.EEBlock;
import moonee.ee.EEItem;
import moonee.ee.network.EEPacketHandler;
import moonee.ee.network.EEServerProxy;
import moonee.ee.network.GuiHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MoonsEE", name = "Moon's EE 2.5", version = "0.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels = { "MoonsEE" }, packetHandler = EEPacketHandler.class)
public class mod_EE {

	@SidedProxy(clientSide = "moonee.ee.network.EEClientProxy", serverSide = "moonee.ee.network.EEServerProxy")
	public static EEServerProxy proxy;
	@Instance("MoonsEE")
	public static mod_EE instance;

	@PreInit
	public void load(FMLPreInitializationEvent event) {
	}

	@Init
	public void load(FMLInitializationEvent event) {
		LanguageRegistry.instance().addStringLocalization("mod_EE.EEtab",
				"en_US", "Moon's EE 2.5");
		EEBlock.init();
		EEItem.init();
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
		proxy.registerRenderThings();
	}

	public static CreativeTabs EEtab = new CreativeTabs("EETab") {
		public ItemStack getIconItemStack() {
			return new ItemStack(Item.melon, 1, 0);
		}
	};
}
