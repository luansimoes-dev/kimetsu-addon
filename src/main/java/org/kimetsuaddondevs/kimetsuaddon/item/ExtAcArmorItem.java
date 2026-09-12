package org.kimetsuaddondevs.kimetsuaddon.item;

import java.util.function.Supplier;
import org.kimetsuaddondevs.kimetsuaddon.ModMain;
import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ExtAcArmorItem extends ArmorItem {
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
        if (modelAccessor != null) {
            BipedModel<?> armorModel = new BipedModel<>(1.0F);

            armorModel.body = modelAccessor.extAccessBody();
            armorModel.leftArm = modelAccessor.extAccessLeftArm();
            armorModel.rightArm = modelAccessor.extAccessRightArm();
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
        modelAccessor = supplier.get();
        return this;
    }

    public ExtAcArmorItem setTexture(String location) {
        texture = ModMain.NAMESPACE + ":" + location;
        return this;
    }
}
