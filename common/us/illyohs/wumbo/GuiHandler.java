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
 * Class created on Jul 18, 2014 at 12:55:51 AM
 * 
 */
package us.illyohs.wumbo;

import us.illyohs.wumbo.client.gui.GuiId;
import us.illyohs.wumbo.client.gui.GuiWumboChat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
//		if(id == GuiId.WUMBO_CHAT) {
//			return
//		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		if(id == GuiId.WUMBO_CHAT) {
			return new GuiWumboChat();
		}
		return null;
	}

}
