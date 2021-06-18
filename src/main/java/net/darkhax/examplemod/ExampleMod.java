package net.darkhax.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {
	
	public static final Logger LOG = LogManager.getLogger("Example Mod");
	@Override
	public void onInitialize() {

		LOG.info("Hello world.");
	}
}