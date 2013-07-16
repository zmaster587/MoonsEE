package moonee.ee.network;

import moonee.ee.blocks.ContainerAlchChest;
import moonee.ee.blocks.GuiAlchChest;
import moonee.ee.blocks.TileEntityAlchChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
        //returns an instance of the Container you made earlier
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityAlchChest){
                        return new ContainerAlchChest(player.inventory, (TileEntityAlchChest) tileEntity);
                }
                return null;
        }

        //returns an instance of the Gui you made earlier
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityAlchChest){
                        return new GuiAlchChest(player.inventory, (TileEntityAlchChest) tileEntity);
                }
                return null;

        }
}