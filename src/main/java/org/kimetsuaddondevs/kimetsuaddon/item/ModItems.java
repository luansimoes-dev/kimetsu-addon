package org.kimetsuaddondevs.kimetsuaddon.item;

import org.kimetsuaddondevs.kimetsuaddon.ModMain;
import org.kimetsuaddondevs.kimetsuaddon.models.ExtModelAccessors;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final Item UNIFORM_KAIGAKU_CHESTPLATE;
    public static final Item UNIFORM_KAIGAKU_BOOTS;

    public static final Item CLOTHES_UROKODAKI_CHESTPLATE;

    static {
        {
            Item item = new ExtAcArmorItem(
                    ModArmorMaterials.UNIFORM_KAIGAKU,
                    EquipmentSlotType.CHEST,
                    new Item.Properties())
                    .setModelAccessor(ExtModelAccessors.UniformZenitsuItem::Modelclothes_tomioka)
                    .setTexture("textures/models/uniform_kaigaku_chestplate.png");

            UNIFORM_KAIGAKU_CHESTPLATE = registerItem("uniform_kaigaku_chestplate", item);
        }
        {
            Item item = new ExtAcArmorItem(
                    ModArmorMaterials.UNIFORM_KAIGAKU,
                    EquipmentSlotType.FEET,
                    new Item.Properties())
                    .setModelAccessor(ExtModelAccessors.UniformZenitsuItem::Modeluniform_boots)
                    .setTexture("textures/models/uniform_kaigaku_boots.png");

            UNIFORM_KAIGAKU_BOOTS = registerItem("uniform_kaigaku_boots", item);
        }
        {
            Item item = new ExtAcArmorItem(
                    ModArmorMaterials.GENERIC_CLOTHES,
                    EquipmentSlotType.CHEST,
                    new Item.Properties())
                    .setModelAccessor(ExtModelAccessors.ClothesKokushiboItem::Modelclothes)
                    .setTexture("textures/models/clothes_urokodaki_chestplate.png");

            CLOTHES_UROKODAKI_CHESTPLATE = registerItem("clothes_urokodaki_chestplate", item);
        }
    }

    private static Item registerItem(String location, Item item) {
        final ResourceLocation resourceLocation = ModMain.resourceLocation(location);
        item.setRegistryName(resourceLocation);
        if (item instanceof BlockItem) {
            final BlockItem blockItem = (BlockItem) item;
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    public static void initialize() {
    }

    private ModItems() {
    }
}
