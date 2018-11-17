package com.example.along.learningprogram.deisgnpatterns.create.builder;

/**
 * @author $汪金龙$
 * @desc 自行车
 * @date 2018/11/12 14:48
 */
public class Bike {
    private String mColor;
    private String mName;
    private String mMaterial;

    private Bike(Builder builder) {
        mColor = builder.mColor;
        mName = builder.mName;
        mMaterial = builder.mMaterial;
    }

    public static class Builder {
        private String mColor;
        private String mName;
        private String mMaterial;

        public Builder() {
            mColor = "黑色";
            mName = "法拉利";
            mMaterial = "黄金";
        }

        public Builder setColor(String color) {
            mColor = color;
            return this;
        }

        public Builder setName(String name) {
            mName = name;
            return this;
        }

        public Builder setMaterial(String material) {
            mMaterial = material;
            return this;
        }

        public Bike build() {
            return new Bike(this);
        }
    }

    @Override
    public String toString() {
        return "恭喜获得由" + mMaterial + "材质制造的" + mColor + mName+"自行车一辆";
    }
}
