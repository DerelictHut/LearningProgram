package com.example.along.learningprogram.deisgnpatterns;

import android.os.Bundle;

import com.example.along.learningprogram.R;
import com.example.along.learningprogram.R2;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.chainofresponsibility.ChainOfResponsibilityActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.command.CommandActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.iterator.IteratorActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.mediator.MediatorActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.memento.MementoActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.observer.ObserverActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.state.StateActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.strategy.StrategyActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.templatemethod.TemplateMethodActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.visitor.VisitorActivity;
import com.example.along.learningprogram.deisgnpatterns.create.abstractfactory.AbstractFactoryActivity;
import com.example.along.learningprogram.deisgnpatterns.create.builder.BuilderActivity;
import com.example.along.learningprogram.deisgnpatterns.create.factorymethod.FactoryMethodActivity;
import com.example.along.learningprogram.deisgnpatterns.create.prototype.PrototypeActivity;
import com.example.along.learningprogram.deisgnpatterns.create.singleton.SingletonActivity;
import com.example.along.learningprogram.deisgnpatterns.behaviortype.interpreter.InterpreterActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.adapter.AdapterActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.bridge.BridgeActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.composite.CompositeActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.decorator.DecoratorActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.facade.FacadeActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.flyweight.FlyweightActivity;
import com.example.along.learningprogram.deisgnpatterns.structured.proxy.ProxyActivity;
import com.example.l.commoncomponent.GeneralList;
import com.example.lon.baselibary.BaseActivity;

import butterknife.BindView;

/**
 * @author $汪金龙$
 * @desc 设计模式
 * <p>参考：https://blog.csdn.net/doymm2008/article/details/13288067</>
 * @date 2018/11/10 14:12
 */
public class DesignPatternsActivity extends BaseActivity{
    @BindView(R2.id.gl_list)
    GeneralList mGeneralList;
    @Override
    protected void initView() {
        mGeneralList.setPrompt("设计模式");
        mGeneralList.addData(this, DesignByPrincipleActivity.class, "遵循原则");
        mGeneralList.addData(this, FactoryMethodActivity.class, "创建型模式-->工厂方法模式");
        mGeneralList.addData(this, AbstractFactoryActivity.class, "创建型模式-->抽象工厂模式");
        mGeneralList.addData(this, SingletonActivity.class, "创建型模式-->单例模式");
        mGeneralList.addData(this, BuilderActivity.class, "创建型模式-->建造者模式");
        mGeneralList.addData(this, PrototypeActivity.class, "创建型模式-->原型模式");
        mGeneralList.addData(this, AdapterActivity.class, "结构型模式-->适配器模式");
        mGeneralList.addData(this, DecoratorActivity.class, "结构型模式-->装饰器模式");
        mGeneralList.addData(this, ProxyActivity.class, "结构型模式-->代理模式");
        mGeneralList.addData(this, FacadeActivity.class, "结构型模式-->外观模式");
        mGeneralList.addData(this, BridgeActivity.class, "结构型模式-->桥接模式");
        mGeneralList.addData(this, CompositeActivity.class, "结构型模式-->组合模式");
        mGeneralList.addData(this, FlyweightActivity.class, "结构型模式-->享元模式");
        mGeneralList.addData(this, StrategyActivity.class, "行为型模式-->策略模式");
        mGeneralList.addData(this, TemplateMethodActivity.class, "行为型模式-->模板方法模式");
        mGeneralList.addData(this, ObserverActivity.class, "行为型模式-->观察者模式");
        mGeneralList.addData(this, IteratorActivity.class, "行为型模式-->迭代子模式");
        mGeneralList.addData(this, ChainOfResponsibilityActivity.class, "行为型模式-->责任链模式");
        mGeneralList.addData(this, CommandActivity.class, "行为型模式-->命令模式");
        mGeneralList.addData(this, MementoActivity.class, "行为型模式-->备忘录模式");
        mGeneralList.addData(this, StateActivity.class, "行为型模式-->状态模式");
        mGeneralList.addData(this, VisitorActivity.class, "行为型模式-->访问者模式");
        mGeneralList.addData(this, MediatorActivity.class, "行为型模式-->中介者模式");
        mGeneralList.addData(this, InterpreterActivity.class, "行为型模式-->解释器模式");
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {

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
        return R.layout.deisgnpatterns_activity_patterns;
    }
}
