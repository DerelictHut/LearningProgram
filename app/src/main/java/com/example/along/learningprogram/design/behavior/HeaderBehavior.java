package com.example.along.learningprogram.design.behavior;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

import com.example.l.commoncomponent.GeneralList;


/**
 * @author $汪金龙$
 * @desc 标题行为
 * <p> Behavior代理的四种事件：https://www.jianshu.com/p/39fbc9f4f0c6
 * @date 2018/10/27 16:45
 */
public class HeaderBehavior extends CoordinatorLayout.Behavior<View> {
    private float deltaY;

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        return dependency instanceof GeneralList;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        if (deltaY == 0) {
            deltaY = dependency.getY() - child.getHeight();
        }
        float d = dependency.getY() - child.getHeight();
        d = d < 0 ? 0 : d;

        float a = 1 - d * 1f / deltaY;
        child.setAlpha(a);
        return true;
    }
}
