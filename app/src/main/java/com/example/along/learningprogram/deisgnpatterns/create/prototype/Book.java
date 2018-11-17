package com.example.along.learningprogram.deisgnpatterns.create.prototype;

import android.text.TextUtils;

/**
 * @author $汪金龙$
 * @desc 可以克隆的书，使用java提供的Cloneable接口实现克隆能力为浅克隆
 * @date 2018/11/12 16:29
 */
public class Book implements Cloneable {
    /**
     * 书名
     */
    private String mName;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book) {
            Book bookClone = (Book) obj;
            return bookClone.getName() == null && this.getName() == null ||
                    bookClone.getName() != null && this.getName() != null &&
                            bookClone.getName().equals(this.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return TextUtils.isEmpty(mName) ? 0 : mName.hashCode();
    }
}
