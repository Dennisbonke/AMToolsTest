package com.zandor300.advancedmachines.blocks;

import com.zandor300.advancedmachines.AdvancedMachines;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class LeadBlock extends Block{
    public LeadBlock(Material material) {
        super(material);

        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(AdvancedMachines.advancedmachinesTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(AdvancedMachines.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
