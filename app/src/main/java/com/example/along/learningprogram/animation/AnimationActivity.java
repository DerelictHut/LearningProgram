package com.example.along.learningprogram.animation;

import android.os.Bundle;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 动画类
 * @date 2018/11/10 10:32
 */
public class AnimationActivity extends BaseActivity{
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;

    @Override
    protected void initView() {
        mGeneralList.setPrompt("Material Design");
        mGeneralList.addData(this, VectorDrawableActivity.class, "矢量图简单应用");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {

    }

    /**
     * 请求
     */
    @Override
    protected void request() {

    }

    /**
     * 添加布局
     *
     * @param savedInstanceState 保存状态
     * @return 返回布局id
     */
    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.animation_activity_animation;
    }
}
