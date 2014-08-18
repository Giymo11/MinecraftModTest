package at.giymo11.testmod.handler;

import at.giymo11.testmod.reference.Info;
import at.giymo11.testmod.utility.Logger;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Giymo11 on 18.08.2014.
 */
public class ConfigurationHandler {

    private static final ConfigurationHandler instance = new ConfigurationHandler();

    private Configuration configuration;
    private boolean testValue = false;

    private ConfigurationHandler() {}

    public static ConfigurationHandler getInstance() {
        return instance;
    }

    public void initConfiguration(File file) {
        if(configuration == null) {
            configuration = new Configuration(file);
            loadConfiguration();
        }
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    @SubscribeEvent
    public void onConfigurationChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if(event.modID.equalsIgnoreCase(Info.ID))
            loadConfiguration();
    }

    private void loadConfiguration() {
        try {
            configuration.load();
            testValue = configuration.get(Configuration.CATEGORY_GENERAL, "testValue", false, "Example Test Value").getBoolean();

        } catch(Exception ex) {
            StringBuilder builder = new StringBuilder();

            for(StackTraceElement elem : ex.getStackTrace())
                builder.append(elem.toString()).append("\n");

            Logger.i(builder.toString());
        } finally {
            if(configuration.hasChanged())
                configuration.save();
        }
    }
}
