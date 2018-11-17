package com.example.along.learningprogram.deisgnpatterns.structured.adapter;

/**
 * @author $汪金龙$
 * @desc 类适配器模式，将2.5mm接口转化为3.5mm接口
 * <p>有一个TwoPointFiveMm类，拥有一个方法，待适配，
 * 目标接口ThreePointFiveMmInterface，通过Adapter类，将TwoPointFiveMm
 * 的功能扩展到ThreePointFiveMmInterface里</>
 * @date 2018/11/14 16:18
 */
public class ClassConverterAdapter extends TwoPointFiveMm implements ThreePointFiveMmInterface {
    /**
     * 3.5mm接口
     *
     * @return 测试描述用
     */
    @Override
    public String useThreePointFiveMm() {
        return useTwoPointFiveMm();
    }

    /**
     * 接口适配器模式使用
     */
    @Override
    public void a() {

    }

    /**
     * 接口适配器模式使用
     */
    @Override
    public void b() {

    }

    /**
     * 接口适配器模式使用
     */
    @Override
    public void c() {

    }

    /**
     * 接口适配器模式使用
     */
    @Override
    public void d() {

    }

    /**
     * 接口适配器模式使用
     */
    @Override
    public void e() {

    }
}
