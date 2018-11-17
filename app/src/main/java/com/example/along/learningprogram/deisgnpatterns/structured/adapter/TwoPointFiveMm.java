package com.example.along.learningprogram.deisgnpatterns.structured.adapter;

/**
 * @author $汪金龙$
 * @desc 类适配器模式对需要进行转化的而接口做implements操作，
 * 如果TwoPointFiveMmInterface直接是class则ClassConverterAdapter直接继承即可
 * @date 2018/11/14 16:19
 */
public class TwoPointFiveMm implements TwoPointFiveMmInterface{
    /**
     * 2.5mm接口
     *
     * @return 测试描述用
     */
    @Override
    public String useTwoPointFiveMm() {
        return "对象适配器结果：适配器使耳机接口为2.5mm的手机能够使用3.5mm耳机听歌了";
    }
}
