package at.giymo11.testmod;

import at.giymo11.testmod.proxy.Proxy;
import at.giymo11.testmod.reference.Info;
import at.giymo11.testmod.utility.Logger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Giymo11 on 18.08.2014.
 *
 * This is the main Mod class containing the init handling.
 */
@Mod(modid= Info.ID, name= Info.NAME, version= Info.VERSION)
public class TestMod {

    @Mod.Instance(Info.ID)
    public static TestMod instance;

    @SidedProxy(clientSide = Info.CLIENTPROXY, serverSide = Info.SERVERPROXY)
    public static Proxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        loadConfigs(event.getSuggestedConfigurationFile());
    }

    private boolean testValue = false;

    private void loadConfigs(File file) {
        Configuration configuration = new Configuration(file);

        try {
            configuration.load();
            testValue = configuration.get(Configuration.CATEGORY_GENERAL, "testValue", false, "Example Test Value").getBoolean();

        } catch(Exception ex) {
            StringBuilder builder = new StringBuilder();

            for(StackTraceElement elem : ex.getStackTrace())
                builder.append(elem.toString()).append("\n");

            Logger.d(builder.toString());
        } finally {
            configuration.save();
        }

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
