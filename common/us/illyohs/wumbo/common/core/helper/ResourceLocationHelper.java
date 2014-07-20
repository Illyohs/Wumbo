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
 * Class created on Jul 18, 2014 at 3:58:58 PM
 * 
 */
package us.illyohs.wumbo.common.core.helper;

import net.minecraft.util.ResourceLocation;
import us.illyohs.wumbo.common.lib.LibInfo;

public class ResourceLocationHelper {
	
	public static ResourceLocation getResourceLocation(String modid, String path) {
		return new ResourceLocation(modid, path);
	}
	
	public static ResourceLocation getOBJAsset(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(), "models/" + path + ".obj");
	}
	
	public static ResourceLocation getGUIAsset(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(), "textures/gui/" + path + ".png");
	}
	
	public static ResourceLocation getModelAsset(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(), "textures/models/" + path + ".png");
	}

}
