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

import us.illyohs.wumbo.common.lib.LibInfo;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {
	
	public static ResourceLocation getResourceLocation(String modid, String path) {
		return new ResourceLocation(modid, path);
	}

	public static ResourceLocation getResourceLocation(String path) {
		return getResourceLocation(LibInfo.MOD_ID.toLowerCase(),  path);
	}

}
