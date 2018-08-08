package com.matt.fishoverload;

import com.matt.fishoverload.proxy.CommonProxy;
import com.matt.fishoverload.util.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.Name, version = Reference.Version)
public class Main {
	
	
	
	
	@cpw.mods.fml.common.Mod.Instance
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
