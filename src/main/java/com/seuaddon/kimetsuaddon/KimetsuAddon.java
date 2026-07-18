package com.seuaddon.kimetsuaddon;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("kimetsuaddon")
public class KimetsuAddon {
    private static final Logger LOGGER = LogManager.getLogger();
    
    public KimetsuAddon() {
        LOGGER.info("Kimetsu Addon inicializado com sucesso!");
    }
}
