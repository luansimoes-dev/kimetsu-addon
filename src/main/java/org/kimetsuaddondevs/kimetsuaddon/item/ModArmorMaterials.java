package org.kimetsuaddondevs.kimetsuaddon.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModArmorMaterials {
    public static final IArmorMaterial UNIFORM_KAIGAKU = createUniform("uniform_kaigaku", 576, 2.0F);

    public static final IArmorMaterial GENERIC_CLOTHES = new IArmorMaterial() {
        @Override
        public int getDurabilityForSlot(EquipmentSlotType pSlot) {
            return 576;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlotType pSlot) {
            return 2;
        }

        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_LEATHER;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.EMPTY;
        }

        @Override
        @OnlyIn(Dist.CLIENT)
        public String getName() {
            return "generic_clothes";
        }

        @Override
        public float getToughness() {
            return 0.0F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.0F;
        }
        
    };

    private static IArmorMaterial createUniform(String name, int durability, float toughness) {
        return new IArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlotType equipmentSlotType) {
                return durability;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlotType equipmentSlotType) {
                switch (equipmentSlotType) {
                    case CHEST:
                        return 12;
                    case FEET:
                        return 3;
                    case HEAD:
                        throw new UnsupportedOperationException("Unimplemented case HEAD in 'getDefenseForSlot'");
                    case LEGS:
                        throw new UnsupportedOperationException("Unimplemented case LEGS in 'getDefenseForSlot'");
                    default:
                        throw new Error();
                }
            }

            @Override
            public int getEnchantmentValue() {
                return 15;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_LEATHER;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            @Override
            @OnlyIn(Dist.CLIENT)
            public String getName() {
                return name;
            }

            @Override
            public float getToughness() {
                return toughness;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.0F;
            }
        };
    }

    private ModArmorMaterials() {
    }
}
