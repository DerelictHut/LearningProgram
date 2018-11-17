package com.example.along.learningprogram.deisgnpatterns.structured.bridge;

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
 * @desc 桥接模式
 * <p>桥接模式即将抽象部分与它的实现部分分离开来，使他们都可以独立变化。
 * 桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量</>
 * <p>抽象化：其概念是将复杂物体的一个或几个特性抽出去而只注意其他特性的行动或过程。在面向对象就是将对象共同的性质抽取出去而形成类的过程。
 * 实现化：针对抽象化给出的具体实现。它和抽象化是一个互逆的过程，实现化是对抽象化事物的进一步具体化。
 * 脱耦：脱耦就是将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联，将两个角色之间的继承关系改为关联关系。</>
 * @date 2018/11/10 15:05
 */
public class BridgeActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;
    private Shape mShape;
    private Color mColor;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mGeneralList.setPrompt("桥接模式");
        mGeneralList.addData("随机颜色和形状");
    }

    /**
     * 初始化监听
     */
    @SuppressLint("SetTextI18n")
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            int temp = (int) (Math.random() * 3);
            if (temp == 0) {
                mColor = new Gray();
            } else if (temp == 1) {
                mColor = new Purple();
            } else {
                mColor = new Yellow();
            }
            temp = (int) (Math.random() * 3);
            if (temp == 0) {
                mShape = new Circle();
            } else if (temp == 1) {
                mShape = new Rectangle();
            } else {
                mShape = new Square();
            }
            mShape.setColor(mColor);
            mTvResult.setText("结果：" + mShape.draw());
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
        return R.layout.deisgnpatterns_activity_bridge;
    }
}
