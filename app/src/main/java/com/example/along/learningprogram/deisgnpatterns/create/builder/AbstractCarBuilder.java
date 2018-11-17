package com.example.along.learningprogram.deisgnpatterns.create.builder;

/**
 * @author $汪金龙$
 * @desc 汽车--个人理解可以加入泛型产生如下效果
 * .XXX()
 * .XXX()
 * .build()
 * @date 2018/11/12 13:31
 */
public abstract class AbstractCarBuilder {
    /**
     * 材质
     *
     * @param material 材质
     */
    abstract void makeMaterial(String material);
    /**
     * 材质
     *
     * @param type 类型
     */
    abstract void makeType(String type);

    /**
     * 配置
     *
     * @param configuration 配置
     */
    abstract void makeConfiguration(String configuration);

    /**
     * @return 汽车
     */
    abstract Car build();
}
