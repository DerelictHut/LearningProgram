package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

import android.widget.Toast;

import com.example.lon.baselibary.BaseApplication;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/11/12 10:51
 */
public class QQRegister implements IRegister{
    /**
     * 注册
     *
     * @param username 用户名
     * @param password 密码
     */
    @Override
    public void register(String username, String password) {
        Toast.makeText(BaseApplication.getApplication(),username+"进行了QQ注册",Toast.LENGTH_SHORT).show();
    }
}
