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
 * Class created on Jul 15, 2014 at 8:14:06 PM
 * 
 */
package us.illyohs.wumbo.client.render;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import us.illyohs.wumbo.client.models.ModelGuildCore;
import us.illyohs.wumbo.common.lib.LibInfo;
import us.illyohs.wumbo.common.tile.TileGuildCore;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderGuildCore extends TileEntitySpecialRenderer{

	private ModelGuildCore model;
	
	public RenderGuildCore() {
		model = new ModelGuildCore();
	}
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(LibInfo.MOD_ID, "textures/models/woodslate.png");
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float tick) {
		TileGuildCore tgc = (TileGuildCore) tile;
		
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5, (float)y + 1.5, (float)z + 2.5);
        GL11.glScalef(1F, -1F, -1F);
        
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE);
        model.render(.0625F);
        GL11.glScalef(1F, -1F, -1F);
        GL11.glBlendFunc(0, 1);
        GL11.glClearColor(0.7f, 0.7f, 0.7f, 1.0f);
        
        GL11.glPopMatrix();
		
	}

}
