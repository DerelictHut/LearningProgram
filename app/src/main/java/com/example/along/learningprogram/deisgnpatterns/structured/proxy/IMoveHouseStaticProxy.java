package com.example.along.learningprogram.deisgnpatterns.structured.proxy;

/**
 * @author $汪金龙$
 * @desc 静态代理
 * <p>静态代理总结：
 * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
 * 缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改</>
 * @date 2018/11/15 13:21
 */
public interface IMoveHouseStaticProxy {
    /**
     * 搬家
     * @return 描述
     */
    String moveHouse();
}
