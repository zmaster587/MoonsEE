package moonee.ee.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerAlchChest extends Container {

	protected TileEntityAlchChest tileEntity;
	private int numRows;

    public ContainerAlchChest(IInventory par1IInventory, TileEntityAlchChest par2IInventory)
    {
        this.tileEntity = par2IInventory;
        this.numRows = par2IInventory.getSizeInventory() / 13; //devide by the number of columns
        par2IInventory.openChest();
        int var3 = (this.numRows - 4) * 26; //multiply by the number of columns x2
        int var4;
        int var5;
        //chest inventory
        for (var4 = 0; var4 < this.numRows; ++var4)
        {
        	//The number to the right of the "less then" is the number of columns
            for (var5 = 0; var5 < 13; ++var5)
            {
                this.addSlotToContainer(new Slot(par2IInventory, var5 + var4 * 13, //multiply par2 by the number of columns....again....
                		//par3 = xpos
                		//par4 = ypos 
                		8 + var5 * 18 - 35, //this is par3
                		18 + var4 * 18 - 45)); //this is par4
            }
        }
        // player inventory
        for (var4 = 0; var4 < 3; ++var4)
        {
            for (var5 = 0; var5 < 9; ++var5)
            {
                this.addSlotToContainer(new Slot(par1IInventory, var5 + var4 * 9 + 9, 8 + var5 * 18 + 1, 103 + var4 * 18 + var3 - 87));
            }
        }
        // Player HotBar Thingy
        for (var4 = 0; var4 < 9; ++var4)
        {
            this.addSlotToContainer(new Slot(par1IInventory, var4, 8 + var4 * 18 + 1, 161 + var3 - 87));
        }
    }

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntity.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		ItemStack stack = null;
		Slot slotObject = (Slot) inventorySlots.get(slot);

		// null checks and checks if the item can be stacked (maxStackSize > 1)
		if (slotObject != null && slotObject.getHasStack()) {
			ItemStack stackInSlot = slotObject.getStack();
			stack = stackInSlot.copy();

			// merges the item into player inventory since its in the tileEntity
			if (slot < 9) {
				if (!this.mergeItemStack(stackInSlot, 0, 35, true)) {
					return null;
				}
			}
			// places it into the tileEntity is possible since its in the player
			// inventory
			else if (!this.mergeItemStack(stackInSlot, 0, 9, false)) {
				return null;
			}

			if (stackInSlot.stackSize == 0) {
				slotObject.putStack(null);
			} else {
				slotObject.onSlotChanged();
			}

			if (stackInSlot.stackSize == stack.stackSize) {
				return null;
			}
			slotObject.onPickupFromSlot(player, stackInSlot);
		}
		return stack;
	}
}