package com.example.along.learningprogram.deisgnpatterns.create.singleton;

/**
 * @author $汪金龙$
 * @desc 单利模式--静态内部类
 * @date 2018/11/12 13:01
 */
public class SingletonDemo2 {
    private SingletonDemo2() {
    }

    private static class SingletonDemo2Instance {
        private static final SingletonDemo2 INSTANCE = new SingletonDemo2();
    }

    public static SingletonDemo2 getInstance() {
        return SingletonDemo2Instance.INSTANCE;
    }
}
