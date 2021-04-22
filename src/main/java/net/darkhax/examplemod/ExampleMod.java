package net.darkhax.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModContainer;

@Mod(modid = ExampleMod.MOD_ID)
public class ExampleMod {
    
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogManager.getLogger("Example Mod");
    
    public ExampleMod() {
        
    	final ModContainer container = Loader.instance().getIndexedModList().get(MOD_ID);
    	LOGGER.info("Loaded {} v{}", container.getName(), container.getDisplayVersion());
    }
}