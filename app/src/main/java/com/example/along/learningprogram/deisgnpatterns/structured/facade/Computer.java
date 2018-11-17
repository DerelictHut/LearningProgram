package com.example.along.learningprogram.deisgnpatterns.structured.facade;

/**
 * @author $汪金龙$
 * @desc 每个Computer都有CPU、Memory、Disk。在Computer开启和关闭的时候，
 * 相应的部件也会开启和关闭，所以，使用了该外观模式后，会使用户和部件之间解耦
 * @date 2018/11/15 15:15
 */
public class Computer {
    private Cpu mCpu;
    private Disk mDisk;
    private Memory mMemory;

    public Computer() {
        mCpu = new Cpu();
        mDisk = new Disk();
        mMemory = new Memory();
    }

    public String start() {
        return mCpu.start() + "\n" +
                mDisk.start() + "\n" +
                mMemory.start() + "\n" +
                "Computer启动成功！！！";
    }

    public String shutDown() {
        return mCpu.shutDown() + "\n" +
                mDisk.shutDown() + "\n" +
                mMemory.shutDown() + "\n" +
                "Computer关闭成功！！！";
    }
}
