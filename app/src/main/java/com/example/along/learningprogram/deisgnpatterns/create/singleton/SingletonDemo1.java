package com.example.along.learningprogram.deisgnpatterns.create.singleton;

/**
 * @author $汪金龙$
 * @desc 单利模式--双重校验锁
 * @date 2018/11/12 13:01
 */
public class SingletonDemo1 {
    private static volatile SingletonDemo1 singleton;

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance() {
        if (singleton == null) {
            synchronized (SingletonDemo1.class) {
                if (singleton == null) {
                    singleton = new SingletonDemo1();
                }
            }
        }
        return singleton;
    }
}
