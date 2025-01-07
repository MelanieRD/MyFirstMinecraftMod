package com.melanie.myFirstMod.item;

import com.melanie.myFirstMod.MyFirstMOD;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

// DeferredRegister its like a list
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMOD.MOD_ID);

    public static final RegistryObject<Item> MELYNUT = ITEMS.register("melynut", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MELYNUT_RAW = ITEMS.register("melynut_raw", ()-> new Item(new Item.Properties()));
    //Telling forge this is our DeferredRegister for our mod


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
