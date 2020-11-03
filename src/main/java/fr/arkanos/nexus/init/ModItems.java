package fr.arkanos.nexus.init;

import fr.arkanos.nexus.NEXUS;
import fr.arkanos.nexus.utils.Utils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TEST_INGOT = new Item(new Item.Settings());
    public static final Item TEST_STICK = new Item(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(16));

    public static void registerAll(){

        Registry.register(Registry.ITEM,new Identifier(Utils.MODID, "test_ingot"), TEST_INGOT);
        Registry.register(Registry.ITEM,new Identifier(Utils.MODID, "test_stick"), TEST_STICK);

    }

}
