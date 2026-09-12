package org.kimetsuaddondevs.kimetsuaddon.models;

public class ExtModelAccessors {
    public static class UniformZenitsuItem {
        public static ExtModelAccessor Modelclothes_tomioka() {
            net.mcreator.kimetsunoyaiba.item.UniformZenitsuItem.Modelclothes_tomioka m = new net.mcreator.kimetsunoyaiba.item.UniformZenitsuItem.Modelclothes_tomioka();
            return (ExtModelAccessor) m;
        }

        public static ExtModelAccessor Modeluniform_boots() {
            net.mcreator.kimetsunoyaiba.item.UniformZenitsuItem.Modeluniform_boots m = new net.mcreator.kimetsunoyaiba.item.UniformZenitsuItem.Modeluniform_boots();
            return (ExtModelAccessor) m;
        }

        private UniformZenitsuItem() {
        }
    }

    public static class ClothesKokushiboItem {
        public static ExtModelAccessor Modelclothes() {
            net.mcreator.kimetsunoyaiba.item.ClothesKokushiboItem.Modelclothes m = new net.mcreator.kimetsunoyaiba.item.ClothesKokushiboItem.Modelclothes();
            return (ExtModelAccessor) m;
        }

        private ClothesKokushiboItem() {
        }
    }

    protected ExtModelAccessors() {
    }
}
