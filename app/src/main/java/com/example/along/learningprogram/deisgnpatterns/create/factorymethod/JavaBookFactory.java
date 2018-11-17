package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

/**
 * @author $汪金龙$
 * @desc Java语言书籍工厂
 * @date 2018/11/10 17:11
 */
public class JavaBookFactory implements BookFactory{
    @Override
    public AbstractBook productionBook() {
        return new JavaBook("Java从入门到入土","B");
    }
}
