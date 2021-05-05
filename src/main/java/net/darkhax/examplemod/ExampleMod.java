package net.darkhax.examplemod;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSigner;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

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
        
        for (final IModInfo modInfo : modEntry.getMods()) {
            
            LOGGER.info("Loaded {} v{} from '{}'", modInfo.getModId(), modInfo.getVersion(), modEntry.getFile().getFilePath());
            
            if (!verifyJarSignature(modEntry.getFile().getFilePath().toFile())) {
                
                LOGGER.error("Could not verify the mod's signature! modId={} version={} path={}", modInfo.getModId(), modInfo.getVersion(), modEntry.getFile().getFilePath());
            }
        }
    }
    
    private static boolean verifyJarSignature (File file) {
        
        // Only JAR file signatures can be verified here.
        if (file.exists() && !file.isDirectory()) {
            
            try (JarFile jar = new JarFile(file)) {
                
                boolean hasFailed = false;
                final Enumeration<JarEntry> entries = jar.entries();
                
                while (entries.hasMoreElements()) {
                    
                    final JarEntry entry = entries.nextElement();
                    
                    try (final InputStream is = jar.getInputStream(entry)) {
                        
                        final byte[] buffer = new byte[8192];
                        
                        while (is.read(buffer, 0, buffer.length) != -1) {
                            
                            // In Java 8+ we need to read the data if we actually want the code
                            // signers to be verified. Invalid signatures will throw errors
                            // when read which are caught.
                        }
                    }
                    
                    // This exception is raised when the contents of a file do not match the
                    // expected signature. We don't hard fail right away to allow all
                    // violations to be logged.
                    catch (SecurityException e) {
                        
                        hasFailed = true;
                        LOGGER.catching(e);
                    }
                }
                
                return !hasFailed;
            }
            
            catch (final IOException e) {
                
                e.printStackTrace();
                return false;
            }
        }
        
        return false;
    }
}