package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 黄色
 * @date 2018/11/15 16:21
 */
public class Yellow implements Color {
    @Override
    public String paint(String shape) {
        return "黄色的" + shape;
    }
}
