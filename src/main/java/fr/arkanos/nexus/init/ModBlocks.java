package fr.arkanos.nexus.init;

import fr.arkanos.nexus.blocks.BlockBEBlock;
import fr.arkanos.nexus.utils.Utils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(0f, 15f));
    public static final Block BE_BLOCK = new BlockBEBlock();


    public void registerAll(){
        register(TEST_BLOCK, new Identifier(Utils.MODID, "test_block"));
        register(BE_BLOCK, new Identifier(Utils.MODID, "be_block"));

    }

    private void register(Block block, Identifier name){
        Registry.register(Registry.BLOCK, name, block);
        createBlockItem(block, name);
    }

    private void createBlockItem(Block block, Identifier name){
        Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }


}
