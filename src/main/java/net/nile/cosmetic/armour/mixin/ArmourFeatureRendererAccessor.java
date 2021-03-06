package net.nile.cosmetic.armour.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.fabricmc.api.EnvType;

import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
@Mixin(ArmorFeatureRenderer.class)
public interface ArmourFeatureRendererAccessor {
    @Invoker("renderArmor")
    public void nileRenderArmour(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, LivingEntity entity, EquipmentSlot equipmentSlot, int i, BipedEntityModel model);

    @Invoker("getArmor")
    public BipedEntityModel nileGetArmour(EquipmentSlot slot);
}
