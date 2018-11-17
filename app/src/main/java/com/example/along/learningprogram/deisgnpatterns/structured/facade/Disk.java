package com.example.along.learningprogram.deisgnpatterns.structured.facade;

/**
 * @author $汪金龙$
 * @desc 磁盘
 * @date 2018/11/15 15:14
 */
public class Disk {
    public String start() {
        return "磁盘启动------>";
    }

    public String shutDown() {
        return "磁盘停止------>";
    }
}
