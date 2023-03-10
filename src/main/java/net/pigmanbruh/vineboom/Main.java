package net.pigmanbruh.vineboom;

import net.pigmanbruh.vineboom.item.Moditems;
import net.pigmanbruh.vineboom.sound.Sounds;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
    public static final String MOD_ID = "vineboom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        Sounds.registerModSounds();
        Moditems.registerModItems();
    }
}
