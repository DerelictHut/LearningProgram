package com.example.along.learningprogram.deisgnpatterns.structured.adapter;

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
 * @desc 适配器模式
 * <p>适配器模式把一个类的接口变换成客户端所期待的另一种接口，
 * 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * 类似变压器起到转换作用</>
 * <p>总结：当给出的是两个接口时个人认为使用对象适配器好一些</>
 * @date 2018/11/10 15:00
 */
@SuppressLint("SetTextI18n")
public class AdapterActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mGeneralList.setPrompt("适配器模式");
        mGeneralList.addData("描述：我有一部耳机接口为2.5mm的手机");
        mGeneralList.addData("为了能够使用3.5mm的耳机需要适配器进行转换");
        mGeneralList.addData("类适配器模式转换");
        mGeneralList.addData("对象适配器模式转换");
        mGeneralList.addData("接口适配器模式-->并不进行接口转换");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 2) {
                ThreePointFiveMmInterface mmInterface = new ObjectConverterAdapter(mInterface);
                mTvResult.setText(mmInterface.useThreePointFiveMm());
            } else if (position == 3) {
                ThreePointFiveMmInterface mmInterface = new ClassConverterAdapter();
                mTvResult.setText(mmInterface.useThreePointFiveMm());
            } else if (position == 4) {
                ThreePointFiveMm mm = new ThreePointFiveMm();
                mTvResult.setText(mm.useThreePointFiveMm());
            }
        });
    }

    private TwoPointFiveMmInterface mInterface = () ->
            "类适配器结果：适配器使耳机接口为2.5mm的手机能够使用3.5mm耳机听歌了";


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
        return R.layout.deisgnpatterns_activity_adapter;
    }
}
