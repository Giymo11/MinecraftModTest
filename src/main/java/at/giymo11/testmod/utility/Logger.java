package at.giymo11.testmod.utility;

import at.giymo11.testmod.reference.Info;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;


/**
 * Created by Giymo11 on 18.08.2014.
 */
public class Logger {
    public static void log(Level logLevel, Object object) {
        FMLLog.log(Info.NAME, logLevel, "%s", object);
    }

    public static void log(Level logLevel, Exception ex) {
        FMLLog.log(logLevel, ex, "%s");
    }

    public static void i(Object object) {
        log(Level.INFO, String.valueOf(object));
    }

    public static void i(Exception ex) {
        log(Level.INFO, ex);
    }
}
