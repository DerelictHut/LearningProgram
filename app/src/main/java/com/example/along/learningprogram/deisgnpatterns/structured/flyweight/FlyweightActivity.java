package com.example.along.learningprogram.deisgnpatterns.structured.flyweight;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 享元模式
 * @date 2018/11/10 15:07
 */
public class FlyweightActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;
    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mGeneralList.setPrompt("享元模式");
        mGeneralList.addData("");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 0) {
            } else if (position == 1) {
            } else if (position == 2) {
            }

        });
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
        return R.layout.deisgnpatterns_activity_flyweight;
    }
}
