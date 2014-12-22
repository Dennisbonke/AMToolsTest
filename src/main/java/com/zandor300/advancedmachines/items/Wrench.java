package com.zandor300.advancedmachines.items;

import com.zandor300.advancedmachines.AdvancedMachines;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class Wrench extends Item{

    public Wrench(){
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(AdvancedMachines.advancedmachinesTab);
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(AdvancedMachines.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
