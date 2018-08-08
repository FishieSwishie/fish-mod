package com.matt.fishoverload;

import com.matt.fishoverload.proxy.CommonProxy;
import com.matt.fishoverload.util.Reference;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@net.minecraftforge.fml.common.Mod(modid = Reference.MOD_ID, name = Reference.Name, version = Reference.Version)
public class Main {
	
	
	
	
	@
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
	}
	@EventHandler
	public static void PreInit(FMLInitializationEvent event) {
	}
	@EventHandler
	public static void PreInit(FMLPostInitializationEvent event) {
	}
}
