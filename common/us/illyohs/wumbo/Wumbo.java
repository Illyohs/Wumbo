/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of Wumbo
 * Source Code: https://github.com/LordIllyohs/Wumbo
 *
 * Wumbo is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 4.0 International license.
 * (http://creativecommons.org/licenses/by-nc-sa/4.0/)
 *
 * 
 * Class created on Jul 8, 2014 at 8:52:37(hh:mm:ss) PM
 * 
 */
package us.illyohs.wumbo;

import us.illyohs.wumbo.common.block.ModBlocks;
import us.illyohs.wumbo.common.item.ModItems;
import us.illyohs.wumbo.common.lib.IProxy;
import us.illyohs.wumbo.common.lib.LibInfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid =LibInfo.MOD_ID, name = LibInfo.MOD_NAME, version = LibInfo.MOD_VERSION)
public class Wumbo {
	
	@Instance
	public static Wumbo instance;
	
	@SidedProxy(clientSide = LibInfo.CLIENT_PROXY, serverSide = LibInfo.COMMON_PROXY)
	public static IProxy proxy;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		proxy.registerTileEntitys();
		proxy.renderModels();
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}

}
