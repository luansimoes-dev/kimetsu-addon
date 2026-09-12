package org.kimetsuaddondevs.kimetsuaddon.mixins.models;

import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.mcreator.kimetsunoyaiba.item.UniformZenitsuItem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@Mixin(UniformZenitsuItem.Modeluniform_boots.class)
public abstract class MIXIN_UniformZenitsuItem_Modeluniform_boots extends EntityModel<Entity>
        implements ExtModelAccessor {
    @Shadow
    private ModelRenderer leftLeg;
    @Shadow
    private ModelRenderer rightLeg;

    @Override
    public ModelRenderer extAccessLeftLeg() {
        return leftLeg;
    }

    @Override
    public ModelRenderer extAccessRightLeg() {
        return rightLeg;
    }
}
