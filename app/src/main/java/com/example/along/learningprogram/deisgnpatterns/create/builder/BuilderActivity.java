package com.example.along.learningprogram.deisgnpatterns.create.builder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.HeadTitle;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 建造者模式
 * <p>与工厂模式相比，建造者模式一般用来创建更为复杂的对象
 * 一般工厂模式只需要把产品创建出来即可，而建造者模式不仅要把这个产品创建出来，还要关心这个产品的组成细节，组成过程
 * 工厂模式关心整体，建造者模式关心细节
 * <p>Android的AlertDialog的builder模式中的builder
 * 同时扮演了AbstractCarBuilder、AudiBuilder、EngineeringDepartment
 * 简化了builder模式的设计
 * @date 2018/11/10 14:41
 */
@SuppressLint("SetTextI18n")
public class BuilderActivity extends BaseActivity {
    @BindView(R2.id.ht_title)
    HeadTitle mHeadTitle;
    @BindView(R2.id.tv_first_line)
    TextView mTvFirstLine;
    @BindView(R2.id.tv_second_line)
    TextView mTvSecondLine;
    @BindView(R2.id.tv_third_line)
    TextView mTvThirdLine;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mHeadTitle.setPrompt("建造者模式");
        mTvFirstLine.setText("生产车");
        mTvSecondLine.setText("builder模式简化");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {
        mTvFirstLine.setOnClickListener(v -> {
            AbstractCarBuilder builder = new AudiBuilder();
            //指挥官
            EngineeringDepartment director = new EngineeringDepartment(builder);
            director.Construct("木制", "四轮子", "豪华");
            Car audiCar = builder.build();
            mTvThirdLine.setText("结果：" + audiCar.toString());
        });
        mTvSecondLine.setOnClickListener(v -> {
            Bike bike = new Bike.Builder()
                    .setColor("蓝色")
                    .setName("布加迪")
                    .setMaterial("希望蓝钻")
                    .build();
            mTvThirdLine.setText("结果：" + bike.toString());
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
        return R.layout.deisgnpatterns_activity_builder;
    }
}
