package at.giymo11.testmod;

import at.giymo11.testmod.handler.ConfigurationHandler;
import at.giymo11.testmod.proxy.Proxy;
import at.giymo11.testmod.reference.Blocks;
import at.giymo11.testmod.reference.Info;
import at.giymo11.testmod.reference.Items;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Giymo11 on 18.08.2014.
 *
 * This is the main Mod class containing the init handling.
 */
@Mod(modid= Info.ID, name= Info.NAME, version= Info.VERSION, guiFactory = Info.GUIFACTORY)
public class TestMod {

    @Mod.Instance(Info.ID)
    public static TestMod instance;

    @SidedProxy(clientSide = Info.CLIENTPROXY, serverSide = Info.SERVERPROXY)
    public static Proxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.getInstance().initConfiguration(event.getSuggestedConfigurationFile());

        Items.registerItems();
        Blocks.registerBlocks();

        FMLCommonHandler.instance().bus().register(ConfigurationHandler.getInstance());

    }

    private boolean testValue = false;



    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
