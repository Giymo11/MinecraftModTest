package at.giymo11.testmod.reference;

import at.giymo11.testmod.item.BaseItem;
import at.giymo11.testmod.item.MapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Giymo11 on 18.08.2014.
 */
@GameRegistry.ObjectHolder(Info.ID)
public class Items {

    public class Names {
        public static final String mapleLeaf = "mapleLeaf";
    }

    public static final BaseItem mapleLeaf = new MapleLeaf();

    public static void registerItems() {
        GameRegistry.registerItem(mapleLeaf, Names.mapleLeaf, Info.ID);
    }
}
