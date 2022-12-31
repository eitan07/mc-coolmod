package com.eitan07.coolmod.etc;

import com.eitan07.coolmod.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("coolmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WEED.get());
        }
    };
}
