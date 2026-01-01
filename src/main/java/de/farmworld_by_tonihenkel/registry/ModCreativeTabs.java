package de.farmworld_by_tonihenkel.registry;

import de.farmworld_by_tonihenkel.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final RegistryObject<CreativeModeTab> FARMWORLD_TAB =
            CREATIVE_TABS.register("farmworld", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.farmworld_by_tonihenkel"))
                            .icon(() -> new ItemStack(ModBlocks.MYSTERIOUS_PORTAL_STONE_ITEM.get()))
                            .build()
            );

    @SubscribeEvent
    public static void buildTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == FARMWORLD_TAB.get()) {
            event.accept(ModBlocks.MYSTERIOUS_PORTAL_STONE_ITEM.get());
            event.accept(ModBlocks.MYSTERIOUS_PORTAL_ORE_ITEM.get());
            event.accept(ModBlocks.MYSTERIOUS_PORTAL_CRYSTAL_BLOCK_ITEM.get());
        }
    }

    private ModCreativeTabs() {}
}
