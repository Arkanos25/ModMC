package fr.arkanos.nexus.blocks;

import fr.arkanos.nexus.blockentity.BlockEntityBEBlock;
import fr.arkanos.nexus.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BlockBEBlock extends Block implements BlockEntityProvider {

    public BlockBEBlock() {
        super(Settings.copy(ModBlocks.TEST_BLOCK));
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new BlockEntityBEBlock();
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if (world.getBlockEntity(pos) instanceof BlockEntityBEBlock){

            BlockEntityBEBlock be = (BlockEntityBEBlock) world.getBlockEntity(pos);
            player.sendMessage(new LiteralText("counter : " + be.getCounter()), true);
            return ActionResult.SUCCESS;


        }


        return ActionResult.PASS;
    }
}
