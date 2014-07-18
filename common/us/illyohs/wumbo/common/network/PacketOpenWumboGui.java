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
 * Class created on Jul 17, 2014 at 11:35:51 PM
 * 
 */
package us.illyohs.wumbo.common.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import us.illyohs.wumbo.Wumbo;
import us.illyohs.wumbo.client.gui.GuiId;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class PacketOpenWumboGui implements IMessage, IMessageHandler<PacketOpenWumboGui, IMessage> {
	
	public PacketOpenWumboGui() {}
	
	public PacketOpenWumboGui(EntityPlayer player){}

	@Override
	public void fromBytes(ByteBuf buf) {}

	@Override
	public void toBytes(ByteBuf buf) {}

	@Override
	public IMessage onMessage(PacketOpenWumboGui message, MessageContext ctx) {
		ctx.getServerHandler().playerEntity.openGui(Wumbo.instance, GuiId.WUMBO_CHAT, ctx.getServerHandler().playerEntity.worldObj, (int)ctx.getServerHandler().playerEntity.posX, (int)ctx.getServerHandler().playerEntity.posY, (int)ctx.getServerHandler().playerEntity.posZ);
		System.out.print("foo\n");
//		ctx.N
		return null;
	}

}
