package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 圆形
 * @date 2018/11/15 16:13
 */
public class Circle extends Shape {
    @Override
    public String draw() {
        return mColor.paint("圆形");
    }
}
