package at.giymo11.testmod.client.gui;

import at.giymo11.testmod.handler.ConfigurationHandler;
import at.giymo11.testmod.reference.Info;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
* Created by Giymo11 on 18.08.2014.
*/
public class MyGuiConfig extends GuiConfig {
    public MyGuiConfig(GuiScreen screen) {
        super(null, //parent GuiScreen
              new ConfigElement(ConfigurationHandler.getConfiguration().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
              // ^ All elements in the "General" category
              Info.ID,
              false, //allRequireWorldRestart
              false, //allRequireModRestart
              GuiConfig.getAbridgedConfigPath(ConfigurationHandler.getConfiguration().toString())); //title
    }
}
