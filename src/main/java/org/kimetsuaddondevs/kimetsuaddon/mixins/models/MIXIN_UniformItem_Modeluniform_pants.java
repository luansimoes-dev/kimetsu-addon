package org.kimetsuaddondevs.kimetsuaddon.mixins.models;

import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import net.mcreator.kimetsunoyaiba.item.UniformItem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@Mixin(UniformItem.Modeluniform_pants.class)
public abstract class MIXIN_UniformItem_Modeluniform_pants extends EntityModel<Entity> implements ExtModelAccessor {
    @Shadow
    @Final
    private ModelRenderer LeftLeg;
    @Shadow
    @Final
    private ModelRenderer RightLeg;

    @Override
    public ModelRenderer extAccessLeftLeg() {
        return LeftLeg;
    }

    @Override
    public ModelRenderer extAccessRightLeg() {
        return RightLeg;
    }
}
