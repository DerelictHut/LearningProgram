package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

/**
 * @author $汪金龙$
 * @desc Linux语言书籍工厂
 * @date 2018/11/10 17:11
 */
public class LinuxBookFactory implements BookFactory {
    @Override
    public AbstractBook productionBook() {
        return new LinuxBook("Linux从入门到入狱", "C");
    }
}
