package com.example.along.learningprogram.design;

import android.os.Bundle;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc
 * @date 2018/11/10 13:31
 */
public class MaterialDesignActivity  extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;

    @Override
    protected void initView() {
        mGeneralList.setPrompt("Material Design");
        mGeneralList.addData(this, TextInputLayoutActivity.class, "TextInputLayout");
        mGeneralList.addData(this, LittleControlActivity.class, "Material Design小控件");
        mGeneralList.addData(this, CustomBehaviorActivity.class, "自定义Behavior");
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void request() {

    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.materialdesign_activity_design;
    }
}