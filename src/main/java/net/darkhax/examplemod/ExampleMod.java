package net.darkhax.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.moddiscovery.ModFileInfo;
import net.minecraftforge.forgespi.language.IModInfo;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogManager.getLogger("Example Mod");
    
    public ExampleMod() {
        
    	final ModFileInfo modEntry = ModList.get().getModFileById(MOD_ID);
    	
    	for (IModInfo modInfo : modEntry.getMods()) {
    		
    		LOGGER.info("Loaded {} v{} from '{}'", modInfo.getModId(), modInfo.getVersion(), modEntry.getFile().getFilePath());
    	}
    }
}