package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

/**
 * @author $汪金龙$
 * @desc 鸡蛋装饰类
 * @date 2018/11/15 10:40
 */
public class EggDecorator extends IngredientsDecorator {
    private static final int PRICE = 5;

    public EggDecorator(Food food) {
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
        return "加鸡蛋" + mFood.getFoodName();
    }
}
