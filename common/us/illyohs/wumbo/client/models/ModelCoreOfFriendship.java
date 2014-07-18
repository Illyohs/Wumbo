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
 * Class created on Jul 18, 2014 at 3:49:28 PM
 * 
 */
package us.illyohs.wumbo.client.models;

import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import us.illyohs.wumbo.common.lib.LibModels;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelCoreOfFriendship {
	
	private IModelCustom modelOfFriendship;
	
	public ModelCoreOfFriendship() {
		modelOfFriendship = AdvancedModelLoader.loadModel(LibModels.COREOFFRIENDSHIP);
	}
	
	public void render(){
		modelOfFriendship.renderAll();
		
	}
}
