package com.example.along.learningprogram.design;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;


import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc CoordinatorLayout高级用法自定义Behavior
 * @date 2018/10/27 13:01
 */
public class CustomBehaviorActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;

    @Override
    protected void initView() {
        //沉浸式布局
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        mGeneralList.setTitleHidden();
        for (int i = 0, count = 20; i < count; i++) {
            mGeneralList.addData("Item" + (i + 1));
        }
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void request() {

    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.materialdesign_activity_custom_behavior;
    }
}
