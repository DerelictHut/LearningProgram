package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 正方形
 * @date 2018/11/15 16:18
 */
public class Square extends Shape {
    @Override
    public String draw() {
        return mColor.paint("正方形");
    }
}
