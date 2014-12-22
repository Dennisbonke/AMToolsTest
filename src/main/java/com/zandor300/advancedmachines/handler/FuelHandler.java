package com.zandor300.advancedmachines.handler;

import com.zandor300.advancedmachines.AdvancedMachines;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler{

    @Override
    public int getBurnTime(ItemStack fuel) {

        if (fuel.getItem() == AdvancedMachines.itemCoalCoke) return 800;
        if (fuel.getItem() == AdvancedMachines.itemTreePitch) return 3200;

        return 0;
    }
}
