package moonee.ee.util;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

import java.util.HashMap;

public class EEConfig {

	private static HashMap<Object,Integer> EMCArray = new HashMap<Object,Integer>();
	
	public static void config(FMLPreInitializationEvent event) {
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		System.out.println("==== Moon's EE: Loading the Configuration File! ====");
		config.load();
		
		//This Will be where the EMC Default Values will be set
		
		//Most likely will have to change the format of the item to [<ID>.<Damage>] in order
		// To be compatible with mod blocks
		//config.get("EMC", "Stone", 1).getInt();
		
		//BlockEMC example
		EMCArray.put(new ItemBlock(1) ,config.get("EMCVanilla", "1", 1).getInt());
		
		EMCArray.put(new Item(256), config.get("EMCVanilla", "256", 5).getInt());
		//This will be where the default Block/Item IDs are set
		config.get("ID", "rmblock", 2001).getInt();
		
		
		config.save();
		System.out.println("==== Moon's EE: Saving the Configuration File! ====");
		
		//TODO: Custom id config
	}
	
	//Accessed by using "EEConfig.getEMCMap()"
	
	
	///
	///@desc returns a Hashmap of the Item/BlockItem to EMC
	///@returns EMC Hashmap
	///
	public static HashMap<Object,Integer> getEMCMap() {return EMCArray;}

}
