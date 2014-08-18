package at.giymo11.testmod.block;

import at.giymo11.testmod.reference.Info;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Giymo11 on 19.08.2014.
 */
public class BaseBlock extends Block {
    protected BaseBlock(Material material) {
        super(material);
    }

    @Override
    public Block setBlockName(String name) {
        return super.setBlockName(Info.ID + ":" + name);
    }

    @Override
    public Block setBlockTextureName(String name) {
        return super.setBlockTextureName(Info.ID + ":" + name);
    }
}
