package org.kimetsuaddondevs.kimetsuaddon.models;

import net.minecraft.client.renderer.model.ModelRenderer;

public interface ExtModelAccessor {
    public default ModelRenderer extAccessHead() {
        return null;
    }

    public default ModelRenderer extAccessBody() {
        return null;
    }

    public default ModelRenderer extAccessLeftArm() {
        return null;
    }

    public default ModelRenderer extAccessRightArm() {
        return null;
    }

    public default ModelRenderer extAccessLeftLeg() {
        return null;
    }

    public default ModelRenderer extAccessRightLeg() {
        return null;
    }
}
