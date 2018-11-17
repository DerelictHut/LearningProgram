package com.example.along.learningprogram.deisgnpatterns.structured.composite;

import java.util.Iterator;
import java.util.List;

/**
 * @author $汪金龙$
 * @desc 文件夹
 * @date 2018/11/16 9:12
 */
public class Folder extends Directory {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDirectory(Directory dir) {
        dir.mLevel = mLevel + 1;
        dirs.add(dir);

    }

    @Override
    public void removeDirectory(Directory dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        Iterator<Directory> i = dirs.iterator();
        while (i.hasNext()) {
            Directory directory = i.next();
            if (directory.mLevel == 0) {
                sb.append(directory.print());
            }

            if (i.hasNext()) {
                sb.append("\n-->");
            }
        }
        return sb.toString();
    }

    @Override
    public List<Directory> getFiles() {
        return dirs;
    }
}
