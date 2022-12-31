package com.eitan07.coolmod.items;

import com.eitan07.coolmod.CoolMod;
import com.eitan07.coolmod.etc.CreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoolMod.MODID);

    public static RegistryObject<Item> WEED = ITEMS.register("weed", () -> new Item(new Item.Properties().tab(CreativeTab.CREATIVE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
