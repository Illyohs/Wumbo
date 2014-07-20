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
 * Class created on Jul 15, 2014 at 8:49:20 PM
 * 
 */
package us.illyohs.wumbo.common.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import us.illyohs.wumbo.common.tile.TileGuildChest;

public class BlockGuildChest extends BlockContainer {

	public BlockGuildChest() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBrewing);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileGuildChest();
	}

}
