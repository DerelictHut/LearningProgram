package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

/**
 * @author $汪金龙$
 * @desc 食物类-->装饰者模式中最顶级的父类
 * @date 2018/11/15 10:27
 */
public abstract class Food {

    /**
     * 价格
     *
     * @return 食物价格
     */
    public abstract int price();

    public String getFoodName() {
        return "";
    }
}
