package com.infamous.dungeons_mobs.client.models.summonables;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.infamous.dungeons_mobs.entities.summonables.ConstructEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GeomancerConstructModel<T extends ConstructEntity> extends EntityModel<Entity> {
	private final ModelRenderer pillarModel;

	public GeomancerConstructModel() {
		textureWidth = 64;
		textureHeight = 64;

		pillarModel = new ModelRenderer(this);
		pillarModel.setRotationPoint(0.0F, 24.0F, 0.0F);
		pillarModel.setTextureOffset(0, 0).addBox(-7.0F, -48.0F - 20.0F, -7.0F, 14.0F, 50.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		pillarModel.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}