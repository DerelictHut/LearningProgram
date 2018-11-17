package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 长方形
 * @date 2018/11/15 16:18
 */
public class Rectangle  extends Shape{
    @Override
    public String draw() {
        return mColor.paint("长方形");
    }
}
