package com.example.along.learningprogram.design;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 卡片布局、选项开关、SnackBar、FloatingActionButton
 * @date 2018/10/27 8:41
 */
public class LittleControlActivity extends BaseActivity {
    @BindView(R2.id.sc_switch_compat)
    SwitchCompat mSwitchCompat;

    @Override
    protected void initView() {
        //设置关闭时的文字
        mSwitchCompat.setTextOff("off");
        //设置打开时的文字
        mSwitchCompat.setTextOn("on");
        //设置是否显示文字
        mSwitchCompat.setShowText(true);
        //设置是否是选中(打开)状态
        mSwitchCompat.setChecked(true);
        //设置打开关闭监听
        mSwitchCompat.setOnCheckedChangeListener((CompoundButton buttonView, boolean isChecked) -> {

        });
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void request() {

    }

    @Override
    protected int getLayoutId(Bundle savedInstanceState) {
        return R.layout.materialdesign_activity_little_control;
    }

    public void onShowSnackBar(View v) {
        Snackbar.make(v, "叫我出来作甚！！！", Snackbar.LENGTH_LONG)
                .setActionTextColor(ContextCompat.getColor(this, R.color.ffffffff))
                .setAction("这里", (view) ->
                            Toast.makeText(LittleControlActivity.this, "没脸？还点我？？？",
                                    Toast.LENGTH_LONG).show()).show();
    }
}
