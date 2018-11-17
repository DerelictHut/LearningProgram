package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

/**
 * @author $汪金龙$
 * @desc 颜色
 * @date 2018/11/15 16:15
 */
public interface Color {
    /**
     * 绘制颜色
     * @param shape 形状
     * @return 描述
     */
    String paint(String shape);
}
