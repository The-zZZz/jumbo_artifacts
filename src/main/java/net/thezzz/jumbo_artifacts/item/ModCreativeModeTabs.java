package net.thezzz.jumbo_artifacts.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thezzz.jumbo_artifacts.JumboArtifacts;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JumboArtifacts.MODID);

    public static final RegistryObject<CreativeModeTab> JUMBOARTIFACTS_TAB = CREATIVE_MODE_TABS.register("jumboartifacts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.WADING_BOOTS.get()))
                    .title(Component.translatable("mod_name"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.WADING_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
