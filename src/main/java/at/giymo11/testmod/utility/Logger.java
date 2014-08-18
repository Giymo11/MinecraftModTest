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

    public static void d(Object object) {
        log(Level.DEBUG, String.valueOf(object));
    }

    public static void d(Exception ex) {
        log(Level.DEBUG, ex);
    }
}
