package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

/**
 * @author $汪金龙$
 * @desc 烤冷面
 * @date 2018/11/15 10:31
 */
public class RoastGrimFood extends Food{
    /**
     * 价格
     *
     * @return 食物价格
     */
    @Override
    public int price() {
        return 15;
    }

    @Override
    public String getFoodName() {
        return "豪华烤冷面";
    }
}
