package com.example.along.learningprogram.deisgnpatterns.structured.proxy;

/**
 * @author $汪金龙$
 * @desc 搬家
 * @date 2018/11/15 13:35
 */
public class MoveHouse implements IMoveHouseStaticProxy, IMoveHouseDynamicProxy {
    /**
     * 搬家
     *
     * @return 描述
     */
    @Override
    public String moveHouse() {
        return "搬家成功！";
    }
}
