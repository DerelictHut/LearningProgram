package com.example.along.learningprogram.deisgnpatterns.structured.decorator;

import android.annotation.SuppressLint;
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
 * @desc 装饰者模式
 * <p>装饰者模式又名包装(Wrapper)模式。装饰者模式以对客户端透明的方式扩展对象的功能，
 * 是继承关系的一个替代方案，Java中典型应用IO流</>
 * @date 2018/11/10 15:02
 */
@SuppressLint("SetTextI18n")
public class DecoratorActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;
    private Food mFood;
    private EggCakeFood mEggCakeFood;
    private RoastGrimFood mRoastGrimFood;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mGeneralList.setPrompt("装饰者模式");
        mGeneralList.addData("饿了，我要去小摊买吃的");
        mGeneralList.addData("来一份烤冷面");
        mGeneralList.addData("来一份鸡蛋饼");
        mGeneralList.addData("加一根烤肠");
        mGeneralList.addData("加一个鸡蛋");
        mGeneralList.addData("加鸡蛋和烤肠");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 1) {
                mFood = new RoastGrimFood();
                mTvResult.setText("结果：您点了一份" + mFood.getFoodName() + "\n价格：" + mFood.price() + "￥");
            } else if (position == 2) {
                mFood = new EggCakeFood();
                mTvResult.setText("结果：您点了一份" + mFood.getFoodName() + "\n价格：" + mFood.price() + "￥");
            } else if (position == 3) {
                if (mFood == null) {
                    mTvResult.setText("结果：先选择一份食物");
                } else {
                    mFood = new SausageDecorator(mFood);
                    mTvResult.setText("结果：您点了一份" + mFood.getFoodName() + "\n价格：" + mFood.price() + "￥");
                }
            } else if (position == 4) {
                if (mFood == null) {
                    mTvResult.setText("结果：先选择一份食物");
                } else {
                    mFood = new EggDecorator(mFood);
                    mTvResult.setText("结果：您点了一份" + mFood.getFoodName() + "\n价格：" + mFood.price() + "￥");
                }
            } else if (position == 5) {
                if (mFood == null) {
                    mTvResult.setText("结果：先选择一份食物");
                } else {
                    mFood = new EggDecorator(new SausageDecorator(mFood));
                    mTvResult.setText("结果：您点了一份" + mFood.getFoodName() + "\n价格：" + mFood.price() + "￥");
                }
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
        return R.layout.deisgnpatterns_activity_decorator;
    }
}
