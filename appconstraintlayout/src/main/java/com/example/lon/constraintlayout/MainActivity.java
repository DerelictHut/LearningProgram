package com.example.lon.constraintlayout;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lon.baselibary.BaseActivity;

/**
 * @author long
 */
@Route(path = "/appconstraintlayout/MainActivity")
public class MainActivity extends BaseActivity {

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void request() {

    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.constraint_activity_main;
    }
}
