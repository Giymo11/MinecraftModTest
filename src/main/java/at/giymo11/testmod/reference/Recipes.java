package at.giymo11.testmod.reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Giymo11 on 19.08.2014.
 */
public class Recipes {
    public static void registerRecipes() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
        //add all wools
        for(int meta = 0; meta < 16; ++meta) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.austrianFlag), new ItemStack(Items.mapleLeaf), new ItemStack(Item.getItemFromBlock(net.minecraft.init.Blocks.wool), 0, meta)));
        }
    }
}
