package de.farmworld_by_tonihenkel;

import de.farmworld_by_tonihenkel.registry.ModBlocks;
import de.farmworld_by_tonihenkel.registry.ModCreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "farmworld_by_tonihenkel";

    public Main(FMLJavaModLoadingContext context) {
        var bus = context.getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
        ModCreativeTabs.CREATIVE_TABS.register(bus); // <-- DAS ist wichtig
    }
}
