// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart tail;
	private final ModelPart Backpacks;

	public Modelcustom_model(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.tail = root.getChild("tail");
		this.Backpacks = root.getChild("Backpacks");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 15)
						.addBox(-1.0F, 2.0F, -8.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 16.5F, -3.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 4.0F, -3.5F, 6.0F, 11.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, -6.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(27, 30).addBox(
				1.999F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 17.5F, 7.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(29, 21).addBox(
				2.001F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 17.5F, 7.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(27, 30).addBox(
				1.999F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 17.5F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(29, 21).addBox(
				2.001F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 17.5F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(25, 0).addBox(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 17.0F, 9.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Backpacks = partdefinition.addOrReplaceChild("Backpacks",
				CubeListBuilder.create().texOffs(8, 49)
						.addBox(-4.0F, -11.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 36)
						.addBox(3.0F, -10.5F, 1.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(9, 36)
						.addBox(-5.0F, -10.5F, 1.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 43)
						.addBox(4.5F, -10.25F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 43)
						.addBox(-5.5F, -10.25F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Backpacks.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}