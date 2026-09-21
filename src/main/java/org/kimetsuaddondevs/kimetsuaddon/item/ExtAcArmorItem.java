package org.kimetsuaddondevs.kimetsuaddon.item;

import java.util.function.Supplier;
import org.kimetsuaddondevs.kimetsuaddon.ModMain;
import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ExtAcArmorItem extends ArmorItem {
    private Supplier<ExtModelAccessor> modelAccessorSupplier = null;
    private ExtModelAccessor modelAccessor = null;
    private String texture = null;

    public ExtAcArmorItem(IArmorMaterial armorMaterial, EquipmentSlotType equipmentSlotType,
            Properties properties) {
        super(armorMaterial, equipmentSlotType, properties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack,
            EquipmentSlotType armorSlot, A _default) {
        final ExtModelAccessor modelAccessor = getModelAccessor();
        if (modelAccessor != null) {
            BipedModel<?> armorModel = new BipedModel<>(1.0F);

            final ModelRenderer head = modelAccessor.extAccessHead();
            final ModelRenderer body = modelAccessor.extAccessBody();
            final ModelRenderer leftArm = modelAccessor.extAccessLeftArm();
            final ModelRenderer rightArm = modelAccessor.extAccessRightArm();
            final ModelRenderer leftLeg = modelAccessor.extAccessLeftLeg();
            final ModelRenderer rightLeg = modelAccessor.extAccessRightLeg();

            if (head != null)
                armorModel.head = head;
            if (body != null)
                armorModel.body = body;
            if (leftArm != null)
                armorModel.leftArm = leftArm;
            if (rightArm != null)
                armorModel.rightArm = rightArm;
            if (leftLeg != null)
                armorModel.leftLeg = leftLeg;
            if (rightLeg != null)
                armorModel.rightLeg = rightLeg;

            armorModel.crouching = entityLiving.isShiftKeyDown();
            armorModel.riding = _default.riding;
            armorModel.young = entityLiving.isBaby();

            return (A) armorModel;
        }
        return super.getArmorModel(entityLiving, itemStack, armorSlot, _default);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (texture != null) {
            return texture;
        }
        return super.getArmorTexture(stack, entity, slot, type);
    }

    public ExtAcArmorItem setModelAccessor(Supplier<ExtModelAccessor> supplier) {
        modelAccessorSupplier = supplier;
        return this;
    }

    @OnlyIn(Dist.CLIENT)
    private ExtModelAccessor getModelAccessor() {
        if (modelAccessor == null && modelAccessorSupplier != null) {
            modelAccessor = modelAccessorSupplier.get();
        }
        return modelAccessor;
    }

    public ExtAcArmorItem setTexture(String location) {
        texture = ModMain.NAMESPACE + ":" + location;
        return this;
    }
}
