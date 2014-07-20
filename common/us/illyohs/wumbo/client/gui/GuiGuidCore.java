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
 * Class created on Jul 19, 2014 at 1:42:45 AM
 * 
 */
package us.illyohs.wumbo.client.gui;

import net.minecraft.client.gui.GuiScreen;

public class GuiGuidCore extends GuiScreen {
	
	int xSize = 180;
    int ySize = 160;
    int left, top;

//    private static final ResourceLocation TEXTURE = new ResourceLocation(LibAssets.CIVILTOME);

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {

    }

    public boolean doesGuiPauseGame() {
        return false;
    }

}