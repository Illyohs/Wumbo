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
 * Class created on Jul 8, 2014 at 9:30:48 PM
 * 
 */
package us.illyohs.wumbo.common.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.illyohs.wumbo.common.lib.LibInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemGuildTicket extends Item {
	
	public ItemGuildTicket() {
		super();
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setUnlocalizedName(LibInfo.MOD_ID +":guildtecket");
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		itemIcon =reg.registerIcon(LibInfo.MOD_ID + "guildticket");
	}
	
	
	@Override
	public void onCreated(ItemStack is, World world, EntityPlayer player) {
		is.stackTagCompound = new NBTTagCompound();
		is.stackTagCompound.setString("master", player.getDisplayName());
		is.stackTagCompound.setString("guild", "");
		
	}
}
