package com.example.along.learningprogram.deisgnpatterns.structured.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author $汪金龙$
 * @desc 动态代理-->实现InvocationHandler接口
 * <p>动态代理总结：
 * 优点：
 * (1)可以通过一个代理类完成全部的代理功能，接口中声明的所有方法都被转移到调用处理
 * 器一个集中的方法中处理（InvocationHandler.invoke）。当接口方法数量较多时，
 * 我们可以进行灵活处理，而不需要像静态代理那样每一个方法进行中转。
 * (2)动态代理的应用使我们的类职责更加单一，复用性更强
 * 缺点：可以通过一个代理类完成全部的代理功能，接口中声明的所有方法都被转移到调用处理器
 * 一个集中的方法中处理（InvocationHandler.invoke）。当接口方法数量较多时，我们可
 * 以进行灵活处理，而不需要像静态代理那样每一个方法进行中转。</>
 * @date 2018/11/15 13:29
 */
public class MoveHouseDynamicProxy implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object mObj;

    public MoveHouseDynamicProxy(Object obj) {
        mObj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理的对象的方法
        return method.invoke(mObj, args);
    }
}
