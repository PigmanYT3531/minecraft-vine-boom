package net.pigmanbruh.vineboom;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "vineboom";
	public static final Logger LOGGER = LoggerFactory.getLogger("vineboom");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}