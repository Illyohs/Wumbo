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
 * Class created on Jul 15, 2014 at 7:40:44 PM
 * 
 */
package us.illyohs.wumbo.common.block;

import us.illyohs.wumbo.common.tile.TileGuildCore;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGuildCore extends Block implements ITileEntityProvider {

	public BlockGuildCore() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setBlockName("Bloop");
		
	}
	
	@Override
    public boolean renderAsNormalBlock() {
        return false;

    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileGuildCore();
	}

}
