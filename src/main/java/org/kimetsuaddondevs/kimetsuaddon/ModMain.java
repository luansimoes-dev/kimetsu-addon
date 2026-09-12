package org.kimetsuaddondevs.kimetsuaddon;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.kimetsuaddondevs.kimetsuaddon.item.ModItems;

@Mod(ModMain.NAMESPACE)
public class ModMain {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String NAMESPACE = "kimetsuaddon";

    public static ResourceLocation resourceLocation(String location) {
        return new ResourceLocation(NAMESPACE, location);
    }

    public ModMain() {
        LOGGER.info("initializing");

        ModItems.initialize();

        LOGGER.info("done");
    }
}
