package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

/**
 * @author $汪金龙$
 * @desc Java语言书籍->具体产品
 * @date 2018/11/10 16:42
 */
public class JavaBook extends AbstractBook {

    public JavaBook(String bookName, String bookAuthor) {
        super(bookName, bookAuthor);
    }

    /**
     * 使用方式
     */
    @Override
    public String use() {
        return getBookAuthor() + "的《" + getBookName() + "》被吃了!";
    }
}
