package at.giymo11.testmod.reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created by Giymo11 on 19.08.2014.
 */
public class Recipes {
    public static void registerRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(Items.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(net.minecraft.init.Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.austrianFlag), new ItemStack(Items.mapleLeaf), new ItemStack(net.minecraft.init.Blocks.wool));
    }
}
