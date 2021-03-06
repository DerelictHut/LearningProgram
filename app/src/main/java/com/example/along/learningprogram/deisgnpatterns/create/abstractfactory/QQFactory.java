package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/11/12 10:52
 */
public class QQFactory implements IFactory {
    /**
     * 登陆
     */
    @Override
    public ILogin createLogin() {
        return new QQLogin();
    }

    /**
     * 注册
     */
    @Override
    public IRegister createRegister() {
        return new QQRegister();
    }
}
