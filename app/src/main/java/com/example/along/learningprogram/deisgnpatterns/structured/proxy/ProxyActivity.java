package com.example.along.learningprogram.deisgnpatterns.structured.proxy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;

import java.lang.reflect.Proxy;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 代理模式
 * <p>中介隔离作用：
 * 在某些情况下，一个客户类不想或者不能直接引用一个委托对象，
 * 而代理类对象可以在客户类和委托对象之间起到中介的作用，
 * 其特征是代理类和委托类实现相同的接口。
 * 开闭原则，增加功能：
 * 代理类除了是客户类和委托类的中介之外，我们还可以通过给代
 * 理类增加额外的功能来扩展委托类的功能，这样做我们只需要修
 * 改代理类而不需要再修改委托类，符合代码设计的开闭原则。
 * 代理类主要负责为委托类预处理消息、过滤消息、把消息转发给委托类，
 * 以及事后对返回结果的处理等。代理类本身并不真正实现服务，
 * 而是同过调用委托类的相关方法，来提供特定的服务。真正的业务功能
 * 还是由委托类来实现，但是可以在业务功能执行的前后加入一些公共的
 * 服务。例如我们想给项目加入缓存、日志这些功能，我们就可以使用代
 * 理类来完成，而没必要打开已经封装好的委托类</>
 * <p>我们有多种不同的方式来实现代理。如果按照代理创建的时期来进行
 * 分类的话，可以分为两种：静态代理、动态代理。静态代理是由程序员创
 * 建或特定工具自动生成源代码，在对其编译。在程序员运行之前，代理类
 * .class文件就已经被创建了。动态代理是在程序运行时通过反射机制动态创建的</>
 * @date 2018/11/10 15:03
 */
public class ProxyActivity extends BaseActivity {
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @BindView(R2.id.tv_result)
    TextView mTvResult;

    /**
     * 初始化操作
     */
    @Override
    protected void initView() {
        mGeneralList.setPrompt("代理模式");
        mGeneralList.addData("自己搬家");
        mGeneralList.addData("静态代理-->搬家公司搬家");
        mGeneralList.addData("动态代理-->搬家公司搬家");
    }

    /**
     * 初始化监听
     */
    @SuppressLint("SetTextI18n")
    @Override
    protected void initListener() {
        mGeneralList.getMAdapter().setOnItemClickListener((BaseQuickAdapter adapter, View view, int position) -> {
            if (position == 0) {
                MoveHouse moveHouse = new MoveHouse();
                mTvResult.setText("未使用代理结果：花了一年自己" + moveHouse.moveHouse() + "累屁了！！！");
            } else if (position == 1) {
                MoveHouseStaticProxy staticProxy = new MoveHouseStaticProxy(new MoveHouse());
                mTvResult.setText("静态代理结果：花了一小时" + staticProxy.moveHouse() + "很轻松！！！");
            } else if (position == 2) {
                IMoveHouseDynamicProxy iMoveHouseDynamicProxy = new MoveHouse();
                MoveHouseDynamicProxy dynamicProxy = new MoveHouseDynamicProxy(iMoveHouseDynamicProxy);
                ClassLoader classLoader = iMoveHouseDynamicProxy.getClass().getClassLoader();
                IMoveHouseDynamicProxy moveHouseCompany = (IMoveHouseDynamicProxy) Proxy.newProxyInstance(
                        classLoader,
                        new Class[]{IMoveHouseDynamicProxy.class},
                        dynamicProxy);
                mTvResult.setText("动态代理结果：花了一小时" + moveHouseCompany.moveHouse() + "很轻松！！！");
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
        return R.layout.deisgnpatterns_activity_proxy;
    }
}
