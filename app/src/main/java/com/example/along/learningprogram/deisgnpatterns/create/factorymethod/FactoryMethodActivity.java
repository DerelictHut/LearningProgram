package com.example.along.learningprogram.deisgnpatterns.create.factorymethod;

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
 * @desc 工厂方法模式
 * <p>抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。
 * 在java中它由抽象类或者接口来实现。
 * 具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。
 * 抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
 * 具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现
 * @date 2018/11/10 14:31
 */
public class FactoryMethodActivity extends BaseActivity {
    @BindView(R2.id.ht_title)
    HeadTitle mHeadTitle;
    @BindView(R2.id.tv_first_line)
    TextView mTvFirstLine;
    @BindView(R2.id.tv_second_line)
    TextView mTvSecondLine;
    @BindView(R2.id.tv_third_line)
    TextView mTvThirdLine;
    private BookFactory mBookFactory;
    private AbstractBook mBook;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mHeadTitle.setPrompt("工厂方法模式");
        mTvFirstLine.setText("获取书");
        mTvSecondLine.setText("使用书");
    }

    /**
     * 初始化监听
     */
    @SuppressLint("SetTextI18n")
    @Override
    protected void initListener() {
        mTvFirstLine.setOnClickListener(v -> {
            int select = (int) (Math.random() * 3);
            switch (select) {
                case 0:
                    mBookFactory = new CBookFactory();
                    break;
                case 1:
                    mBookFactory = new JavaBookFactory();
                    break;
                case 2:
                    mBookFactory = new LinuxBookFactory();
                    break;
                default:
            }
            mBook = mBookFactory.productionBook();
            mTvThirdLine.setText("结果：获得一本" + mBook.getBookAuthor() + "的《" + mBook.getBookName() + "》");
        });
        mTvSecondLine.setOnClickListener(v -> {
            if (mBook == null) {
                mTvThirdLine.setText("结果：请先获取一本书");
            } else {
                mTvThirdLine.setText("结果：" + mBook.use());
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
        return R.layout.deisgnpatterns_activity_factory_method;
    }
}
