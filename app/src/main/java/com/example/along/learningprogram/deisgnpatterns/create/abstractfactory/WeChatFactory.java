package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/11/12 11:01
 */
public class WeChatFactory implements IFactory {
    /**
     * 登陆
     */
    @Override
    public ILogin createLogin() {
        return new WeChatLogin();
    }

    /**
     * 注册
     */
    @Override
    public IRegister createRegister() {
        return new WeChatRegister();
    }
}
