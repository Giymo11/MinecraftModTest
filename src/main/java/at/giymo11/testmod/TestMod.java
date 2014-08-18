package at.giymo11.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Giymo11 on 18.08.2014.
 *
 * This is the main Mod class containing the init handling.
 */
@Mod(modid="testmod", name="TestMod", version="0.1")
public class TestMod {
    @Mod.Instance("testmod")
    public static TestMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
