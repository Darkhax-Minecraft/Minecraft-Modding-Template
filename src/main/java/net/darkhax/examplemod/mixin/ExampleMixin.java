package net.darkhax.examplemod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.darkhax.examplemod.ExampleMod;
import net.minecraft.Bootstrap;

@Mixin(Bootstrap.class)
public class ExampleMixin {
	
	@Shadow
	private static boolean initialized;
	
	@Inject(at = @At("HEAD"), method = "initialize()V")
	private static void initialize(CallbackInfo info) {
		
		if (!initialized) {
			
			ExampleMod.LOG.info("Bootstrap has been initialized.");
		}
	}
}