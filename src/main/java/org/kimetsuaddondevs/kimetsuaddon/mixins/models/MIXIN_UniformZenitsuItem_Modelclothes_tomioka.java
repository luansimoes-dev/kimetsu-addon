package org.kimetsuaddondevs.kimetsuaddon.mixins.models;

import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import net.mcreator.kimetsunoyaiba.item.UniformZenitsuItem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@Mixin(UniformZenitsuItem.Modelclothes_tomioka.class)
public abstract class MIXIN_UniformZenitsuItem_Modelclothes_tomioka extends EntityModel<Entity>
        implements ExtModelAccessor {
    @Shadow
    private ModelRenderer Body;
    @Shadow
    private ModelRenderer LeftArm;
    @Shadow
    private ModelRenderer RightArm;

    @Override
    public ModelRenderer extAccessBody() {
        return Body;
    }

    @Override
    public ModelRenderer extAccessLeftArm() {
        return LeftArm;
    }

    @Override
    public ModelRenderer extAccessRightArm() {
        return RightArm;
    }
}
