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
 * Class created on Jul 17, 2014 at 11:44:54 PM
 * 
 */
package us.illyohs.wumbo.client.gui;

import net.minecraft.client.gui.GuiScreen;

public class GuiWumboChat extends GuiScreen {
	
	@Override
	public void initGui() {
		super.initGui();
	}

	@Override
	public void drawScreen(int par1, int par2, float par3) {
		drawDefaultBackground();
		drawRect(2, this.height - 14, this.width - 2, this.height - 2, Integer.MIN_VALUE);
		System.out.print("Bloop\n");
	}

	public boolean doesGuiPauseGame() {
		return false;
	}


}
