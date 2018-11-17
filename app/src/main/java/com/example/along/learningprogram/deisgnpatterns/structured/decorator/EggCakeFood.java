package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

/**
 * @author $汪金龙$
 * @desc 鸡蛋饼
 * @date 2018/11/15 10:31
 */
public class EggCakeFood extends Food{
    /**
     * 价格
     *
     * @return 食物价格
     */
    @Override
    public int price() {
        return 10;
    }

    @Override
    public String getFoodName() {
        return "鸡蛋饼";
    }
}
