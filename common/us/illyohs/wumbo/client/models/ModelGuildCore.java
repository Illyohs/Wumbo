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
 * Class created on Jul 15, 2014 at 7:07:21 PM
 * 
 */
package us.illyohs.wumbo.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelGuildCore extends ModelBase {
	
	ModelRenderer Base;
	
	public ModelGuildCore() {
		
		textureWidth = 128;
		textureHeight = 128;
		
		Base = new ModelRenderer(this, 0, 0);
		Base.addBox(-8f, 0f, -8f, 48, 1, 48);
		Base.setRotationPoint(0f, 23f, 0);
		setRotation(Base, 0f, 0f, 0f);
	}
	
	public void render(float f) {
		Base.render(f);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
		
	}

}
