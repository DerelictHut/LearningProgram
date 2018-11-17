package com.example.along.learningprogram.deisgnpatterns.create.builder;

/**
 * @author $汪金龙$
 * @desc 汽车类
 * @date 2018/11/12 13:51
 */
public class Car {
    /**
     * 材质
     */
    private String mMaterial;
    /**
     * 类型
     */
    private String mType;
    /**
     * 配置
     */
    private String mConfiguration;

    public String getMaterial() {
        return mMaterial;
    }

    public void setMaterial(String material) {
        mMaterial = material;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getConfiguration() {
        return mConfiguration;
    }

    public void setConfiguration(String configuration) {
        mConfiguration = configuration;
    }

    @Override
    public String toString() {
        return "恭喜获得一辆" + getMaterial() + "的" + getConfiguration() + getType();
    }
}
