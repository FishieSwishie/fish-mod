package com.matt.fishoverload.util.handlers;

import com.matt.fishoverload.init.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandle {
@SubscribeEvent
public static void onItemRegister(Register<Item> event) {

event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

}
}

