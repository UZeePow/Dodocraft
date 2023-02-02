package net.uzee.kenacraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    // Create a new tab with the specified icon
    public static final CreativeModeTab KENA_TAB = new CreativeModeTab("kenatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CRYSTAL.get());
        }
    };
}
