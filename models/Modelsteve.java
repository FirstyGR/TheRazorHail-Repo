// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer leftear;
	private final ModelRenderer rightear;
	private final ModelRenderer bb_main;

	public Modelsteve() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-8.0F, -40.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(32, 32).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(80, 32).addBox(-11.0F, -26.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(64, 96).addBox(3.0F, -26.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 32).addBox(-6.0F, -12.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(32, 96).addBox(-2.0F, -12.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, 24.0F, 0.0F);

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightear.setTextureOffset(117, 11).addBox(-8.0F, -67.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(120, 49).addBox(-5.0F, -67.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(118, 65).addBox(-5.0F, -66.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		rightear.setTextureOffset(115, 4).addBox(-7.0F, -67.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		rightear.setTextureOffset(116, 33).addBox(-7.0F, -68.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(118, 19).addBox(-6.0F, -69.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		rightear.setTextureOffset(120, 54).addBox(4.0F, -66.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(116, 47).addBox(7.0F, -67.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(116, 52).addBox(5.0F, -68.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(119, 51).addBox(5.0F, -67.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(114, 10).addBox(5.0F, -69.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(115, 28).addBox(4.0F, -67.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(117, 30).addBox(3.0F, -66.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 87).addBox(-4.0F, -66.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftear.render(matrixStack, buffer, packedLight, packedOverlay);
		rightear.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}