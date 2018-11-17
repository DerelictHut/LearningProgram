package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 紫色
 * @date 2018/11/15 16:20
 */
public class Purple implements Color {
    @Override
    public String paint(String shape) {
        return "紫色的" + shape;
    }
}
