/**
 * This class was created by Anthony Anderson(Lord Illyohs)
 * It is distributed as part of Wumbo
 * Source Code: https://github.com/LordIllyohs/Wumbo
 *
 * Wumbo is Open Source and distributed under a
 * Attribution-NonCommercial-ShareAlike 4.0 International.
 * (http://creativecommons.org/licenses/by-nc-sa/4.0/)
 *
 * 
 * Class created on Jul 17, 2014 at 11:09:48 PM
 * 
 */
package us.illyohs.wumbo.common.network;

import us.illyohs.wumbo.common.lib.LibInfo;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler {
	
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(LibInfo.MOD_ID.toLowerCase());
	
	public static void init() {
		
		INSTANCE.registerMessage(PacketOpenWumboGui.class, PacketOpenWumboGui.class, 0, Side.SERVER);
		
	}


}
