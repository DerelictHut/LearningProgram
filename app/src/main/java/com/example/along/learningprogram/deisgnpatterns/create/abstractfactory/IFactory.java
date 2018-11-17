package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

/**
 * @author $汪金龙$
 * @desc 工厂接口，进行登陆和注册
 * @date 2018/11/12 10:52
 */
public interface IFactory {
    /**
     * 登陆
     */
    ILogin createLogin();

    /**
     * 注册
     */
    IRegister createRegister();
}
