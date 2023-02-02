package net.uzee.kenacraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.uzee.kenacraft.KenaCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KenaCraft.MOD_ID);

    // Create an item called "_" (must be all lowercase)
    // Supplier creates new item ( () -> new... )
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KENA_TAB)));

    // Register items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
