package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 灰色
 * @date 2018/11/15 16:19
 */
public class Gray implements Color {
    @Override
    public String paint(String shape) {
        return "灰色的" + shape;
    }
}
