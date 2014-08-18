package at.giymo11.testmod.block;

import at.giymo11.testmod.reference.Blocks;
import net.minecraft.block.material.Material;

/**
 * Created by Giymo11 on 19.08.2014.
 */
public class AustrianFlag extends BaseBlock {
    public AustrianFlag() {
        super(Material.cloth);
        setBlockName(Blocks.Names.austrianFlag);
        setBlockTextureName(Blocks.Names.austrianFlag);
    }
}
