package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

/**
 * @author $汪金龙$
 * @desc 书接口->抽象产品
 * @date 2018/11/10 16:23
 */
public abstract class AbstractBook {
    private String mBookName;
    private String mBookAuthor;

    public AbstractBook(String bookName, String bookAuthor) {
        this.mBookName = bookName;
        this.mBookAuthor = bookAuthor;
    }

    public String getBookName() {
        return mBookName;
    }

    public void setBookName(String bookName) {
        mBookName = bookName;
    }

    public String getBookAuthor() {
        return mBookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        mBookAuthor = bookAuthor;
    }

    /**
     * 使用方式
     */
    abstract String use();
}
