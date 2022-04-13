package net.chexmix.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ChexmixMod implements ModInitializer {
	public static final String MODID = "chexmixmod";

	public static final Random rand = new Random();

	@Override
	public void onInitialize() {
		ItemInit.init();
		LootTableInit.modifyLootTables();
	}
}
