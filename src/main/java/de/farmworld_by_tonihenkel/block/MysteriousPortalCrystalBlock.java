package de.farmworld_by_tonihenkel.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MysteriousPortalCrystalBlock extends Block {

    /**
     * Selection / Outline (was du siehst & anklickst)
     * -> kristallig, nicht full block
     */
    private static final VoxelShape OUTLINE =
            Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);

    /**
     * Kollision (woran der Spieler hängenbleibt)
     * -> etwas kleiner als Outline, fühlt sich "organisch" an
     */
    private static final VoxelShape COLLISION =
            Block.box(3.0D, 0.0D, 3.0D, 13.0D, 12.0D, 13.0D);

    public MysteriousPortalCrystalBlock(Properties properties) {
        super(properties);
    }

    /**
     * Hitbox / Selection
     */
    @Override
    public VoxelShape getShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            CollisionContext context
    ) {
        return OUTLINE;
    }

    /**
     * Echte Kollision
     */
    @Override
    public VoxelShape getCollisionShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            CollisionContext context
    ) {
        return COLLISION;
    }

    /**
     * Keine Vollblock-Occlusion (wichtig für Licht & Nachbarblöcke)
     */
    @Override
    public VoxelShape getOcclusionShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos
    ) {
        return Shapes.empty();
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return false;
    }

    @Override
    public boolean isCollisionShapeFullBlock(
            BlockState state,
            BlockGetter level,
            BlockPos pos
    ) {
        return false;
    }

    @Override
    public boolean isOcclusionShapeFullBlock(
            BlockState state,
            BlockGetter level,
            BlockPos pos
    ) {
        return false;
    }
}
