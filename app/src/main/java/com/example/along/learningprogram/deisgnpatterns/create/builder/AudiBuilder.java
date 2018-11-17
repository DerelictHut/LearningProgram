package com.example.along.learningprogram.deisgnpatterns.create.builder;

/**
 * @author $汪金龙$
 * @desc 奥迪车建造者
 * @date 2018/11/12 14:12
 */
public class AudiBuilder extends AbstractCarBuilder {
    private Car mCar;

    public AudiBuilder() {
        mCar = new Car();
    }

    /**
     * 材质
     *
     * @param material 材质
     */
    @Override
    void makeMaterial(String material) {
        mCar.setMaterial(material);
    }

    /**
     * 材质
     *
     * @param type 类型
     */
    @Override
    void makeType(String type) {
        mCar.setType(type);
    }

    /**
     * 配置
     *
     * @param configuration 配置
     */
    @Override
    void makeConfiguration(String configuration) {
        mCar.setConfiguration(configuration);
    }

    /**
     * @return 汽车
     */
    @Override
    Car build() {
        return mCar;
    }
}
