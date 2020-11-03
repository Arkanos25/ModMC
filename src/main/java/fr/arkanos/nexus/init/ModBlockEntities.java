package fr.arkanos.nexus.init;

import fr.arkanos.nexus.blockentity.BlockEntityBEBlock;
import fr.arkanos.nexus.utils.Utils;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ModBlockEntities {

    private ModBlockEntities(){

    }

    public static final ModBlockEntities INSTANCE = new ModBlockEntities();

    public BlockEntityType<?> BLOCK_ENTITY_BE;

    public void registerAll(){
        BLOCK_ENTITY_BE = registerBlockEntity(BlockEntityBEBlock::new, "block_entity_be");

    }

    private BlockEntityType<?> registerBlockEntity(Supplier<? extends BlockEntity> bE, String name){
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Utils.MODID, name), BlockEntityType.Builder.create(bE, ModBlocks.BE_BLOCK).build(null));
    }

}
