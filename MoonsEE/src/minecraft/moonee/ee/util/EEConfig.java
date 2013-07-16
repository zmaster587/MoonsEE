package moonee.ee.util;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class EEConfig {

	public static void config(FMLPreInitializationEvent event) {
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		System.out.println("==== Moon's EE: Loading the Configuration File! ====");
		config.load();
		
		//This Will be where the EMC Default Values will be set
		config.get("EMC", "Stone", 1).getInt();
		
		
		//This will be where the default Block/Item IDs are set
		config.get("ID", "rmblock", 2001).getInt();
		
		
		config.save();
		System.out.println("==== Moon's EE: Saving the Configuration File! ====");
	}

}
