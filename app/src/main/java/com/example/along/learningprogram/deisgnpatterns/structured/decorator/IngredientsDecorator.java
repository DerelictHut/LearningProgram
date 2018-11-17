package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

/**
 * @author $汪金龙$
 * @desc 配料装饰类
 * 所有的配料装饰者都必须重新实现price()方法，
 * 因为装饰者的price是要修饰被装饰者的price的
 * @date 2018/11/15 10:35
 */
public abstract class IngredientsDecorator extends Food {
    /**
     * 声明一个食物
     */
    protected Food mFood;

    public IngredientsDecorator(Food food) {
        mFood = food;
    }

    /**
     * 价格
     *
     * @return 食物价格
     */
    @Override
    public abstract int price();
}
