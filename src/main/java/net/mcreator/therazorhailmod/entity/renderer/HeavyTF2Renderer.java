package net.mcreator.therazorhailmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.therazorhailmod.entity.HeavyTF2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HeavyTF2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HeavyTF2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelIronGolemModel(), 2.6f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("therazorhail_mod:textures/iron_golem.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelIronGolemModel extends EntityModel<Entity> {
		private final ModelRenderer field_78176_b;
		private final ModelRenderer field_78174_d;
		private final ModelRenderer field_78177_c;
		private final ModelRenderer field_78175_e;
		private final ModelRenderer field_78178_a;
		private final ModelRenderer field_78173_f;
		private final ModelRenderer mid_section;
		public ModelIronGolemModel() {
			textureWidth = 128;
			textureHeight = 128;
			field_78176_b = new ModelRenderer(this);
			field_78176_b.setRotationPoint(0.0F, -7.0F, 0.0F);
			field_78176_b.setTextureOffset(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F, false);
			field_78174_d = new ModelRenderer(this);
			field_78174_d.setRotationPoint(0.0F, -7.0F, 0.0F);
			field_78174_d.setTextureOffset(60, 58).addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);
			field_78177_c = new ModelRenderer(this);
			field_78177_c.setRotationPoint(0.0F, -7.0F, 0.0F);
			field_78177_c.setTextureOffset(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);
			field_78175_e = new ModelRenderer(this);
			field_78175_e.setRotationPoint(-4.0F, 11.0F, 0.0F);
			field_78175_e.setTextureOffset(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			field_78178_a = new ModelRenderer(this);
			field_78178_a.setRotationPoint(0.0F, -7.0F, -2.0F);
			field_78178_a.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			field_78173_f = new ModelRenderer(this);
			field_78173_f.setRotationPoint(5.0F, 11.0F, 0.0F);
			field_78173_f.setTextureOffset(60, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, true);
			mid_section = new ModelRenderer(this);
			mid_section.setRotationPoint(0.0F, 24.0F, 0.0F);
			mid_section.setTextureOffset(40, 4).addBox(-5.0F, -21.0F, -4.0F, 10.0F, 5.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			field_78176_b.render(matrixStack, buffer, packedLight, packedOverlay);
			field_78174_d.render(matrixStack, buffer, packedLight, packedOverlay);
			field_78177_c.render(matrixStack, buffer, packedLight, packedOverlay);
			field_78175_e.render(matrixStack, buffer, packedLight, packedOverlay);
			field_78178_a.render(matrixStack, buffer, packedLight, packedOverlay);
			field_78173_f.render(matrixStack, buffer, packedLight, packedOverlay);
			mid_section.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
