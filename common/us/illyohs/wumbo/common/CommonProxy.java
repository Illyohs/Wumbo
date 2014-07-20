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
 * Class created on Jul 15, 2014 at 6:57:33 PM
 * 
 */
package us.illyohs.wumbo.common;

import us.illyohs.wumbo.common.lib.IProxy;
import us.illyohs.wumbo.common.tile.TileGuildCore;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IProxy{

	@Override
	public void renderModels() {} //NO-OP

	@Override
	public void registerTileEntitys() {
		GameRegistry.registerTileEntity(TileGuildCore.class, "tileguildcore");
	}

	@Override
	public void renderKeyBinding() {}

}
