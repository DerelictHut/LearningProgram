package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

/**
 * @author $汪金龙$
 * @desc 注册
 * @date 2018/11/12 10:41
 */
public interface IRegister {
    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     */
    void register(String username,String password);
}
