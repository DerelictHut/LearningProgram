package com.example.along.learningprogram.deisgnpatterns.create.singleton;

import android.os.Bundle;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.HeadTitle;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 单例模式
 * 适用场合
 * 1、需要频繁的进行创建和销毁的对象
 * 2、创建对象时耗时过多或耗费资源过多，但又经常用到的对象
 * 3、工具类对象
 * 4、频繁访问数据库或文件的对象
 * @date 2018/11/10 14:41
 */
public class SingletonActivity extends BaseActivity {
    @BindView(R2.id.ht_title)
    HeadTitle mHeadTitle;
    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mHeadTitle.setPrompt("单例模式");
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
        return R.layout.deisgnpatterns_activity_singleton;
    }
}
