package org.kimetsuaddondevs.kimetsuaddon.mixins.models;

import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import net.mcreator.kimetsunoyaiba.item.SabitoMaskItem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@Mixin(SabitoMaskItem.Modelsabito_mask.class)
public abstract class MIXIN_SabitoMaskItem_Modelsabito_mask extends EntityModel<Entity> implements ExtModelAccessor {
    @Shadow
    private ModelRenderer Head;

    @Override
    public ModelRenderer extAccessHead() {
        return Head;
    }
}
