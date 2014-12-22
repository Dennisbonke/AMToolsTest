package com.zandor300.advancedmachines;

import com.zandor300.advancedmachines.blocks.*;
import com.zandor300.advancedmachines.items.DBItems;
import com.zandor300.advancedmachines.items.Wrench;
import com.zandor300.advancedmachines.worldgen.AMWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = AdvancedMachines.modid, version = AdvancedMachines.version, name = AdvancedMachines.name, modLanguage = "java", canBeDeactivated = false)
public class AdvancedMachines {
    //GeneralModInfo
    public static final String modid = "advancedmachines";
    public static final String version = "Alpha v0.1";
    public static final String name = "Advanced Machines";
    //WorldGen
    AMWorldGen eventWorldGen = new AMWorldGen();
    //CreativeTab
    public static CreativeTabs advancedmachinesTab;
    //Items
    //Ingots
    public static Item itemCopperIngot;
    public static Item itemSilverIngot;
    public static Item itemTinIngot;
    public static Item itemLeadIngot;
    //Gems
    public static Item itemTopaz;
    //Tools
    public static Item itemWrench;
    //Blocks
    //Ores
    public static Block oreCopperOre;
    public static Block oreTinOre;
    public static Block oreLeadOre;
    public static Block oreSilverOre;
    public static Block oreTopazOre;
    //StorageBlocks
    public static Block blockTinBlock;
    public static Block blockLeadBlock;
    public static Block blockSilverBlock;
    public static Block blockCopperBlock;
    public static Block blockTopazBlock;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //InitCreativeTab
        advancedmachinesTab = new CreativeTabs("advancedmachines") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(AdvancedMachines.oreCopperOre);
            }
        };
        //CreateStuff
        //Blocks
        //Ores
        oreCopperOre = new OreBlock(Material.rock).setBlockName("CopperOre");
        oreTinOre = new OreBlock(Material.rock).setBlockName("TinOre");
        oreLeadOre = new OreBlock(Material.rock).setBlockName("LeadOre");
        oreSilverOre = new OreBlock(Material.rock).setBlockName("SilverOre");
        oreTopazOre = new OreBlock(Material.rock).setBlockName("TopazOre");
        //StorageBlocks
        blockCopperBlock = new CopperBlock(Material.iron).setBlockName("CopperBlock");
        blockLeadBlock = new LeadBlock(Material.iron).setBlockName("LeadBlock");
        blockSilverBlock = new SilverBlock(Material.iron).setBlockName("SilverBlock");
        blockTinBlock = new TinBlock(Material.iron).setBlockName("TinBlock");
        blockTopazBlock = new TopazBlock(Material.iron).setBlockName("TopazBlock");
        //Items
        //Ingots
        itemCopperIngot = new DBItems().setUnlocalizedName("CopperIngot");
        itemTinIngot = new DBItems().setUnlocalizedName("TinIngot");
        itemSilverIngot = new DBItems().setUnlocalizedName("SilverIngot");
        itemLeadIngot = new DBItems().setUnlocalizedName("LeadIngot");
        //Gems
        itemTopaz = new DBItems().setUnlocalizedName("Topaz");
        //Tools
        itemWrench = new Wrench().setUnlocalizedName("Wrench");
        //RegisterStuff
        //Blocks
        //Ores
        GameRegistry.registerBlock(oreCopperOre, "CopperOre");
        GameRegistry.registerBlock(oreTinOre, "TinOre");
        GameRegistry.registerBlock(oreLeadOre, "LeadOre");
        GameRegistry.registerBlock(oreSilverOre, "SilverOre");
        GameRegistry.registerBlock(oreTopazOre, "TopazOre");
        //StorageBlocks
        GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");
        GameRegistry.registerBlock(blockLeadBlock, "LeadBlock");
        GameRegistry.registerBlock(blockSilverBlock, "SilverBlock");
        GameRegistry.registerBlock(blockTinBlock, "TinBlock");
        GameRegistry.registerBlock(blockTopazBlock, "TopazBlock");
        //Items
        //Ingots
        GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
        GameRegistry.registerItem(itemTinIngot, "TinIngot");
        GameRegistry.registerItem(itemSilverIngot, "SilverIngot");
        GameRegistry.registerItem(itemLeadIngot, "LeadIngot");
        //Gems
        GameRegistry.registerItem(itemTopaz, "Topaz");
        //Tools
        GameRegistry.registerItem(itemWrench, "Wrench");
        //WorldGen
        GameRegistry.registerWorldGenerator(eventWorldGen, 0);
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //Crafting
        //Shaped
        //StorageBlocks
        GameRegistry.addRecipe(new ItemStack(blockCopperBlock), new Object[]{"CCC", "CCC", "CCC", 'C', itemCopperIngot});
        GameRegistry.addRecipe(new ItemStack(blockLeadBlock), new Object[]{"LLL", "LLL", "LLL", 'L', itemLeadIngot});
        GameRegistry.addRecipe(new ItemStack(blockSilverBlock), new Object[]{"SSS", "SSS", "SSS", 'S', itemSilverIngot});
        GameRegistry.addRecipe(new ItemStack(blockTinBlock), new Object[]{"TTT", "TTT", "TTT", 'T', itemTinIngot});
        GameRegistry.addRecipe(new ItemStack(blockTopazBlock), new Object[]{"TTT", "TTT", "TTT", 'T', itemTopaz});
        //Tools
        GameRegistry.addRecipe(new ItemStack(itemWrench), new Object[]{"I I", "T", " I ", 'I', Items.iron_ingot, 'T', itemTinIngot});
        //Shapeless
        //StorageBlocks
        GameRegistry.addShapelessRecipe(new ItemStack(itemCopperIngot, 9), new Object[]{blockCopperBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(itemLeadIngot, 9), new Object[]{blockLeadBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(itemSilverIngot, 9), new Object[]{blockSilverBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(itemTinIngot, 9), new Object[]{blockTinBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(itemTopaz, 9), new Object[]{blockTopazBlock});
        //Smelting
        //Ingots
        GameRegistry.addSmelting(oreCopperOre, new ItemStack(itemCopperIngot), 0);
        GameRegistry.addSmelting(oreTinOre, new ItemStack(itemTinIngot), 0);
        GameRegistry.addSmelting(oreSilverOre, new ItemStack(itemSilverIngot), 0);
        GameRegistry.addSmelting(oreLeadOre, new ItemStack(itemLeadIngot), 0);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
