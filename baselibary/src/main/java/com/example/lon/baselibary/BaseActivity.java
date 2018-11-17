package com.example.lon.baselibary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author $汪金龙$
 * @desc base类
 * 沉浸式布局
 * View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
 * 去除底部虚拟按键的占位
 * <p>
 * <p>
 * View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
 * 保留底部虚拟按键的占位但去除它的ui
 * <p>
 * <p>
 * View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
 * 去除顶部状态栏的占位
 * <p>
 * <p>
 * View.SYSTEM_UI_FLAG_FULLSCREEN
 * 保留顶部状态栏的占位但去除它的ui
 * <p>
 * <p>
 * View.SYSTEM_UI_FLAG_LAYOUT_STABLE
 * 防止系统栏隐藏时内容区域大小发生变化
 * <p>
 * <p>
 * View.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
 * (如果有该属性)在全沉浸时滑动后显示状态栏,但过几秒会继续全沉浸
 * <p>
 * <p>
 * View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
 * 将状态栏的字体变成深色(有的需要白色状态栏时可能需要,否则看不清字)
 * @date 2018/10/18 8:45
 */
public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
        beforeSetContentView(savedInstanceState);
        int layout = getLayoutId(savedInstanceState);
        if (layout != 0) {
            setContentView(layout);
            this.mUnbinder = ButterKnife.bind(this);
//            //当系统版本为4.4或者4.4以上时可以使用沉浸式状态栏,将以下两行代码加入onCreate()方法中，
//            // 要注意，在setContentView()之后
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            //透明导航栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//            ViewGroup contentView = this.findViewById(android.R.id.content);
        }
        initView();
        initListener();
        request();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
        mUnbinder.unbind();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(TAG, "onNewIntent");
    }

    /**
     * 初始化操作
     */
    protected abstract void initView();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    /**
     * 请求
     */
    protected abstract void request();

    /**
     * 添加布局
     *
     * @param savedInstanceState 保存状态
     * @return 返回布局id
     */
    @LayoutRes
    protected abstract int getLayoutId(Bundle savedInstanceState);

    /**
     * 在setContentView之前设置信息
     */
    protected void beforeSetContentView(Bundle savedInstanceState) {

    }
}
