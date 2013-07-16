package moonee.ee.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRM extends Block {


	public BlockRM(int par1, int par2) {
		super(par1, par2, Material.wood);
		
	}

	public String getTextureFile()
    {
            return "/moonee/ee/art/sprites/eqexterra.png";
    }

}
