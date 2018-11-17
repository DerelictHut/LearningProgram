package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

/**
 * @author $汪金龙$
 * @desc Linux语言书籍->具体产品
 * @date 2018/11/10 16:46
 */
public class LinuxBook extends AbstractBook {

    public LinuxBook(String bookName, String bookAuthor) {
        super(bookName, bookAuthor);
    }

    /**
     * 使用方式
     */
    @Override
    public String use() {
        return getBookAuthor() + "的《" + getBookName() + "》被撕了!";
    }
}
