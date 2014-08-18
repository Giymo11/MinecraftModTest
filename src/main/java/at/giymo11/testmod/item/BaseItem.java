package at.giymo11.testmod.item;

import at.giymo11.testmod.reference.Info;
import at.giymo11.testmod.reference.MyCreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Giymo11 on 18.08.2014.
 */
public abstract class BaseItem extends Item {

    public BaseItem() {
        super();
        setCreativeTab(MyCreativeTabs.testModTab);
    }

    @Override
    public Item setUnlocalizedName(String name) {
        return super.setUnlocalizedName(Info.ID + ":" + name);
    }

    @Override
    public Item setTextureName(String name) {
        // adds the id so forge knows where to look
        return super.setTextureName(Info.ID + ":" + name);
    }


}
