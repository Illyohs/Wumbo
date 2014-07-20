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
 * Class created on Jul 8, 2014 at 9:16:14 PM
 * 
 */
package us.illyohs.wumbo.common.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block guildCore;
	public static Block guildChest;

	public static void init() {

		guildCore = new BlockGuildCore();
		guildChest = new BlockGuildChest();


		gameReg();
	}

	private static void gameReg() {

		GameRegistry.registerBlock(guildCore, "guildCore");
		GameRegistry.registerBlock(guildChest, "guildChest");

	}

}
