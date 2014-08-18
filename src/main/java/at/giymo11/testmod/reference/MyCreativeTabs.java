package at.giymo11.testmod.reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Giymo11 on 19.08.2014.
 */
public class MyCreativeTabs {
    public static final CreativeTabs testModTab = new CreativeTabs(Info.ID) {
        @Override
        public Item getTabIconItem() {
            return Items.mapleLeaf;
        }
    };
}
