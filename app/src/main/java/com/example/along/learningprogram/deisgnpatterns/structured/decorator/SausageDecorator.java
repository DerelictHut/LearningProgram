package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

/**
 * @author $汪金龙$
 * @desc 烤肠装饰类
 * @date 2018/11/15 10:40
 */
public class SausageDecorator extends IngredientsDecorator {
    private static final int PRICE = 3;

    public SausageDecorator(Food food) {
        super(food);
    }

    /**
     * 价格
     *
     * @return 食物价格
     */
    @Override
    public int price() {
        return PRICE + mFood.price();
    }

    @Override
    public String getFoodName() {
        return "加烤肠" + mFood.getFoodName();
    }
}
