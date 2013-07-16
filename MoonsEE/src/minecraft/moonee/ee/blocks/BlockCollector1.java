package moonee.ee.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCollector1 extends Block {


	public BlockCollector1(int par1, int par2) {
		super(par1, par2, Material.wood);
		
	}

	public String getTextureFile()
    {
            return "/moonee/ee/art/sprites/eqexterra.png";
    }
	
	 public int getBlockTextureFromSide(int par1)
	    {
	        return par1 == 0 ? this.blockIndexInTexture + 2 : (par1 == 1 ? this.blockIndexInTexture + 2 : this.blockIndexInTexture);
	    }

}
