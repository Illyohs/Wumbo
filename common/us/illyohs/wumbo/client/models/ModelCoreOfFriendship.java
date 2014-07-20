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
import us.illyohs.wumbo.common.lib.LibAssets;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelCoreOfFriendship {
	
	private IModelCustom modelOfFriendship;
	
	public ModelCoreOfFriendship() {
		modelOfFriendship = AdvancedModelLoader.loadModel(LibAssets.OBJ_GUILD_CORE);
	}
	
	public void render() {
		modelOfFriendship.renderAll();

		
		
	}
	
	public void renderAll() {
		modelOfFriendship.renderAll();
	}
	
	public void render1() {
		modelOfFriendship.renderOnly("cube1");
	}

	public void render2() {
		modelOfFriendship.renderOnly("cube1", "cube6");
	}

	public void render3() {
		modelOfFriendship.renderOnly("cube1", "cube3", "cube6");
	}
	
	public void render4() {
		modelOfFriendship.renderOnly("cube1", "cube3", "cube6", "cube8");
	}

	public void render5() {
		modelOfFriendship.renderOnly("cube1", "cube3", "cube5",
				"cube6", "cube8");
	}
	
	public void render6() {
		modelOfFriendship.renderOnly("cube1", "cube2", "cube3",
				"cube5", "cube6", "cube8");
	}
	
	public void render7() {
		modelOfFriendship.renderOnly("cube1", "cube2", "cube3",
				"cube5", "cube6", "cube7", "cube8");
	}
	
	public void render8() {
		modelOfFriendship.renderOnly("cube1", "cube2", "cube3",
				"cube4", "cube5", "cube6", "cube7", "cube8");
	}
	
}
