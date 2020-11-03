package fr.arkanos.nexus;

import fr.arkanos.nexus.init.ModBlockEntities;
import fr.arkanos.nexus.init.ModBlocks;
import fr.arkanos.nexus.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class NEXUS implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.registerAll();
        ModBlocks.INSTANCE.registerAll();
        ModBlockEntities.INSTANCE.registerAll();

    }
}
