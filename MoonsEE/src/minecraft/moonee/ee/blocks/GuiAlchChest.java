package moonee.ee.blocks;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiAlchChest extends GuiContainer {

        public GuiAlchChest (InventoryPlayer inventoryPlayer,
                        TileEntityAlchChest tileEntity) {
                //the container is instanciated and passed to the superclass for handling
                super(new ContainerAlchChest(inventoryPlayer, tileEntity));
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                        int par3) {
                //draw your Gui here, only thing you need to change is the path
                int texture = mc.renderEngine.getTexture("/moonee/ee/art/gui/alchest.png");
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.mc.renderEngine.bindTexture(texture);
                this.xSize = 255;
                this.ySize = 230;
                int x = (width - xSize) / 2;
                int y = (height - ySize) / 2;
                this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
        }

}