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
 * Class created on Jul 17, 2014 at 11:19:50 PM
 * 
 */
package us.illyohs.wumbo.common.core.handler;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.illyohs.wumbo.common.lib.LibInfo;
import us.illyohs.wumbo.common.network.PacketOpenWumboGui;
import us.illyohs.wumbo.common.network.PacketHandler;
import net.minecraft.client.settings.KeyBinding;

public class KeyHandler {
	
	public KeyBinding keyC = new KeyBinding(LibInfo.MOD_NAME +" Chat", Keyboard.KEY_C, "key.categories.chat");
	
	public KeyHandler() {
		ClientRegistry.registerKeyBinding(keyC);
	}
	
	@SideOnly(value=Side.CLIENT)
	@SubscribeEvent
	public void playerTick(PlayerTickEvent event) {
		if(event.side == Side.SERVER) return;
		if(event.phase == Phase.START) {
			if(keyC.getIsKeyPressed() && FMLClientHandler.instance().getClient().inGameHasFocus) {
				PacketHandler.INSTANCE.sendToServer(new PacketOpenWumboGui());
			}
		}

	}

}
