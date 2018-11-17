package com.example.along.learningprogram.deisgnpatterns.structured.bridge;


/**
 * @author $汪金龙$
 * @desc 形状
 * @date 2018/11/15 16:12
 */
public abstract class Shape {
    protected Color mColor;

    public void setColor(Color color) {
        mColor = color;
    }

    /**
     * 绘制形状
     * @return 描述
     */
    public abstract String draw();
}
