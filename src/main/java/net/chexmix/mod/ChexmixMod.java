package net.chexmix.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChexmixMod implements ModInitializer {
	public static final String MODID = "chexmixmod";


	@Override
	public void onInitialize() {
		ItemInit.init();
	}
}
