package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

import android.widget.Toast;

import com.example.lon.baselibary.BaseApplication;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/11/12 10:53
 */
public class WeChatLogin implements ILogin{
    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @Override
    public void login(String username, String password) {
        Toast.makeText(BaseApplication.getApplication(),username+"进行了微信登陆",Toast.LENGTH_SHORT).show();
    }
}
