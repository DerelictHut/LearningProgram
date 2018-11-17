package com.example.along.learningprogram.deisgnpatterns.create.abstractfactory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.HeadTitle;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author $汪金龙$
 * @desc 抽象工厂模式
 * @date 2018/11/10 14:42
 */
@SuppressLint("SetTextI18n")
public class AbstractFactoryActivity extends BaseActivity {
    @BindView(R2.id.ht_title)
    HeadTitle mHeadTitle;
    @BindView(R2.id.tv_first_line)
    TextView mTvFirstLine;
    @BindView(R2.id.tv_second_line)
    TextView mTvSecondLine;
    @BindView(R2.id.tv_third_line)
    TextView mTvThirdLine;
    private IFactory mIFactory;
    private ILogin mILogin;
    private IRegister mIRegister;
    private String mWeChat = "切换到微信操作";
    private String mQQ = "切换到QQ操作";

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mHeadTitle.setPrompt("抽象工厂模式");
        mIFactory = new QQFactory();
        mILogin = mIFactory.createLogin();
        mIRegister = mIFactory.createRegister();
        mTvFirstLine.setText(mWeChat);
        mTvSecondLine.setText("注册");
        mTvThirdLine.setText("登陆");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {
        mTvFirstLine.setOnClickListener(v -> {
            if (mWeChat.contentEquals(mTvFirstLine.getText())) {
                mTvFirstLine.setText(mQQ);
                mIFactory = new WeChatFactory();
            } else {
                mTvFirstLine.setText(mWeChat);
                mIFactory = new QQFactory();
            }
            mILogin = mIFactory.createLogin();
            mIRegister = mIFactory.createRegister();
        });
        mTvSecondLine.setOnClickListener(v -> mIRegister.register("小明同学", ""));
        mTvThirdLine.setOnClickListener(v -> mILogin.login("小明同学", ""));
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
        return R.layout.deisgnpatterns_activity_abstract_factory;
    }
}
