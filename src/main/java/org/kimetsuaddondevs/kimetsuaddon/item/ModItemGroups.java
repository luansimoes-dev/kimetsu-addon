package org.kimetsuaddondevs.kimetsuaddon.item;

import org.kimetsuaddondevs.kimetsuaddon.ModMain;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyValue;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroups {
    public static final ItemGroup TAB_MAIN = createItemGroup("main", new LazyValue<>(() -> {
        return ModItems.TANJIRO_MASK;
    }));

    private static ItemGroup createItemGroup(String langId, LazyValue<IItemProvider> lazyIcon) {
        return new ItemGroup(-1, ModMain.NAMESPACE + "." + langId) {
            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack makeIcon() {
                return new ItemStack(lazyIcon.get());
            }
        };
    }

    private ModItemGroups() {
    }
}
