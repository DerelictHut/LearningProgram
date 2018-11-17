package com.example.along.learningprogram.deisgnpatterns.structured.adapter;

/**
 * @author $汪金龙$
 * @desc 对象适配器模式，将2.5mm接口转化为3.5mm接口
 * <p>基本思路和类的适配器模式相同，只是将Adapter类作修改，
 * 这次不继承TwoPointFiveMm类，而是持有TwoPointFiveMmInterface类的实例，以达到解决兼容性的问题</>
 * @date 2018/11/14 15:54
 */
public class ObjectConverterAdapter implements ThreePointFiveMmInterface{
    private TwoPointFiveMmInterface mTwoPointFiveMmInterface;
    public ObjectConverterAdapter(TwoPointFiveMmInterface mmInterface){
        mTwoPointFiveMmInterface = mmInterface;
    }

    /**
     * 3.5mm接口
     *
     * @return 测试描述用
     */
    @Override
    public String useThreePointFiveMm() {
        return mTwoPointFiveMmInterface.useTwoPointFiveMm();
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
