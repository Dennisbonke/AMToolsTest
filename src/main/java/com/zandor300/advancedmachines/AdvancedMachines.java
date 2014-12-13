package com.zandor300.advancedmachines;

import com.zandor300.advancedmachines.blocks.OreBlock;
import com.zandor300.advancedmachines.items.DBItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = AdvancedMachines.modid, version = AdvancedMachines.version, name = AdvancedMachines.name, modLanguage = "java", canBeDeactivated = false)
public class AdvancedMachines {
    public static final String modid = "advancedmachines";
    public static final String version = "Alpha v0.1";
    public static final String name = "Advanced Machines";

    public static CreativeTabs advancedmachinesTab;

    public static Item itemCopperIngot;
    public static Item itemSilverIngot;
    public static Item itemTinIngot;
    public static Item itemLeadIngot;
    public static Block oreCopperOre;
    public static Block oreTinOre;
    public static Block oreLeadOre;
    public static Block oreSilverOre;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){

        advancedmachinesTab = new CreativeTabs("advancedmachines") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(AdvancedMachines.oreCopperOre);
            }
        };

        oreCopperOre = new OreBlock(Material.rock).setBlockName("CopperOre");
        oreTinOre = new OreBlock(Material.rock).setBlockName("TinOre");
        oreLeadOre = new OreBlock(Material.rock).setBlockName("LeadOre");
        oreSilverOre = new OreBlock(Material.rock).setBlockName("SilverOre");

        itemCopperIngot = new DBItems().setUnlocalizedName("CopperIngot");
        itemTinIngot = new DBItems().setUnlocalizedName("TinIngot");
        itemSilverIngot = new DBItems().setUnlocalizedName("SilverIngot");
        itemLeadIngot = new DBItems().setUnlocalizedName("LeadIngot");

        GameRegistry.registerBlock(oreCopperOre, "CopperOre");
        GameRegistry.registerBlock(oreTinOre, "TinOre");
        GameRegistry.registerBlock(oreLeadOre, "LeadOre");
        GameRegistry.registerBlock(oreSilverOre, "SilverOre");
        GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
        GameRegistry.registerItem(itemTinIngot, "TinIngot");
        GameRegistry.registerItem(itemSilverIngot, "SilverIngot");
        GameRegistry.registerItem(itemLeadIngot, "LeadIngot");
    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }
}
