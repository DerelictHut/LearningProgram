package com.example.along.learningprogram;

import com.example.lon.baselibary.BaseEntity;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/10/18 14:31
 */
public class ListEntity extends BaseEntity{
    private String mContent;
    private int mIcon;

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public int getIcon() {
        return mIcon;
    }

    public void setIcon(int icon) {
        mIcon = icon;
    }
}
