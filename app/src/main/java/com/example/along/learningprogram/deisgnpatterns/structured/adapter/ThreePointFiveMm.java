package com.example.along.learningprogram.deisgnpatterns.structured.adapter;

/**
 * @author $汪金龙$
 * @desc 接口适配器测试
 * @date 2018/11/14 16:56
 */
public class ThreePointFiveMm extends InterfaceConverterAdapter{

    @Override
    public String useThreePointFiveMm() {
        return "接口适配器结果：适配器简化了接口的使用，Android中Animator动画中的addListener监听" +
                "的AnimatorListenerAdapter使用的就是接口适配器模式，使用者不用实现所有的动画回调" +
                "只需要实现自己想要的方法即可";
    }
}
