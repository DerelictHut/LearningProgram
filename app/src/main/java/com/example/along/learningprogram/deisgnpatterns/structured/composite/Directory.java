package com.example.along.learningprogram.deisgnpatterns.structured.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $汪金龙$
 * @desc 文件夹系统-->定义目录接口
 * @date 2018/11/16 9:09
 */
public abstract class Directory {
    protected List<Directory> dirs = new ArrayList<>();
    private String mName;
    protected int mLevel = 1;

    public Directory(String name) {
        this.mName = name;
    }

    /**
     * 添加文件或文件夹
     *
     * @param dir 文件目录
     */
    public abstract void addDirectory(Directory dir);

    /**
     * 删除文件或文件夹
     *
     * @param dir 文件目录
     */
    public abstract void removeDirectory(Directory dir);

    /**
     * 清空所有元素
     */
    public abstract void clear();

    /**
     * 打印文件夹系统结构
     *
     * @return 返回目录结构
     */
    public abstract String print();

    public abstract List<Directory> getFiles();

    public String getName() {
        return mName;
    }
}
