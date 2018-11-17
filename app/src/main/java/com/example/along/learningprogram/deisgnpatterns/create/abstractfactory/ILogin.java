package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

/**
 * @author $汪金龙$
 * @desc 登陆
 * @date 2018/11/12 10:43
 */
public interface ILogin {

    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    void login(String username, String password);
}
