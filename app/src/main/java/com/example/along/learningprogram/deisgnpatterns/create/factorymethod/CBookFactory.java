package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

/**
 * @author $汪金龙$
 * @desc C语言书籍工厂
 * @date 2018/11/10 17:01
 */
public class CBookFactory implements BookFactory{
    @Override
    public AbstractBook productionBook() {
        return new CBook("C从入门到放弃","A");
    }
}
