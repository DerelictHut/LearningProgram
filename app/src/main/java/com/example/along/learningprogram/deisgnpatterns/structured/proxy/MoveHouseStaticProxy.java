package com.example.along.learningprogram.deisgnpatterns.structured.proxy;

/**
 * @author $汪金龙$
 * @desc 代理类，代理搬家行为
 * @date 2018/11/15 13:30
 */
public class MoveHouseStaticProxy implements IMoveHouseStaticProxy {
    private IMoveHouseStaticProxy mStaticProxy;

    public MoveHouseStaticProxy(IMoveHouseStaticProxy proxy) {
        mStaticProxy = proxy;
    }

    /**
     * 搬家
     *
     * @return 描述
     */
    @Override
    public String moveHouse() {
        return "通过搬家公司" + mStaticProxy.moveHouse();
    }
}
