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
 * Class created on Jul 15, 2014 at 6:56:55 PM
 * 
 */
package us.illyohs.wumbo.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import us.illyohs.wumbo.client.render.RenderGuildCore;
import us.illyohs.wumbo.common.lib.IProxy;
import us.illyohs.wumbo.common.tile.TileGuildCore;

public class ClientProxy implements IProxy{

	@Override
	public void renderModels() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileGuildCore.class, new RenderGuildCore());
		
	}

	@Override
	public void registerTileEntitys() {} //NO-OP

}
