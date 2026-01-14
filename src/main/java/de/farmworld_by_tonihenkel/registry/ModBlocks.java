package de.farmworld_by_tonihenkel.registry;

import de.farmworld_by_tonihenkel.Main;
import de.farmworld_by_tonihenkel.block.MysteriousPortalCrystalBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public final class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    // =========================================================
    // STONE
    // =========================================================
    public static final RegistryObject<Block> MYSTERIOUS_PORTAL_STONE =
            BLOCKS.register("mysterious_portal_stone", () ->
                    new Block(BlockBehaviour.Properties.of()
                            .strength(3.0f, 6.0f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
                    )
            );

    public static final RegistryObject<Item> MYSTERIOUS_PORTAL_STONE_ITEM =
            ITEMS.register("mysterious_portal_stone", () ->
                    new BlockItem(MYSTERIOUS_PORTAL_STONE.get(), new Item.Properties()) {
                        @Override
                        public void appendHoverText(
                                ItemStack stack,
                                Item.TooltipContext context,
                                List<Component> tooltip,
                                TooltipFlag flag
                        ) {
                            super.appendHoverText(stack, context, tooltip, flag);
                            tooltip.add(Component.translatable(
                                    "tooltip.farmworld_by_tonihenkel.mysterious_portal_stone"
                            ));
                        }
                    }
            );

    // =========================================================
    // ORE
    // =========================================================
    public static final RegistryObject<Block> MYSTERIOUS_PORTAL_ORE =
            BLOCKS.register("mysterious_portal_ore", () ->
                    new Block(BlockBehaviour.Properties.of()
                            .strength(3.0f, 6.0f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
                    )
            );

    public static final RegistryObject<Item> MYSTERIOUS_PORTAL_ORE_ITEM =
            ITEMS.register("mysterious_portal_ore", () ->
                    new BlockItem(MYSTERIOUS_PORTAL_ORE.get(), new Item.Properties()) {
                        @Override
                        public void appendHoverText(
                                ItemStack stack,
                                Item.TooltipContext context,
                                List<Component> tooltip,
                                TooltipFlag flag
                        ) {
                            super.appendHoverText(stack, context, tooltip, flag);
                            tooltip.add(Component.translatable(
                                    "tooltip.farmworld_by_tonihenkel.mysterious_portal_ore"
                            ));
                        }
                    }
            );

    // =========================================================
    // CRYSTAL BLOCK (Cluster)
    // =========================================================
    public static final RegistryObject<Block> MYSTERIOUS_PORTAL_CRYSTAL_BLOCK =
            BLOCKS.register("mysterious_portal_crystal_block", () ->
                    new MysteriousPortalCrystalBlock(BlockBehaviour.Properties.of()
                            .strength(1.5f, 3.0f)
                            .sound(SoundType.AMETHYST)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
                            .lightLevel(state -> 7)
                    )
            );

    public static final RegistryObject<Item> MYSTERIOUS_PORTAL_CRYSTAL_BLOCK_ITEM =
            ITEMS.register("mysterious_portal_crystal_block", () ->
                    new BlockItem(MYSTERIOUS_PORTAL_CRYSTAL_BLOCK.get(), new Item.Properties()) {
                        @Override
                        public void appendHoverText(
                                ItemStack stack,
                                Item.TooltipContext context,
                                List<Component> tooltip,
                                TooltipFlag flag
                        ) {
                            super.appendHoverText(stack, context, tooltip, flag);
                            tooltip.add(Component.translatable(
                                    "tooltip.farmworld_by_tonihenkel.mysterious_portal_crystal_block"
                            ));
                        }
                    }
            );

    private ModBlocks() {}
}
