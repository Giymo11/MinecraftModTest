package at.giymo11.testmod.reference;

import at.giymo11.testmod.block.AustrianFlag;
import at.giymo11.testmod.block.BaseBlock;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Giymo11 on 19.08.2014.
 */
public class Blocks {

    public class Names {
        public static final String austrianFlag = "austrianFlag";
    }

    public static BaseBlock austrianFlag = new AustrianFlag();

    public static void registerBlocks() {
        GameRegistry.registerBlock(austrianFlag, Names.austrianFlag);
    }
}
