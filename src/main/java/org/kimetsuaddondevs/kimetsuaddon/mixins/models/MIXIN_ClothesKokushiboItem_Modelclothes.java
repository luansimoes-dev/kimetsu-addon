package org.kimetsuaddondevs.kimetsuaddon.mixins.models;

import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.mcreator.kimetsunoyaiba.item.ClothesKokushiboItem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@Mixin(ClothesKokushiboItem.Modelclothes.class)
public abstract class MIXIN_ClothesKokushiboItem_Modelclothes extends EntityModel<Entity> implements ExtModelAccessor {
    @Shadow
    private ModelRenderer Body;
    @Shadow
    private ModelRenderer RightArm;
    @Shadow
    private ModelRenderer LeftArm;

    @Override
    public ModelRenderer extAccessBody() {
        return Body;
    }

    @Override
    public ModelRenderer extAccessRightArm() {
        return RightArm;
    }

    @Override
    public ModelRenderer extAccessLeftArm() {
        return LeftArm;
    }
}
