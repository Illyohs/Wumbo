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
 * Class created on Jul 8, 2014 at 9:28:34 PM
 * 
 */
package us.illyohs.wumbo.common.item;

import us.illyohs.wumbo.common.lib.LibInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item guildTicket;

	public static void init() {
		
		guildTicket = new ItemGuildTicket();
		
		gameReg();
	}

	private static void gameReg() {
		GameRegistry.registerItem(guildTicket, LibInfo.MOD_ID+ "GuildTicket");
		
	}

}
