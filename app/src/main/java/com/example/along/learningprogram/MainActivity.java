package com.example.along.learningprogram;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.along.learningprogram.animation.AnimationActivity;
import com.example.along.learningprogram.deisgnpatterns.DesignPatternsActivity;
import com.example.along.learningprogram.design.MaterialDesignActivity;
import com.example.along.learningprogram.rxjava2.RxJavaActivity;
import com.example.lon.baselibary.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author long
 */
public class MainActivity extends BaseActivity {
    @BindView(R2.id.rv_list)
    RecyclerView mRecyclerView;
    private ListAdapter mListAdapter;
    private List<ListEntity> mListEntities;

    @Override
    protected void initView() {
        mListEntities = new ArrayList<>();
        mListAdapter = new ListAdapter(R.layout.item_list, mListEntities);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mListAdapter);
        initData();
    }

    /**
     * 构造数据
     */
    private void initData() {
        //测试utils工具
        mListEntities.add(getItemEntity(R.string.app_test_utils, R.drawable.svg_right_c124));
        //自定义控件
        mListEntities.add(getItemEntity(R.string.app_custom_view, R.drawable.svg_right_c124));
        //ConstraintLayout
        mListEntities.add(getItemEntity(R.string.app_constraint_layout, R.drawable.svg_right_c124));
        //RxJava2+Retrofit2
        mListEntities.add(getItemEntity(R.string.app_rxjava_retrofit, R.drawable.svg_right_c124));
        //动画
        mListEntities.add(getItemEntity(R.string.app_animation, R.drawable.svg_right_c124));
        //MaterialDesign风格
        mListEntities.add(getItemEntity(R.string.app_material_design, R.drawable.svg_right_c124));
        //设计模式
        mListEntities.add(getItemEntity(R.string.app_design_patterns, R.drawable.svg_right_c124));
        mListAdapter.notifyDataSetChanged();
    }

    private ListEntity getItemEntity(int idContent, int idIcon) {
        ListEntity le = new ListEntity();
        le.setContent(getString(idContent));
        le.setIcon(idIcon);
        return le;
    }

    @Override
    protected void initListener() {
        mListAdapter.setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 0) {
                startActivity(new Intent(this, UtilsTestActivity.class));
            } else if (position == 1) {
                //隐式启动
                Intent intent = new Intent();
                intent.setAction("com.example.l.commoncomponent.activity.WidgetUseActivity");
                startActivity(intent);
            } else if (position == 2) {
                //ARouter启动
                ARouter.getInstance()
                        .build("/appconstraintlayout/MainActivity")
                        .navigation();
            } else if (position == 3) {
                startActivity(new Intent(this, RxJavaActivity.class));
            } else if (position == 4) {
                startActivity(new Intent(this, AnimationActivity.class));
            } else if (position == 5) {
                startActivity(new Intent(this, MaterialDesignActivity.class));
            }else if(position == 6){
                startActivity(new Intent(this, DesignPatternsActivity.class));
            }
        });
    }

    @Override
    protected void request() {
    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.all_activity_main;
    }
}
