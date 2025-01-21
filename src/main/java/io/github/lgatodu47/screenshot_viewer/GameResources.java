package io.github.lgatodu47.screenshot_viewer;

import net.minecraft.util.Identifier;
import nl.enjarai.shared_resources.api.*;


public class GameResources implements SharedResourcesEntrypoint {
    public static ResourceDirectory SCREENSHOTS;

    @Override
    public void registerResources(GameResourceRegistry registry) {
        SCREENSHOTS = (ResourceDirectory) registry.get(Identifier.tryParse("shared-resources:screenshots"));
    }
}
